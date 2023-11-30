public class TarefaMod10 {
    public static void main(String args[]){

    double nota1, nota2, nota3, nota4, nota5, nota6;

    nota1 = 8;
    nota2 = 6;
    nota3 = 7;
    nota4 = 9;

    nota5 = (nota1+nota2+nota3+nota4);
    nota6 = (nota5 / 4);
    System.out.println("Média do aluno: "+nota6);

    if(nota6 >= 7){
        System.out.println("Aluno Aprovado!");
    }
    else if(nota6 >= 5 && nota6<7){
        System.out.println("Aluno de recuperação.");
    }
    else {
        System.out.println("Aluno reprovado.");
    }






    }
}
