public class Ejercicio_2 {
    public static void main(String[] args) {
        //leer un numero entero de 2 digitos y determinar si un digito es multiplo de otro

        int numero = 24;
        int digito1=0,digito2=0;

        if (numero<0) {
            numero=numero*-1;
            
        }

        if(numero>9&&numero<100){
            digito1=numero/10;
        digito2=numero%10;
        

        if(digito1%digito2==0||digito2%digito1==0){
            System.out.println("Los digitos del numero "+numero+ " son multiplos");
        }else{
            System.out.println("Los digitos del numero ingresado no son multiplos");
        }



    }else{
        System.out.println("El numero tiene mas de dos cifras");
    }
    }
}
