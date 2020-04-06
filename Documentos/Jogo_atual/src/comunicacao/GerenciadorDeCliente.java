/* **************************************************************** 
 *  Autor: Elayne Natalia
 *  Matricula: 2018116013
 *  Inicio: 25/03/2020
 *  Ultima alteracao: 28/03/2020 as 14:19h
 *  Nome: Jogo da Memoria - Redes de Computadores I
 *  Funcao: Jogo multiusario desenvolvido em Java com utilizacao de sockets usando arquitetura TCP/IP
 *  *************************************************************** */

package comunicacao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.JOptionPane;

public class GerenciadorDeCliente extends Thread{

	/* declaracao de variaveis */
	
	private Socket cliente;
	private String nomeCliente;
	
    /* ****************************************************************
     * Metodo: GerenciadorDeCliente
     * Funcao: permitir que varios clientes se conectem ao servidor ao mesmo tempo
     * Parametros: Socket cliente
     * Retorno: void
     * *************************************************************** */
	
	public GerenciadorDeCliente(Socket cliente) {
		this.cliente = cliente;
		start(); 
	}
	
}
	
