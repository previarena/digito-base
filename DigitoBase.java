import java.io.IOException;
import java.util.Scanner;


public class DigitoBase {


    private static final Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) throws IOException {
        System.out.println("Ingrese los valores separados por un espacio");
        String[] nk = scanner.nextLine().split(" ");
        String n = nk[0];
        int k = Integer.parseInt(nk[1]);
     
        
        int result = digitoBase(n, k);
        System.out.println("resultado: "+ result);
        scanner.close();
    }


    static int digitoBase(String n, int k) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < k; i++) {
            sb.append(n);
        }
        int temp = sumaArreglo(sb.toString());
        
        while (temp>=10) {
            temp=sumaArreglo(String.valueOf(temp));
        }
        return temp;
    }


    private static int sumaArreglo(String numero) {
        char[] arr =numero.toCharArray();
        int resultado = 0;
        for (int i = 0; i < arr.length; i++) {
            resultado +=  Integer.parseInt(String.valueOf(arr[i]));
        }
        return resultado;
    }
}