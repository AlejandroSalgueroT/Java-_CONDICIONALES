public class Ejercicio_13 {
    public static void main(String[] args) {
        //Leer un numero entero de 2 digitos y si es par entonces mostrar en pantalla la suma de sus digitos, y si es primo y menor que 15 mostrar en pantalla su ultimo digito y si es multiplo
        //de 5 y menor que 20 mostrar en pantalla el primer digito

        int numero= 22;

        if (numero>=9&&numero<=99){
        int digito1= numero/10;
        int digito2= numero%10;

            if(numero%2==0){
                
                int suma= digito1+digito2;
                System.out.println("La suma de los digitos es:"+suma);
            }
            if (numero==2||numero==3||numero==5||numero==7||numero==11||numero==13) {

                System.out.println("El ultimo digito es "+digito2);
            }
            if(numero%5==0&&numero<20){
                System.out.println("El primer digito es "+digito1);
            }







        }else{
            System.out.println("El numero no tiene dos digitos");
        }
    }
}
