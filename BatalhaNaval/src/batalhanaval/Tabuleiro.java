package batalhanaval;

import batalhanaval.navios.Navio;

/**
 *
 * @author jota_gomes
 */
public class Tabuleiro {
    
    private Navio embarcacoes[][];
    private int linhas;
    private int colunas; 
    
    public Tabuleiro(int linhas, int colunas) {
        this.linhas = linhas;
        this.colunas = colunas;
        this.embarcacoes = new Navio[linhas][colunas];
    }

    public Navio getEmbarcacoes(int linha, int coluna) {
        return this.embarcacoes[linha][coluna];
    }

    public int getLinhas() {
        return this.linhas;
    }

    public int getColunas() {
        return this.colunas;
    }
    
}