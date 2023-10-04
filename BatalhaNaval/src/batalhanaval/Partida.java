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
    private Maquina maquina;
    private Random r;
    private int rodada;
    private int vez;
    private boolean[][] jogadas;
    
    public Partida() {
        this.maquina = new Maquina();
        this.jogador = new Jogador();
        this.jogadas = new boolean[5][10];
        this.r = new Random();
    }
    
    public boolean defineEmbarcacoes(int linha, int coluna, Navio navio, boolean orientacao) {
        if (jogador.adicionaEmbarcacoes(linha, coluna, navio, orientacao)) {
            maquina.adicionaEmbarcacoes(navio);      
            return true;
        } 
        
        return false;
    }
    
    public int realizaRodada(int linhaP, int colunaP, int linhaIA, int colunaIA) {
        boolean jogadorAcertou = jogador.realizaTiro(linhaP, colunaP, this.maquina);
        boolean maquinaAcertou = maquina.realizaTiro(linhaIA, colunaIA, this.jogador);
        
        if (!jogadas[linhaP][colunaP]) {
            jogadas[linhaP][colunaP] = true;
            if (jogadorAcertou && !maquinaAcertou) {
                // Jogador acertou, máquina errou
                return 1;
            } else if (!jogadorAcertou && maquinaAcertou) {
                // Máquina acertou, jogador errou
                return 2;
            } else if (jogadorAcertou && maquinaAcertou) {
                // Ambos acertaram
                return 3;
            } else {
                // Ambos erraram
                return 4;
            }
        } else {
            return 0;
        }
    }

}