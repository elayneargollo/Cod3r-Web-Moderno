/* **************************************************************** 
 *  Autor: Elayne Natalia
 *  Matricula: 2018116013
 *  Inicio: 25/03/2020
 *  Ultima alteracao: 28/03/2020 as 14:19h
 *  Nome: Jogo da Memoria - Redes de Computadores I
 *  Funcao: Jogo multiusario desenvolvido em Java com utilizacao de sockets usando arquitetura TCP/IP
 *  *************************************************************** */

package comunicacao;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import javax.swing.JOptionPane;

public class SocketServidor {	
	
	/* declaracao de variavel */
	
	private ServerSocket server = null;
	
	 /* ****************************************************************
     * Metodo: criarServerSocket
     * Funcao: criar socket para manter jogo
     * Parametros: int porta
     * Retorno: void
     * *************************************************************** */
	
	public void criarServerSocket(int porta) throws IOException {
		server = new ServerSocket(porta);
	}
	
	 /* ****************************************************************
     * Metodo: esperarConexao
     * Funcao: espera conexao do cliente
     * Parametros: nenhum
     * Retorno: void
     * *************************************************************** */
	
	public Socket esperarConexao() throws IOException {
		Socket client = server.accept();
		return client;
	}

	 /* ****************************************************************
     * Metodo: main
     * Funcao: inicializar servidor
     * Parametros: nenhum
     * Retorno: void
     * *************************************************************** */
	
	public static void main(String[] args) throws IOException {
		
		try {
			
			SocketServidor servidor = new SocketServidor();
			servidor.criarServerSocket(11111); /* atualiza essa porta <<<<--- */
			JOptionPane.showMessageDialog(null, "Servidor iniciador com sucesso");

			while (true) {
				Socket cliente = servidor.esperarConexao(); 
				new GerenciadorDeCliente(cliente); /* varios clientes se conectando ao mesmo tempo */
			}
			
		} catch (IOException e) { /* tratamento de erro */
			JOptionPane.showMessageDialog(null, "A porta esta ocupada ou o servidor esta ocupado.");
		} 
		
	}
}
