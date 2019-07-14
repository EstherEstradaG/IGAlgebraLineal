package edu.ujcv.progra2.matriz;

import edu.ujcv.progra2.vector.IGVecR2;

public class IGMatR2 {

IGVecR2 f1;
IGVecR2 f2;
    public IGMatR2 suma(IGMatR2 b) {
        IGMatR2 retval = new IGMatR2();
        retval.f1.setX(this.f1.suma(b.f1));
        retval.f2.setX(this.f2.suma(b.f2));

        return retval;
    }

    public IGMatR2 resta(IGMatR2 b) {
        IGMatR2 retval = new IGMatR2();
        retval.f1.setX(this.f1.resta(b.f1));
        retval.f2.setX(;this.f2.resta(b.f2));
        return retval;
    }

    public IGVecR2 multvector(IGVecR2 v) {
        IGVecR2 retval = new IGVecR2();
        retval.setX(v.productoPunto(this.f1.getX()));
        retval.setY(v.productoPunto(this.f2.getX()));
        return retval;
    }

    public IGMatR2 mul(IGMatR2 b) {
        IGMatR2 retval = new IGMatR2();
        retval.setCol1(new IGVecR2(this.f1.getX().productoPunto(b.f1), this.f1.getX().productoPunto(b.f1)));
        retval.setCol2(new IGVecR2(this.f2.getX().productoPunto(b.f2), this.f2.getX().productoPunto(b.f2)));
        return retval;
    }

    public IGMatR2 escalarXmat(double escalar) {
        IGMatR2 retval = new IGMatR2();
        retval.col1.setX(this.col1.getX() * escalar);
        retval.col1.setY(this.col1.getY() * escalar);
        retval.col2.setX(this.col2.getX() * escalar);
        retval.col2.setY(this.col2.getY() * escalar);
        return retval;
    }

    //public IGVecR2 colXMat(IGVecR2 col1){
    //}

    public IGMatR2 rotacion(double angulo, IGMatR2 b) {
        IGMatR2 retval = new IGMatR2();
        retval.col1.setX(this.getF1().getX() * Math.cos(angulo));
        retval.col2.setX(this.getF1().getY() * (-Math.sin(angulo)));
        retval.col1.setY(this.getF2().getX() * Math.cos(angulo));
        retval.col2.setY(this.getF2().getY() * Math.sin(angulo));

        return retval;
    }
}