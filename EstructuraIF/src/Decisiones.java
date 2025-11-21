public class Decisiones {

    public void estructuraIF(int nota) {

        System.out.println("Explicación estructura IF");
        if (nota >= 5) {
            System.out.println("El examen está aprobado");

        } else {
            System.out.println("El examen está suspenso");
        }
        System.out.println("Terminando evaluación");
    }


    public void estructuraIFELSE(double nota) {

        System.out.println("Iniciando evaluación del examen");
        if (nota>=0&&nota<=10){
            if (nota < 1) {
                System.out.println("Desastroso");
            } else if (nota<4){
                System.out.println("Mal");
            } else if (nota<5) {
                System.out.println("Suspenso Raspado");
            } else if (nota<8){
                System.out.println("Bien");
            } else if (nota<9) {
                System.out.println("Notable");
            } else if (nota<10) {
                System.out.println("Sobresaliente");
            } else{
                System.out.println("Matrícula de honor");
            }

        } else {
            System.out.println("Rango incorrecto");
        }

        System.out.println("Finalizando la evaluación");

    }
}