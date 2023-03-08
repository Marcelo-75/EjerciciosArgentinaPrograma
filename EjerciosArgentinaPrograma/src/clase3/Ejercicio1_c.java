package clase3;

public class Ejercicio1_c {
	public static void main(String[] args) {
		int n = 30;
		int sumatoria = mayorQueN(n);
		
		System.out.println("Valor de la sumatoria: "+sumatoria);
	}
	public static int mayorQueN(int n) {
		int numeros[] = new int[] {16,28,8};
		int sumaN = 0;
		for(int valor:numeros) {
			if(n>valor) {
				sumaN = sumaN + valor; 
			}
		}
	return sumaN;
	}
}
