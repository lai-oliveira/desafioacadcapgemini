package desafios;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * desafio2
 * @author Laisa de oliveira
 */
public class Desafio2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*inicialisando com quantidade minima de caracter*/
        String senha;
        int qtdMinCaracter = 6;
        int maiuscula = 0;
        int minuscula = 0;
        int numero = 0;
        int caracterEspecial = 0;
        System.out.println("--------------------Iniciando o cadastro de sua senha--------------------");
        System.out.println("O site considera uma senha forte quando ela satisfaz os seguintes critérios:" + "\n" +
                " * Possui no mínimo 6 caracteres." + "\n" +
                " * Contém no mínimo 1 digito." + "\n" +
                " * Contém no mínimo 1 letra maiúscula" + "\n" +
                " * Contem no minimo uma letra minuscula." + "\n" +
                " * Contem no minimo 1 caractere especial. Os caracters especiais são: !&@#%$^*()-=" + "\n");

        System.out.println("Digite sua Senha :");
        senha = scan.nextLine();

        /**
         * Checagem de caracteres maiusculas,
         * Checagem de caracteres minusculas,
         * Checagem de números.
         */
        if (senha.length() >= qtdMinCaracter) {
            for (int i = 0; i < senha.length(); i++) {
                char ch = senha.charAt(i);
                if (Character.isUpperCase(ch)) {
                    maiuscula++;
                }
                if (Character.isDigit(ch)) {
                    numero++;
                }
                if (Character.isLowerCase(ch)) {
                    minuscula++;
                }
                Pattern p = Pattern.compile("[A-Z a-z 0-9]");
                Matcher m = p.matcher(senha);
                boolean b = m.find();
                if (b)
                    caracterEspecial++;
            }
            /**
             * Logica que implementa a força da senha
             */
            if (caracterEspecial == 0) {
                System.out.println("Falta carcter especial");
            }
            if (numero == 0) {
                System.out.println("Falta numero");
            }
            if (minuscula == 0) {
                System.out.println("Falta minuscula");
            }
            if (maiuscula == 0) {
                System.out.println("Falta maiuscula");
            }
            if (senha.length() < qtdMinCaracter) {
                int falta = qtdMinCaracter - senha.length();
                System.out.printf("Falta %2d", falta);
            }
            if (maiuscula >= 1 && minuscula >= 1 && numero >= 1 && caracterEspecial >= 1) {
                System.out.println("Forte");
            } else {
                System.out.println(" Possui no mínimo 6 caracteres");
            }
        }
        /**
         * Condicão que retorna quantidade que falta para completar 6 caracteres
         */
        if (senha.length() < qtdMinCaracter) {
            int falta = qtdMinCaracter - senha.length();
            System.out.printf("Falta %2d", falta);
        }
    }
}
