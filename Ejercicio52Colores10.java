/*
52.- Crea un array de tamaño 10 que sirva para almacenar colores y pide al usuario que
rellene cada posición del array con un color. A continuación indica cuantas veces
aparece el color “rojo” y el color “azul” usando la siguiente salida:
El color 'rojo' aparece X veces en el array.
El color 'azul' aparece Y veces en el array.
Siendo X el número de veces que aparece el rojo en el array e Y el número de veces que aparece el
azul en el array).
 */
package Arrays;
import java.util.Scanner;
public class Ejercicio52Colores10 {

    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    String []colores = new String[10];
    int contadorrojo= 0;
    int contadorazul = 0;
        for(int i=0;i<colores.length;i++){
            System.out.println("Introduce un color para aniadirlo al Array en la posicion " + i + " :");
            colores[i] = teclado.nextLine();
            if (colores[i].equals("rojo")){
            contadorrojo++; 
            }
            else if(colores[i].equals("azul")){
                contadorazul++;   
            }
       }
        System.out.println("Has puesto 'rojo': " + contadorrojo + " veces.");
        System.out.println("Has puesto 'azul': " + contadorrojo + " veces.");
    }
    
}
