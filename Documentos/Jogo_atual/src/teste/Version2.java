package teste;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
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

public class Version2 extends JFrame {

	private JPanel contentPane;
	private JButton selecionar;
	private JLayeredPane layeredPane;
	private JTextPane txtpnTeste;
	private JLabel lblNewLabel;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Version2 frame = new Version2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public Version2() {
		

		setTitle("Version");
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
		txtpnTeste.setText("Disponivel na versao v0.1.0");
		txtpnTeste.setBounds(114, 143, 179, 39);
		layeredPane.add(txtpnTeste);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Credits2.class.getResource("/Imagens/teste.png")));
		lblNewLabel.setBounds(74, 11, 219, 100);
		layeredPane.add(lblNewLabel);
		
		this.getContentPane().setBackground(Color.BLACK);  	      
		
		selecionar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				
				/* Tem que voltar pra tela inicial */
				
			}
		
		
		
	});
}
}