package batalhanaval.jogadores;

import batalhanaval.navios.Navio;
import java.util.Vector;

public class Maquina extends Jogador{
    
    public Maquina(int id) {
        super(id);
        super.embarcacoes = new Vector<>();
    }
}