public class Ejercicio_11 {
    public static void main(String[] args) {
      //11.	Leer un número entero de dos dígitos y si es múltiplo cuatro mostrar en pantalla su mitad si es múltiplo de 5 
      //mostrar en pantalla su cuadrado y si es múltiplo de 6 mostrar en pantalla su primer dígito asumir que el número de menor que 100.
      
        int numero= 30;
        int mcuatro;
        int mcinco;
        int mseis;
        

        if (numero<0){
            numero=numero*-1;
        }


        if (numero>9&&numero<99){
            if (numero%4==0) {
                mcuatro=numero/2;
                System.out.println("El numero es multiplo de cuatro: "+mcuatro)  ; 
            }
                if (numero%5==0) {
                    mcinco=numero*numero;
                    System.out.println("El numero es multiplo de cinco: "+mcinco) ;
                }
                    if (numero%6==0){
                        mseis=numero/10;
                        System.out.println("El numero es multiplo de seis: "+mseis) ;
                    }








        }else{
            System.out.println("El numero no tiene dos digitos") ;
        }


    }
}
