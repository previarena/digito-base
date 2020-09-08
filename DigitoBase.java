import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
 
public class DigitoBase {
 
 /**
 * Metodo que realiza el calculo del digito base.
 * @param n Cadena con numeros
 * @param k Número de concatenación de la cadena n 
 **/
 static int digitoBase(String n, int k) {
 int sumaN = sumaDigitos(n);
     return generarDigitoBase(String.valueOf(sumaN * k));
 }
 
 /**
 * Método que se encarga de validar las restricciones del desafio
 * @param n Cadena con numeros
 * @param k Número de concatenación de la cadena n 
 */
 static boolean validarRestricciones(String n, String k){
 if(!Pattern.matches("^(?!0)(\\d){1,4}", n))
 return false;
 if(!Pattern.matches("^(?!0)(10|\\d)", k))
 return false;
 return true; 
 }
 /**
 * Método se encarga de generar el digito base de forma recursiva
 * @param n Cadena de número calculado
 **/
 static int generarDigitoBase(String n){
 int digitoBase = Integer.parseInt(n);
 if(digitoBase >= 0 && digitoBase < 10){
 return digitoBase;
 }
 int sumaN = sumaDigitos(n);
 return generarDigitoBase(String.valueOf(sumaN)); 
 }
 
 /**
 * Método auxiliar para sumar digitos de un String con numeros.
 * @param n numero para sumar todos los digitos que contiene
 **/
 static int sumaDigitos(String n) {
 return Arrays.stream(n.split("")).mapToInt(subN -> Integer.parseInt(subN)).sum();
 }
 
 private static final Scanner scanner = new Scanner(System.in);
 
 public static void main(String[] args) throws IOException {
 String datos = "";
 while(datos.isEmpty()){
 
 datos = scanner.nextLine();
 if(datos.isEmpty())
 System.out.println("Ingrese los valores separados por un espacio(No ingrese vacios o le volvere a preguntar)");
 }
 String[] nk = datos.split(" ");
 if(nk.length == 2){
 String n = nk[0];
 String k = nk[1];
 if (validarRestricciones(n, k))
 System.out.println(digitoBase(n, Integer.parseInt(k)));
 else
 System.out.println("Datos ingresados no cumple las condiciones para el calculo");
 }
 scanner.close();
 }
}