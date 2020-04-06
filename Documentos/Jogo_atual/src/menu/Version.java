/* **************************************************************** 
 *  Autor: Elayne Natalia
 *  Matricula: 2018116013
 *  Inicio: 25/03/2020
 *  Ultima alteracao: 28/03/2020 as 14:19h
 *  Nome: Jogo da Memoria - Redes de Computadores I
 *  Funcao: Jogo multiusario desenvolvido em Java com utilizacao de sockets usando arquitetura TCP/IP
 *  *************************************************************** */

package menu;  /* nome do pacote em que se encontra a classe Version */

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;

public class Version extends JFrame {

	/* declaracao das variaveis */
	
	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	private JButton selecionar;
	private JLayeredPane layeredPane;
	private JTextPane txtpnTeste;
	private JLabel lblNewLabel;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Version frame = new Version();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

    /* ****************************************************************
     * Metodo: Version
     * Funcao: construtor da classe Version que mostra a versao do programa
     * Parametros: nenhum
     * Retorno: void
     * *************************************************************** */
	public Version() {

		setTitle("Version"); /* define o titulo da janela */
		setResizable(false);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 391, 279);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		layeredPane = new JLayeredPane();
		layeredPane.setForeground(Color.DARK_GRAY);
		layeredPane.setBackground(new Color(0, 0, 0));
		contentPane.add(layeredPane, BorderLayout.CENTER);

		selecionar = new JButton("Ok");
		selecionar.setBounds(152, 193, 89, 23);
		layeredPane.add(selecionar);

		txtpnTeste = new JTextPane();
		txtpnTeste.setBackground(Color.BLACK);
		txtpnTeste.setFont(new Font("Verdana", Font.PLAIN, 11));
		txtpnTeste.setForeground(Color.WHITE);
		txtpnTeste.setText("Versao 0.1.0 (21086)");
		txtpnTeste.setBounds(114, 143, 179, 39);
		layeredPane.add(txtpnTeste);

		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Version.class.getResource("/Imagens/IFBALogo.png")));
		lblNewLabel.setBounds(74, 11, 219, 100);
		layeredPane.add(lblNewLabel);

		/* alterando imagem do icone da janela */
		setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagens/JogoMemoria.png")));
		this.getContentPane().setBackground(Color.BLACK);

		selecionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
			}
		});
	}
}