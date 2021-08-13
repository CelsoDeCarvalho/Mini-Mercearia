package teste;

import java.util.Scanner;

/**
 *
 * @author De Carvalho
 */
public class Teste {
    
    
    private static void menu(){
        Scanner leitor=new Scanner(System.in);
        int escolha;
        do{
        
            System.out.println("-------------------------------------------------");
            System.out.println("|      SISTEMA DE GERENCIAMENTO DE MERCEARIA     |");
            System.out.println("-------------------------------------------------");
            System.out.println("[1] ENTRAR\n[2] CADASTRAR\n[3] APP INFO\n[0] SAIR");
            System.out.print("=> ");
            escolha =leitor.nextInt();
        
            switch(escolha){
                case 1:break;
                case 2:break;
                case 3:break;
                case 0:System.exit(0); break;
                default:{
                    System.err.println("Opcao invalida");
                }
            }
        }while(escolha!=0);
        
    }
    
    public static void main(String[] args) {
        menu();
    }
    
}
