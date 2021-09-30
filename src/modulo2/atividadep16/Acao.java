import java.util.Scanner;

public class Acao {

   private Scanner sc;
   
   public void cabecalho(){
        System.out.println("======== SISTEMA DE TRANSACOES ======== \n");
   }
   
   public void Menu(){
      System.out.println("----- OPERAÇÃOES DISPONÍVEIS -----");
      System.out.println("1- DEPOSITO |\t2 - SAQUE || \t3 - TRANSFERENCIA \n");
   }
   
   public double lerValor(String msg){
      sc = new Scanner(System.in);
      double valor=0;
      do{
         System.out.print(msg);
         valor = Double.parseDouble(sc.nextLine());
         if(valor<=0){
            System.out.println("Valor inválido!\n");
         }
      } while(valor<0);
      return valor;
   }

   public boolean validaOutraTransacao(){
      sc = new Scanner(System.in);
      System.out.print("Gostaria de realizar outra transacao? (S/N):");
      char resposta = sc.nextLine().toUpperCase().charAt(0);

      if(resposta=='S'){
         return true;
      }

      return false;
   }
   
}
