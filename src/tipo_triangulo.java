import java.util.Scanner;

public class tipo_triangulo {
    public static void main(String[] args) {
        int lad1,lad2,lad3;
        String information;
        Scanner ler = new Scanner(System.in);
        System.out.println("informe os lados");
        lad1 = ler.nextInt();
        lad2 = ler.nextInt();
        lad3 = ler.nextInt();
        if (lad1 == lad2 && lad2 == lad3){
            information = "equilatero";
        }else if (lad1 == lad2 || lad1 == lad3 || lad2 == lad3){
            information = "isócles";
        }else{
            information = "Escaleno";
        }
        System.out.printf("o triangulo é tipo %s%n",information);

    }
}
