
package Class;

public class Principal {

    public static void main(String[] args) {
       Asignatura[]malla={
       new Asignatura("SP001",1,"Principios",2),
       new Asignatura("SZ001",3,"Taller",2),
       new Asignatura("SP002",2,"Programacion",2),
       new Asignatura("SH001",4,"Algoritmo",2),
       new Asignatura("SZ002",5,"Integrador",2),
       new Asignatura("SZ002",5,"Integrador",2),
       new Asignatura("SZ002",5,"Integrador",2),
       new Asignatura("SZ002",5,"Integrador",2),
       new Asignatura("SZ002",5,"Integrador",2),
       new Asignatura("SZ002",5,"Integrador",2),
       new Asignatura("SZ002",5,"Integrador",2),
       new Asignatura("SZ002",5,"Integrador",2),
       new Asignatura("SZ002",5,"Integrador",2),
       new Asignatura("SZ002",5,"Integrador",2),
       new Asignatura("SZ002",5,"Integrador",2),
       new Asignatura("SZ002",5,"Integrador",2),
       new Asignatura("SZ002",5,"Integrador",2),
       new Asignatura("SZ002",5,"Integrador",2),
       new Asignatura("SZ002",5,"Integrador",2),
       new Asignatura("SZ002",5,"Integrador",2),
       
       
    };
    
    System.out.println("Datos originales");
    
    for(Asignatura item:malla)
        System.out.println(item);
    
    
    Ordena.mergeSort(malla);
    
    System.out.println("\nDatos Cambiados");
    
    for(Asignatura item:malla)
        System.out.println(item);
    }
}
