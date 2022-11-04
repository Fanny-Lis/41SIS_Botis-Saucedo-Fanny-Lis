import java.util.Scanner;

public class Principal {

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int op;
        
        //hago la instancia del animal perro
        perro dog = new perro();
        Gato cat = new Gato();
        Hamster reou = new Hamster();
        Conejo bad = new Conejo();
        Cuyo nose = new Cuyo();
        Uron risa = new Uron();
        Pez gluglu = new Pez();

        /*Quiero que se cree un menu mediante el cual el usuario pueda ingresar los datos de los animales:
         * 
         * 1.- Perro
         * 2.- Gato
         * 3.- Hamster
         * 4.- Conejo
         * 5.- Cuyo
         * 6.- Uron
         * 7.- Otro
         * 
         * Debera de poder ingresar cada uno de los datos y asi mismo deberan de entregar el diagrama de clases hecho en star uml aplicando la herencia correspondiente y el programa
        */
        System.out.println("Lee las opciones y escoje tu animalito ");
        System.out.println(" 1 perro ");
        System.out.println(" 2 gato ");
        System.out.println(" 3 Hamster");
        System.out.println(" 4 Conejo ");
        System.out.println(" 5 Cuyo ");
        System.out.println(" 6 Uron ");
        System.out.println(" 7 Sorpresa ");
        System.out.println("Digita tu opcion ");
        op = entrada.nextInt();

        switch(op){
            case 1:
            dog.mostrarPerro();
            break;

            case 2:
            cat.mostrarGato();
            break;

            case 3:
            reou.mostrarHamster();
            break;

            case 4:
            bad.mostrarConejo();
            break;

            case 5:
            nose.mostrarCuyo();
            break;

            case 6:
            risa.mostrarUron();
            break;

            case 7:
            gluglu.mostrarPez();
            break;
        }
    }    
}
