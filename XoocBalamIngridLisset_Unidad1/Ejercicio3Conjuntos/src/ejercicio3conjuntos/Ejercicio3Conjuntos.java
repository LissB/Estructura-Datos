package ejercicio3conjuntos;
import Conjuntos.OperacionConjuntos;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Ingrid Lisset Xooc Balam
 */
public class Ejercicio3Conjuntos {
    public static void main(String[] args) {
        Scanner t1 = new Scanner (System.in);
        ArrayList <Integer> ConjA = new ArrayList(); //se crea un arrarlist para luego introducirle datos
        ConjA.add(30);
        ConjA.add(2);
        ConjA.add(89);
        ConjA.add(20);
        ConjA.add(37);
        ConjA.add(15);
        ArrayList <Integer> ConjB = new ArrayList();
        ConjB.add(2);
        ConjB.add(20);
        ConjB.add(66);
        ConjB.add(106);
        ConjB.add(0);
        System.out.println("EL arreglo A: "+ConjA);
        System.out.println("El arreglo B: "+ConjB);
        int op;
        OperacionConjuntos ob = new OperacionConjuntos();
        System.out.println("1. Conjunto Vacio");
        System.out.println("2. Es Vacio");
        System.out.println("3. Agregar");
        System.out.println("4. Union");
        System.out.println("5. Buscar elemento");
        System.out.println("6. Interseccion");
        System.out.println("7. Diferencia");
        System.out.println("8. Eliminar elemento");
        System.out.println("Otro numero para salir"); 
        System.out.print("Eliga una Opcion :");
        op = t1.nextInt();
        while(op>=1 && op<=8){
            switch (op){
                case 1:
                    ob.ConjuntoVacio(ConjA);
                    break;
                case 2:
                    ob.EsVacio(ConjA);
                    break;
                case 3:
                    ob.Agregar(ConjA);
                    break;
                case 4:
                    ob.Union(ConjA,ConjB);
                    break;
                case 5:
                    int z;
                    System.out.println("Ingrese el numero a buscar: ");
                    z=t1.nextInt();
                    ob.Buscar(ConjA,z);
                    break;
                case 6:
                    ob.Interseccion(ConjA, ConjB);
                    break;
                case 7:
                    ob.Diferencia(ConjA, ConjB);
                    break;
                case 8:
                    ob.Eliminar(ConjA);
                    break;
                case 9:
                    System.out.println("El programa se ha cerrado");
                    break;
            }
            System.out.println("\n\n1. Conjunto Vacio\n2. Es Vacio\n3. Agregar\n4. Union\n5. Buscar elemento\n6. Interseccion\n7. Diferencia\n8. Eliminar elemento\nOtro numero para salir"); 
            System.out.print("Eliga una Opcion :");
            op = t1.nextInt();
        }
    } 
}
