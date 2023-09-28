package batalhanaval.navios;

/**
 *
 * @author jota_gomes
 */
public class Navio {
    protected String nome; // Nome do navio
    protected int celula; // Tamanho do navio (número de células)
    protected boolean estado; // Estado das células do navio

    // Construtor
    public Navio(String nome, int quantCedula) {
        this.nome = nome;
        this.celula = quantCedula;
        this.estado = false; //Célula intactada
    }

    // Getter para o nome do navio
    public String getNome() {
        return this.nome;
    }

    // Getter para o tamanho do navio
    public int getCelula() {
        return this.celula;
    }

    // Getter para o estado de uma célula específica do navio
    public boolean getCelulaEstado() {
        return this.estado; 
    }

    // Setter para o estado de uma célula específica do navio
    public void setCelulaEstado() {
        this.estado = true; //Célula atingida
    }
}