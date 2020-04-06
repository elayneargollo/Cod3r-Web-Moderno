/* **************************************************************** 
 *  Autor: Elayne Natalia
 *  Matricula: 2018116013
 *  Inicio: 25/03/2020
 *  Ultima alteracao: 28/03/2020 as 14:19h
 *  Nome: Jogo da Memoria - Redes de Computadores I
 *  Funcao: Jogo multiusario desenvolvido em Java com utilizacao de sockets usando arquitetura TCP/IP
 *  *************************************************************** */

package jogo;  /* nome do pacote em que se encontra a classe Jogo */

import java.awt.Color;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.Collections;

public class Jogo extends javax.swing.JFrame {

	private static final long serialVersionUID = 1L;
	
	/* declaracao de variavel */
	
	ArrayList<Jogo4x4> cartas = new ArrayList<Jogo4x4>();
    
    private javax.swing.JMenuBar barraDeMenu;
    private javax.swing.JLabel labelCartasViradas;
    private javax.swing.JLabel labelPontos;
    private javax.swing.JLabel labelPontuacao;
    private javax.swing.JLabel labelQuantDeCartasViradas2;
    private javax.swing.JMenu menuJogo;
    private javax.swing.JPanel painelPrincipal;
    private javax.swing.JMenuItem subMenuDeJogo_NovoJogo;
    private javax.swing.JMenuItem subMenuDeJogo_Opcoes;
    private javax.swing.JMenuItem subMenuDeJogo_Sair;

    /* ****************************************************************
     * Metodo: Jogo
     * Funcao: construtor da classe Jogo que inicializa o metodo initComponets e instancia as cartas do jogo assim como as adicionam no arrayList 
     		   e define seus respectivos pares.
     * Parametros: nenhum
     * Retorno: void
     * *************************************************************** */
	
    public Jogo() {
    	initComponents();

        /*Criando as cartas*/

        Jogo4x4 carta1 = new Jogo4x4("/Imagens/ethernet.png", labelPontuacao, labelQuantDeCartasViradas2, subMenuDeJogo_NovoJogo);
        Jogo4x4 carta2 = new Jogo4x4("/Imagens/resEthernet.png", labelPontuacao, labelQuantDeCartasViradas2, subMenuDeJogo_NovoJogo);        
        Jogo4x4 carta3 = new Jogo4x4("/Imagens/firewall.png", labelPontuacao, labelQuantDeCartasViradas2, subMenuDeJogo_NovoJogo);
        Jogo4x4 carta4 = new Jogo4x4("/Imagens/resFirewall.png", labelPontuacao, labelQuantDeCartasViradas2, subMenuDeJogo_NovoJogo);        
        Jogo4x4 carta6 = new Jogo4x4("/Imagens/modem.png", labelPontuacao, labelQuantDeCartasViradas2, subMenuDeJogo_NovoJogo);
        Jogo4x4 carta7 = new Jogo4x4("/Imagens/resModem.png", labelPontuacao, labelQuantDeCartasViradas2, subMenuDeJogo_NovoJogo);        
        Jogo4x4 carta8 = new Jogo4x4("/Imagens/noBreak.png", labelPontuacao, labelQuantDeCartasViradas2, subMenuDeJogo_NovoJogo);
        Jogo4x4 carta9 = new Jogo4x4("/Imagens/resNobreak.png", labelPontuacao, labelQuantDeCartasViradas2, subMenuDeJogo_NovoJogo);        
        Jogo4x4 carta10 = new Jogo4x4("/Imagens/repetidor.png", labelPontuacao, labelQuantDeCartasViradas2, subMenuDeJogo_NovoJogo);
        Jogo4x4 carta11 = new Jogo4x4("/Imagens/resRepetidor.png", labelPontuacao, labelQuantDeCartasViradas2, subMenuDeJogo_NovoJogo);        
        Jogo4x4 carta12 = new Jogo4x4("/Imagens/roteador.png", labelPontuacao, labelQuantDeCartasViradas2, subMenuDeJogo_NovoJogo);
        Jogo4x4 carta13 = new Jogo4x4("/Imagens/resRoteador.png", labelPontuacao, labelQuantDeCartasViradas2, subMenuDeJogo_NovoJogo);        
        Jogo4x4 carta14 = new Jogo4x4("/Imagens/servidores.png", labelPontuacao, labelQuantDeCartasViradas2, subMenuDeJogo_NovoJogo);
        Jogo4x4 carta5 = new Jogo4x4("/Imagens/resServidores.png", labelPontuacao, labelQuantDeCartasViradas2, subMenuDeJogo_NovoJogo);        
        Jogo4x4 carta15 = new Jogo4x4("/Imagens/switch.png", labelPontuacao, labelQuantDeCartasViradas2, subMenuDeJogo_NovoJogo);
        Jogo4x4 carta16 = new Jogo4x4("/Imagens/resSwitch.png", labelPontuacao, labelQuantDeCartasViradas2, subMenuDeJogo_NovoJogo);
    	    
        /*Adicionando as cartas no ArrayList*/
        cartas.add(carta1);
        cartas.add(carta2);
        cartas.add(carta3);
        cartas.add(carta4);
        cartas.add(carta5);
        cartas.add(carta6);
        cartas.add(carta7);
        cartas.add(carta8);
        cartas.add(carta9);
        cartas.add(carta10);
        cartas.add(carta11);
        cartas.add(carta12);
        cartas.add(carta13);
        cartas.add(carta14);
        cartas.add(carta15);
        cartas.add(carta16);
        
        /*Definindo os pares das cartas em relacao da primeira para a segunda*/
        carta1.setPar(carta2);
        carta3.setPar(carta4);
        carta6.setPar(carta7);
        carta8.setPar(carta9);
        carta10.setPar(carta11);
        carta12.setPar(carta13);
        carta14.setPar(carta5);
        carta15.setPar(carta16);
        
        /*Definindo os pares das cartas em relacao da segunda para a primeira*/
        carta2.setPar(carta1);
        carta4.setPar(carta3);
        carta7.setPar(carta6);
        carta9.setPar(carta8);
        carta11.setPar(carta10);
        carta13.setPar(carta12);
        carta5.setPar(carta14);
        carta16.setPar(carta15);

        Collections.shuffle(cartas); /* ele embaralha o arrayList */
        
        for (Jogo4x4 c : cartas) {
            c.esconderCarta(); 
            painelPrincipal.add(c); /* adiciona o array de cartas no painel principal de jogabilidade */
        }
    }

    /* ****************************************************************
     * Metodo: initComponents
     * Funcao: inicializar os componentes do JFrame
     * Parametros: nenhum
     * Retorno: void
     * *************************************************************** */
    
    private void initComponents() {

        labelPontos = new javax.swing.JLabel();
        labelPontuacao = new javax.swing.JLabel();
        labelCartasViradas = new javax.swing.JLabel();
        labelQuantDeCartasViradas2 = new javax.swing.JLabel();
        painelPrincipal = new javax.swing.JPanel();
        barraDeMenu = new javax.swing.JMenuBar();
        menuJogo = new javax.swing.JMenu();
        subMenuDeJogo_NovoJogo = new javax.swing.JMenuItem();
        subMenuDeJogo_Opcoes = new javax.swing.JMenuItem();
        subMenuDeJogo_Sair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jogo da Memoria Redes");
        setResizable(false);

        /* alterar cor de fundo do Pane para cinza escuro */
        this.getContentPane().setBackground(Color.gray); 
       
		/* alterando imagem do icone da janela */
		setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagens/JogoMemoria.png")));
		
        labelPontos.setText("Pontos:");
        labelPontuacao.setText("0");
        labelCartasViradas.setText("Cartas Viradas:");
        labelQuantDeCartasViradas2.setText("0");

        painelPrincipal.setLayout(new java.awt.GridLayout(4, 4));
        this.painelPrincipal.setBackground(Color.gray);  /* alterar cor de fundo do painel principal para cinza escuro */
        menuJogo.setText("Jogo");

        /* criacao e configuracao do menu da jogabilidade */
        
        subMenuDeJogo_NovoJogo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        subMenuDeJogo_NovoJogo.setText("Novo Jogo");
        
        /* define acao ao clicar na opcao de Novo jogo*/
        subMenuDeJogo_NovoJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubMenuDeJogo_NovoJogoActionPerformed(evt);
            }
        });
        
        menuJogo.add(subMenuDeJogo_NovoJogo); /* Adiciona no menu a opcao de novo jogo */        
        subMenuDeJogo_Sair.setText("Sair"); /* seta o titulo de Sair */
        
        /* define acao ao clicar na opcao de Sair */
        subMenuDeJogo_Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubMenuDeJogo_SairActionPerformed(evt);
            }
        });
        
        menuJogo.add(subMenuDeJogo_Sair); /* adiciona no menu a opcao de sair */
        barraDeMenu.add(menuJogo);
        setJMenuBar(barraDeMenu);

        /* criacao do design do jogo */
        
        /* agrupamento hierarquico dos componentes em um container */
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(  /* Define o Group que posiciona e dimensiona componentes ao longo do eixo horizontal. */
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING) /* Cria e retorna um ParallelGroup com um alinhamento de Alignment.LEADING  */
            .addGroup(layout.createSequentialGroup() /* cria um grupo sequencia */
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup() /* cria um grupo sequencia */
                        .addComponent(painelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 627, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup() /* cria um grupo sequencia */
                        .addComponent(labelPontos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelPontuacao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 438, Short.MAX_VALUE)
                        .addComponent(labelCartasViradas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelQuantDeCartasViradas2)
                        .addGap(64, 64, 64))))
        );
        
        layout.setVerticalGroup( /* Define o Group que posiciona e dimensiona componentes ao longo do eixo vertical. */
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING) /* Cria e retorna um ParallelGroup com um alinhamento de Alignment.LEADING */
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup() /* cria um grupo sequencia */
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPontos)
                    .addComponent(labelPontuacao)
                    .addComponent(labelCartasViradas)
                    .addComponent(labelQuantDeCartasViradas2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(painelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }

    /* ****************************************************************
     * Metodo: SubMenuDeJogo_NovoJogoActionPerformed
     * Funcao: Iniciar um novo jogo ao clicar no botao new game
     * Parametros: java.awt.event.ActionEvent ev 
     * Retorno: void
     * *************************************************************** */
    
    private void SubMenuDeJogo_NovoJogoActionPerformed(java.awt.event.ActionEvent evt) {
        Jogo newJogo = new Jogo();//Cria um objeto do tipo Jogo
        newJogo.setVisible(true);//Torna a visibilidade no jogo true
        Jogo.super.setVisible(false);//Torna o JFrame JogoNivelFacil com visibilidade false
    }

    /* ****************************************************************
     * Metodo: SubMenuDeJogo_SairActionPerformed
     * Funcao: Sair do jogo ao clicar no botao sair
     * Parametros: java.awt.event.ActionEvent evt
     * Retorno: void
     * *************************************************************** */
    
    private void SubMenuDeJogo_SairActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
    }
}
