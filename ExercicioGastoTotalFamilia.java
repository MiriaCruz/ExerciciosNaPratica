import java.util.Scanner;

public class ExercicioGastoTotalFamilia {
  public static void main(String[] args) {
	  
	 Scanner scanner = new Scanner(System.in);
	 	 	System.out.println("----------Gasto M�s Abril ---------");
	 	 	Double totalMes = 0.0;
	 	 	
	 	 	System.out.print("Conta de Luz: ");
	 	 	totalMes += scanner.nextDouble();
	 	 
	 	 	System.out.print("Conta de agua: ");
	 	 	totalMes += scanner.nextDouble();
	 	 	
	 	 	System.out.print("Conta do Telefone: ");
	 	 	totalMes += scanner.nextDouble();
	 	 	
	 	 	System.out.print("Escola do Filho: ");
	 	 	totalMes += scanner.nextDouble();
	 	 	
	 	 	System.out.print("Fatura do Cart�o: ");
	 	 	totalMes += scanner.nextDouble();
	 	 	
	 	 	System.out.print("Gasto com o Mercado: ");
	 	 	totalMes += scanner.nextDouble();
	 	 	
	 	 	
	 	 	System.out.println("Valor total esse m�s �: " + totalMes );
	 	 	
	 	 	scanner.close();	 
  }
	}
