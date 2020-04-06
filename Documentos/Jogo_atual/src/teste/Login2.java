package teste;

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

import javax.swing.JLayeredPane;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Login2 extends JFrame {

	private JPanel contentPane;
	private JButton btnJogar;
	private JLayeredPane layeredPane;
	private final JLabel lblCarregando;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login2 frame = new Login2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public Login2() {
		
		this.lblCarregando = new JLabel();
		setTitle("Jogo da Memoria - Redes");
		setResizable(false);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBorderPainted(false);
		setJMenuBar(menuBar);
		
		/* Jmenu Menu */
		
		setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagens/JogoMemoria.png")));
		
		JMenu mnNewMenu = new JMenu("Menu");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("New Game");
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Exit");
		mnNewMenu.add(mntmNewMenuItem_1);
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		
		
		/* Jmenu Help */
		
		JMenu mnNewMenu_1 = new JMenu("Help");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Welcome");
		mnNewMenu_1.add(mntmNewMenuItem_4);
		mntmNewMenuItem_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				/* Nova instancia da classe */
				Welcome2 obj = new Welcome2();
				obj.main(null);
			}
		});
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Version");
		mnNewMenu_1.add(mntmNewMenuItem_3);
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Version2 obj = new Version2();
				obj.main(null);
			}
		});
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Credits");
		mnNewMenu_1.add(mntmNewMenuItem_2);
		
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Credits2 obj = new Credits2();
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

	

		JLabel lblEntreComIp = new JLabel("Entre com IP do servidor:");
		lblEntreComIp.setBounds(247, 44, 154, 14);
		layeredPane.add(lblEntreComIp);
		lblEntreComIp.setForeground(Color.white);

	

		JLabel lblEntreComA = new JLabel("Entre com a porta:");
		lblEntreComA.setBounds(247, 119, 167, 14);
		layeredPane.add(lblEntreComA);
		lblEntreComA.setForeground(Color.white);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(Login2.class.getResource("/Imagens/JogoMemoria.png")));
		lblNewLabel_1.setBounds(10, 26, 227, 203);
		layeredPane.add(lblNewLabel_1);
		
		this.getContentPane().setBackground(Color.BLACK);  	      
		
		/* Ação do botao "Jogar" */
		
		btnJogar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {

				setVisible(false);
		
			}

		});
		
	}
}