public class Ejercicio_14 {
    public static void main(String[] args) {
        //14. Leer 2 números enteros y si la diferencia entre los 2 es menor que 10 entonces 
        //mostrar en pantalla todos los enteros comprendidos entre el menor y el mayor de los números leídos.


        int numero1=11;
        int numero2= 11;
        int diferencia=numero1-numero2;

        //Si el resultado de la diferencia es negativo lo convierte en positivo para mas facilidad
        if (diferencia<=0) {
            diferencia=diferencia*-1;
        }
        //Si el resultado de la diferencia es 0 solo ejecuta este codigo
        if (diferencia==0) {
            diferencia=diferencia*-1;
            System.out.println("El resultador de la resta es 0");
        }


        //Empezamos con la respuesta del ejercicio SOLO CON CONDICIONALES, se que se puede reducir el codigo de 130 lineas a 20 con un ciclo pero estamos en condicionales.
        //Luego de aclarado lo anterior 



        //Si la diferencia es menor que 10 

         if(diferencia<=10){

            //Si se cumple lo anterior vamos a hacer 2 ciclos generales. porque necesitamos saber cual de los dos numeros es el menor para desde ahi empezar el ciclo.
            //Entonces si el numero 1 es mayor que el numero 2, el numero 2 es el menor de los dos.

            if (numero1>numero2){


            // para mas orden declaramos una variable contador que le vamos a asignar el valor que esta guardado en numero1, pues ya sabemos que es el menor
            int contador = numero2;

            //Y este es el condicional que nos hace el ciclo 
            //Si el valor que esta en contador es menor o igual al numero1 que es el numero mayor entonces a contador le sumamos 1
                        if (contador<=numero1) {
                        contador=contador+1;
                        System.out.println(contador);
                        }
            //Ya que en el problema dice que la diferencia de los dos numeros tiene que ser menor que 10 entonces solo colocamos 10 veces el mismo condicional
                        if (contador<numero1) {
                        contador=contador+1;
                        System.out.println(contador);
                        }
            // ya cuando el valor de contador sea igual al de numero 1 termina el programa
                        if (contador<numero1) {
                        contador=contador+1;
                        System.out.println(contador);
                        }

                        if (contador<numero1) {
                        contador=contador+1;
                        System.out.println(contador);
                        }

                        if (contador<numero1) {
                        contador=contador+1;
                        System.out.println(contador);
                        }

                        if (contador<numero1) {
                        contador=contador+1;
                        System.out.println(contador);
                        }

                        if (contador<numero1) {
                        contador=contador+1;
                        System.out.println(contador);
                        }

                        if (contador<numero1) {
                        contador=contador+1;
                        System.out.println(contador);
                        }
                          if (contador<=numero1) {
                        contador=contador+1;
                        System.out.println(contador);
                        }
                        

            // lo mismo del anterior numero pero ahora para el numero 1, por si el usuario ingresa un numero menor en el numero 1 

            //Ejemplo:
            //ingrese el primer valor: 4
            //ingrese el segundo valor:8

            //Ya que el condicional arriba solo hace el ciclo si en numero 2 es el menor pues aqui lo hacemos si en dado caso en numero 1 sea el menor como en 
            //el ejemplo anterior que es 4 
            }

            //si el numero 2 es mayor que el numero 1 entonces el numero menor es 1
             if (numero1<numero2){
            
            //asignamos la variable contador al numero 1
            int contador = numero1;
            //y empezamos el ciclo hasta que contador sea igual a numero 2 mientras sea menor ira sumando hasta su maximo 10 numeros
                        if (contador<=numero2) {

                        contador=contador+1;
                        System.out.println(contador);
                        }

                        if (contador<numero2) {
                        contador=contador+1;
                        System.out.println(contador);
                        }

                        if (contador<numero2) {
                        contador=contador+1;
                        System.out.println(contador);
                        }

                        if (contador<numero2) {
                        contador=contador+1;
                        System.out.println(contador);
                        }

                        if (contador<numero2) {
                        contador=contador+1;
                        System.out.println(contador);
                        }

                        if (contador<numero2) {
                        contador=contador+1;
                        System.out.println(contador);
                        }

                        if (contador<numero2) {
                        contador=contador+1;
                        System.out.println(contador);
                        }

                        if (contador<numero2) {
                        contador=contador+1;
                        System.out.println(contador);
                        }
                          if (contador<=numero2) {
                        contador=contador+1;
                        System.out.println(contador);
                        }

                       
            }

            // si la diferencia no tiene 10 digitos pues simplemente mostramos en pantalla que la diferencia de los numeros no esta en el rango de 10
        }else{
            System.out.println("La diferencia del numero es "+diferencia+ " no esta dentro del rango de 10");
        }


    }
}





    

