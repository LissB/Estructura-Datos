package ejercicio1numeros;
import NumerosNaturales.Operaciones;
import java.util.Scanner;

/**
 *
 * @author Ingrid Lisset Xooc Balam
 */
public class Ejercicio1Numeros {
    public static void main(String[] args) {
        Operaciones ob1 = new Operaciones(); //objeto de la clase operaciones
        int op;//Variable para determinr la opcion a sleccionar
        int var, var2, resul; 
        Scanner t1= new Scanner(System.in); 
        System.out.println("1. Cero ");
        System.out.println("2. Sucesor");
        System.out.println("3. Es cero ");
        System.out.println("4. Igual");
        System.out.println("5. Suma");
        System.out.println("6. Antecesor");
        System.out.println("7. Diferencia");
        System.out.println("8. Menor");
        System.out.println("Otro numero para salir");
        System.out.println("Ingresa la opcion que desea: ");
        op=t1.nextInt();
        while(op>=1 && op<=8){
            switch (op){
                case 1:
                    System.out.print("Ingresa un numero: ");
                    var=t1.nextInt();
                    ob1.EsCero();
                    break;
                case 2:
                    System.out.print("Ingresa un numero: ");
                    var=t1.nextInt();
                    resul=ob1.Sucesor(var);
                    System.out.println("El sucesor de " + var + " es " + resul);
                    break; 
                case 3:
                    System.out.print("Ingresa un numero: ");
                    var=t1.nextInt();
                    ob1.PreguntaEsCero(var);
                    break;
                case 4:
                    System.out.print("Ingresa dos numeros: ");
                    var=t1.nextInt();
                    var2=t1.nextInt();
                    ob1.Igual(var, var2);
                    break;
                case 5:
                    System.out.print("Ingresa dos numeros: ");
                    var=t1.nextInt();
                    var2=t1.nextInt();
                    resul=ob1.Suma(var, var2);
                    System.out.println("La suma es: "+resul);
                    break;
                case 6:
                    System.out.print("Ingresa un numero: ");
                    var=t1.nextInt();
                    resul=ob1.Antecesor(var);
                    System.out.println("El antecesor es de "+var+" es "+ resul);
                    break;
                case 7:
                    System.out.print("Ingresa dos numeros: ");
                    var=t1.nextInt();
                    var2=t1.nextInt();
                    resul=ob1.Diferencia(var, var2);
                    System.out.println("La diferencia es: "+resul);
                    break;
                case 8:
                    System.out.print("Ingresa dos numeros: ");
                    var=t1.nextInt();
                    var2=t1.nextInt();
                    resul=ob1.Menor(var, var2);
                    switch(resul){
                        case 0:
                            System.out.println("El menor es "+ var);
                            break;
                        case 1:
                            System.out.println("El menor es "+ var2);
                            break;
                        case 2:
                            System.out.println("Las variables son iguales");
                            break;
                    }
                    break;   
            }
            System.out.println("\n____________________________");
            System.out.println("1. Cero ");
            System.out.println("2. Sucesor");
            System.out.println("3. Es cero ");
            System.out.println("4. Igual");
            System.out.println("5. Suma");
            System.out.println("6. Antecesor");
            System.out.println("7. Diferencia");
            System.out.println("8. Menor");
            System.out.println("Otro numero para salir");
            System.out.println("Ingresa la opcion que desea: ");
            op=t1.nextInt();
        }
    }
    
}
