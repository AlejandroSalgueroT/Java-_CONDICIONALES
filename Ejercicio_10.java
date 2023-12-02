public class  Ejercicio_10 {
    public static void main(String[] args) {
        //10.	Leer 2 números enteros y determinar si la diferencia entre los 2 es un número divisor exacto de alguno de los 2 números.
        int numero1 =10;
        int numero2 =5;

        int resta=numero1-numero2;

        if (numero1%resta==0){
            System.out.println("El resultado "+resta+" es divisor exacto del primer numero ("+numero1+")");
        }else if (numero2%resta==0){
            System.out.println("El resultado "+resta+" es divisor exacto del segundo numero ("+numero2+")");
        }else{
             System.out.println("El resultado "+resta+"  NO es divisor exacto de ninguno de los dos digitos ingresados");
        }

    }
}
