import java.io.*;
import java.util.*;

/*
* Desafio PreviArena equipo Zeus 
* @Author ROrtiz
* @Author FSoto
* @Author YPerez
*/
public class DigitoBase {

	private static final Scanner scanner = new Scanner(System.in);
  private static final int MIN_NUM = 1;
  private static final int MAX_DIGITO_BASE = 10000;
  private static final int MAX_REPETICIONES = 11;
	
	/**
	 * Metodo principal encargado de recolectar la variables N (digitoBase), K(repeticiones) <br>
	 * Y retornar el resultado en pantalla.
	 * @param argumentos
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
    String[] entrada;
    String numeroEntero;
    String repeticiones;
    boolean invalido;
    do{
      invalido = true;
      System.out.println("Ingrese los valores separados por un espacio");

		  entrada = scanner.nextLine().split(" ");    
      
		  numeroEntero = entrada[0];

		  repeticiones = entrada[1];

      if(!validaNumero(numeroEntero)){
        invalido = false;
      }
      else if(!validarMaxMin(numeroEntero,MAX_DIGITO_BASE)){
        invalido = false;
      }
      else if(!validaNumero(repeticiones)){
        invalido = false;
      }
      else if(!validarMaxMin(repeticiones,MAX_REPETICIONES)){
        invalido = false;
      }

		  
    }while( !invalido );
    int repeticionInt = Integer.parseInt(repeticiones);
		int salida = superDigito(numeroEntero, repeticionInt);

		System.out.println("Resultado " + salida);
		
		scanner.close();
	}		

  /**
	 * Metodo que valida si el numero es un entero
	 * @param numeroEntero
	 * @return true si es valido
	 */
  static boolean validaNumero(String numeroEntero){
    try{
      int num = Integer.parseInt(numeroEntero);
      if (num == 0)
        return false;
      return true;
    }
    catch(NumberFormatException e){
      System.out.println("El numero entero ingresado no es valido " + numeroEntero);
      return false;
    }
  }

  /**
	 * Metodo que valida el rango valido entre dos numero
	 * @param numeroEntero
	 * @param numMax
	 * @return true si es valido
	 */
  static boolean validarMaxMin(String numeroEntero, int numMax){
    int numero =Integer.parseInt(numeroEntero);
    if(MIN_NUM <= numero  && numMax > numero){
      return true;
    }else{
      System.out.println("El numero no esta en rango deseado " + numeroEntero);
      return false;
    }      
  }
 
	/**
	 * Metodo para el calculo del digito base.
	 * @param numero entero
	 * @param repeticiones
	 * @return digito
	 */
	static int superDigito(String numeroEntero, int repeticiones) {
		String digitoBase = concatenarNumerosNVeces(numeroEntero, repeticiones);
		return obtenerDigitoBase(digitoBase);
	}

	/**
	 * Metodo recursivo que itera el super digito para obtener el numero base.
	 * @param numero 
	 * @return digito
	 */
	static int obtenerDigitoBase(String numero) {
		if (numero.length() == 1) {
			return Integer.parseInt(numero);
		}

		String[] listaNumero = numero.split("");
		int suma = 0;
		for (int i = 0; listaNumero.length > i; i++) {
			suma = suma + Integer.parseInt(listaNumero[i]);
		}
		return obtenerDigitoBase(String.valueOf(suma));
	}
	
	/**
	 * Metodo que concatena nVeces el digito base.
	 * @param numero entero
	 * @param nVeces
	 * @return numero concatenado
	 */
	static String concatenarNumerosNVeces(String numeroEntero, int nVeces) {
		String auxStr = "";
		for (int i = 0; i < nVeces; i++) {
			auxStr = auxStr.concat(numeroEntero);
		}
		return auxStr;
	}
}