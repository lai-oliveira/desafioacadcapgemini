package desafios;
import java.util.Arrays;
import java.util.HashMap;

public class Desafio3 {
    public static void main(String[] args) {
        subString("laisa");
    }


    /**
     * Usando frequências de caracteres como chaves e contagens correspondentes como valores.
     * Resouvendo esse problema iterando em todas as
     * substrings e contando as frequências de caracteres em cada substring.
     *
     * @param s
     */
    static void subString(String s){
        HashMap<String, Integer> map= new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            for(int j = i; j < s.length(); j++){
                char[] valC = s.substring(i, j+1).toCharArray();
                Arrays.sort(valC);
                String val = new String(valC);
                if (map.containsKey(val))
                    map.put(val, map.get(val)+1);
                else
                    map.put(val, 1);
            }
        }
        /**
         * Pares de anagramas que podem ser formados
         */
        int anagramPairCount = 0;
        for(String key: map.keySet()){
            int n = map.get(key);
            anagramPairCount += (n * (n-1))/2;
        }
        System.out.println(anagramPairCount);
    }
}

