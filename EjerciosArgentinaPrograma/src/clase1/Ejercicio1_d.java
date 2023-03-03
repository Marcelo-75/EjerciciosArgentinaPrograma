package clase1;

public class Ejercicio1_d {
	public static void main(String[] args) {
		// d. Utilizando la sentencia for, hacer lo mismo que en (b) pero invirtiendo el orden
		int numeroInicio = 5;
		int numeroFin = 14;
		// Se deberían mostrar los números: 14-12-10-8-6
		for(numeroFin = 14;numeroFin >= numeroInicio;numeroFin--) {
			if(numeroFin % 2 == 0) {
				System.out.print(numeroFin+";");
			}
		}
	}
}
