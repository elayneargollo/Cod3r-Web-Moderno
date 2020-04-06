/* **************************************************************** 
 *  Autor: Elayne Natalia
 *  Matricula: 2018116013
 *  Inicio: 25/03/2020
 *  Ultima alteracao: 28/03/2020 as 14:19h
 *  Nome: Jogo da Memoria - Redes de Computadores I
 *  Funcao: Jogo multiusario desenvolvido em Java com utilizacao de sockets usando arquitetura TCP/IP
 *  *************************************************************** */

package menu;  /* nome do pacote em que se encontra a classe Credits */

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.Toolkit;

public class Credits extends JFrame { 

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
					Credits frame = new Credits();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

    /* ****************************************************************
     * Metodo: Credits
     * Funcao: construtor da classe Credits que inicializar o JFrame e mostra ao usuario os desenvolvedores do programa
     * Parametros: nenhum
     * Retorno: void
     * *************************************************************** */
	public Credits() {

		setTitle("Credits"); /* define o titulo da janela */
		setResizable(false);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 392, 412);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		layeredPane = new JLayeredPane();
		layeredPane.setForeground(Color.DARK_GRAY);
		layeredPane.setBackground(new Color(0, 0, 0));
		contentPane.add(layeredPane, BorderLayout.CENTER);

		selecionar = new JButton("Ok");
		selecionar.setBounds(120, 323, 89, 23);
		layeredPane.add(selecionar);

		txtpnTeste = new JTextPane();
		txtpnTeste.setBackground(Color.BLACK); /* cor de fundo */
		txtpnTeste.setFont(new Font("Verdana", Font.PLAIN, 11)); /* caracteristicas de fonte */
		txtpnTeste.setForeground(Color.WHITE); /* cor do texto */
		txtpnTeste.setText(
				"Orientador :\r\n   > Grinaldo Lopes de Oliveira\r\n\t\t\t\r\nColaboradores :\r\n  > Elayne Natalia de O. Argollo\r\n  > Edilton Silva Junior\r\n  > Gabriel dos Reis Morais\r\n");
		txtpnTeste.setBounds(76, 169, 254, 132);
		layeredPane.add(txtpnTeste);

		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Credits.class.getResource("/Imagens/IFBALogo.png")));
		lblNewLabel.setBounds(10, 11, 356, 117);
		layeredPane.add(lblNewLabel);
		
		/* alterando imagem do icone da janela */
		setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagens/JogoMemoria.png")));
		this.getContentPane().setBackground(Color.BLACK); /* cor do fundo */

		selecionar.addActionListener(new ActionListener() { /* acao ao clicar no botao Ok */
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
			}
		});
	}
}