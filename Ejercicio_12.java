public class Ejercicio_12 {
public static void main(String[] args) {
    //leer 2 numeros enteros cada uno de 2 digitos y si la diferencia entre los 2 numeros es par entonces mostrar en pantalla la suma de los digitos de los numeros,
     //si dicha diferencia es un numero primo menor que 10 entonces mostrar en pantalla el producto de los 2 numeros
     //si la diferencia entre ellos termina en cuatro mostrar en pantalla todos los digitos por separado

int numero1=20;
int numero2=16;
int resta;
int digitosn1,digitosn2,digitosn3,digitosn4;

if((numero1>=9&&numero1<=99)&&(numero2>=9&&numero2<=99)){

    //Hallamos los digitos de los numeros para usarlos en un futuro
    digitosn1=numero1/10;
    digitosn2=numero1%10;

    digitosn3=numero2/10;
    digitosn4=numero2%10;

    
    //El ejercicio se basa en la diferencia de los dos numeros lo hacemos desde un principio para con esta resta resolver todo lo que nos piden
    resta=numero1-numero2;

    //Sacamos el ultimo digito del resultado de la resta de los dos numeros para usarlo en un futuro
    int digito2=resta%10;


    //si la diferencia entre los 2 numeros es par entonces mostrar en pantalla la suma de los digitos de los numeros
    if (resta%2==0){
    int suma=digitosn1+digitosn2+digitosn3+digitosn4;
    System.out.println("La suma de los digitos de ambos numeros es: "+suma);
    }


    //si dicha diferencia es un numero primo menor que 10 entonces mostrar en pantalla el producto de los 2 numeros
    if (resta==2||resta==3||resta==5||resta==7) {
    int multiplicacion = numero1*numero2;
    System.out.println("El producto de los dos numeros es: "+multiplicacion);
    }


    //si la diferencia entre ellos termina en cuatro mostrar en pantalla todos los digitos por separado
    if (digito2==4) {
        System.out.println("La diferencia de los digitos termina en 4 entonces:"+digitosn1+(" ")+digitosn2+(" + ")+digitosn3+(" ")+digitosn4);
    
    }

    
    
    
}
else{
    System.out.println("Los numeros no tienen dos digitos");
}
}
}
