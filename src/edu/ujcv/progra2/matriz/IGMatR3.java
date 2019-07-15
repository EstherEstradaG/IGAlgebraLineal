package edu.ujcv.progra2.matriz;

import edu.ujcv.progra2.vector.IGVecR3;

public class IGMatR3 {
    IGVecR3 col1;
    IGVecR3 col2;
    IGVecR3 col3;

    public  IGMatR3 rotacionZ (double angulo, IGVecR3 vector){
        IGMatR3 retval = new IGMatR3();

        retval.col1.setX(this.col1.getX() * Math.cos(angulo));
        retval.col1.setY(this.col1.getY() * (Math.sin(angulo)));
        retval.col1.setZ(this.col1.getZ() * 0);
        retval.col2.setX(this.col2.getX() * -Math.sin(angulo));
        retval.col2.setY(this.col2.getY() * Math.cos(angulo));
        retval.col2.setZ(this.col2.getZ() * 0);
        retval.col3.setX(this.col3.getX() * 0);
        retval.col3.setY(this.col3.getY() * 0);
        retval.col3.setZ(this.col3.getZ() * 1);

        return retval;
     }

     public  IGMatR3 rotacionX (double angulo, IGVecR3 vector){
        IGMatR3 retval = new IGMatR3();

         retval.col1.setX(this.col1.getX() * 1);
         retval.col1.setY(this.col1.getY() * 0);
         retval.col1.setZ(this.col1.getZ() * 0);
        retval.col3.setX(this.col1.getX() * 0);
         retval.col3.setY(this.col1.getY() * Math.cos(angulo));
         retval.col3.setZ(this.col2.getZ() * Math.sin(angulo));
         retval.col2.setX(this.col3.getX() * 0);
         retval.col2.setY(this.col2.getY() * -Math.sin(angulo));
         retval.col2.setZ(this.col3.getZ() * Math.cos(angulo));
         return retval;
    }

     public  IGMatR3 rotacionY (double angulo, IGVecR3 vector){
        IGMatR3 retval = new IGMatR3();

         retval.col1.setX(this.col1.getX() * Math.cos(angulo));
         retval.col1.setY(this.col1.getY() * 0);
         retval.col1.setZ(this.col1.getZ() * -Math.sin(angulo));
         retval.col3.setX(this.col1.getX() * 0);
         retval.col3.setY(this.col1.getY() * 1);
         retval.col3.setZ(this.col2.getZ() * 0);
         retval.col2.setX(this.col3.getX() * Math.sin(angulo));
         retval.col2.setY(this.col2.getY() * 0);
         retval.col2.setZ(this.col3.getZ() * Math.cos(angulo));

         return retval;
   }

}
