package batalhanaval;

import batalhanaval.navios.Navio;

/**
 *
 * @author jota_gomes
 */
public class Tabuleiro {
    
    private Navio embarcacoes[][];
    
    public Tabuleiro() {
        this.embarcacoes = new Navio[5][10];
    }

    public Navio getEmbarcacoes(int linha, int coluna) {
        return this.embarcacoes[linha][coluna];
    }

    public void setEmbarcacoes(Navio[][] embarcacoes) {
        this.embarcacoes = embarcacoes;
    }
    
}