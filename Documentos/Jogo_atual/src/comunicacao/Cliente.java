/* **************************************************************** 
 *  Autor: Elayne Natalia
 *  Matricula: 2018116013
 *  Inicio: 25/03/2020
 *  Ultima alteracao: 28/03/2020 as 14:19h
 *  Nome: Jogo da Memoria - Redes de Computadores I
 *  Funcao: Jogo multiusario desenvolvido em Java com utilizacao de sockets usando arquitetura TCP/IP
 *  *************************************************************** */

package comunicacao; /* nome do pacote em que se encontra a classe Cliente */

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import javax.swing.JOptionPane;
import jogo.Jogo;

public class Cliente {

	/* declaracao da variaveis */
	
	private static Cliente cliente;
	private String host;
	private int porta;

    /* ****************************************************************
     * Metodo: Cliente
     * Funcao: construtor da classe Cliente que ira identificar o host e a porta que deve se comunicar
     * Parametros: String host, int porta
     * Retorno: void
     * *************************************************************** */
	
	public Cliente(String host, int porta) {
		this.host = host;
		this.porta = porta;
		cliente = this;
	}

    /* ****************************************************************
     * Metodo: executa
     * Funcao: inicializa um socket cliente enviando o host e a porta do servidor. Esse metodo tambem apresenta ao jogo a tela de conectado
     * Parametros: nenhum
     * Retorno: void
     * *************************************************************** */
	
	public void executa() throws UnknownHostException, IOException {

		try {
			Socket cliente = new Socket(host, porta);

			new Thread() {
				@Override
				public void run() {
					Jogo jogo = new Jogo(); /* instancia um novo jogo */
					JOptionPane.showMessageDialog(null, "Voce esta conectado. Bom jogo !");
					jogo.setVisible(true); /* torna a tela visivel */
				}
			}.start();

		} catch (UnknownHostException e) { /* tratamento de erro para ip invalido */
			JOptionPane.showMessageDialog(null, "Endereco Invalido. Tente novamente !");
			e.printStackTrace();
		} catch (IOException e) { /* tratamento de erro para servidor nao inicializado */
			JOptionPane.showMessageDialog(null, "Servidor esta fora do ar");
			e.printStackTrace();
		}
	}

}