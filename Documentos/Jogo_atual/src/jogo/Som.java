/* **************************************************************** 
 *  Autor: Elayne Natalia
 *  Matricula: 2018116013
 *  Inicio: 25/03/2020
 *  Ultima alteracao: 28/03/2020 as 14:19h
 *  Nome: Jogo da Memoria - Redes de Computadores I
 *  Funcao: Jogo multiusario desenvolvido em Java com utilizacao de sockets usando arquitetura TCP/IP
 *  *************************************************************** */

package jogo;  /* nome do pacote em que se encontra a classe Som */

import java.io.InputStream;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Som {
     

    /* ****************************************************************
     * Metodo: cartaVirando
     * Funcao: emitir som ao virar as cartas do jogo
     * Parametros: nenhum
     * Retorno: void
     * *************************************************************** */
	
    public void cartaVirando() {
    	
        try {
         
        String resource = "/audios/CartaVirando.wav";  /* Só reconhece arquivo .wav */
        
        InputStream input = getClass().getResourceAsStream(resource); /* leitura de dado local */
        Clip oClip = AudioSystem.getClip(); 
      
        AudioInputStream audio = AudioSystem.getAudioInputStream(input); /* obtem um fluxo de entrada de áudio a partir do fluxo de entrada fornecido */
        
        oClip.open(audio);
        oClip.loop(0);  /* toca apenas uma vez */
 
        } catch (Exception e) { /* tratamento de excessao */
        	e.printStackTrace();
        }
         
    }
    
    /* ****************************************************************
     * Metodo: selecionado
     * Funcao: emitir som ao clicar em botoes de ação
     * Parametros: nenhum
     * Retorno: void
     * *************************************************************** */
    
   public void selecionado() {
    	
        try {
         
        String resource = "/audios/botao.wav";
        
        InputStream input = (InputStream) getClass().getResourceAsStream(resource);
        Clip oClip = AudioSystem.getClip();
      
        AudioInputStream audio = AudioSystem.getAudioInputStream(input);
        
        oClip.open(audio);
        oClip.loop(0); 
 
        } catch (Exception e) {
        	e.printStackTrace();
        }
         
    }
    
}