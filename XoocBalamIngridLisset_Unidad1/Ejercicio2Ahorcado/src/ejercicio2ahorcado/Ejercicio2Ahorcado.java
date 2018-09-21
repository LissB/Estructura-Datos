package ejercicio2ahorcado;
import JuegoAhorcado.Palabras;
import java.util.Scanner;
import java.util.Random;
/**
 * @author Ingrid Lisset Xooc Balam
 */
public class Ejercicio2Ahorcado {
    public static void main(String[] args) {
        Palabras ob1=new Palabras();
        int intentos = 0;// declaracion de variaables que nos serviran para deternimar si el jugador puede seguir intentando adivinar
        int aciertos = 0;//para saber si ya adivino la palabra
        Scanner t1 = new Scanner(System.in);
        char resp; //variable para leer las letras
        Random rnd = new Random();//variable donde se almacenara un numero aleatorio
        String Frutas[] = {"mandarina", "platano", "sandia", "piña", "melon", "kiwi", "uva", "papaya"};//arreglo de palabras donde se extraera la palabra
        do {
            int Numalea = rnd.nextInt(Frutas.length);// se crea el numero aleatorio,el rango de posiciones se cuenta por medio del array
            String palabra = Frutas[Numalea];//Selecciona la palabra en l arrray dependiendo del numero aleatorio
            //INTENTOS
            int intentoTotal = palabra.length() + 5;
            char[] caracteresPalabra = ob1.DividirPalabra(palabra);//se hace uso del metodo DividirPalabra
            char[] copia = ob1.DividirPalabra(palabra); 
            char[] PosiblesLetras = new char[caracteresPalabra.length];// declaracion de un array donde se almacenaran las posibles respuestas 

            for (int i = 0; i < PosiblesLetras.length; i++) {
                PosiblesLetras[i] = '*';
            }
            System.out.println("-----ADIVINA LA FRUTA-----"); 
            // 
            while (intentos < intentoTotal && aciertos != PosiblesLetras.length) {
                ob1.PalabraOculta(PosiblesLetras);
                System.out.println("\nIngresa la letra: ");
                resp = t1.next().toLowerCase().charAt(0);

                // RECORDEMOS EL ARREGLO Y COMPROBAMOS SI SE A PRODUCIDO UN ACIERTO
                for (int i = 0; i < caracteresPalabra.length; i++) {
                    if (caracteresPalabra[i] == resp) {
                        PosiblesLetras[i] = caracteresPalabra[i];
                        caracteresPalabra[i] = ' ';
                        aciertos++;
                    }
                }
                intentos++;
            }
            // DESPUES DE ACERTAR TODO SE IMPRIME UN MENSAJE
            if (aciertos == PosiblesLetras.length) {
                System.out.print("\nFELICIDADES HAS ACERTADO LA PALABRA: ");
                ob1.PalabraOculta(PosiblesLetras);
            }else {
                System.out.print("\nSIGUE PARTICIPANDO, LA PALABRA ES: ");
                for (int i = 0; i < copia.length; i++) {
                    System.out.print(copia[i] + " ");
                }
            }
            // SE RESETEA LOS C0NTADORES 
            intentos = 0;
            aciertos = 0;
            // SE VUELVE A PREGUNTAR AL USUARIO SI LO QUIERE INTENTAR DE NUEVO
            resp = ob1.preguntar("\n\n¿Desea seguir en el juego? (S/N)", t1);
        } while (resp != 'n');
    }
    
}
 