import java.util.Scanner;
public class residencia {
    public static void main(String[] args) {
        //atribuição
        double consumo;
        double valorConta = 0;
        Scanner ler = new Scanner(System.in);
        System.out.println("leitor de consumo de agua, informe o tipo ");
        String tipo = ler.nextLine();
        if (tipo.equals("social")) {
            System.out.println("informe o consumo da agua(em m³)");
            consumo = ler.nextDouble();

            if (10 >= consumo) {
                valorConta = 7.59;
            } else if (20 >= consumo) {
                valorConta = consumo * 1.31;
            } else if (30 >= consumo) {
                valorConta = consumo * 4.64;
            } else if (50 >= consumo) {
                valorConta = consumo * 6.62;
            } else {
                valorConta = consumo * 7.31;
            }

            System.out.printf("valor da conta sera %.2f %n", valorConta);
        }
        if (tipo.equals(" residencial")) {
            System.out.println("informe o consumo de agua em m³");
            consumo = ler.nextDouble();
            if (10 >= consumo) {
                valorConta = 22.38;
            } else if (20 >= consumo) {
                valorConta = consumo * 3.50;
            } else if (50 >= consumo) {
                valorConta = consumo * 8.75;
            } else {
                valorConta = consumo * 9.64;
            }
            System.out.printf("o valor do consumo é %.2f%n", valorConta);
        }
        if (tipo.equals("predio")) {
            System.out.println("informe o consumo de agua em m³");
            consumo = ler.nextDouble();
            if (10 >= consumo) {
                valorConta = 44.95;
            } else if (20 >= consumo) {
                valorConta = consumo * 8.75;
            } else if (50 >= consumo) {
                valorConta = consumo * 16.75;
            } else {
                valorConta = consumo * 17.46;
            }
            System.out.printf("o valor do consumo é %.2f%n", valorConta);
        }
    }
}