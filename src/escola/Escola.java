package escola;

import java.util.ArrayList;
import java.util.List;

public class Escola {
    private String Nome;
    private List<Turma> Filial=new ArrayList<Turma>();
    
    public void ExibirTurma(){
        
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public List<Turma> getFilial() {
        return Filial;
    }

    public void setFilial(List<Turma> Filial) {
        this.Filial = Filial;
    }
    
}
