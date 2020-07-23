import java.util.Scanner;
import java.util.stream.IntStream;

public class TestStefaniniFalha {

	private boolean verificaPrimos(int valor) {
		return valor > 1 && IntStream.rangeClosed(2, (int) Math.sqrt(valor)).noneMatch(n -> (valor % n == 0));
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		try 
		{
			System.out.print("Informe um valor para verificacão:");
			int valor = scanner.nextInt();
			TestStefaniniFalha test = new TestStefaniniFalha();
			boolean t = test.verificaPrimos(valor);
			System.out.println(t ? "É Primo" : "Não é Primo");
		} 
		finally 
		{
			scanner.close();
		}

	}
}
