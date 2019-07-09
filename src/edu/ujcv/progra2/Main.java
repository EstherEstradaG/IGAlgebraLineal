package edu.ujcv.progra2;

import edu.ujcv.progra2.vector.IGVecR3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            IGVecR3 calcu = new IGVecR3();
            System.out.println("Bienvenido");
            System.out.println("Ingrese su opcion");
            System.out.println("1. Vectores");
            System.out.println("2. Matrices");
            int opcion = sc.nextInt();
            if (opcion == 1){
                System.out.println("Ingrese una dimension");
                System.out.println("1. IGVecR2");
                System.out.println("2. IGVecR3");
                System.out.println("3. IGVecR4");
                opcion = sc.nextInt();
                if (opcion == 1){

                }
            }
        }
    }
}
