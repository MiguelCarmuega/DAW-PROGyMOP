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


}
