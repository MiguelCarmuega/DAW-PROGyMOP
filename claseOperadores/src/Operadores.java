import java.util.Scanner;

public class Operadores {
    public void operadoresAritmeticos (){
        System.out.println("Explicación operadores aritmeticos");
        // unarios
        int operandoUno = 5;
        operandoUno++;
        operandoUno++;
        operandoUno++;
        operandoUno++;
        System.out.println("Despues de incrementar"+operandoUno);
        operandoUno--;
        operandoUno--;
        operandoUno--;
        operandoUno--;
        System.out.println("Despues de decrementar"+operandoUno);

        //binarios
        int operandoDos = 2;
        int suma = operandoUno + operandoDos;
        System.out.println("El resultado de la suma es "+suma);
        int resta =operandoUno - operandoDos;
        System.out.println("El resultado de la resta es "+resta);
        int multiplicacion = operandoUno * operandoDos;
        System.out.println("El resultado de la multiplicación es "+multiplicacion);
        double division = (double) operandoUno/operandoDos;
        //Para redondear por ejemplo a dos deciamles
        System.out.printf("El resultado de la división es %.2f",division);
        int modulo =operandoUno%operandoDos;//resto de la división

        System.out.println("El resto de la división es "+modulo);
    }

    public void operadoresAsignacion() {
        int operandoUno = 6;
        operandoUno += 6; //operandoUno = operandoUno +10; //16
        operandoUno -= 3; // 9
        operandoUno *= 2; //18
        operandoUno /= 2; // 9
        operandoUno %= 3; // 0
    }

    public void operadoresComparacion(){
        int numeroUno = 4;
        int numeroDos = 7;

        boolean resultado = numeroUno>numeroDos; // false
        System.out.println("El resultado es "+resultado);
        resultado = numeroUno>=numeroDos; // false
        System.out.println("El resultado es "+resultado);
        resultado = numeroUno<numeroDos; // true
        System.out.println("El resultado es "+resultado);
        resultado = numeroUno<=numeroDos; //true
        System.out.println("El resultado es "+resultado);
        resultado = numeroUno==numeroDos; //false
        System.out.println("El resultado es "+resultado);
        resultado = numeroUno!=numeroDos; //true
        System.out.println("El resultado es "+resultado);

    }

    public void operadoresLogicos(){
        int numeroUno = 4;
        int numeroDos = 10;
        int numeroTres = 17;
        //Operador logico AND
        boolean resultadoLogicoAND = numeroUno>1 && numeroDos<11 && numeroDos!=numeroTres && numeroTres%2!=0;
                                  //true && true && true && true -> true
        System.out.println("El resultado lógico del AND es "+resultadoLogicoAND);

        // Operador lógico OR

        boolean resultadoLogicoOR = numeroUno!=10 || numeroDos>10 || numeroTres<2 || numeroDos%2!=0;
                                   //true || false || false || false -> true
        System.out.println("El resultado lógico del OR es "+resultadoLogicoOR);

        //Resultado lógico combinado

        boolean resultadoLogicoCon = numeroUno<10 || numeroTres>0 || numeroDos!=9 && numeroUno>0;
                                     // true || true || true && true -> true
        System.out.println("El resultado lógico del OR y AND es "+resultadoLogicoCon);


    }
    public void evaluarCandidato(){
        Scanner lectorTeclado = new Scanner(System.in);
        System.out.println("Dime nobre y apellido");
        String nombreApellido = lectorTeclado.nextLine();
        System.out.println("Dime tu edad");
        int edad = lectorTeclado.nextInt();
        System.out.println("que salario quieres cobrar");
        int salario = lectorTeclado.nextInt();
        System.out.println("Tienes experiencia");
        boolean experiencia = lectorTeclado.nextBoolean();

        //candidato válido si edad inferior a 40 y sueldo inferior a 40000 y experiencia

        boolean resultadoEvaluacion = edad<40 && salario<40000 && experiencia;
        System.out.println("El resultado de la evaluación es que el candidato es "+resultadoEvaluacion);

        lectorTeclado.close();


    }

    public void cambiosTipo (){
         //casteo -> cambiar un tipo de dato momentaneamente. Solo aplica a tipos que entran dentro de otros.
        double ejemCasteo = (int)  7.5;
        System.out.println(+ejemCasteo);

        // parseo -> cambiar dato momentaneamente. tanto en origen como si no. ME LA JUEGO
        String palabra ="hola";
        // System.out.println(Integer.parseInt(palabra)); aqui no funciona
        String palabra2 = "7";
        System.out.println(Integer.parseInt(palabra2)); //Aqui si funciona



    }

}
