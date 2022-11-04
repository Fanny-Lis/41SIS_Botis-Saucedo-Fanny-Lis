import java.util.Scanner;
import java.lang.Math;

//libreria math es para el uso de raiz cuadrada y potencias, asi como numero de euler pi, etc

public class Figura {

    //variables globales
    double lado, altura, area, perimetro, lado2, lado3, base,lado4;
    int opcion;
    char letra;
    int op; 


    //objeto
    Scanner entrada = new Scanner(System.in);

    //metodos

    public void menu(){
        /**
         * vamos a realizar un prgorama que se encargue del calculo del area y perimetro de cuadrado, triangulo, rectangulo y circulo
         */

        do{
            System.out.println("Programa para el calculo de area y perimetro de figuras");
            System.out.println("Elija una opcion deseada: ");
            System.out.println("1.- Cuadrado");
            System.out.println("2.- Triangulo");
            System.out.println("3.- Circulo");
            System.out.println("4.- Rectangulo");
            System.out.println("5.- Salir");

            opcion = entrada.nextInt();

            switch(opcion){
                case 1: 
                    calcularCuadrado();
                    break;
                case 2: 
                    calcularTriangulo();
                    break;
                case 3: 
                    calcularCirculo();
                    break;
                case 4: 
                    calcularRectangulo();
                    break;
                default:
                    System.out.println("Gracias por ocupar este programa saluditos");
                    break;
            }
            System.out.println("¿Desea repetir el programa?, escriba S para repetir ");
            letra = entrada.next().charAt(0);

        }while(letra == 's' || letra == 'S');
    }

    public void calcularCuadrado(){
        try{
            System.out.println("Ingrese el valor del lado del cuadrado: ");
            lado = entrada.nextDouble();
            perimetro = lado*4;
            area = lado*lado;
            System.out.println("El perimetro es de: " +perimetro + " el area es de: " + area);

        }catch(Exception e){
            System.out.println("Ingrese unicamente valores numericos");
            System.out.println("Error: " + e.getMessage());

        }
    }

    public void calcularTriangulo(){

        System.out.println("Ingrese 1 para el área y 2 para tipos de triángulo : ");
        opcion = entrada.nextInt();

        switch(opcion){
            case 1:

                    try{
                        System.out.println("Ingrese la base del triángulo: ");

                        base = entrada.nextDouble();
                        System.out.println("Ingrese la altura del triángulo: ");
                        altura = entrada.nextDouble();
                        area = (base*altura)/2;
                        System.out.println("El área del triángulo es: " + area);

                    }catch(Exception e){
                        System.out.println("Ingrese unicamente valores numéricos");
                        System.out.println("Error: " + e.getMessage());
                        System.out.println(e.getStackTrace()); //obtiene la raiz del problema

                    }

                break;
            case 2:

                System.out.println("Qué triángulo es y su perímetro "); 
                System.out.println("Ingrese el primer lado:"); 
                lado = entrada.nextDouble(); 
                System.out.println("Ingrese el segundo lado: "); 
                lado2 = entrada.nextDouble(); 
                System.out.println("Ingrese el tercer lado:"); 
                lado3 = entrada.nextDouble(); 
                perimetro = (lado+lado+lado3); 
                System.out.println("El perímetro del triángulo es: " + perimetro);  
                if(lado == lado2 && lado == lado3 && lado2 == lado3){
                    System.out.println("y el triángulo es equilátero ");
                }
                if(lado != lado2 && lado2 == lado3 && lado != lado3){
                    System.out.println(" y el triángulo es isósceles "); 
                }
                if(lado != lado2 && lado != lado3 && lado2 != lado3){
                    System.out.println("y el triángulo es escaleno "); 
                }
                //ahi lo hacen de tarea, porque quiero que identifique si es un triangulo equilatero, escaleno o isoseles
                System.out.println("tarea");
                break;
            default:
                System.out.println("Opción invalida rayoss");
                break;
        }
    }

    public void calcularCirculo(){
        System.out.println("ingrese 1 para el area y 2 para el perimetro : ");
        opcion = entrada.nextInt();

        switch(opcion){
            case 1:
                System.out.println("Ingresa el radio del circulo: ");
                lado = entrada.nextDouble();

                //pi * r* r
                area = Math.PI*lado*lado;
                System.out.println("El area es de: " + area);
                break;
            case 2:
                System.out.println("Ingrese el diametro del circulo: ");
                lado = entrada.nextDouble();

                //PI * diametro
                perimetro = Math.PI*lado;
                System.out.println("El perimetro es de : " + perimetro);
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }


    }

    public void calcularRectangulo(){
        System.out.println("Rectángulo"); 
        System.out.println("Escoge la opción deseada: "); 
        System.out.println("1 Área"); 
        System.out.println("2 Perímetro"); 
        op = entrada.nextInt(); 
        switch(op){
            case 1 :
            System.out.print("ingrese la altura del rectángulo : "); 
            altura = entrada.nextDouble(); 
            System.out.print("Ingrese la base del rectángulo : "); 
            base = entrada.nextDouble(); 
            area = (base*altura); 
            System.out.println("El área del rectángulo es : "+area); 
            break; 
            case 2: 
            System.out.println("Perímetro"); 
            System.out.println("Ingrese lado a : ");
            lado = entrada.nextDouble();
            System.out.println("Ingrese lado b : ");
            lado2 = entrada.nextDouble(); 
            System.out.println("Ingrese lado c : ");
            lado3 = entrada.nextDouble(); 
            System.out.println("Ingrese lado a : ");
            lado4 = entrada.nextDouble(); 

            perimetro = (lado+lado2+lado3+lado4); 

            System.out.println("El Perímetro del rectángulo es : "+perimetro); 
            break; 
        }

        //tarea wiiii para que ahorita lo acaben w

    }

}

