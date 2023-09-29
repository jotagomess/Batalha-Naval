package batalhanaval.jogadores;

import batalhanaval.Tabuleiro;
import batalhanaval.navios.Navio;
import java.util.Vector;

/**
 *
 * @author jota_gomes
 */
public class Jogador {
    
    protected int id;
    protected int pontuacao;
    private Tabuleiro tabuleiro;
    protected Vector<Navio> embarcacoes;
    
    public Jogador(int id) {
        this.id = id;
        this.embarcacoes = new Vector<>();
        this.tabuleiro = new Tabuleiro(5, 10);
    }
   
    public void setId(int id) {
        this.id = id;
    }
    
    public void adicionaEmbarcacoes(int linha, int coluna, Navio navio) {
        this.tabuleiro.setEmbarcacoes(linha, coluna,navio);
    }
    
    public void atirar(int linha, int coluna) {
        
    }
}