package JuegoAhorcado;
import java.util.Scanner;

/**
 * @author Ingrid Xooc
 */
public class Palabras {
    //Divide la palabra en letras y los guarda en un array
    public static char[] DividirPalabra(String palabra) {
        char[] letras;
        letras = new char[palabra.length()];
        for (int i = 0; i < palabra.length(); i++) {
            letras[i] = palabra.charAt(i);
        }
        return letras;
    }
    
    //Este metodo oculta la palabra
    public static void PalabraOculta(char[] PosiblesLetras) {
        for (int i = 0; i < PosiblesLetras.length; i++) {
            System.out.print(PosiblesLetras[i] + " ");
        }
    }
    
    
    /**
     * ESTO NOS PREGUNTA SI QUEREMOS VOLVER A JUGAR Y COMPRUEBA LOS CARACTERES
     * INTRODUCIDOS EL MEN TEXTO PARA MOSTRAR AL USUARIO
     *
     * @RETURN CARACTER DE RESPUESTA (S/N)
     */
    public static char preguntar(String mensaje, Scanner teclado) {
        char resp;
        System.out.println(mensaje);
        resp = teclado.next().toLowerCase().charAt(0);
        while (resp != 's' && resp != 'n') {
            System.out.println("Solo Puede introducir s o n");
            resp = teclado.next().toLowerCase().charAt(0);
        }
        return resp;
    }
}
