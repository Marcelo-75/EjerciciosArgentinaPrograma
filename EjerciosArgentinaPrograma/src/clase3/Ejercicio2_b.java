package clase3;

/* ************************************************************************************** */
/* EN ESTA VERSION SE USAN DOS METODOS, UNO PARA CODIFICAR Y OTRO PARA DECODIFICAR Y SE   */
/* USA UNA VARIABLE STRING PARA COMPARAR LA CADENA A CODIFICAR O DECODIFICAR CON EL ABE-  */
/* CEDARIO. SE RECORRE TANTO LA CADENA DE TEXTO COMO EL ABECEDARIO EN BUSCA DE LAS COIN-  */
/* CIDENCIAS Y SE SUMA/RESTA EL DESPLAZAMIENTO PARA ENCONTRAR EL CARACTER QUE CORRESPONDA */
/* TAMBIEN SE TIENE EN CUENTA LOS POSIBLES SOBREPASOS DE LOS INDICES EVALUANDO SI LA PO-  */
/* SICION ES MAYOR A LA CADENA DEL ABECEDARIO O SI ES MENOR A 0.                          */
/* ************************************************************************************** */

public class Ejercicio2_b {
	public static void main(String[] args) {
		String cadena = "hola que tal";
		String textoCod = Codificar(cadena, 1);
		System.out.println(textoCod);
		//Se podria asignar a la variable directamente el resultado del metodo Codificar con la siguiente linea.
		//String textoDecod = Decodificar(Codificar(cadena, 2), -2);
		String textoDecod = Decodificar(textoCod, -1);
		System.out.println(textoDecod);
	}

	private static String Decodificar(String decodificar, int despla) {
		String abcd ="abcdefghijklmnopqrstuvwxyz ";
		String decodificado = "";
		for (int i = 0; i < decodificar.length(); i++) {
			for (int j = 0; j < abcd.length(); j++) {
				if(decodificar.charAt(i)==abcd.charAt(j) ) {
					if(despla + j < 0) {
						//si con el desplazamiento es menor a 0, la posicion comienza en el largo de la cadena
						decodificado = decodificado + abcd.charAt((despla+j)+abcd.length());
					} else if(despla + j >= abcd.length()) {
						//si con el desplazamiento supera el largo de la cadena comienza de la posicion 0
						decodificado = decodificado + abcd.charAt((despla+j)-abcd.length());
					} else {
						decodificado = decodificado + abcd.charAt(j+despla);
					}
					
				}
			}
		}
		return decodificado;
	}

	private static String Codificar(String cadena, int despla) {
		String abcd ="abcdefghijklmnopqrstuvwxyz ";
		String codificado = "";
		for (int i = 0; i < cadena.length(); i++) {
			for (int j = 0; j < abcd.length(); j++) {

				if(cadena.charAt(i)==abcd.charAt(j) ) {
					if(despla + j >= abcd.length()) {
						//si con el desplazamiento supera el largo de la cadena comienza de la posicion 0
						codificado = codificado + abcd.charAt((despla+j)-abcd.length());
					} else if(despla + j < 0) {
						//si con el desplazamiento es menor a 0, la posicion comienza en el largo de la cadena
						codificado = codificado + abcd.charAt((despla+j)+abcd.length());
					} else {
						codificado = codificado + abcd.charAt(j+despla);
					}
				}

			}
		}
		return codificado;
	}	

}
