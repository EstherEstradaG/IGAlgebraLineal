package edu.ujcv.progra2;

import edu.ujcv.progra2.matriz.IGMatR2;
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
        System.out.println("0. salir");
        int opcion = leerEntero(sc,"ingrese su opcion","caracter no valido ");

        while (opcion != 0) {


            if (opcion == 1) {
                System.out.println("Ingrese una dimension");
                System.out.println("1. IGVecR2");
                System.out.println("2. IGVecR3");
                System.out.println("3. IGVecR4");
                opcion = leerEntero(sc,"ingrese su opcion","caracter no valido ");

                if (opcion == 1) {
                    System.out.println("Elija su opcion");
                    System.out.println("1. suma");
                    System.out.println("2. resta");
                    System.out.println("3. escalar por vector");
                    System.out.println("4.producto punto");
                    System.out.println("5. angulo");
                    System.out.println("6. magnitud");
                    opcion = leerEntero(sc,"ingrese su opcion","caracter no valido ");


                    if (opcion == 1) {
                        IGVecR2 a = new IGVecR2();

                        System.out.println("Ingrese x1 y y1");
                        a.setX(leerReal(sc,"x1","caracter no valido "));
                        a.setY(leerReal(sc,"Y1","caracter no valido "));
                        IGVecR2 b = new IGVecR2();
                        System.out.println("Ingrese x2 y y2");
                        b.setX(leerReal(sc,"x2","caracter no valido "));
                        b.setY(leerReal(sc,"Y2","caracter no valido "));
                        IGVecR2 r = a.suma(b);
                        System.out.println("El resultado es: " + r.getX() + " , " + r.getY());

                    }

                    if (opcion == 2) {
                        IGVecR2 a = new IGVecR2();
                        System.out.println("Ingrese x1 y y1");
                        a.setX(leerReal(sc,"x1","caracter no valido "));
                        a.setY(leerReal(sc,"Y1","caracter no valido "));
                        IGVecR2 b = new IGVecR2();
                        System.out.println("Ingrese x2 y y2");
                        b.setX(leerReal(sc,"x2","caracter no valido "));
                        b.setY(leerReal(sc,"Y2","caracter no valido "));
                        IGVecR2 r = a.resta(b);
                        System.out.println("El resultado es: " + r.getX() + " , " + r.getY());
                    }

                    if (opcion == 3) {
                        IGVecR2 a = new IGVecR2();
                        a.setX(leerReal(sc,"x1","caracter no valido "));
                        a.setY(leerReal(sc,"Y1","caracter no valido "));
                        IGVecR2 b = new IGVecR2();
                        System.out.println("Ingrese x2 y y2");
                        b.setX(leerReal(sc,"x2","caracter no valido "));
                        b.setY(leerReal(sc,"Y2","caracter no valido "));
                        System.out.println("Ingrese alpha");
                        double alpha = sc.nextDouble();
                        IGVecR2 r = a.escalarPorVector(alpha);
                        System.out.println("El resultado es: " + r.getX() + " , " + r.getY());

                    }

                    if (opcion == 4) {
                        IGVecR2 a = new IGVecR2();
                        System.out.println("Ingrese x1 y y1");
                        a.setX(leerReal(sc,"x1","caracter no valido "));
                        a.setY(leerReal(sc,"Y1","caracter no valido "));
                        IGVecR2 b = new IGVecR2();
                        System.out.println("Ingrese x2 y y2");
                        b.setX(leerReal(sc,"x2","caracter no valido "));
                        b.setY(leerReal(sc,"Y2","caracter no valido "));
                        double r = a.productoPunto(b);
                        System.out.println("El resultado es: " + r);
                    }

                    if (opcion == 5) {
                        IGVecR2 a = new IGVecR2();
                        System.out.println("Ingrese x1 y y1");
                        a.setX(leerReal(sc,"x1","caracter no valido "));
                        a.setY(leerReal(sc,"Y1","caracter no valido "));
                        IGVecR2 b = new IGVecR2();
                        System.out.println("Ingrese x2 y y2");
                        b.setX(leerReal(sc,"x2","caracter no valido "));
                        b.setY(leerReal(sc,"Y2","caracter no valido "));
                        double r = a.angulo(b, a);
                        System.out.println("El resultado es: " + r);
                    }

                    if (opcion == 6) {
                        IGVecR2 a = new IGVecR2();
                        System.out.println("Ingrese x1 y y1");
                        a.setX(leerReal(sc,"x1","caracter no valido "));
                        a.setY(leerReal(sc,"Y1","caracter no valido "));
                        IGVecR2 b = new IGVecR2();
                        System.out.println("Ingrese x2 y y2");
                        b.setX(leerReal(sc,"x2","caracter no valido "));
                        b.setY(leerReal(sc,"Y2","caracter no valido "));
                        double r = a.magnitud(b);
                        System.out.println("El resultado es: " + r);
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
                    System.out.println("7. productor cruz");
                    opcion = leerEntero(sc, "ingrese su opcion", "caracter no valido ");

                    if (opcion == 1) {
                        IGVecR3 a = new IGVecR3();
                        System.out.println("Ingrese x1, y1 y z1");
                        a.setX(leerReal(sc, "x1", "caracter no valido "));
                        a.setY(leerReal(sc, "Y1", "caracter no valido "));
                        a.setZ(leerReal(sc, "Z1", "caracter no valido "));
                        IGVecR3 b = new IGVecR3();
                        System.out.println("Ingrese x2, y2 y z2");
                        b.setX(leerReal(sc, "x2", "caracter no valido "));
                        b.setY(leerReal(sc, "y2", "caracter no valido "));
                        b.setZ(leerReal(sc, "z2", "caracter no valido "));
                        IGVecR3 c = new IGVecR3();
                        System.out.println("Ingrese x3, y3 y z3");
                        c.setX(leerReal(sc, "x3", "caracter no valido "));
                        c.setY(leerReal(sc, "y3", "caracter no valido "));
                        c.setZ(leerReal(sc, "z3", "caracter no valido "));
                        IGVecR3 r = a.suma(b);
                        System.out.println("El resultado es: " + r.getX() + "," + r.getY() + "," + r.getZ());

                    }

                    if (opcion == 2) {
                        IGVecR3 a = new IGVecR3();
                        System.out.println("Ingrese x1, y1 y z1");
                        a.setX(leerReal(sc, "x1", "caracter no valido "));
                        a.setY(leerReal(sc, "Y1", "caracter no valido "));
                        a.setZ(leerReal(sc, "Z1", "caracter no valido "));
                        IGVecR3 b = new IGVecR3();
                        System.out.println("Ingrese x2, y2 y z2");
                        b.setX(leerReal(sc, "x2", "caracter no valido "));
                        b.setY(leerReal(sc, "y2", "caracter no valido "));
                        b.setZ(leerReal(sc, "z2", "caracter no valido "));
                        IGVecR3 c = new IGVecR3();
                        System.out.println("Ingrese x3, y3 y z3");
                        c.setX(leerReal(sc, "x3", "caracter no valido "));
                        c.setY(leerReal(sc, "y3", "caracter no valido "));
                        c.setZ(leerReal(sc, "z3", "caracter no valido "));
                        IGVecR3 r = a.resta(b);
                        System.out.println("El resultado es: " + r.getX() + "," + r.getY() + "," + r.getZ());
                    }

                    if (opcion == 3) {
                        IGVecR3 a = new IGVecR3();
                        System.out.println("Ingrese x1, y1 y z1");
                        a.setX(leerReal(sc, "x1", "caracter no valido "));
                        a.setY(leerReal(sc, "Y1", "caracter no valido "));
                        a.setZ(leerReal(sc, "Z1", "caracter no valido "));
                        IGVecR3 b = new IGVecR3();
                        System.out.println("Ingrese x2, y2 y z2");
                        b.setX(leerReal(sc, "x2", "caracter no valido "));
                        b.setY(leerReal(sc, "y2", "caracter no valido "));
                        b.setZ(leerReal(sc, "z2", "caracter no valido "));
                        IGVecR3 c = new IGVecR3();
                        System.out.println("Ingrese x3, y3 y z3");
                        c.setX(leerReal(sc, "x3", "caracter no valido "));
                        c.setY(leerReal(sc, "y3", "caracter no valido "));
                        c.setZ(leerReal(sc, "z3", "caracter no valido "));
                        System.out.println("Ingrese alpha");
                        double alpha = sc.nextDouble();
                        IGVecR3 r = a.escalarPorVector(alpha);
                        System.out.println("El resultado es: " + r.getX() + "," + r.getY() + "," + r.getZ());

                    }

                    if (opcion == 4) {
                        IGVecR3 a = new IGVecR3();
                        System.out.println("Ingrese x1, y1 y z1");
                        a.setX(leerReal(sc, "x1", "caracter no valido "));
                        a.setY(leerReal(sc, "Y1", "caracter no valido "));
                        a.setZ(leerReal(sc, "Z1", "caracter no valido "));
                        IGVecR3 b = new IGVecR3();
                        System.out.println("Ingrese x2, y2 y z2");
                        b.setX(leerReal(sc, "x2", "caracter no valido "));
                        b.setY(leerReal(sc, "y2", "caracter no valido "));
                        b.setZ(leerReal(sc, "z2", "caracter no valido "));
                        IGVecR3 c = new IGVecR3();
                        System.out.println("Ingrese x3, y3 y z3");
                        c.setX(leerReal(sc, "x3", "caracter no valido "));
                        c.setY(leerReal(sc, "y3", "caracter no valido "));
                        c.setZ(leerReal(sc, "z3", "caracter no valido "));
                        double r = a.productoPunto(b);
                        System.out.println("El resultado es: " + r);
                    }

                    if (opcion == 5) {
                        IGVecR3 a = new IGVecR3();
                        System.out.println("Ingrese x1, y1 y z1");
                        a.setX(leerReal(sc, "x1", "caracter no valido "));
                        a.setY(leerReal(sc, "Y1", "caracter no valido "));
                        a.setZ(leerReal(sc, "Z1", "caracter no valido "));
                        IGVecR3 b = new IGVecR3();
                        System.out.println("Ingrese x2, y2 y z2");
                        b.setX(leerReal(sc, "x2", "caracter no valido "));
                        b.setY(leerReal(sc, "y2", "caracter no valido "));
                        b.setZ(leerReal(sc, "z2", "caracter no valido "));
                        IGVecR3 c = new IGVecR3();
                        System.out.println("Ingrese x3, y3 y z3");
                        c.setX(leerReal(sc, "x3", "caracter no valido "));
                        c.setY(leerReal(sc, "y3", "caracter no valido "));
                        c.setZ(leerReal(sc, "z3", "caracter no valido "));
                        double r = a.angulo(a, b);
                        System.out.println("El resultado es: " + r);
                    }

                    if (opcion == 6) {
                        IGVecR3 a = new IGVecR3();
                        System.out.println("Ingrese x1 y y1");
                        a.setX(leerReal(sc, "x1", "caracter no valido "));
                        a.setY(leerReal(sc, "Y1", "caracter no valido "));
                        a.setZ(leerReal(sc, "Z1", "caracter no valido "));
                        IGVecR3 b = new IGVecR3();
                        System.out.println("Ingrese x2, y2 y z2");
                        b.setX(leerReal(sc, "x2", "caracter no valido "));
                        b.setY(leerReal(sc, "y2", "caracter no valido "));
                        b.setZ(leerReal(sc, "z2", "caracter no valido "));
                        IGVecR3 c = new IGVecR3();
                        System.out.println("Ingrese x3, y3 y z3");
                        c.setX(leerReal(sc, "x3", "caracter no valido "));
                        c.setY(leerReal(sc, "y3", "caracter no valido "));
                        c.setZ(leerReal(sc, "z3", "caracter no valido "));
                        double r = a.magnitud(b);
                        System.out.println("El resultado es: " + r);

                    }

                    if (opcion == 7) {
                        IGVecR3 a = new IGVecR3();
                        System.out.println("Ingrese x1, y1 y z1");
                        a.setX(leerReal(sc, "x1", "caracter no valido "));
                        a.setY(leerReal(sc, "Y1", "caracter no valido "));
                        a.setZ(leerReal(sc, "Z1", "caracter no valido "));
                        IGVecR3 b = new IGVecR3();
                        System.out.println("Ingrese x2, y2 y z2");
                        b.setX(leerReal(sc, "x2", "caracter no valido "));
                        b.setY(leerReal(sc, "y2", "caracter no valido "));
                        b.setZ(leerReal(sc, "z2", "caracter no valido "));
                        IGVecR3 c = new IGVecR3();
                        System.out.println("Ingrese x3, y3 y z3");
                        c.setX(leerReal(sc, "x3", "caracter no valido "));
                        c.setY(leerReal(sc, "y3", "caracter no valido "));
                        c.setZ(leerReal(sc, "z3", "caracter no valido "));
                        System.out.println("Ingrese alpha");
                        double alpha = sc.nextDouble();
                        IGVecR3 r = a.productoCruz(b);
                        System.out.println("El resultado es: " + r.getX() + "," + r.getY() + "," + r.getZ());

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
                        opcion = leerEntero(sc,"ingrese su opcion","caracter no valido ");


                        if (opcion == 1) {
                            IGVecR4 a = new IGVecR4();
                            System.out.println("Ingrese w1, x1, y1, z1");
                            a.setW(leerReal(sc,"w1","caracter no valido "));
                            a.setX(leerReal(sc,"x1","caracter no valido "));
                            a.setY(leerReal(sc,"y1","caracter no valido "));
                            a.setZ(leerReal(sc,"Z1","caracter no valido "));
                            IGVecR4 b = new IGVecR4();
                            System.out.println("Ingrese w2, x2, y2, z2");
                            b.setW(leerReal(sc,"w2","caracter no valido "));
                            b.setX(leerReal(sc,"x2","caracter no valido "));
                            b.setY(leerReal(sc,"y2","caracter no valido "));
                            b.setZ(leerReal(sc,"z2","caracter no valido "));
                            IGVecR4 c = new IGVecR4();
                            System.out.println("Ingrese w3, x3, y3, z3");
                            c.setW(leerReal(sc,"w3","caracter no valido "));
                            c.setX(leerReal(sc,"x3","caracter no valido "));
                            c.setY(leerReal(sc,"y3","caracter no valido "));
                            c.setZ(leerReal(sc,"Z3","caracter no valido "));
                            IGVecR4 d = new IGVecR4();
                            System.out.println("Ingrese w4, x4, y4, z4");
                            d.setW(leerReal(sc,"w4","caracter no valido "));
                            d.setX(leerReal(sc,"x4","caracter no valido "));
                            d.setY(leerReal(sc,"y4","caracter no valido "));
                            d.setZ(leerReal(sc,"Z4","caracter no valido "));
                            IGVecR4 r = a.suma(b);
                            System.out.println("El resultado es: " + r.getW() + "," + r.getX() + "," + r.getY() + "," + r.getZ());

                        }

                        if (opcion == 2) {
                            IGVecR4 a = new IGVecR4();
                            System.out.println("Ingrese w1, x1, y1, z1");
                            a.setW(leerReal(sc,"w1","caracter no valido "));
                            a.setX(leerReal(sc,"x1","caracter no valido "));
                            a.setY(leerReal(sc,"y1","caracter no valido "));
                            a.setZ(leerReal(sc,"Z1","caracter no valido "));
                            IGVecR4 b = new IGVecR4();
                            System.out.println("Ingrese w2, x2, y2, z2");
                            b.setW(leerReal(sc,"w2","caracter no valido "));
                            b.setX(leerReal(sc,"x2","caracter no valido "));
                            b.setY(leerReal(sc,"y2","caracter no valido "));
                            b.setZ(leerReal(sc,"z2","caracter no valido "));
                            IGVecR4 c = new IGVecR4();
                            System.out.println("Ingrese w3, x3, y3, z3");
                            c.setW(leerReal(sc,"w3","caracter no valido "));
                            c.setX(leerReal(sc,"x3","caracter no valido "));
                            c.setY(leerReal(sc,"y3","caracter no valido "));
                            c.setZ(leerReal(sc,"Z3","caracter no valido "));
                            IGVecR4 d = new IGVecR4();
                            System.out.println("Ingrese w4, x4, y4, z4");
                            d.setW(leerReal(sc,"w4","caracter no valido "));
                            d.setX(leerReal(sc,"x4","caracter no valido "));
                            d.setY(leerReal(sc,"y4","caracter no valido "));
                            d.setZ(leerReal(sc,"Z4","caracter no valido "));
                            IGVecR4 r = a.resta(b);
                            System.out.println("El resultado es: " + r.getW() + "," + r.getX() + "," + r.getY() + "," + r.getZ());
                        }

                        if (opcion == 3) {
                            IGVecR4 a = new IGVecR4();
                            System.out.println("Ingrese w1, x1, y1, z1");
                            a.setW(leerReal(sc,"w1","caracter no valido "));
                            a.setX(leerReal(sc,"x1","caracter no valido "));
                            a.setY(leerReal(sc,"y1","caracter no valido "));
                            a.setZ(leerReal(sc,"Z1","caracter no valido "));
                            IGVecR4 b = new IGVecR4();
                            System.out.println("Ingrese w2, x2, y2, z2");
                            b.setW(leerReal(sc,"w2","caracter no valido "));
                            b.setX(leerReal(sc,"x2","caracter no valido "));
                            b.setY(leerReal(sc,"y2","caracter no valido "));
                            b.setZ(leerReal(sc,"z2","caracter no valido "));
                            IGVecR4 c = new IGVecR4();
                            System.out.println("Ingrese w3, x3, y3, z3");
                            c.setW(leerReal(sc,"w3","caracter no valido "));
                            c.setX(leerReal(sc,"x3","caracter no valido "));
                            c.setY(leerReal(sc,"y3","caracter no valido "));
                            c.setZ(leerReal(sc,"Z3","caracter no valido "));
                            IGVecR4 d = new IGVecR4();
                            System.out.println("Ingrese w4, x4, y4, z4");
                            d.setW(leerReal(sc,"w4","caracter no valido "));
                            d.setX(leerReal(sc,"x4","caracter no valido "));
                            d.setY(leerReal(sc,"y4","caracter no valido "));
                            d.setZ(leerReal(sc,"Z4","caracter no valido "));
                            System.out.println("Ingrese alpha");
                            double alpha = sc.nextDouble();
                            IGVecR4 r = a.escalarPorVector(alpha);
                            System.out.println("El resultado es: " + r.getW() + "," + r.getX() + "," + r.getY() + "," + r.getZ());

                        }


                        if (opcion == 4) {
                            IGVecR4 a = new IGVecR4();
                            System.out.println("Ingrese w1, x1, y1, z1");
                            a.setW(leerReal(sc,"w1","caracter no valido "));
                            a.setX(leerReal(sc,"x1","caracter no valido "));
                            a.setY(leerReal(sc,"y1","caracter no valido "));
                            a.setZ(leerReal(sc,"Z1","caracter no valido "));
                            IGVecR4 b = new IGVecR4();
                            System.out.println("Ingrese w2, x2, y2, z2");
                            b.setW(leerReal(sc,"w2","caracter no valido "));
                            b.setX(leerReal(sc,"x2","caracter no valido "));
                            b.setY(leerReal(sc,"y2","caracter no valido "));
                            b.setZ(leerReal(sc,"z2","caracter no valido "));
                            IGVecR4 c = new IGVecR4();
                            System.out.println("Ingrese w3, x3, y3, z3");
                            c.setW(leerReal(sc,"w3","caracter no valido "));
                            c.setX(leerReal(sc,"x3","caracter no valido "));
                            c.setY(leerReal(sc,"y3","caracter no valido "));
                            c.setZ(leerReal(sc,"Z3","caracter no valido "));
                            IGVecR4 d = new IGVecR4();
                            System.out.println("Ingrese w4, x4, y4, z4");
                            d.setW(leerReal(sc,"w4","caracter no valido "));
                            d.setX(leerReal(sc,"x4","caracter no valido "));
                            d.setY(leerReal(sc,"y4","caracter no valido "));
                            d.setZ(leerReal(sc,"Z4","caracter no valido "));
                            double r = a.productoPunto(b);
                            System.out.println("El resultado es: " + r);
                        }

                        if (opcion == 5) {
                            IGVecR4 a = new IGVecR4();
                            System.out.println("Ingrese w1, x1, y1, z1");
                            a.setW(leerReal(sc,"w1","caracter no valido "));
                            a.setX(leerReal(sc,"x1","caracter no valido "));
                            a.setY(leerReal(sc,"y1","caracter no valido "));
                            a.setZ(leerReal(sc,"Z1","caracter no valido "));
                            IGVecR4 b = new IGVecR4();
                            System.out.println("Ingrese w2, x2, y2, z2");
                            b.setW(leerReal(sc,"w2","caracter no valido "));
                            b.setX(leerReal(sc,"x2","caracter no valido "));
                            b.setY(leerReal(sc,"y2","caracter no valido "));
                            b.setZ(leerReal(sc,"z2","caracter no valido "));
                            IGVecR4 c = new IGVecR4();
                            System.out.println("Ingrese w3, x3, y3, z3");
                            c.setW(leerReal(sc,"w3","caracter no valido "));
                            c.setX(leerReal(sc,"x3","caracter no valido "));
                            c.setY(leerReal(sc,"y3","caracter no valido "));
                            c.setZ(leerReal(sc,"Z3","caracter no valido "));
                            IGVecR4 d = new IGVecR4();
                            System.out.println("Ingrese w4, x4, y4, z4");
                            d.setW(leerReal(sc,"w4","caracter no valido "));
                            d.setX(leerReal(sc,"x4","caracter no valido "));
                            d.setY(leerReal(sc,"y4","caracter no valido "));
                            d.setZ(leerReal(sc,"Z4","caracter no valido "));
                            double r = a.angulo(b, a);
                            System.out.println("El resultado es: " +r);
                        }
                    }

                    if (opcion == 2) {
                        System.out.println("Ingrese una dimension");
                        System.out.println("1. IgMatR2");
                        System.out.println("2. IgMatR3");
                        System.out.println("3. IgMatR4");
                        opcion = leerEntero(sc,"ingrese su opcion","caracter no valido ");


                        if (opcion == 1) {
                            System.out.println("ingrese una opcion");
                            System.out.println("1. suma");
                            System.out.println("2. resta");
                            System.out.println("3. multiplicacion");
                            System.out.println("4. columna por matriz");
                            System.out.println("5. escalar por matriz");
                            System.out.println("6. rotacion");
                            opcion = leerEntero(sc,"ingrese su opcion","caracter no valido ");

                            if (opcion == 1){

                            }

                            if (opcion == 2) {

                            }

                            if (opcion == 3){

                            }
                            if (opcion == 4){

                            }

                            if (opcion == 5){

                            }
                        }


                        if (opcion == 2) {
                            System.out.println("Ingrese su opcion");
                            System.out.println("1. rotacion en x");
                            System.out.println("2. rotacion en y");
                            System.out.println("3. rotacion en w");
                            opcion = leerEntero(sc,"ingrese su opcion","caracter no valido ");

                            if (opcion == 1){

                            }

                            if (opcion == 2) {

                            }

                            if (opcion == 3){

                            }
                        }

                        }


                    }
                }
            }
    public static double leerReal(Scanner sc,String mensaje, String mensajeError) {
        double retval = 0;
        System.out.println(mensaje);
        while (!sc.hasNextDouble()) {
            sc.nextLine();
            System.out.println(mensajeError);
        }
        retval = sc.nextDouble();
        sc.nextLine();
        return retval;
    }

    public static int leerEntero(Scanner sc,String mensaje, String mensajeError) {
        int retval = 0;
        System.out.println(mensaje);
        while (!sc.hasNextInt()) {
            sc.nextLine();
            System.out.println(mensajeError);
        }
        retval = sc.nextInt();
        sc.nextLine();
        return retval;
    }
    }

