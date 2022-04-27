import java.util.*;

public class HashMaps {
    
    /** 
     * HasMaps são objetos que armazenam dados em pares com chaves e valores
     * Diferentemente das 'ArrayLists', não existem indices, o acesso dos valores é atraves das chaves
    */
    
    public static void main(String[] args) {
        
        HashMap<String, Integer> hashmap = new HashMap();

        // O metodo "put" armazena o valor declarado na chave determinada
        hashmap.put("someKey1", 10);
        hashmap.put("someKey2", 20);
        hashmap.put("someKey3", 50);
        hashmap.put("someKey4", 40);

        // O metodo "get" acessa qualquer valor pela chave
        int SomeNumber = hashmap.get("somekey1");
        // "remove" exclui o dado atraves da chave
        hashmap.remove("somekey4");
        // "size" retorna um inteiro com o a quantidade de elementos
        hashmap.size();
        
        // Assim como em Arrays, é possível percorrer os dados atraves de um loop
        for(String i : hashmap.keySet()){

            // Imprime as chaves
            System.out.println("keys: " + i);
            // Imprime os valores das chaves
            System.out.println("values: " + hashmap.get(i));
        }

        // O HashMap não é ordenado e as chaves não possuem uma posição específica, por isso os dados não possuem indices
        System.out.println("Somewhere in that HasMap, you can find number"+ SomeNumber);
    }
}
