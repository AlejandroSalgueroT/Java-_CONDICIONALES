
public class Ejercicio_1 {
    
    public static void main(String[] args) {
        
        //Leer un numero menor que 20 y determinar si es primo

        int numero =10;

        if (numero<20&&numero>0) {
            
            if ((numero==2)||(numero==3)||(numero==5)||(numero==7)||(numero==11)||(numero==13)||(numero==17)||(numero==19) ) {
                System.out.println(numero+" primo");
            }else{
                System.out.println("no primo");
            }
            
        }else{
            System.out.println("El numero no es menor que 20");
        }
    }
}
