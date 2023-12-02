public class Ejercicio_7 {
    public static void main(String[] args) {

        //7.	Leer un número entero de cuatro dígitos y determinar cuántos dígitos impares tiene.

        int numero = 1234;
        int digito1=0,digito2=0,digito3=0,digito4=0,contador=0;

        if(numero<0){
            numero=numero*-1;
        }

        if(numero>999&&numero<9999){
            digito1=numero/1000;
            digito2=(numero/100)%10;
            digito3=(numero/10)%10;
            digito4=numero%10;

           if(digito1%2==1){
            contador=contador+1;
           }
           if(digito2%2==1){
            contador=contador+1;
           }
           if(digito3%2==1){
            contador=contador+1;
           }
           if(digito4%2==1){
            contador=contador+1;
           }
           System.out.println("El digito tiene un total de "+contador+" cifras impares");








        }else{
            System.out.println("El valor no tiene 4 digitos");
        }
    }
}
