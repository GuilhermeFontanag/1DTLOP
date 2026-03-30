import java.util.Scanner;

public class varias_opcoes {
    public static void main(String[] args) {
       Scanner ler = new Scanner(System.in);
       String tela;
        int opcao [] = {0,1,2,3,4};
        int selecionar;
        do {
            System.out.println("informe a opçao");
            selecionar = ler.nextInt();

            if (selecionar == 4) {
               System.out.println("sair do programa");
                return;

           }else if(selecionar >4 || selecionar == 0){
               System.out.println("opção invalida");
           }
       }while(selecionar < 1 || selecionar>4);
        System.out.printf("voce selecionou a opção %s%n",opcao[selecionar] );
    }
}
