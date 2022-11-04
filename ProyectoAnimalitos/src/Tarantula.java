import java.util.Scanner;
public class Pez extends Animal{
    Scanner entrada = new Scanner(System.in);
    //aqui
    String sonido;
    public Pez(){

    }

    public Pez(String nombre, String raza, String tipo_alimento, int edad, String sonido){
        //debo de poder acceder a la clase super
        super(nombre, raza, tipo_alimento, edad);
        this.sonido = sonido;
    }

    //recibir
    public String getsonido(){
        System.out.println("como hace el pez?");
        sonido = entrada.next();
        return sonido;
    }

    //enviar
    public void setsonido(String sonido){
        this.sonido = sonido;
    }

    //el metodo propio del perro
    public void mostrarPez(){
        System.out.println("El nombre del perro es: " + getNombre() + "\n" + "Su raza es: " + getRaza() + "\n" + "Se alimenta de: " +
        getTipo_alimento() +  "\n" + "Tiene la edad de: " + getEdad() + "\n" + "el sonido que hace es : " + sonido );
    }
}
