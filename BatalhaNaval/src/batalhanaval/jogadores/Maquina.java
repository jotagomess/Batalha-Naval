package batalhanaval.jogadores;

import batalhanaval.navios.Navio;

import java.util.Random;

public class Maquina {

    private Navio[][] embarcacoes;
    private Random random;

    public Maquina() {
        this.embarcacoes = new Navio[5][10];
        random = new Random();
    }

    public void adicionaEmbarcacoes(Navio navio) {
        boolean valido = false;
        int linha = 0;
        int coluna = 0;
        boolean orientacao = false;
        
        do {
            if (valido) {
               break;
            }
            
            // Não cabe na posição atual, escolher outra aleatoriamente
            linha = random.nextInt(5);
            coluna = random.nextInt(10);
            orientacao = random.nextBoolean();
            
            valido = verificarPosicaoValida(linha, coluna, navio, orientacao);
        } while (valido != true);

        adicionarNavio(linha, coluna, navio, orientacao);
    }
    
    private boolean verificarPosicaoOcupada(int linha, int coluna) {
        if (linha >= 0 && linha < 5 && coluna >= 0 && coluna < 10) {
            return (this.embarcacoes[linha][coluna] != null);
        }
        return true;
    }    
    private boolean verificarPosicaoValida(int linha, int coluna, Navio navio, boolean orientacao) {
        int tamanhoNavio = navio.getCelula();

        if (orientacao) {
            for (int i = 0; i < tamanhoNavio; i++) {
                if (linha + navio.getCelula() >= 5) {
                    if (verificarPosicaoOcupada(linha - i, coluna)) {
                        return false;
                    }
                } else {
                    if (verificarPosicaoOcupada(linha + i, coluna)) {
                        return false;
                    }
                }
            }
        } else {
            for (int i = 0; i < tamanhoNavio; i++) {
                if (coluna + navio.getCelula() >= 10) {
                    if (verificarPosicaoOcupada(linha, coluna - i)) {
                        return false;
                    }
                } else {
                    if (verificarPosicaoOcupada(linha, coluna + i)) {
                        return false;
                    }
                }
            }
        }

        return true;
    }
    
    public void adicionarNavio(int linha, int coluna, Navio navio, boolean orientacao) {
        if (orientacao) {
            for (int i = 0; i < navio.getCelula(); i++) {
                if (linha + navio.getCelula() >= 5) {
                    this.embarcacoes[linha - i][coluna] = navio;
                } else {
                    this.embarcacoes[linha + i][coluna] = navio;
                }
            }
        } else {
            for (int i = 0; i < navio.getCelula(); i++) {
                if (coluna + navio.getCelula() >= 10) {
                    this.embarcacoes[linha][coluna - i] = navio;
                } else {
                    this.embarcacoes[linha][coluna + i] = navio;
                }
            }
        }
    }
    
    public Navio[][] getEmbarcacoes() {
        return embarcacoes;
    }
}