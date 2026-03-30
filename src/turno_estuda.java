import java.util.Scanner;
public class turno_estuda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String resultado = "";
        System.out.print("Digite o turno que você estuda (M-Matutino, V-Vespertino, N-Noturno): ");
        String turno = scanner.nextLine();
        switch (turno) {
            case "M":
                resultado = "bom dia";
                break;
            case "V":
                resultado = "boa tarde";
                break;
            case "N":
                resultado = "boa noite";
                break;
            default:
                System.out.println("Valor Inválido!");
        }
        System.out.printf("%s%n",resultado);
    }
}