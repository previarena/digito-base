## Temática: Cálculo del dígito base

Para encontrar el dígito base de un entero se tienen que seguir las siguientes reglas:

* Se considerará el dígito base, si el número es sólo un dígito.
* Si es que el entero no es un dígito base, entonces debemos sumar cada uno de los dígitos del entero, y volver a evaluar si es o no un dígito base. De lo contrario,
se debe ejercer este paso nuevamente.

Un dígito base puede ser calculado de la siguiente manera:

>digito_base(8909) = digito_base(8 + 9 + 0 + 9)
>                  = digito_base(26)
>                  = digito_base(2+6)
>                  = digito_base(8)
>                  = 8

### Desafío:

Dado un número entero N que llamaremos base y un número K que llamaremos índice de concatenación, debemos encontrar el dígito base 
del número resultante de la concatenación de K veces N.

Por ejemplo:

> N = 856, K = 2, R = super_digit(865856) = super_digit(8 + 6 + 5 + 8 + 5 + 6) = 2

Formato de entrada:

> 856 2

Formato de salida:

> 2

Explicación:

>super_digit(P) = super_digit(8 + 5 + 6 + 8 + 5 +6)  
>               = super_digit(38)  
>               = super_digit(3 + 8)  
>               = super_digit(11)  
>               = super_digit(1 + 1)  
>               = super_digit(2)  
>               = 2  


Haz tu mayor esfuerzo y diviértete!
