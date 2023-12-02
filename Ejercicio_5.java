public class Ejercicio_5 {
    public static void main(String[] args) {

        //5.	Leer un número entero de 3 dígitos y determinar en qué posición está el mayor dígito.

        int numero = 132 , digito1=0,digito2=0,digito3=0;

        if (numero<0) {
            numero=numero*-1;
            }
        if (numero>=100&&numero<=999) {
           digito1=numero/100;
           digito2=(numero/10)%10;
           digito3=numero%10;
          
        }

        if (digito1>digito2&&digito1>digito3) {
            System.out.println("El mayor digito es "+digito1+" y esta en la posicion 1");
        }
        if(digito2>digito1&&digito2>digito3) {
            System.out.println("El mayor digito es "+digito2+" y esta en la posicion 2");
        }
        if(digito3>digito1&&digito3>digito2){
            System.out.println("El mayor digito es "+digito3+" y esta en la posicion 3");
        }


        
    }
}

