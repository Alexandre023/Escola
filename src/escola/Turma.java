package escola;

import java.util.ArrayList;
import java.util.List;

public class Turma {
    private String  NomeTurma;
    private List<Alunos> Alunos=new ArrayList<Alunos>();
    
    public void ExibirAlunos(){
        
    }

    public String getNomeTurma() {
        return NomeTurma;
    }

    public void setNomeTurma(String NomeTurma) {
        this.NomeTurma = NomeTurma;
    }

    public List<Alunos> getAlunos() {
        return Alunos;
    }

    public void setAlunos(List<Alunos> Alunos) {
        this.Alunos = Alunos;
    }
    
}
