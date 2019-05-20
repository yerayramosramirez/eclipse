package calculadora;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Principal {



 
    private static InputStreamReader isr;
    private static BufferedReader br;
 
   
    public static void main(String[] args) throws IOException {
        isr = new InputStreamReader(System.in);
 
        br = new BufferedReader(isr);
 
        menu();
 
        loop();
    }
 
    /**
     * Muestra el menú de opciones
     */
    private static void menu() {
        System.out.println("-------------------------\n"
                + "Elige una opcion:\n"
                + "[a]- SUMAR\n"
                + "[b]- RESTAR\n"
                + "[c]- MULTIPLICAR\n"
                + "[d]- DIVIDIR\n"
                + "-\n"
                + "[m]- Muestra este menu\n"
                + "[x]- Sale del programa\n");
    }
 
    /**
     * Bucle del programa. Se mantiene en espera de la introducción de datos
     * desde la entrada estándar. Finaliza si se detecta "x".
     */
    private static void loop() throws IOException {
        String s = "";
 
        while (true) {
            s = br.readLine();
 
            try {
                if (s.equalsIgnoreCase("a") == true) {
                    suma();
                } else if (s.equalsIgnoreCase("b") == true) {
                    resta();
                } else if (s.equalsIgnoreCase("c") == true) {
                    multiplica();
                } else if (s.equalsIgnoreCase("d") == true) {
                    divide();
                } else if (s.equalsIgnoreCase("m") == true) {
                    menu();
                } else if (s.equalsIgnoreCase("x") == true) {
                    break;
                } else {
                    System.out.println("Opcion desconocida. Escribe \"m\" para ver el menu de opciones");
                }
            } catch (NumberFormatException nfe) {
                System.out.println("Valor invalido: " + nfe.getLocalizedMessage() + "\n-------------------------\n");
            }
        }
    }
 
    /**
     * Realiza la suma de dos valores.
     */
    private static void suma() throws IOException, NumberFormatException {
        int i1, i2, res;
 
        System.out.println("Introduce un valor:");
        i1 = Integer.parseInt(br.readLine());
 
        System.out.println("Introduce otro valor:");
        i2 = Integer.parseInt(br.readLine());
 
        res = i1 + i2;
        System.out.println("Resultado de la suma: " + res + "\n-------------------------\n");
    }
 
    /**
     * Realiza la resta de dos valores.
	*/
    private static void resta() throws IOException, NumberFormatException {
        int i1, i2, res;
 
        System.out.println("Introduce un valor:");
        i1 = Integer.parseInt(br.readLine());
 
        System.out.println("Introduce otro valor:");
        i2 = Integer.parseInt(br.readLine());
 
        res = i1 - i2;
        System.out.println("Resultado de la resta: " + res + "\n-------------------------\n");
    }
 
    /**
     * Realiza la multiplicación de dos valores.
     */
    
    private static void multiplica() throws IOException, NumberFormatException {
        int i1, i2, res;
 
        System.out.println("Introduce un valor:");
        i1 = Integer.parseInt(br.readLine());
 
        System.out.println("Introduce otro valor:");
        i2 = Integer.parseInt(br.readLine());
 
        res = i1 * i2;
        System.out.println("Resultado de la multiplicacion: " + res + "\n-------------------------\n");
    }
 
    /**
     * Realiza la división de dos valores.
     */
    
    private static void divide() throws IOException, NumberFormatException {
        float i1, i2, res;
 
        System.out.println("Introduce un valor:");
        i1 = Float.parseFloat(br.readLine());
 
        System.out.println("Introduce otro valor:");
        i2 = Float.parseFloat(br.readLine());
 
        res = i1 / i2;
        System.out.println("Resultado de la division: " + res + "\n-------------------------\n");
    }

}

