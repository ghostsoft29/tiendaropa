
package Class;

public class Principal {

    public static void main(String[] args) {
       Asignatura[]malla={
       new Asignatura("A1",1,"Principios",2),
       new Asignatura("A5",3,"Taller",2),
       new Asignatura("A4",2,"Programacion",2),
       new Asignatura("A3",4,"Algoritmo",2),
       new Asignatura("A2",5,"Integrador",2),
    };
    
    System.out.println("Datos originales");
    
    for(Asignatura item:malla)
        System.out.println(item);
    
    
    Ordena.mergeSort(malla);
    System.out.println("\nDatos Orginales");
    
    for(Asignatura item:malla)
        System.out.println(item);
    }
}
