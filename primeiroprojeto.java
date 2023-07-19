import java.util.Scanner;
public class primeiroprojeto {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        var nota1 = 0;
        var nota2 = 0;
        var nota3 = 0;
        var nota4 = 0;
        var soma = 0;

        final int MEDIA = 60;
        final int RECUPERACAO = 59;
        final int REPROVADO = 30;

        var nomealuno = "";
        var resutadoaluno = "";

        System.out.println("Digite seu nome: ");
        nomealuno = ler.nextLine();
        System.out.println("Digite a sua primeira nota: ");
        nota1 = ler.nextInt();
        System.out.println("Digite a sua segunda nota: ");
        nota2 = ler.nextInt();
        System.out.println("Digite a sua terceira nota: ");
        nota3 = ler.nextInt();
        System.out.println("Digite a sua quarta nota: ");
        nota4 = ler.nextInt();
        soma = nota1 + nota2 + nota3 + nota4;

        if (soma >= MEDIA) {
            resutadoaluno = "Voce esta aprovado";
        } else if ((soma <= RECUPERACAO) || (soma > REPROVADO)) {
            resutadoaluno = "Voce esta de recuperação final";
        }if (soma <= REPROVADO) {
            resutadoaluno = "Te vejo ano que vem :)";

        }
            System.out.printf("A nota do aluno %s foi de %d. %s", nomealuno, soma, resutadoaluno);

    }}


