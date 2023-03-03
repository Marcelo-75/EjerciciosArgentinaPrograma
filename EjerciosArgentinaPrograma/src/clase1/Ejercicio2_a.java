package clase1;

public class Ejercicio2_a {
	public static void main(String[] args) {
		float ingresos = 489083;
		int cantidadDeAutos = 2;
		int cantidadDeInmuebles = 1;
		boolean activosSocietarios = false;
		int aeronave = 0;
		int embarcacion = 0;		
		if(ingresos >= 489083 || cantidadDeAutos >= 3 || cantidadDeInmuebles >= 3 || activosSocietarios || aeronave > 0 || embarcacion >0) {
			System.out.println("Pertenece al segmento de altos ingresos");
		} else {
			System.out.println("No pertenece al segmento de altos ingresos");
		}
	}
}
