import java.util.Scanner;

public class ExercicioPrevidencia {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
			System.out.println("Por favor digite sua Idade: ");
			Integer idade = scanner.nextInt();
			
			System.out.println("Digite o tempo de contribuição: ");
			Integer ContribuicaoAte25 = scanner.nextInt();
			
			
			Boolean idadeMinima = idade >= 55;
			Boolean ContribuicaoMinima = ContribuicaoAte25 >= 25;
			
			Boolean podeSeAposentar = idadeMinima && ContribuicaoMinima;
			
			if (podeSeAposentar) {
				System.out.println("Sim o senhor(a) pode se Aposentar !!" );
			} else {
				System.out.println("Aposentadoria Negada !! " );
				
				scanner.close();
			}
				
	}

}
