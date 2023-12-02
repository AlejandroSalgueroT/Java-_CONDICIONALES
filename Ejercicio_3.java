public class Ejercicio_3 {
    public static void main(String[] args) {
        //3. Enteros de 2 dígitos y determinar si la suma de los 2 números origina un número par.
        int numero = 300;
        int numero1=100;

        if (numero<0) {
            numero=numero*-1;
            
        }
         if (numero1<0) {
            numero1=numero1*-1;
            
        }

        if((numero>9&&numero<100)&&(numero1>9&&numero1<100)){
             
            int resultado = numero+numero1;
            resultado=resultado%2;
            

            if(resultado==0){
                System.out.println("El resultado de la suma es un numero par");
            }else{
                System.out.println("El resultado de la suma NO es un numero par");
            }








        }else{
            System.out.println("Los numeros no son de dos cifras");
        }
    }
}