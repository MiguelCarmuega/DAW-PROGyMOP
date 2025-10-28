public class Main {

// esto es un comentario

// TODO Me falta esto
    int edadGlobal = 12;

    public static void main(String[] args) {
        System.out.println("Este es mi primer programa en java\n");
        System.out.println("Esta es mi segunda línea del programa\n");
        String miNombre = "Miguel";
        final String DNI = "01672355W";
        char letraDNI = 'w';
        int edad = 27;
        double altura = 1.67;
        float peso = 61.1f;
        boolean experiencia = true;
        System.out.println("Mi nombre es:" +miNombre);
        System.out.println("La letra de mi DNI es: " +letraDNI);
        System.out.println("Mi edad es: " +edad);
        System.out.println("Mi altura es de: " +altura);
        System.out.println("Mi peso es: " +peso);
        System.out.println("Mi experiencia es: " +experiencia);
        System.out.println("Mi DNI es: " +DNI);
        System.out.println("El valor del número PI es: "+Math.PI);



    }

    public void nombreMetodo(){

        int edadGlobal = 35;
        System.out.println(edadGlobal);
        System.out.println(this.edadGlobal);



    }





}