package batalhanaval.jogadores;

import batalhanaval.Tabuleiro;
import batalhanaval.navios.Navio;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author jota_gomes
 */
public class Jogador {

    protected int pontuacao;
    protected Navio[][] embarcacoes;

    public Jogador() {
        this.embarcacoes = new Navio[5][10];
    }

    public boolean adicionaEmbarcacoes(int linha, int coluna, Navio navio, boolean orientacao) {
        int tamanhoNavio = navio.getCelula();
        int linhaAtual = linha;
        int colunaAtual = coluna;

        if (verificarPosicaoOcupada(linhaAtual, colunaAtual)) {
            JOptionPane.showMessageDialog(null, "A posição escolhida está ocupada. Escolha outra posição.", "Posição Ocupada", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        if (!verificarPosicaoValida(linhaAtual, colunaAtual, navio, orientacao)) {
            JOptionPane.showConfirmDialog(null, "A posição escolhida não é válida. Escolha outra", "Posição Inválida", JOptionPane.YES_NO_OPTION);
            return false;

        } 
           
        adicionarNavio(linhaAtual, colunaAtual, navio, orientacao);
        return true;
    }

    private boolean verificarPosicaoOcupada(int linha, int coluna) {
        return (this.embarcacoes[linha][coluna] != null);
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
        try {
            if (orientacao) {
                for (int i = 0; i < navio.getCelula(); i++) {
                    if (linha + navio.getCelula() >= 5) {
                        // Move para a esquerda se não couber à direita
                        this.embarcacoes[linha - i][coluna] = navio;
                    } else {
                        this.embarcacoes[linha + i][coluna] = navio;
                    }
                }
            } else {
                for (int i = 0; i < navio.getCelula(); i++) {
                    if (coluna + navio.getCelula() >= 10) {
                        // Mova para cima se não couber para baixo
                        this.embarcacoes[linha][coluna - i] = navio;
                    } else {
                        this.embarcacoes[linha][coluna + i] = navio;
                    }
                }
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            JOptionPane.showMessageDialog(null, "O valor informado excede o tabuleiro",
                    "Erro na entrada", JOptionPane.ERROR_MESSAGE);
        }
    }

    public Navio[][] getEmbarcacoes() {
        return embarcacoes;
    }
    
}
