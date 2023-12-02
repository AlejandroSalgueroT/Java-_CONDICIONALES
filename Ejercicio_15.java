public class Ejercicio_15 {
    public static void main(String[] args) {
        //15.	Leer un número entero de 5 dígitos y determinar si es un número capícua
        int numero = 11111;
        int digito1=0,digito2=0,digito3=0,digito4=0,digito5=0;

        //si el numero es negativo lo convertimos en positivo
        if(numero<0){
            numero=numero*-1;
        }
        //comprobamos que el numero tenga 5 digitos y los extraemos uno por uno
        if(numero>9999&&numero<99999){
            digito1=numero/10000;
            digito2=(numero/1000)%10;
            digito3=(numero/100)%10;
            digito4=(numero/10)%10;
            digito5=numero%10;
        
        //comprobamos si el numero es capicua, si el digito 1 es igual al digito 5 y el digito 2 es igual al digito 4
            if(digito1==digito5&&digito2==digito4){
                    System.out.println("El numero  "+digito1+digito2+digito3+digito4+digito5+" Es igual que el numero "+digito5+digito4+digito3+digito2+digito1);
            }
        //si no es capicua muestra el mensaje
            else{
            System.out.println("El numero no es un numero capicua");
        }
        //si el numero no tiene cinco cifras mostramos el mensaje
        }else{
            System.out.println("El numero no tiene 5 cifras");
        }
    
        

    }
}
