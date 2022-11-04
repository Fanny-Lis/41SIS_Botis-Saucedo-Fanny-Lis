import java.util.Scanner;

/**Vamos a crear los 14 programas dentro de un menu de 
seleccion de la tarea, comprendido por:
* 1.-Bono o descuento por edad 
*2.-Convertir numeros decimales a binarios
*3.-convertir temperaturas
*4.-numero de positivos y negativos.
*5.-tienda
*6.-area y perimetro
*7.-tabla
*8.-factorial
*9.-dibujitos
*10.-figura hueca
*11.-patrones
*12.-diamante
*13.-calculadora
*14.-salir
*/



class estructuradatos{
    
}
public static void main(String[]args){
    //objetos
    Scanner entrada = new Scanner
    (System.in);
    //aqui van a ir las variables
}
int opcion, numbinario;
char letra = "";
String binario = ""; //comillas es vacio
do{
System.out.println("Bienvenido al programa de las tareas que son para el lunes");
System.out.println("Por favor elija la opcion deseada");
System.out.println("1.-Bono o descuento por edad ");
System.out.println("2.-Convertir numeros decimales a binarios");
System.out.println("3.-convertir temperaturas");
System.out.println("4.-numero de positivos y negativos");
System.out.println("5.-tienda");
System.out.println("6.-area y perimetro");
System.out.println("7.-tabla");
System.out.println("8.-factorial");
System.out.println("9.-dibujitos");
System.out.println("10.-figura hueca");
System.out.println("11.-patrones");
System.out.println("12.-diamante");
System.out.println("13.-calculadora");
System.out.println("14.-salir");
 //obtener la respuesta del usuario
 opcion = entrada.nextInt();

 //menu
 switch(opcion){
     case 1:
         break;
     case 2:
         //convertir numero a binario
         System.out.println("Ingrese un numero positivo entero que desee convertir a binario");
         numbinario = entrada.nextInt();

         //tenemos que saber si es positivo
         if(numbinario > 0){
             //realizar el algotimo con el mod 2 
             while(numbinario > 0){
                 if(numbinario%2 == 0){
                     binario ="0" + binario;
                 }else{
                     binario ="1" + binario;
                 }
                 numbinario = (int)numbinario/2;
             }
         }else if(numbinario == 0){
             binario = "0";
         }else{
             binario = "No se pudo convertir el numero, ingrese solo positivos";
         }
         System.out.println("El numero convertido a binario es: " + binario);
         break;
     case 3:
         break;
     case 4:
         break;    
     case 5:
         break;
     case 6:
         break;
     case 7:
         for(int n = 1; n<=10; n++){
             System.out.println(n + " " +(n*10) + " " + (n*100) + " " +(n*1000) );
         }
         break;
 }

 System.out.println("Deseas repetir el programa, escribe s para si");
 letra = entrada.next().charAt(0);



}while(letra == 's' || letra == 'S' );

}

}