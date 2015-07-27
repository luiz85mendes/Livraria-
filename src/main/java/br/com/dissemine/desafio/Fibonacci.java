package br.com.dissemine.desafio;
/**
 * � uma sucess�o de n�meros que, misteriosamente, aparece em muitos fen�menos da natureza. 
 * Descrita no final do s�culo 12 pelo italiano Leonardo Fibonacci, ela � infinita e come�a com 0 e 1. 
 * Os n�meros seguintes s�o sempre a soma dos dois n�meros anteriores. 
 * Portanto, depois de 0 e 1, v�m 1, 2, 3, 5, 8, 13, 21, 34
 * @author leo
 * @see http://mundoestranho.abril.com.br/materia/o-que-e-a-sequencia-de-fibonacci
 *
 */
public class Fibonacci {

    public static void main(String[] args) {
        calcular(20);
    }
    
    public static void calcular(int limite) {
        int primeiroNumero = 0;
        int segundoNumero = 1;

        System.out.print(primeiroNumero + ", " + segundoNumero);
        for (int i=1; i<=limite; i++) {
            int soma = primeiroNumero + segundoNumero;
            primeiroNumero = segundoNumero;
            segundoNumero = soma;
            System.out.print(", " + soma);
        }
    }
}