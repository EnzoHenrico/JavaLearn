package JavaLearn.AlgoritimosBusca;

/** Algoritmos de Busca Binária
 * 
 * Uma ferramenta de busca eficiente
 * A Busca binária reduz muito a quantidade de operações em comapração a Busca Linear
 * É um requesito que o Objeto de busca esteja ordenado!
 * 
 * Recursividade:
 * O metodo executado nesse algorítimo explora da recursividade para reduzir os processos e ser eficiente
 * A recursividade é uma repetição, quando um método chama a sí mesmo para ser executado novamente
 */

public class BuscaBinaria {

    public static void main(String[] args) {
    
    // Vetor ordenado
    int [] orderedArray = {0, 5, 7, 12, 18, 20, 21, 35, 48};

    // O "start" inicialmente sempre será o primeiro índice do array
    int start = orderedArray[0];
    // O "end" inicialmente sempre será o ultimo índice do array
    int end = orderedArray.length -1;
    // Valor procurado no array
    int value = 21;

    int result = binarySearch(orderedArray, value, start, end);
    System.out.println(result == -1 ? "Valor não encontrado" : "Valor encontrado no indice: " + result);
    }
    
    // Função recursíva que executa a Busca binária 
    public static int binarySearch(int[] elements, int value, int start, int end){

        // É declarado o meio do vetor, diminuindo os elementos de busca pela metade
        int middle = start + ((end - start) / 2);
        
        if (end < start){
            return -1;
        }
        if (value == elements[middle]) {
            return middle; 
        } 
        else if(value < elements[middle]){
            return binarySearch(elements, value, start, middle -1);
        }
        else {
            return binarySearch(elements, value, middle +1, end);
        }
    }  
}
