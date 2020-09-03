#Desafío del dígito base

Para encontrar el dígito base de un entero se tienen que seguir las siguientes reglas:

* Se considerará el dígito base, si lo resultante es un dígito.
* Si es que no es un dígito base, entonces debemos sumar cada uno de los dígitos que lo componen, y volver a evaluar si es o no un dígito base. De lo contrario,
se debe ejercer este paso nuevamente.

Un dígito base puede ser calculado de la siguiente manera:
digito_base(8909) = digito_base(8 + 9 + 0 + 9)
                  = digito_base(26)
                  = digito_base(2+6)
                  = digito_base(8)
                  = 8

## Desafío:

Dado un número entero N que llamaremos base y un número K que llamaremos índice de concatenación, debemos encontrar el dígito base 
del número resultante de la concatenación de K veces N.

Por ejemplo


Formato de entrada:

8909

Formato de salida:

8

Explicación:

Input Format

The first line contains two space separated integers,  and .

Constraints

Output Format

Output the super digit of , where  is created as described above.

Sample Input 0

148 3
Sample Output 0

3
Explanation 0

Here  and , so .

super_digit(P) = super_digit(148148148) 
               = super_digit(1+4+8+1+4+8+1+4+8)
               = super_digit(39)
               = super_digit(3+9)
               = super_digit(12)
               = super_digit(1+2)
               = super_digit(3)
               = 3.
