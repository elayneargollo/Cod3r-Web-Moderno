package teste;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import menu.Credits;

import javax.swing.JTextPane;
import java.awt.Font;

public class Credits2 extends JFrame {

	private JPanel contentPane;
	private JButton selecionar;
	private JLayeredPane layeredPane;
	private JTextPane txtpnTeste;
	private JLabel lblNewLabel;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Credits2 frame = new Credits2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public Credits2() {
		

		setTitle("Credits");
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
		txtpnTeste.setBackground(Color.BLACK);
		txtpnTeste.setFont(new Font("Verdana", Font.PLAIN, 11));
		txtpnTeste.setForeground(Color.WHITE);
		txtpnTeste.setText("Orientador :\r\n   > Grinaldo Lopes de Oliveira\r\n\t\t\t\r\nColaboradores :\r\n  > Elayne Natalia de O. Argollo\r\n  > Edilton Silva Junior\r\n  > Gabriel dos Reis Morais\r\n");
		txtpnTeste.setBounds(76, 169, 254, 132);
		layeredPane.add(txtpnTeste);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Credits2.class.getResource("/Imagens/IFBAlogo.png")));
		lblNewLabel.setBounds(10, 11, 356, 117);
		layeredPane.add(lblNewLabel);
				this.getContentPane().setBackground(Color.BLACK);  	      
		
		selecionar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
			
	
				setVisible(false);
				
	
		
			}
		
		
		
	});
}
}