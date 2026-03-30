import java.util.Scanner;
public class situação_escolar {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
double n1,n2,n3,n4;
        String conceito;
        String situacao;
        System.out.println("Digite a nota do 1º bimestre: ");
         n1 = teclado.nextDouble();
        System.out.println("Digite a nota do 2º bimestre: ");
         n2 =teclado.nextDouble();
        System.out.println("Digite a nota do 3º bimestre: ");
         n3 =teclado.nextDouble();
        System.out.println("Digite a nota do 4º bimestre: ");
         n4 =teclado.nextDouble();

        double media = (n1 + n2 + n3 + n4) / 4;

        if (media >= 9) conceito = "A";
        else if (media >= 7.5) conceito = "B";
        else if (media >= 6) conceito = "C";
        else if (media >= 4) conceito = "D";
        else conceito = "E";

        // Situação do aluno
       situacao = (conceito.equals("A") || conceito.equals("B") || conceito.equals("C")) ? "APROVADO" : "REPROVADO";

        // Exibição dos resultados
        System.out.println("Notas: " + n1 + ", " + n2 + ", " + n3 + ", " + n4);
        System.out.println("Média: " + media);
        System.out.println("Conceito: " + conceito);
        System.out.println("Situação: " + situacao);

    }
}