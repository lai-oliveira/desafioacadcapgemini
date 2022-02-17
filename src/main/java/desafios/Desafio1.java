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
     * de acordo com a quantidade adicionada no parametro.
     * @param qtd
     */
    static void escada(int qtd) {
        for (int linha=1; linha<=qtd; linha++){
            for(int espaco = 0;espaco<qtd-linha;espaco++) {
                System.out.print(" ");
            }
            for (int col=linha;col >=1;col--){
                System.out.print("*");
            }

            System.out.println( );
        }
    }
}

