
package Clases;

public class SearchUTP {

    private static int binarySearch(Object[] data, Object key,
                                    int left, int right){
        int mid = (right + left) / 2;
        if ( left > right ) return -1;  // Punto de finalizacion
        if ( ((Comparable) data[mid]).compareTo(key) == 0) return mid;
        if ( ((Comparable) data[mid]).compareTo(key) > 0 ) return binarySearch(data, key, left, mid-1);
        return binarySearch(data, key, mid+1, right);
    }

    public static int binarySearch(Object[] data, Object key){
        return binarySearch(data, key, 0, data.length-1);
    }

    public static int linearSearch(Object[] data, Object key){
        for (int idx = 0; idx < data.length; idx++) {
            if ( ((Comparable) data[idx]).compareTo(key) == 0 ) return idx;
        }
        return -1;
    }

}
