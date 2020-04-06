/* **************************************************************** 
 *  Autor: Elayne Natalia
 *  Matricula: 2018116013
 *  Inicio: 25/03/2020
 *  Ultima alteracao: 28/03/2020 as 14:19h
 *  Nome: Jogo da Memoria - Redes de Computadores I
 *  Funcao: Jogo multiusario desenvolvido em Java com utilizacao de sockets usando arquitetura TCP/IP
 *  *************************************************************** */

package main;  /* nome do pacote em que se encontra a classe Login */

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import comunicacao.Cliente;
import jogo.Jogo;
import jogo.Som;
import menu.Credits;
import menu.Version;
import menu.Welcome;
import javax.swing.JLayeredPane;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Login extends JFrame {

	private static final long serialVersionUID = 1L;
	private final JLabel lblCarregando;
	
	private JPanel contentPane;
	private JButton btnJogar;
	private JLayeredPane layeredPane;	
	private Cliente cliente;
	private JTextField ipServidor;
	private JTextField portaServidor;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
     /* ****************************************************************
     * Metodo: Login
     * Funcao: apresenta ao usuario tela de login
     * Parametros: nenhum
     * Retorno: void
     * *************************************************************** */

	public Login() {

		this.lblCarregando = new JLabel();
		setTitle("Jogo da Memoria - Redes"); /* define o titulo da janela */
		setResizable(false);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		/* Construcao do menu Menu */
		
		JMenu mnNewMenu = new JMenu("Menu");
		menuBar.add(mnNewMenu);

		/* Construcao do submenu de Menu */
		/* Opcao New Game */
		
		JMenuItem mntmNewMenuItem = new JMenuItem("New Game");
		mnNewMenu.add(mntmNewMenuItem);
		
		mntmNewMenuItem.addActionListener(new ActionListener() { /* acao ao clicar na opcao New game */
			public void actionPerformed(ActionEvent arg0) {
				Jogo jogo = new Jogo(); /* instancia novo jogo */
				Login.super.setVisible(false); /* torna a tela do jogo pai falsa*/

				Login login = new Login(); /* instancia um novo login */
				login.setVisible(true); /* torna o login visiavel ao usuario */
			}
		});

		/* Opcao Exit */
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Exit");
		mnNewMenu.add(mntmNewMenuItem_1);
		
		mntmNewMenuItem_1.addActionListener(new ActionListener() { /* acao ao clicar na opcao Exit*/
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0); /* fecha a aplicacao */
			}
		});

		/* Construcao do menu Help */

		JMenu mnNewMenu_1 = new JMenu("Help");
		menuBar.add(mnNewMenu_1);

		/* Construcao do submenu de Help */
		/* Opcao Welcome */
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Welcome");
		mnNewMenu_1.add(mntmNewMenuItem_4);
		
		mntmNewMenuItem_4.addActionListener(new ActionListener() {/* acao ao clicar na opcao Welcome*/
			public void actionPerformed(ActionEvent arg0) {
				Welcome obj = new Welcome(); /* instancia novo objetivo*/
				obj.main(null);
			}
		});

		/* Opcao Version */
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Version"); 
		mnNewMenu_1.add(mntmNewMenuItem_3);
		
		mntmNewMenuItem_3.addActionListener(new ActionListener() {/* acao ao clicar na opcao Version*/
			public void actionPerformed(ActionEvent arg0) {
				Version obj = new Version();  /* instancia novo objetivo*/
				obj.main(null);
			}
		});
		
		/* Opcao Credits */

		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Credits");
		mnNewMenu_1.add(mntmNewMenuItem_2);
		
		mntmNewMenuItem_2.addActionListener(new ActionListener() {/* acao ao clicar na opcao Credits*/
			public void actionPerformed(ActionEvent arg0) {
				Credits obj = new Credits();  /* instancia novo objetivo*/
				obj.main(null);
			}
		});

		/* Lagout Principal */

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		layeredPane = new JLayeredPane();
		contentPane.add(layeredPane, BorderLayout.CENTER);

		btnJogar = new JButton("Jogar");
		btnJogar.setBounds(308, 189, 89, 23);
		layeredPane.add(btnJogar);

		ipServidor = new JTextField();
		ipServidor.setColumns(10);
		ipServidor.setBounds(247, 70, 150, 20);
		layeredPane.add(ipServidor);

		/* Solicita ao usuario o numero do IP do servidor */
		
		JLabel lblEntreComIp = new JLabel("Entre com IP do servidor:");
		lblEntreComIp.setBounds(247, 44, 154, 14);
		layeredPane.add(lblEntreComIp);
		lblEntreComIp.setForeground(Color.white); /* cor do texto */

		portaServidor = new JTextField();
		portaServidor.setColumns(10);
		portaServidor.setBounds(247, 145, 150, 20);
		layeredPane.add(portaServidor);

		/* Solicita ao usuario o numero da porta do servidor */
		
		JLabel lblEntreComA = new JLabel("Entre com a porta:");
		lblEntreComA.setBounds(247, 119, 167, 14);
		layeredPane.add(lblEntreComA);
		lblEntreComA.setForeground(Color.white);  /* cor do texto */

		JLabel lblNewLabel_1 = new JLabel("New label");
		/* endereco da imagem */
		lblNewLabel_1.setIcon(new ImageIcon(Login.class.getResource("/Imagens/JogoMemoria.png")));
		lblNewLabel_1.setBounds(10, 26, 227, 203);
		layeredPane.add(lblNewLabel_1);

		/* alterando imagem do icone da janela */
		setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagens/JogoMemoria.png")));
		
		this.getContentPane().setBackground(Color.BLACK); /* define cor de fundo da tela principal*/

		btnJogar.addActionListener(new ActionListener() { /* Ação do botao "Jogar" */
			public void actionPerformed(ActionEvent arg0) {
				try {
					new Som().selecionado(); /* emite som ao clicar no botao Jogar*/
					cliente = new Cliente(ipServidor.getText(), Integer.parseInt(portaServidor.getText())); /* instancia de um novo cliente */
					cliente.executa(); 
				} catch (IOException e) {
					lblCarregando.setVisible(false); /* torna a tela de login invisivel*/
					e.printStackTrace();
				}
			}
		});

	}
}