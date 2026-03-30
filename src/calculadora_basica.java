import java.util.Scanner;
    public class calculadora_basica {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String resultado = "";
            double num1, num2 = 0;
            int opcao;
            System.out.println("Digite o primeiro número:");
            num1 = scanner.nextDouble();

            System.out.println("Escolha a operação:");
            System.out.printf(" 1- Adição %n 2- Subtração %n 3- Multiplicação%n 4- Divisão %n 5- Potência%n 6- Raiz quadrada%n 7- Número par%n 8- Número ímpar");
            opcao = scanner.nextInt();

            if (opcao >= 1 && opcao <= 5) {
                System.out.println("Digite o segundo número:");
                num2 = scanner.nextDouble();
            }

            switch (opcao) {
                case 1:
                    resultado = "resultado sera" + (num1 + num2);
                    break;
                case 2:
                    resultado = "resultado sera" + (num1 - num2);
                    break;
                case 3:
                    resultado = "resultado sera" + (num1*num2);
                    break;
                case 4:
                    if (num2 != 0) {
                        resultado = "resultado sera" + (num1 / num2);
                    } else {
                        resultado = "Erro: divisão por zero!";
                    }
                    break;
                case 5:
                    resultado = "resultado sera" + Math.pow(num1, num2);
                    break;
                case 6:
                    if (num1 >= 0) {
                        resultado = "resultado sera" + Math.sqrt(num1);
                    } else {
                        resultado ="Erro: número negativo!";
                    }
                    break;
                case 7:
                    if (num1 % 2 == 0) {
                        resultado = "resultado é par";
                    } else {
                        resultado = "resultado não é par";
                    }
                    break;
                case 8:
                    if (num1 % 2 != 0) {
                        resultado = "resultado é impar";
                    } else {
                        resultado = "resultado não é par";
                    }
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
            System.out.printf("o resultado é %s%n", resultado);
        }
    }
