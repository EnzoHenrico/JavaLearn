package JavaLearn.AlgoritimosBusca;
/** Algoritmo de Busca sequencial ou Linear
 * 
 * É um algoritmo simples e eficaz
 * Faz uma busca por cada elemento do objeto individualmente até encontrar o que busca
 * 
 * Duas condições de parada:
 * O objeto é completamente percorrido e nada é encontrado, é retornado -1
 * O elemento buscado é encontrado, é retornado o indice encontrado
 * 
 * Apesar de eficaz, não é eficiente como a busca binária em arrays ordenados
 */
public class BuscaSequencial {

    public static void main(String[] args) {

        // Declarados parametros para a busca: Objeto=array"elementos", Valora a ser buscado="10"
        int[] elementos = {0,12,5,88,10,6,98,3,76,21,53,58};
        int valor = 10;

        int result = buscaLinear(elementos, valor);

        System.out.println(result == -1 ? "Valor não encontrado" : "Valor na posição" + result);
    }

    // Metodo simples de busca sequencial
    public static int buscaLinear(int[] elementos, int valor){

        // O loop executa a condicional para cada elemento do objeto 
        for(int i = 0; i < elementos.length; i++){
            if(elementos[i] == valor)
            return i;
        }
        return -1;
    }
    
}
