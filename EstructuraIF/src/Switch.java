import java.util.Scanner;

public class Switch {

    public void estructuraTradicional(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la nota");
        int nota = scanner.nextInt();

        switch (nota){
            case 1:
                System.out.println("Si la nota vale 1, has susoendido con honores");
                break;

            case 5:
                System.out.println("Has sacado un 5 pelao");
                break;

            case 8:
                System.out.println("Has aprobado de forma correcta");
                break;

            case 10:
                System.out.println("Lo has bordado");
                break;

            default:
                System.out.println("Esta nota no es analizable");
                break;


        }


    }

    public void estructuraLambda(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indícame tu nombre");
        String nombre = scanner.nextLine();
        switch (nombre){
            case "Borja" ->{
                System.out.println("Nobre introducido Borja");
                String apellido = "asd";

            }
            case "María" ->{
                System.out.println("Nobre introducido María");
                String apellido = "asd";

            }
            case "Juan" ->{
                System.out.println("Nobre introducido Juan");
                String apellido = "asd";

            }
            case "Marcos" ->{
                System.out.println("Nobre introducido Marcos");
                String apellido = "asd";

            }
            default ->{
                System.out.println("Nobre introducido caso no contemplado");
                String apellido = "asd";

            }

            }

        }

    }









