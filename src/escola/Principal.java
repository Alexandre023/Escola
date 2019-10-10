package escola;

public class Principal {

    public static void main(String[] args) {
        Escola e = new Escola();
        e.setNome("ETEC Peruibe");
        
        Turma t1 = new Turma();
        Turma t2 = new Turma();
        t1.setNomeTurma("1 MIN");
        t2.setNomeTurma("2 MIN");
        
        Alunos a1 = new Alunos();
        Alunos a2 = new Alunos();
        Alunos a3 = new Alunos();
        Alunos a4 = new Alunos();
        Alunos a5 = new Alunos();
        Alunos a6 = new Alunos();
        Alunos a7 = new Alunos();
        Alunos a8 = new Alunos();
        Alunos a9 = new Alunos();
        Alunos a10 = new Alunos();
        
        a1.setCodAluno(1);
        a1.setNome("Alexandre");
        a1.setNota1(8);
        a1.setNota2(6);
        a1.setNota3(10);
        a1.setNota4(9);
        
        a2.setCodAluno(2);
        a2.setNome("Luiz");
        a2.setNota1(8);
        a2.setNota2(4);
        a2.setNota3(7);
        a2.setNota4(9);
        
        a3.setCodAluno(3);
        a3.setNome("Camyle");
        a3.setNota1(5);
        a3.setNota2(7);
        a3.setNota3(8);
        a3.setNota4(6);
        
        a4.setCodAluno(4);
        a4.setNome("Jonas");
        a4.setNota1(8);
        a4.setNota2(10);
        a4.setNota3(7);
        a4.setNota4(9);
        
        a5.setCodAluno(5);
        a5.setNome("Ana");
        a5.setNota1(9);
        a5.setNota2(10);
        a5.setNota3(8);
        a5.setNota4(9);
        
        a6.setCodAluno(6);
        a6.setNome("Caio");
        a6.setNota1(3);
        a6.setNota2(5);
        a6.setNota3(7);
        a6.setNota4(6);
        
        a7.setCodAluno(7);
        a7.setNome("Suelen");
        a7.setNota1(7);
        a7.setNota2(4);
        a7.setNota3(7);
        a7.setNota4(9);
        
        a8.setCodAluno(8);
        a8.setNome("Carlos");
        a8.setNota1(5);
        a8.setNota2(8);
        a8.setNota3(8);
        a8.setNota4(9);
        
        a9.setCodAluno(9);
        a9.setNome("Felipe");
        a9.setNota1(8);
        a9.setNota2(6);
        a9.setNota3(7);
        a9.setNota4(9);
        
        a10.setCodAluno(10);
        a10.setNome("Beatriz");
        a10.setNota1(9);
        a10.setNota2(10);
        a10.setNota3(7);
        a10.setNota4(9);
        
        e.addTurma(t1);
        e.addTurma(t2);
        t1.addAlunos(a1);
        t1.addAlunos(a2);
        t1.addAlunos(a3);
        t1.addAlunos(a4);
        t1.addAlunos(a5);
        t2.addAlunos(a6);
        t2.addAlunos(a7);
        t2.addAlunos(a8);
        t2.addAlunos(a9);
        t2.addAlunos(a10);
        
        System.out.println("Escola: "+e.getNome());
        System.out.println("Turmas compostas nesta escola:\n"+t1.getNomeTurma()+"\n"+t2.getNomeTurma());
        System.out.println("----------");
        System.out.println("Turma: "+t1.getNomeTurma());
        t1.ExibirAlunos();
        System.out.println("----------");
        System.out.println("Turma: "+t2.getNomeTurma());
        t2.ExibirAlunos();
    }
    
}
