import java.util.*;

public class HashMaps {
    
    /** 
     * Map é uma interface que armazenam dados em objetos, sendo um deles o HashMap 
     * HashMaps segue uma estrutura de pares, com chaves e valores relacionados
     * Diferentemente das 'ArrayLists', não existem indices, o acesso dos valores é atraves das chaves
    */
    
    public static void main(String[] args) {
        
        Map<String, Integer> hashmap = new HashMap<>();

        // O metodo "put" armazena o valor declarado na chave determinada
        hashmap.put("someKey1", 10);
        hashmap.put("someKey2", 20);
        hashmap.put("someKey3", 30);
        hashmap.put("someKey4", 40);

        // O metodo "get" acessa qualquer valor pela chave
        int SomeNumber = hashmap.get("someKey1");
        // "remove" exclui o dado atraves da chave
        hashmap.remove("someKey4");
        // "size" retorna um inteiro com o a quantidade de elementos
        hashmap.size();
        
        // Assim como em Arrays, é possível percorrer os dados atraves de um loop
        for(String key : hashmap.keySet()){

            // Imprime as chaves
            System.out.println("keys: " + key);
            // Imprime os valores a partir das chaves
            System.out.println("values: " + hashmap.get(key));
        }

        System.out.println("------------------------");

        // Para iterar diretamente os valores independente das chaves
        for(Integer value : hashmap.values()){

            // Imprime os valores a partir das chaves
            System.out.println("values: " + value);
        }

        System.out.println("------------------------");

        // Também é possivel que o loop retorne um objeto com cada chave e valor atraves do "entry"
        for(Map.Entry<String, Integer> entry : hashmap.entrySet()){

            // Imprime os valores a partir das chaves
            System.out.println("keys: " + entry.getKey() + "values: " + entry.getValue());
        }

        // O HashMap não garante a ordem de inserção dos valores, portanto não se pode garantir a posição dos itens
        System.out.println("Somewhere in that HasMap, you can find the number "+ SomeNumber);
        
        // Para garantir que os dados mantenham sua ordem de inserção se utiliza LinkedHasMap
        Map<String, Integer> linkedHashmap = new LinkedHashMap<>();
        
        linkedHashmap.put("linkedKey1", 10);
        linkedHashmap.put("linkedKey2", 20);
        linkedHashmap.put("linkedKey3", 30);
        linkedHashmap.put("linkedKey4", 40);

        // A ordem de inserção sempre será respeitada e será retornado na sequencia
        for(Map.Entry<String, Integer> linkedEntry : linkedHashmap.entrySet()){

            // Imprime os valores a partir das chaves
            System.out.println("keys: " + linkedEntry.getKey() + "values: " + linkedEntry.getValue());
        }
    }
}
