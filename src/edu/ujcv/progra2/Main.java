package edu.ujcv.progra2;

import edu.ujcv.progra2.utility.LectorDeTecladoValidado;
import edu.ujcv.progra2.vector.IGVecR3;
import edu.ujcv.progra2.vector.IGVecR2;
import edu.ujcv.progra2.vector.IGVecR4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenido");
        System.out.println("Ingrese su opcion");
        System.out.println("1. Vectores");
        System.out.println("2. Matrices");
        System.out.println("0. Salir");
        int opcion = sc.nextInt();


        while (opcion != 0) {


            if (opcion == 1) {
                System.out.println("Ingrese una dimension");
                System.out.println("1. IGVecR2");
                System.out.println("2. IGVecR3");
                System.out.println("3. IGVecR4");
                opcion = sc.nextInt();

                if (opcion == 1) {
                    System.out.println("Elija su opcion");
                    System.out.println("1. suma");
                    System.out.println("2. resta");
                    System.out.println("3. escalar por vector");
                    System.out.println("4.producto punto");
                    System.out.println("5. angulo");
                    System.out.println("6. magnitud");
                    opcion = sc.nextInt();


                    if (opcion == 1) {
                        IGVecR2 a = new IGVecR2();

                        System.out.println("Ingrese x1 y y1");
                        a.setX(sc.nextDouble());
                        a.setY(sc.nextDouble());
                        IGVecR2 b = new IGVecR2();
                        System.out.println("Ingrese x2 y y2");
                        b.setX(sc.nextDouble());
                        b.setY(sc.nextDouble());
                        IGVecR2 r = a.suma(b);
                        System.out.println("El resultado es: " +r.getX()+ " , "+r.getY());

                    }

                    if (opcion == 2) {
                        IGVecR2 a = new IGVecR2();
                        System.out.println("Ingrese x1 y y1");
                        a.setX(sc.nextDouble());
                        a.setY(sc.nextDouble());
                        IGVecR2 b = new IGVecR2();
                        System.out.println("Ingrese x2 y y2");
                        b.setX(sc.nextDouble());
                        b.setY(sc.nextDouble());
                        IGVecR2 r = a.resta(b);
                        System.out.println("El resultado es: " +r.getX()+" , "+r.getY());
                    }

                    if (opcion == 3) {
                        IGVecR2 a = new IGVecR2();
                        System.out.println("Ingrese x1 y y1");
                        a.setX(sc.nextDouble());
                        a.setY(sc.nextDouble());
                        IGVecR2 b = new IGVecR2();
                        System.out.println("Ingrese x2 y y2");
                        b.setX(sc.nextDouble());
                        b.setY(sc.nextDouble());
                        System.out.println("Ingrese alpha");
                        double alpha = sc.nextDouble();
                        IGVecR2 r = a.escalarPorVector(alpha);
                        System.out.println("El resultado es: " + r.getX()+" , " +r.getY());

                    }

                    if (opcion == 4) {
                        IGVecR2 a = new IGVecR2();
                        System.out.println("Ingrese x1 y y1");
                        a.setX(sc.nextDouble());
                        a.setY(sc.nextDouble());
                        IGVecR2 b = new IGVecR2();
                        System.out.println("Ingrese x2 y y2");
                        b.setX(sc.nextDouble());
                        b.setY(sc.nextDouble());
                        double r = a.productoPunto(b);
                        System.out.println("El resultado es: " + r);
                    }

                    if (opcion == 5) {
                        IGVecR2 a = new IGVecR2();
                        System.out.println("Ingrese x1 y y1");
                        a.setX(sc.nextDouble());
                        a.setY(sc.nextDouble());
                        IGVecR2 b = new IGVecR2();
                        System.out.println("Ingrese x2 y y2");
                        b.setX(sc.nextDouble());
                        b.setY(sc.nextDouble());
                        double r = a.angulo(b,a);
                        System.out.println("El resultado es: " + r);
                    }

                    if (opcion == 6) {
                        IGVecR2 a = new IGVecR2();
                        System.out.println("Ingrese x1 y y1");
                        a.setX(sc.nextDouble());
                        a.setY(sc.nextDouble());
                        IGVecR2 b = new IGVecR2();
                        System.out.println("Ingrese x2 y y2");
                        b.setX(sc.nextDouble());
                        b.setY(sc.nextDouble());
                        System.out.println("El resultado es: " + a.magnitud(b));
                    }


                }
                if (opcion == 2) {
                    System.out.println("Elija su opcion");
                    System.out.println("1. suma");
                    System.out.println("2. resta");
                    System.out.println("3. escalar por vector");
                    System.out.println("4.producto punto");
                    System.out.println("5. angulo");
                    System.out.println("6. magnitud");
                    opcion = sc.nextInt();

                    if (opcion == 1) {
                        IGVecR3 a = new IGVecR3();
                        System.out.println("Ingrese x1, y1 y z1");
                        a.setX(sc.nextDouble());
                        a.setY(sc.nextDouble());
                        a.setZ(sc.nextDouble());
                        IGVecR3 b = new IGVecR3();
                        System.out.println("Ingrese x2, y2 y z2");
                        b.setX(sc.nextDouble());
                        b.setX(sc.nextDouble());
                        b.setZ(sc.nextDouble());
                        IGVecR3 c = new IGVecR3();
                        System.out.println("Ingrese x3, y3 y z3");
                        c.setX(sc.nextDouble());
                        c.setY(sc.nextDouble());
                        c.setZ(sc.nextDouble());
                        System.out.println("El resultado es: " + a.suma(b));

                    }

                    if (opcion == 2) {
                        IGVecR3 a = new IGVecR3();
                        System.out.println("Ingrese x1, y1 y z1");
                        a.setX(sc.nextDouble());
                        a.setY(sc.nextDouble());
                        a.setZ(sc.nextDouble());
                        IGVecR3 b = new IGVecR3();
                        System.out.println("Ingrese x2, y2 y z2");
                        b.setX(sc.nextDouble());
                        b.setX(sc.nextDouble());
                        b.setZ(sc.nextDouble());
                        IGVecR3 c = new IGVecR3();
                        System.out.println("Ingrese x3, y3 y z3");
                        c.setX(sc.nextDouble());
                        c.setY(sc.nextDouble());
                        c.setZ(sc.nextDouble());
                        System.out.println("El resultado es: " + a.resta(b));
                    }

                    if (opcion == 3) {
                        IGVecR3 a = new IGVecR3();
                        System.out.println("Ingrese x1, y1 y z1");
                        a.setX(sc.nextDouble());
                        a.setY(sc.nextDouble());
                        IGVecR3 b = new IGVecR3();
                        System.out.println("Ingrese alpha");
                        double alpha = sc.nextDouble();
                        IGVecR3 resultado = a.escalarPorVector(alpha);
                        System.out.println("El resultado es: " + resultado);

                    }

                    if (opcion == 4) {
                        IGVecR3 a = new IGVecR3();
                        System.out.println("Ingrese x1, y1 y z1");
                        a.setX(sc.nextDouble());
                        a.setY(sc.nextDouble());
                        a.setZ(sc.nextDouble());
                        IGVecR3 b = new IGVecR3();
                        System.out.println("Ingrese x2, y2 y z2");
                        b.setX(sc.nextDouble());
                        b.setX(sc.nextDouble());
                        b.setZ(sc.nextDouble());
                        System.out.println("Ingrese x3, y3 y z3");
                        IGVecR3 c = new IGVecR3();
                        c.setX(sc.nextDouble());
                        c.setX(sc.nextDouble());
                        c.setZ(sc.nextDouble());
                        System.out.println("El resultado es: " + a.productoPunto(b));
                    }

                    if (opcion == 5) {
                        IGVecR3 a = new IGVecR3();
                        System.out.println("Ingrese x1, y1 y z1");
                        a.setX(sc.nextDouble());
                        a.setY(sc.nextDouble());
                        a.setZ(sc.nextDouble());
                        IGVecR3 b = new IGVecR3();
                        System.out.println("Ingrese x2, y2 y z2");
                        b.setX(sc.nextDouble());
                        b.setX(sc.nextDouble());
                        b.setZ(sc.nextDouble());
                        IGVecR3 c = new IGVecR3();
                        System.out.println("Ingrese x3, y3 y z3");
                        c.setX(sc.nextDouble());
                        c.setX(sc.nextDouble());
                        c.setZ(sc.nextDouble());
                        System.out.println("El resultado es: " + a.angulo(a, b));
                    }

                }

                if (opcion == 3) {
                    System.out.println("Elija su opcion");
                    System.out.println("1. suma");
                    System.out.println("2. resta");
                    System.out.println("3. escalar por vector");
                    System.out.println("4.producto punto");
                    System.out.println("5. angulo");
                    System.out.println("6. magnitud");
                    opcion = sc.nextInt();


                    if (opcion == 1) {
                        IGVecR4 a = new IGVecR4();
                        System.out.println("Ingrese w1, x1, y1, z1");
                        a.setW(sc.nextDouble());
                        a.setX(sc.nextDouble());
                        a.setY(sc.nextDouble());
                        a.setZ(sc.nextDouble());
                        IGVecR4 b = new IGVecR4();
                        System.out.println("Ingrese w2, x, y2, z2");
                        b.setW(sc.nextDouble());
                        b.setX(sc.nextDouble());
                        b.setX(sc.nextDouble());
                        b.setZ(sc.nextDouble());
                        IGVecR4 c = new IGVecR4();
                        System.out.println("Ingrese w3, x3, y3, z3");
                        c.setW(sc.nextDouble());
                        c.setX(sc.nextDouble());
                        c.setY(sc.nextDouble());
                        c.setZ(sc.nextDouble());
                        IGVecR4 d = new IGVecR4();
                        System.out.println("Ingrese w4, x4, y4, z4");
                        d.setW(sc.nextDouble());
                        d.setX(sc.nextDouble());
                        d.setY(sc.nextDouble());
                        d.setZ(sc.nextDouble());
                        System.out.println("El resultado es: " + a.suma(b));

                    }

                    if (opcion == 2) {
                        IGVecR4 a = new IGVecR4();
                        System.out.println("Ingrese w1, x1, y1, z1");
                        a.setW(sc.nextDouble());
                        a.setX(sc.nextDouble());
                        a.setY(sc.nextDouble());
                        a.setZ(sc.nextDouble());
                        IGVecR4 b = new IGVecR4();
                        System.out.println("Ingrese w2, x2, y2, z2");
                        b.setW(sc.nextDouble());
                        b.setX(sc.nextDouble());
                        b.setX(sc.nextDouble());
                        b.setZ(sc.nextDouble());
                        IGVecR4 c = new IGVecR4();
                        System.out.println("Ingrese w3, x3, y3, z3");
                        c.setW(sc.nextDouble());
                        c.setX(sc.nextDouble());
                        c.setY(sc.nextDouble());
                        c.setZ(sc.nextDouble());
                        IGVecR4 d = new IGVecR4();
                        System.out.println("Ingrese w4, x4, y4, z4");
                        d.setW(sc.nextDouble());
                        d.setX(sc.nextDouble());
                        d.setY(sc.nextDouble());
                        d.setZ(sc.nextDouble());
                        System.out.println("El resultado es: " + a.resta(b));
                    }

                    if (opcion == 3) {
                        IGVecR4 a = new IGVecR4();
                        System.out.println("Ingrese w1, x1, y1, z1");
                        a.setW(sc.nextDouble());
                        a.setX(sc.nextDouble());
                        a.setY(sc.nextDouble());
                        a.setZ(sc.nextDouble());
                        System.out.println("Ingrese alpha");
                        double alpha = sc.nextDouble();
                        IGVecR4 resultado = a.escalarPorVector(alpha);
                        System.out.println("El resultado es: " + resultado);

                    }

                    if (opcion == 4) {
                        IGVecR4 a = new IGVecR4();
                        System.out.println("Ingrese w1, x1, y1, z1");
                        a.setW(sc.nextDouble());
                        a.setX(sc.nextDouble());
                        a.setY(sc.nextDouble());
                        a.setZ(sc.nextDouble());
                        IGVecR4 b = new IGVecR4();
                        System.out.println("Ingrese w2, x2, y2, z2");
                        b.setW(sc.nextDouble());
                        b.setX(sc.nextDouble());
                        b.setX(sc.nextDouble());
                        b.setZ(sc.nextDouble());
                        IGVecR4 c = new IGVecR4();
                        System.out.println("Ingrese w4, x4, y4, z4");
                        c.setW(sc.nextDouble());
                        c.setX(sc.nextDouble());
                        c.setY(sc.nextDouble());
                        c.setZ(sc.nextDouble());
                        IGVecR4 d = new IGVecR4();
                        System.out.println("Ingrese w4, x4, y4, z4");
                        d.setW(sc.nextDouble());
                        d.setX(sc.nextDouble());
                        d.setY(sc.nextDouble());
                        d.setZ(sc.nextDouble());
                        System.out.println("El resultado es: " + a.productoPunto(b));
                    }

                    if (opcion == 5) {
                        IGVecR4 a = new IGVecR4();
                        System.out.println("Ingrese w1, x1, y1, z1");
                        a.setW(sc.nextDouble());
                        a.setX(sc.nextDouble());
                        a.setY(sc.nextDouble());
                        a.setZ(sc.nextDouble());
                        IGVecR4 b = new IGVecR4();
                        System.out.println("Ingrese w2, x2, y2, z2");
                        b.setW(sc.nextDouble());
                        b.setX(sc.nextDouble());
                        b.setX(sc.nextDouble());
                        b.setZ(sc.nextDouble());
                        IGVecR4 c = new IGVecR4();
                        System.out.println("Ingrese w3, x3, y3, z3");
                        c.setW(sc.nextDouble());
                        c.setX(sc.nextDouble());
                        c.setY(sc.nextDouble());
                        c.setZ(sc.nextDouble());
                        IGVecR4 d = new IGVecR4();
                        System.out.println("Ingrese w4, x4, y4, z4");
                        d.setW(sc.nextDouble());
                        d.setX(sc.nextDouble());
                        d.setY(sc.nextDouble());
                        d.setZ(sc.nextDouble());
                        System.out.println("El resultado es: " + a.angulo(b, a));
                    }
                }

                if (opcion == 2) {
                    System.out.println("Ingrese una dimension");
                    System.out.println("1. IgMatR2");
                    System.out.println("2. IgMatR3");
                    System.out.println("3. IgMatR4");
                    opcion = sc.nextInt();


                    if (opcion == 1) {
                        System.out.println("ingrese una opcion");
                        System.out.println("1. suma");
                        System.out.println("2. multiplicacion");
                        System.out.println("3. columna por matriz");
                        System.out.println("4. escalar por matriz");
                        System.out.println("5. rotacion");
                        opcion = sc.nextInt();

                    }
                    if (opcion == 2) {
                        System.out.println("Ingrese su opcion");
                        System.out.println("1. rotacion en x");
                        System.out.println("2. rotacion en y");
                        System.out.println("3. rotacion en w");
                        opcion = sc.nextInt();
                    }
                    if (opcion == 3) {
                        System.out.println("Ingrese su opcion");
                        System.out.println("1. rotacion en x");
                        System.out.println("2. rotacion en y");
                        System.out.println("3. rotacion en w");
                        opcion = sc.nextInt();

                    }


                }
            }
        }
    }
}

