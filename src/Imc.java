import java.util.Scanner;

public class Imc {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String classificacao;

        System.out.print("informe a sua altura(em m):");
        double altura = ler.nextDouble();

        System.out.print("informe seu peso(em kg):");
        double peso = ler.nextDouble();

         double imc = peso / Math.pow(altura, 2);

        if (imc<16){
            classificacao = "magreza grave";
        }else if(imc <17){
            classificacao = "magreza moderada";
        }else if(imc <18.5) {
            classificacao = "magreza leve";
        }else if(imc <25){
                classificacao = "saudavel";
        }else if(imc <30){
            classificacao = "sobrepeso";
        }else if(imc <35){
            classificacao = "obesidade grau I";
        }else if(imc <40){
            classificacao = "obesidade grau II(mórbida";
        }else {
            classificacao = "obesidade grau II(mórbida";

        }
        System.out.printf("seu imc é %.1f%n ", imc);
        System.out.printf("sua classificacao é %s%n",classificacao);
    }
}
