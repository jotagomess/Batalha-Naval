package batalhanaval.jogadores;

import batalhanaval.navios.Navio;
import java.util.Vector;

/**
 *
 * @author jota_gomes
 */
public class Jogador {
    
    protected int id;
    protected int pontuacao;
    protected Vector<Navio> embarcacoes;
    
    public Jogador(int id) {
        this.id = id;
        this.embarcacoes = new Vector<>();
    }
   
    public void setId(int id) {
        this.id = id;
    }
    
    public void adicionaEmbarcacoes() {
        Navio fragata = new Navio("Fragata", 3);
        Navio cruzador = new Navio("Cruzador", 2);
        Navio portaAvioes = new Navio("Porta-Aviões", 4);
        
        this.embarcacoes.add(fragata);
        this.embarcacoes.add(cruzador);
        this.embarcacoes.add(portaAvioes);
    }
    
    public void atirar(int linha, int coluna) {
        
    }
}