package edu.ujcv.progra2.matriz;

import edu.ujcv.progra2.vector.IGVecR2;
import edu.ujcv.progra2.vector.IGVecR3;

public class IGMatR3 {
    IGVecR2 f1;
    IGVecR2 f2;
    IGVecR2 f3;

    public  IGMatR3 rotacionZ (double angulo, IGVecR2 vector){
        IGMatR3 retval = new IGMatR3();
        retval.f1.setX(this.f1.getX() * Math.cos(angulo));
        retval.f1.setY(this.f1.getY() * (-Math.sin(angulo)));
        retval.f2.setX(this.f2.getX() * Math.cos(angulo));
        retval.f2.setY(this.f2.getY() * Math.sin(angulo));

        return retval;
     }

     public  IGMatR3 rotacionX (double angulo, IGVecR3 vector){
        IGMatR2 retval = new IGMatR2();
        retval.f1.setX(this.f1.getX() * Math.cos(angulo));
        retval.f1.setY(this.f1.getY() * (-Math.sin(angulo)));
        retval.f2.setX(this.f2.getX() * Math.cos(angulo));
        retval.f2.setY(this.f2.getY() * Math.sin(angulo));
    }

     public  IGMatR3 rotacionY (double angulo, IGVecR3 vector){
        IGMatR2 retval = new IGMatR2();
        retval.f1.setX(this.f1.getX() * Math.cos(angulo));
        retval.f1.setY(this.f1.getY() * (-Math.sin(angulo)));
        retval.f2.setX(this.f2.getX() * Math.cos(angulo));
        retval.f2.setY(this.f2.getY() * Math.sin(angulo));
         return retval;
   }

}
