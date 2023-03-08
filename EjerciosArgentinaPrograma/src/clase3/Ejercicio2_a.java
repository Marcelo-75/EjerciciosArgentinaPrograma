package clase3;

/* ************************************************************************************** */
/* EN ESTA VERSION SE USA EL MISMO METODO PARA CODIFICAR Y DECODIFICAR SEGUN EL TEXTO Y   */
/* VALOR DE DESPLAZAMIENTO CONFIGURADO. NO SE COMPARAN TEXTOS SINO QUE SE ASIGNA EN UN    */
/* ARRAY EL VALOR ENTERO DE CADA CARACTER Y LUEGO SE LE SUMA (O RESTA) EL DESPLAZAMIENTO  */
/* PARA TERMINAR CONCATENANDO CADA CARACTER CON EL DESPLAZAMIENTO EN UNA VARIABLE DE TIPO */
/* STRING E IMPRIME EL RESULTADO DE LA FUNCION.                                           */
/* ************************************************************************************** */

public class Ejercicio2_a {
	public static void main(String[] args) {
		String cadena = "hola que tal";

		//llamo al metodo pasando como parametro el texto de la variable cadena
		String cadenaCodificada = CodificarDecodificar(cadena, 3);
		System.out.println(cadenaCodificada);
		
		//llamo (e imprimo) al metodo pasando como parametro la variable cadenaCodificada
		System.out.println(CodificarDecodificar(cadenaCodificada, -3));
	}

	private static String CodificarDecodificar(String cadena, int nDesplazamiento) {
		char strToChar[] = new char[cadena.length()];
		String textoCodificado = "";
		
		for (int i = 0; i < strToChar.length; i++) {
			// Convierto cada caracter ascii de la cadena (+ el desplazamiento) en char
			strToChar[i] = (char) ((cadena.charAt(i))+nDesplazamiento);
			textoCodificado = textoCodificado + strToChar[i];
		}

		return textoCodificado;
	}
}
