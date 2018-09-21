package Conjuntos;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
/**
 * @author Ingrid Lisset Xooc Balam 
 */
public class OperacionConjuntos {
    public void ConjuntoVacio(ArrayList <Integer> ConjA){
         ConjA.clear();//Limpiar el arraylist
            System.out.println("El conjunto A = "+ConjA);
    }
    public void EsVacio(ArrayList <Integer> ConjA){
        boolean Vacio = ConjA.isEmpty();// devuelve true cuando el valor del arraylist es 0 osea que no tiene elementos
      if (Vacio == true) {
         System.out.println("El Arreglo esta vacio");
      } else {
         System.out.println("El Arreglo no esta vacio");
      }
    }
    public void Union(ArrayList <Integer> ConjA, ArrayList <Integer> ConjB){
       List <Integer> UnionConj = new ArrayList <Integer>(); //se declara un nuevo arraylist para almacenar los datos repetidos.
         UnionConj.addAll(ConjA);//se añade todos los elementos de los arraylist
         UnionConj.addAll(ConjB);
         HashSet<Integer> hashSet = new HashSet<Integer>(UnionConj);
		UnionConj.clear();
		UnionConj.addAll(hashSet);//El hashset sirve para identificar los elementos repetidos         
         System.out.println("La union es: "+ UnionConj);
        
   }
    public void Agregar(ArrayList <Integer> ConjA){//Inicia Metodo Agregar
        Scanner t1 = new Scanner (System.in);
          System.out.println("Desea Agregar un nuevo numero S/N");
        char res=t1.next().charAt(0);
        if (res=='S' || res=='s'){
            int agregar;
            System.out.println("Ingrese el nuevo valor: ");
            agregar=t1.nextInt();
            ConjA.add(0,agregar);// se determina la posicion y el nuevo elemento que estara en el arraylist
            System.out.println("EL arreglo A con el nuevo elemento es : "+ConjA);
        }else if(res=='N' || res=='n'){
        }     
    }
    public void Buscar(ArrayList <Integer> ConjA, int buscar){
       if(ConjA.contains(buscar))//Devuelve un valor true si se encuentra el valor especificado en el arreglo
           System.out.println("El numero ingresado "+buscar+ " si se encuentra en el conjunto");
       else 
           System.out.println("El numero ingresado "+buscar+ " no se encuentra en el conjunto");
   } 
    public  void Interseccion(ArrayList <Integer> ConjA, ArrayList <Integer>ConjB){
         ArrayList <Integer> InterConj= new ArrayList ();
         System.out.println("Conjunto A: "+ConjA);
         System.out.println("Conjunto B: "+ConjB);
    for(int i=0; i<ConjA.size(); i++){
        if (ConjB.contains(ConjA.get(i))){//Busca los elementos del arreglo, para poder almacenarlos en el nuevo arreglo
            InterConj.add(ConjA.get(i));//Se añaden los elementos iguales de los dos arreglos (conjA y conjB)
        }
    }
       Collections.sort(InterConj);
       System.out.println("La intersección de AnB es: "+InterConj);
 }   
    public  void Eliminar(ArrayList <Integer>ConjA){
    Scanner t1= new Scanner (System.in);
        System.out.println("¿Desea eliminar algun numero del arreglo? S/N");
        char respuesta=t1.next().charAt(0);
        if (respuesta=='S' || respuesta=='s'){
            System.out.println("Los valores que tiene actualmente el Conjunto son: ");
            System.out.println(ConjA);
         int eliminar, cont=0;
         System.out.println("¿Que valor desea eliminar?");
         eliminar=t1.nextInt();
         for (int i=0; i<ConjA.size();i++){
           if (eliminar==ConjA.get(i)){
              ConjA.remove(i); 
           }else{
           cont++;
           }
        }
           if(cont>0){
               System.out.println("El numero que ingreso no existe en el arreglo");
           }
         System.out.println("El nuevo Conjunto es: "+ ConjA);
   }else if (respuesta=='N' || respuesta=='n'){
        System.out.println("Fin del programa");
   }     
   }
    public  void Diferencia(ArrayList <Integer> ConjA, ArrayList <Integer>ConjB){
         ArrayList <Integer> DiferConj= new ArrayList ();
         System.out.println("El conjunto A es: "+ConjA);
         System.out.println("El conjunto B es: "+ConjB);
    for(int i=0; i<ConjA.size(); i++){
            if (!ConjB.contains(ConjA.get(i))){ //si el elemento que esta en A es diferente al B, entonces se agrega al nuevo arreglo
               
                DiferConj.add(ConjA.get(i));
            }
    }
       System.out.println("La Diferencia de A-B es: "+DiferConj);
 }   
}
