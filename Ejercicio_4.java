public class Ejercicio_4  {
    public static void main(String[] args) {
        //4.	leer un número entero de 3 dígitos y determinar a cuánto es igual la suma de sus dígitos.
        int numero = 654;
        int digito=0,digito2=0,digito3=0;

        if(numero<0){
            numero=numero*-1;
        }

        if(numero>99&&numero<999){
            digito=(numero/100);
            digito2=(numero/10)%10;
            digito3=(numero%10);
            int resultado=digito+digito2+digito3;
            System.out.println("La suma de los digitos es: "+resultado);



        }else{
            System.out.println("El numero no es de 3 cifras");
        }
    }
}
