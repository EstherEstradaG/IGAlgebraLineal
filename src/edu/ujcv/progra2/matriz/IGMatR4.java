package edu.ujcv.progra2.matriz;

import edu.ujcv.progra2.vector.IGVecR4;

public class IGMatR4 {
IGVecR4 col1;
IGVecR4 col2;
IGVecR4 col3;

    public  IGMatR4 rotacionZ (double angulo, IGVecR4 vector){
        IGMatR4 retval = new IGMatR4();

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

    public  IGMatR4 rotacionX (double angulo, IGVecR4 vector){
        IGMatR4 retval = new IGMatR4();

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

    public  IGMatR4 rotacionY (double angulo, IGVecR4 vector){
        IGMatR4 retval = new IGMatR4();

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