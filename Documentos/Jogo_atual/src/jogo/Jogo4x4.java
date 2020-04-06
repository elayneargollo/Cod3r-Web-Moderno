/* **************************************************************** 
 *  @Autor: Elayne Natalia
 *  Matricula: 2018116013
 *  Inicio: 25/03/2020
 *  Ultima alteracao: 28/03/2020 as 14:19h
 *  Nome: Jogo da Memoria - Redes de Computadores I
 *  Funcao: Jogo multiusario desenvolvido em Java com utilizacao de sockets usando arquitetura TCP/IP
 *  *************************************************************** */

package jogo;  /* nome do pacote em que se encontra a classe Jogo4x4 */

import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class Jogo4x4 extends Carta {

	/* declaracao de variaveis */
	
	private static final long serialVersionUID = 1L;
	private final String imgFundo = "/Imagens/flipper.png"; // Recebe imagem de Plano de fundo

    /* ****************************************************************
     * Metodo: Jogo4x4
     * Funcao: construtor da classe Jogo4x4 
     * Parametros: String imgF, JLabel Label_pont, JLabel cartasViradas, JMenuItem novojogo
     * Retorno: void
     * *************************************************************** */
	
	public Jogo4x4(String imgF, JLabel Label_pont, JLabel cartasViradas, JMenuItem novojogo) {
																										
		super(imgF, Label_pont, cartasViradas, novojogo);//
		setImgFrente(imgF);// Recebe endereco da imagem
		var_Label_Pontos = Label_pont;// Atribui em var_Label_Pontos o Label: [LabelPontuacao]
		var_Label_Cartas_Viradas = cartasViradas; // Atribui em var_Label_Cartas_Viradas o Label:
													// LabelQuantCartasViradas logo ira mudar a o valor
		NovoJogo = novojogo;// Recebe Item de Menu (JMenuItem)

		this.addMouseListener(new java.awt.event.MouseAdapter() {// Assinatura de Evento Clique do mouse

			@Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				capturarCliqueDoMouse();// Captura o clique do mouse e ao clicar executar tais procedimentos
			}
		});

		NovoJogo.addActionListener(new java.awt.event.ActionListener() {// Assinatura de Evento de Sub Menu do Jogo
																		// (ActionPerformed NovoJogo)
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				subMenuDeJogoNovoJogoActionPerformed();// Captura a "ação" de Novo Jogo
			}
		});

	}


    /* ****************************************************************
     * Metodo: subMenuDeJogoNovoJogoActionPerformed
     * Funcao: zera todas as pontuacoes, cartas viradas e pares para iniciar um novo jogo
     * Parametros: void
     * Retorno: void
     * *************************************************************** */
	
	@Override
	public void subMenuDeJogoNovoJogoActionPerformed() {
		contCartasViradasUma = 0;// Zera O contador de cada carta virada
		pontos = 0;// Zera o contador de pontos
		contCardViradaPar = 0;// Zera o contador de cartas pares viradas
	}

	 /* ****************************************************************
     * Metodo: capturarCliqueDoMouse
     * Funcao:  procedimentos a serem executados a cada clique
     * Parametros: void
     * Retorno: void
     * *************************************************************** */
	
	@Override
	public void capturarCliqueDoMouse() {
		if (!this.isViradaPraFrente()) {// Verifica se a carta nao esta virada para frente (atribui false)

			this.mostrarCarta();// Mostrar carta
			viradaParaFrente = true;
			cont++;// Conta os cliques (Adiciona +1 ao contador)
			contCartasViradasUma++;// Conta a quantidade de cartas que foram viradas

			var_Label_Cartas_Viradas.setText(contCartasViradasUma + "");// Escreve no Label a quantidade de cartas viradas
																	
			if (cont == 1) {// Verifica se o contador esta em 1

				new Som().cartaVirando();
				ClicaPrimCarta = this;// Atribui a variavel ClicaPrimCarta a ela mesma [this]
			
			}

			if (cont == 2) {// Verifica se o contador está em 2

				new Som().cartaVirando();
				
				if (this.getPar().isViradaPraFrente()) {// equivale: (ClicaPrimCarta.getPar().isViradaParaFrente())|
					// Verifica se o par da carta clicada esta virada para frente.

					JOptionPane.showMessageDialog(null, "Acertou!");
					ClicaPrimCarta.setVisible(false);// Torna a Visibilidade da carta (ClicaPrimCarta) oculta.
					this.setVisible(false);// Torna a Visibilidade da segunda carta clicada Oculta.
					ClicaPrimCarta.viradaParaFrente = true;// Atribui valor verdadeiro a Primeira Carta virada para
															// frente
					this.viradaParaFrente = true;// Atribui verdadeiro a segunda carta virada.
					var_Label_Pontos.setText(Pontuacao(+10));// Faz pontuacao receber +10 ao metodo pontuacao, passando
																// assim para o label de pontos
					contCardViradaPar += 2;// Atribui a cartas pares viradas +2

				} else {
					
					JOptionPane.showMessageDialog(null, "Errou!");
					ClicaPrimCarta.esconderCarta();// Esconde a carta exibindo a imagem de plano de fundo
					this.esconderCarta();// Esconde a segunda carta exibindo a imagem de plano de fundo
					ClicaPrimCarta.viradaParaFrente = false;// Atribui falso a primeira carta virada para frente
					this.viradaParaFrente = false;// Atribui falso (false) a segunda carta virada para frente
					var_Label_Pontos.setText(Pontuacao(-5));// Faz pontuacao receber +10 ao metodo pontuacao, passando
															// assim para o label de pontos
				}

				if (contCardViradaPar == 16) {// Verifica se as 16 cartas ja estao viradas	
					
					if (Integer.parseInt(Pontuacao(0)) == 80) {
						JOptionPane.showMessageDialog(null, " Voce eh o Flipper !!" + "\n Sua pontuacao foi: " + Pontuacao(0));
					}
					
					if (Integer.parseInt(Pontuacao(0)) > 20) {
						JOptionPane.showMessageDialog(null, " Muito bem ! Continue praticando." + "\n Sua pontuacao foi: " + Pontuacao(0));
					}
					
					else {
					JOptionPane.showMessageDialog(null, "Voce precisa estudar" + "\n Sua pontuacao foi: " + Pontuacao(0));
					}
					
					contCartasViradasUma = 0;// Zera O contador de cada carta virada
					pontos = 0;// Zera o contador de pontos
					contCardViradaPar = 0;// Zera o contador de cartas pares viradas

				}
				
				ClicaPrimCarta = null; // Faz ClicaPrimCarta receber null,
				cont = 0;// Zera o contador de cliques

			}
		} else {// Caso a carta ja esteja virada para frente

			esconderCarta();// Esconde a carta virada para frente
			viradaParaFrente = false;// Atribui falso para viradaParaFrente
			ClicaPrimCarta = null;// Faz ClicaPrimCarta receber null
			cont = 0;// Zera o contador

		}

	}

	 /* ****************************************************************
     * Metodo: esconderCarta
     * Funcao: virar a carta
     * Parametros: void
     * Retorno: void
     * *************************************************************** */
	
	@Override
	public void esconderCarta() {
		this.setIcon(new javax.swing.ImageIcon(getClass().getResource(imgFundo)));
	}

	 /* ****************************************************************
     * Metodo: mostrarCarta
     * Funcao: mostrar a carta
     * Parametros: void
     * Retorno: void
     * *************************************************************** */
	
	@Override
	public void mostrarCarta() {
		this.setIcon(new javax.swing.ImageIcon(getClass().getResource(getImgFrente())));
	}

}
