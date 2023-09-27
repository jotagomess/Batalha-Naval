package batalha.navios;

/**
 *
 * @author jota_gomes
 */
public class Navio {
    protected String nome; // Nome do navio
    protected int tamanho; // Tamanho do navio (número de células)
    protected boolean[] estado; // Estado das células do navio

    // Construtor
    public Navio(String nome, int tamanho) {
        this.nome = nome;
        this.tamanho = tamanho;
        this.estado = new boolean[tamanho]; // Inicialmente, todas as células estão intactas
    }

    // Getter para o nome do navio
    public String getNome() {
        return nome;
    }

    // Getter para o tamanho do navio
    public int getTamanho() {
        return tamanho;
    }

    // Getter para o estado de uma célula específica do navio
    public boolean getCelulaEstado(int indiceCelula) {
        if (indiceCelula >= 0 && indiceCelula < tamanho) {
            return estado[indiceCelula];
        }
        return false; // Índice de célula inválido
    }

    // Setter para o estado de uma célula específica do navio
    public void setCelulaEstado(int indiceCelula, boolean atingida) {
        if (indiceCelula >= 0 && indiceCelula < tamanho) {
            estado[indiceCelula] = atingida;
        }
    }
}