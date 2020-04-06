/* **************************************************************** 
 *  Autor: Elayne Natalia
 *  Matricula: 2018116013
 *  Inicio: 25/03/2020
 *  Ultima alteracao: 28/03/2020 as 14:19h
 *  Nome: Jogo da Memoria - Redes de Computadores I
 *  Funcao: Jogo multiusario desenvolvido em Java com utilizacao de sockets usando arquitetura TCP/IP
 *  *************************************************************** */

package jogo;  /* nome do pacote em que se encontra a classe Carta */

import javax.swing.JLabel;
import javax.swing.JMenuItem;

public abstract class Carta extends JLabel {

	/* declaracao de variaveis */
	
	private static final long serialVersionUID = 1L;
	
    public static int cont = 0;//Contador de Cliques.
    public static int pontos = 0;//Contador de Pontos
    public static int contCardViradaPar = 0;//Contador de Cartas viradas (pares)
    public static int contCartasViradasUma = 0; // Contador de Cartas viradas (uma)
    public static Carta ClicaPrimCarta;//Guarda primeira carta clicada.
    
	protected String imgFrente; //Recebe imagem o verso da carta.
    protected boolean viradaParaFrente = false;
    public Carta par;//variavel tipo carta
    public JLabel var_Label_Pontos;//Variavel do tipo jLabel
    public JLabel var_Label_Cartas_Viradas;//Ira Receber o Label : LabelQuantCartasViradas
    public JMenuItem NovoJogo;//Ira receber o Item de Menu: SubMenuDeJogo_NovoJogo
 

    /* ****************************************************************
     * Metodo: Carta
     * Funcao: construtor
     * Parametros: String imgF, JLabel Label_pont, JLabel cartasViradas, JMenuItem novojogo
     * Retorno: void
     * *************************************************************** */
    
    public Carta(String imgF, JLabel Label_pont, JLabel cartasViradas, JMenuItem novojogo) {
        super();
    }

    
    /* ****************************************************************
     * Metodo: Pontuacao
     * Funcao: contagem da pontuacao do jogo
     * Parametros: int num
     * Retorno: string
     * *************************************************************** */
    
    public static String Pontuacao(int num) {

        pontos = (num) + pontos;
        String nome_num = pontos + "";
        
        return nome_num;

    }
    
    /* ****************************************************************
     * Metodo: getImgFrente
     * Funcao: retornar a imagem
     * Parametros: nenhum
     * Retorno: string
     * *************************************************************** */
    
    public String getImgFrente() {
        return imgFrente;
    }

    /* ****************************************************************
     * Metodo: setImgFrente
     * Funcao: setar a imagem
     * Parametros: string de uma imagem
     * Retorno: void
     * *************************************************************** */
    
    public void setImgFrente(String imgFrente) {
        this.imgFrente = imgFrente;
    }

    /* ****************************************************************
     * Metodo: isViradaPraFrente
     * Funcao: identificar se a carta está virada ou nao
     * Parametros: nenhum
     * Retorno: boolean
     * *************************************************************** */
    
    public boolean isViradaPraFrente() {
        return viradaParaFrente;
    }

    /* ****************************************************************
     * Metodo: setViradaPraFrente
     * Funcao: setar a imagem
     * Parametros: boolena viradaParaFrente
     * Retorno: void
     * *************************************************************** */
    
    public void setViradaPraFrente(boolean viradaParaFrente) {
        this.viradaParaFrente = viradaParaFrente;
    }

    /* ****************************************************************
     * Metodo: getPar
     * Funcao: identificar qual o par de uma carta
     * Parametros: nenhum
     * Retorno: variavel do tipo carta
     * *************************************************************** */
    
    public Carta getPar() {
        return par;
    }

    /* ****************************************************************
     * Metodo: setPar
     * Funcao: setar os pares das cartas do jogo
     * Parametros: variavel do tipo carta
     * Retorno: void
     * *************************************************************** */
    
    public void setPar(Carta par) {
        this.par = par;
    }
    
    /* ****************************************************************
     *Metodos abstratos que sera implementados pela classe filha
     * *************************************************************** */
    
    public abstract void esconderCarta();    
    public abstract void mostrarCarta();
    public abstract void subMenuDeJogoNovoJogoActionPerformed() ;
    public abstract void capturarCliqueDoMouse() ;
  
}
