package br.com.dissemine.desafio;

/**
 * Verifica se os numeros entre 0 e 100 s�o multiplos de 3
 * @author leonardo valeriano
 */
public class Multiplos3 {
	public static void main(String[] args) {
//		
//		for (int i=0; i<=100; i++) {
//			int resto = i%3;
//			if (resto == 0) {
//				System.out.println(i + " � multiplo de 3");
//			} else {
//				System.out.println(i + " n�o � multiplo de 3");
//			}
//		}
		
		int numero = 0;
		while (numero <= 100) {
			if (numero % 3 == 0) {
				System.out.println(numero + " � multiplo de 3");
			} else {
				System.out.println(numero + " n�o � multiplo de 3");
			}
			numero++;
		}
	}
}
