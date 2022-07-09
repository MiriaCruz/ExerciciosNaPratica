import java.util.Scanner;

public class AlterandoValorVariavel {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
		System.out.print("Digite o valor do produto: ");
		Double valorProduto = scanner.nextDouble();
		
		System.out.print("Digite o tipo de pagamento [1 = à vista / 2 = à prazo]: ");
		Integer tipoPagamento = scanner.nextInt();
		
		Boolean pagamentoAVista = tipoPagamento.equals(1); 
		
		Double juros = 0.0;
		
		if (pagamentoAVista) {
			
		} else {
			juros = 10.0;
		}
		
		Double acrescimo = valorProduto * juros / 100;
		
		Double valorTotal = acrescimo + valorProduto;
		
		System.out.print("Valor total: "  + valorTotal);
		
		scanner.close();
		
	} // na linha usando 20 a ! ex: if(!pagamentoAVista) ela irá negar, ou seja vai fazer com que ela fique true, ou seja se o pagamento não for a vista vai ser dado o acrescimo como na versão feita acima 

}
