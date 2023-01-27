package com.mycompany.lab2p1_fernandogomez;

/**
 *
 * @author Fernando_Jose
 */
import java.util.Scanner;

public class Lab2P1_FernandoGomez {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Bienvenido a mi ejercicio de laboratorio.");
        while (true) {
            System.out.println("\n Menu \n 1.Numero perfecto \n 2.Sumatoria \n 3.Serie \n 4.Salir\n");
            int caso = entrada.nextInt();
            switch (caso) {
                case 1:
                    System.out.print("Ingrese n:");
                    int num = entrada.nextInt();
                    int conta = 1,
                     sum = 0;
                    while (conta < num) {
                        if (num % conta == 0) {
                            sum = conta + sum;
                        }
                        conta = conta + 1;
                    }
                    if (sum == 1) {
                        System.out.println("Output: Es primo, no se pudo realizar el calculo por falta de divisores.");
                    } else if (sum == num) {
                        System.out.println("Output: Es un numero perfecto.");
                        conta = 1;
                        sum = 0;
                        System.out.print("Divisores:");
                        while (conta < num) {
                            if (num % conta == 0) {
                                System.out.print(" " + conta);
                                sum = conta + sum;
                            }
                            conta = conta + 1;
                        }
                    } else {
                        conta = 1;
                        sum = 0;
                        System.out.print("Divisores:");
                        while (conta < num) {
                            if (num % conta == 0) {
                                System.out.print(" " + conta);
                                sum = conta + sum;
                            }
                            conta = conta + 1;
                        }
                    }

                    break;
                case 2:
                    System.out.print("Input: ");
                    int num2 = entrada.nextInt();
                    int cont = 0;
                    float a = 0,
                     b = 0,
                     resp = 0,
                     res;
                    while (cont < num2) {
                        cont = cont + 1;
                        a = (2 * cont - 1);
                        b = cont * (cont + 1);
                        res = a / b;
                        resp = res + resp;
                    }
                    System.out.println("Output: " + resp);

                    break;
                case 3:
                    int n = 0;
                    System.out.print("N = ");
                    n = entrada.nextInt();
                    System.out.print("X = ");
                    int x = entrada.nextInt();
                    int con = 0,
                     out = 0;
                    System.out.print(con + "  1  ");
                    while (con < x) {
                        con = con + 1;
                        if (con % 2 == 0) {
                            out = n * con;
                        } else if (con % 2 == 1) {
                            out = (-n) * con;
                        }
                        System.out.print(out + "  ");
                    }
                    break;
                case 4:
                    System.out.println(".....Finalizando programa.....");
                    System.exit(0);
                    break;
                default:
                    System.out.println("El numero que ingreso no es valido Pruebe otro");
                    break;
            }
        }
    }
}
