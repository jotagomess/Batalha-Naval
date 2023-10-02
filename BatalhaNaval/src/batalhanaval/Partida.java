package batalhanaval;

import batalhanaval.jogadores.Jogador;
import batalhanaval.jogadores.Maquina;
import batalhanaval.navios.Navio;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author jota_gomes
 */
public class Partida {
    
    private Jogador jogador;
    private Tabuleiro tabuleiro;
    private Maquina maquina;
    private Random r;
    private int rodada;
    private int vez;
    
    public Partida() {
        this.maquina = new Maquina();
        this.tabuleiro = new Tabuleiro();
        this.jogador = new Jogador();
        this.r = new Random();
    }
    
    public boolean defineEmbarcacoes(int linha, int coluna, Navio navio, boolean orientacao) {
        if (jogador.adicionaEmbarcacoes(linha, coluna, navio, orientacao)) {
            maquina.adicionaEmbarcacoes(navio);      
            return true;
        } 
        
        return false;
    }

}