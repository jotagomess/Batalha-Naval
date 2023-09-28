package batalhanaval;

import batalhanaval.jogadores.Jogador;
import batalhanaval.navios.Navio;
import java.util.Random;

/**
 *
 * @author jota_gomes
 */
public class Partida {
    
    private Jogador[] jogadores;
    private Random r;
    private int rodada;
    private int vez;
    
    public Partida(Jogador[] jogadores) {
        this.jogadores = jogadores;
        this.r = new Random();
    }
    
    public void realizaRodada() {
        boolean vencedor = false;
        
        do {
           
           
        } while(vencedor != true);
    }
    
    public void defineEmbarcacoes(int linha, int coluna, Navio navio) {
        this.jogadores[0].adicionaEmbarcacoes(linha, coluna, navio);
        
        linha = r.nextInt(1, 6);
        coluna = r.nextInt(1, 10);
        
        this.jogadores[1].adicionaEmbarcacoes(linha, coluna, navio);
    }
}