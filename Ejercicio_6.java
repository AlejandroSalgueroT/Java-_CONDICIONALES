public class Ejercicio_6 {
    public static void main(String[] args) {
        //6.	Leer un número entero de 3 dígitos y determinar si algún dígito es múltiplo de los otros.
        int numero = 422;
        int digito1=0,digito2=0,digito3=0;

        if (numero<0) {
            numero=numero*-1;
            }
        if (numero>=100&&numero<=999) {
           digito1=numero/100;
           digito2=(numero/10)%10;
           digito3=numero%10;

           if(digito1%digito2==0&&digito2%digito3==0){
            System.out.println("Los digitos del numero "+numero+ " son multiplos");
        }else{
            System.out.println("Los digitos del numero ingresado no son multiplos");
        }







        }else{
            System.out.println("El valor no tiene 3 digitos");
        }





    }
}
