package clase3;

public class Ejercicio1_a {

	public static void main(String[] args) {
		String palabra = "paleontoLOGIA";
		char letra = 'A';
		int repetida = 0;
		
		for(int i = 0; i < palabra.length(); i++) {
			//Se usa toLowerCase() (String) y Character.toLowerCase() (char) para que sea
			//indistinto si estan en mayuscula o minuscula la palabra elegida y la letra a buscar
			if(palabra.toLowerCase().charAt(i) == Character.toLowerCase(letra)) {
				repetida++;
			}
		}
		System.out.println("La letra \""+letra+"\" se repite "+repetida+" veces en la palabra "+palabra);
	}

}
