import java.util.Scanner;

public class ExercicioGastoTotalFamilia {
  public static void main(String[] args) {
	  
	 Scanner scanner = new Scanner(System.in);
	 	 	System.out.println("----------Gasto Mês Abril ---------");
	 	 	Double totalMes = 0.0;
	 	 	
	 	 	System.out.print("Conta de Luz: ");
	 	 	totalMes += scanner.nextDouble();
	 	 
	 	 	System.out.print("Conta de agua: ");
	 	 	totalMes += scanner.nextDouble();
	 	 	
	 	 	System.out.print("Conta do Telefone: ");
	 	 	totalMes += scanner.nextDouble();
	 	 	
	 	 	System.out.print("Escola do Filho: ");
	 	 	totalMes += scanner.nextDouble();
	 	 	
	 	 	System.out.print("Fatura do Cartão: ");
	 	 	totalMes += scanner.nextDouble();
	 	 	
	 	 	System.out.print("Gasto com o Mercado: ");
	 	 	totalMes += scanner.nextDouble();
	 	 	
	 	 	
	 	 	System.out.println("Valor total esse mês é: " + totalMes );
	 	 	
	 	 	scanner.close();	 
  }
	}
