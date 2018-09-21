
package NumerosNaturales;
/**
 *
 * @author Ingrid Xooc
 */
public class Operaciones {
    //private int numeros;
    public void EsCero(){ // metodo de tipo void 
        System.out.println("Es cero");
    }
    public int Sucesor(int var){
        return var + 1;
    }
    public void PreguntaEsCero(int var){
        if(var==0){
            System.out.println("La variable"+var+" ingresada es igual a cero ");
        }else{
            System.out.println("La variable"+var+" ingresada no es igual a cero ");
        }
    }
    public void Igual(int var, int var2){
        if(var==var2){
            System.out.println("La variable "+ var + " ingresada es igual a "+ var2);
        }else{
            System.out.println("La variable "+ var + " ingresada no es igual a "+ var2);
        }
    }
    public int Suma(int var, int var2){
        return var+var2;
    }
    public int Antecesor(int var){
        return var-1;
    
    }
    public int Diferencia(int var, int var2){
        return var-var2;
    }
    public int Menor(int var, int var2){
        int op;// variable que dependiendo del valor que retorne determina cula es el menor o si son iguals.
        if(var<var2){
            op=0;
        }else if (var>var2){
            op=1;
        }else{
            op=2;
        }
        return op;
    }
}
