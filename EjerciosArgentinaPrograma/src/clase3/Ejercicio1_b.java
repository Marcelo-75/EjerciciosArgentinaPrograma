package clase3;

public class Ejercicio1_b {
	public static void main(String[] args) {
		//int num1 = 16, num2 = 28, num3 = 8;
		boolean ascendente = true;
		int numeros[] = new int[] {16,28,8};
		int aux;

		if(ascendente) {
			for(int i=0;i<numeros.length;i++) {
				for(int j=i+1; j<numeros.length;j++) {
					if(numeros[i] < numeros[j]) {
						aux = numeros[i];
						numeros[i] = numeros[j];
						numeros[j] = aux;
					}
				}
			}
		}
		else {
			for(int i=0;i<numeros.length;i++) {
				for(int j=i+1; j<numeros.length;j++) {
					if(numeros[i] > numeros[j]) {
						aux = numeros[i];
						numeros[i] = numeros[j];
						numeros[j] = aux;
					}
				}
			}
		}
		for(int n:numeros) {
			System.out.print(n+";");
		}
	}
}
