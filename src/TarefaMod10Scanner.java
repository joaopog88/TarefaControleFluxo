import java.util.Scanner;
public class TarefaMod10Scanner {
    public static void main(String args[]){
        Scanner informarNota = new Scanner(System.in);
        double nota1, nota2, nota3, nota4, media;

        System.out.println("Digite a primeira nota do aluno: ");
        nota1 = informarNota.nextDouble();
        System.out.println("Digite a segunda nota do aluno: ");
        nota2 = informarNota.nextDouble();
        System.out.println("Digite a terceira nota do aluno:");
        nota3 = informarNota.nextDouble();
        System.out.println("Digite a quarta nota do aluno:");
        nota4 = informarNota.nextDouble();
        media = ((nota1+nota2+nota3+nota4) / 4);
        System.out.println("A média do aluno no ano foi: "+media);

        if(media >= 7){
            System.out.println("Aluno aprovado!");
        }
        else if (media >= 5 && media < 7){
            System.out.println("Aluno de recuperação.");
        }
        else{
            System.out.println("Aluno reprovado.");
        }
    }
}
