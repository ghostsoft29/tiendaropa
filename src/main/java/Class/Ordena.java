
package Class;

public class Ordena {

    private static void swap(Object[] data, int i, int j){
        Object aux = data[i];
        data[i] = data[j];
        data[j] = aux;
    }

    public static void bubbleSort(Object[] data){
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length-1; j++) {
                if ( ((Comparable) data[j])
                        .compareTo(data[j+1]) > 0){
                    swap(data,j,j+1);
                }
            }
        }
    }

    private static int getIdxMinimo(Object[] data,
                                    int inicio){
        int idxMin = inicio;
        for (int i = inicio; i < data.length; i++) {
            if ( ((Comparable) data[i])
                    .compareTo(data[idxMin]) < 0){
                idxMin = i;
            }
        }
        return idxMin;
    }

    public static void selectionSort(Object[] data,
                                     int inicio){
        if (inicio >= data.length) return;
        int min = getIdxMinimo(data, inicio);
        if (min != inicio) swap(data, inicio, min);
        selectionSort(data, inicio+1);
    }

    public static void selectionSort(Object[] data){
        selectionSort(data, 0);
    }

    public static void insertionSort(Object[] data){
        int i=1;
        while(i < data.length){
            int j=i;
            while (j >0 && ( ((Comparable) data[j-1])
                    .compareTo(data[j]) > 0) ){
                swap(data, j, j-1);
                j--;
            }
            i++;
        }
    }

    private static void buildMaxHeap(Object []data) {
        for(int i=(data.length-1)/2; i>=0; i--){
            heapify(data,i,data.length-1);
        }
    }

    private static void heapify(Object[] data, int idxPadre,int nivelHeap) {
        int IdxHijoIzq = 2*idxPadre+1;  // Calcular pos IdxHijoIzq
        int IdxHijoDer = 2*idxPadre+2;  // Calcular pos IdxHijoDer
        int idxMax;

        // Buscamos en los nodos hijo (izq y der) si alguno tiene un valor mayor
        if(IdxHijoIzq <= nivelHeap && ( ((Comparable) data[IdxHijoIzq]).compareTo(data[idxPadre]) > 0)){
            idxMax=IdxHijoIzq;
        } else {
            idxMax=idxPadre;
        }

        if(IdxHijoDer <= nivelHeap && ( ((Comparable) data[IdxHijoDer]).compareTo(data[idxMax]) > 0)) {
            idxMax=IdxHijoDer;
        }

        // Intercambiar si es necesario y llamar a heapify
        if(idxMax!=idxPadre) {
            swap(data,idxPadre, idxMax);
            heapify(data, idxMax,nivelHeap);
        }
    }

    public static void heapSort(Object[] data) {
        buildMaxHeap(data);
        int nivelHeap=data.length-1;
        for(int i=nivelHeap; i>0; i--) {
            swap(data,0, i);
            nivelHeap -= 1;
            heapify(data, 0,nivelHeap);
        }
    }

    private static final int INSERTIONSORT_THRESHOLD = 7;

    public static void mergeSort(Object[] a) {
        Object[] aux = a.clone();
        mergeSort(aux, a, 0, a.length, 0);
    }

    private static void mergeSort(Object[] src,
                                  Object[] dest,
                                  int low,
                                  int high,
                                  int off) {
        int length = high - low;

        // Insertion sort en arrays pequeños
        if (length < INSERTIONSORT_THRESHOLD) {
            for (int i=low; i<high; i++)
                for (int j=i; j>low &&
                        ((Comparable) dest[j-1]).compareTo(dest[j])>0; j--)
                    swap(dest, j, j-1);
            return;
        }

        // Se ordenan recursivamente las mitades de dest en src
        int destLow  = low;
        int destHigh = high;
        low  += off;
        high += off;
        int mid = (low + high) >>> 1;
        mergeSort(dest, src, low, mid, -off);
        mergeSort(dest, src, mid, high, -off);

        // Si la lista esta ordenada, solo se copia de src a dest
        // Esto es una optimizacion que resulta en ordenamientos mas rapidos para listas casi ordenadas
        if (((Comparable)src[mid-1]).compareTo(src[mid]) <= 0) {
            System.arraycopy(src, low, dest, destLow, length);
            return;
        }

        // Merge mitades ordenadas (en src) hacia dest
        for(int i = destLow, p = low, q = mid; i < destHigh; i++) {
            if (q >= high || p < mid && ((Comparable)src[p]).compareTo(src[q])<=0)
                dest[i] = src[p++];
            else
                dest[i] = src[q++];
        }
    }

    public static void quickSort(Object[] data){
        quickSort(data, 0, data.length-1);
    }

    public static void quickSort(Object[] data, int low, int high){
        if (low >= high){
            return;
        }
        int mid = (low+high)/2;
        Object pivot = data[mid];
        int left = low;
        int right = high;

        while (left <= right) {
            while ( ((Comparable) data[left]).compareTo(pivot) < 0) {
                left++;
            }
            while (((Comparable) data[right]).compareTo(pivot) > 0) {
                right--;
            }
            if (left <= right) {
                swap(data, left, right);
                left++;
                right--;
            }
        }
        quickSort(data, low, right);
        quickSort(data, left, high);
    }

    public static void shellSort(Object[] data) {
        int n = data.length;

        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                Object key = data[i];
                int j = i;
                while (j >= gap && ((Comparable) data[j - gap]).compareTo(key) > 0) {
                    data[j] = data[j - gap];
                    j -= gap;
                }
                data[j] = key;

            }

        }
    }

}
