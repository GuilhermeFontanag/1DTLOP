        import java.util.Scanner;
    public class dia_semana {
        public static void main(String[] args) {
            int dia;
            Scanner teclado = new Scanner(System.in);
            String semana[] = {"domingo", "segunda", "terça", "quarta", "quinta", "sexta", "sabado", };
                do {
                    System.out.println("informe o dia da semana( 1 a 7");
                     dia = teclado.nextInt();
                    if (0>=dia || dia>7 ) {
                        System.out.println("invalido");
                    }
                }while(0>=dia || dia>7);
            System.out.printf("o dia da semana é %s", semana[dia]);
        }
    }
