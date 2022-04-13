package JavaLearn.AlgoritimosBusca.AlgoritimosOrdenacao;

public class MergeSort {
    
    public static void main(String[] args) {
    
        // Declaração de array desordenada
        //int[] items = {5,2,30,63,4,24,8,13,6,100};
        int[]items = {9,5,8,1,6,4,3,7,10,2};
        
        int esquerda = 5 + 1;
        int direita = 5;

        ordenar(items,esquerda,direita);
    }

    public static void ordenar(int[] items, int esquerda, int direita) {
        if (esquerda < direita){
            
            int meio = esquerda + (direita - esquerda) / 2;
            
            ordenar(items, esquerda, meio);
            ordenar(items, meio + 1, direita);
            merge(items, esquerda, meio, direita);            
        }
    }

    public static void merge(int[] array, int left, int middle, int right){

        //n1 representa
        int n1 = middle - left + 1;
        int n2 = right - middle;

        int[] L = new int[n1];
        int[] R = new int[n2];
        int i, j;

        for (i = 0; i < n1; ++i){
            L[i] = array[left + i];
        }

        for(j = 0; j< n2; j++){

            R[j] = array[middle + left +j];
        }

        i=0;
        j=0;
        int kilo = left;

        while (i < n1 && j < n2){
            if(L[i]<= R[j]){
                array[kilo] = L[i];
                i++;
            }
            else{
                array[kilo] = R[j];
                j++;
            }
            kilo++;
        }

        while (i< n1){
            array[kilo] = L[i];
            i++;
            kilo++;
        }

        while (j< n1){
            array[kilo] = R[j];
            j++;
            kilo++;
        }
    }
}
