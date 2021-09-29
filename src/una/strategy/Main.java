package una.strategy;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        boolean salir = false;
        int opc = 0;
        IOperacion operac = new Suma();


        while(opc!=5){

            System.out.println("CALCULADORA CON STRATEGY");
            System.out.println("Digite ");
            System.out.println("1-SUMAR ");
            System.out.println("2-RESTAR ");
            System.out.println("3-MULTIPLICAR");
            System.out.println("4-DIVIDIR ");
            System.out.println("5-SALIR ");
            opc = entrada.nextInt();
            if(opc==5)
                break;
            System.out.println(" Digite el valor 1");
            int a = entrada.nextInt();
            System.out.println("Digite el valor 2 ");
            int b = entrada.nextInt();

           if(opc==1)
               operac=new Suma();
           if(opc==2)
               operac=new Resta();
           if(opc==3)
               operac=new Multiplicacion();
           if(opc==4)
              operac=new Division();

            System.out.println(" Resultado de la operacion " + operac.operacion(a, b));
            System.out.println(" ");
            System.out.println(" ");
        }

    }
}
