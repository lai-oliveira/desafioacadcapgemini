package desafios;

import java.util.Scanner;

/**
 * desafio2
 * @author Laisa de oliveira
 */
public class Desafio2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

    /*inicialisando com quantidade minima de caracter*/
        String senha;
        int qtdmincaracter = 6;
        int maiuscula = 0;
        int minuscula =0;
        int numero = 0;
        int caracterEspecial = 0;
        System.out.println("--------------------Iniciando o cadastro de sua senha--------------------");
        System.out.println("O site considera uma senha forte quando ela satisfaz os seguintes critérios:" +"\n" +
                " * Possui no mínimo 6 caracteres."+"\n" +
                " * Contém no mínimo 1 digito."+"\n" +
                " * Contém no mínimo 1 letra maiúscula"+"\n"+
                " * Contem no minimo uma letra minuscula."+"\n"+
                " * Contem no minimo 1 caractere especial. Os caracters especiais são: !&@#%$^*()-="+"\n");

        System.out.println("Digite sua Senha :");
        senha = scan.nextLine();











    }
}
