package clase1;

public class Ejercicio1_c {
	public static void main(String[] args) {
		// c. A lo anterior, con una variable extra, elija si se deben mostrar los números pares o impares
		int numeroInicio = 5;
		int numeroFin = 14;
		boolean numeroPar = false;
		// Se deberían mostrar los números pares: 6,8,10,12,14
		if(numeroPar) {
			while(numeroFin >= numeroInicio) {
				if(numeroInicio % 2 == 0) { System.out.print(numeroInicio+";"); }
					numeroInicio++;
				}
		} else {
			while(numeroFin >= numeroInicio) {
				if(numeroInicio % 2 != 0) { System.out.print(numeroInicio+";"); }
				numeroInicio++;
			}
		}
	}
}
