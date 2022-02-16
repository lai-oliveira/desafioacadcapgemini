package desafios;

/**
 * Desafio1
 * @author Laisa de Oliveira
 */

public class Desafio1 {

    public static void main(String[] args) {
        escada(6);

    }

    /**
     * Metodo que mostra na tela uma escada de tamanho n utilizando o caractere * e espaços.
     * @param n
     */
    static void escada(int n) {
        for (int linha=1; linha<=n; linha++){
            for(int espaco = 0;espaco<n-linha;espaco++) {
                System.out.print(" ");
            }
            for (int col=linha;col >=1;col--){
                System.out.print("*");
            }

            System.out.println( );
        }
    }
}

