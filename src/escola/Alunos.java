package escola;

public class Alunos {
    private int CodAluno;
    private String Nome;
    private int nota1;
    private int nota2;
    private int nota3;
    private int nota4;
    
    public String ExibirSituaçao(){
        int notaFinal=(this.nota1+this.nota2+this.nota3+this.nota4)/4;
        if(notaFinal >= 7){
            return "Você foi aprovado(a) com nota: "+notaFinal;
        }else{
            return "Você foi reprovado(a) com a nota: "+notaFinal;
        }
    }
}
