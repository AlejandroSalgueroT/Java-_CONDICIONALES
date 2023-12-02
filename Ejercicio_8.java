public class Ejercicio_8 {
    public static void main(String[] args) {

//8.	Leer un número entero menor que 50 y positivo y determinar si es un número primo.


        int numero =50;
if(numero<=50&&numero>0){
    if (numero == 2 || numero == 3 || numero == 5 || numero == 7) {
            System.out.println("Es primo");}

    else if(numero%2==0){
        System.out.println("no es primo");
    }
    else if(numero%3==0){
        System.out.println("no es primo");
    
    }else if(numero%5==0){
        System.out.println("no es primo");
    
    }else if(numero%7==0){
        System.out.println("no es primo");
    
    }else{
        System.out.println("es primo");
    }

}else{
    System.out.println("El numero no esta dentro del rango de 50");
}
}
}
