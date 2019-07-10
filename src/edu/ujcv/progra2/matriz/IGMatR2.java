package edu.ujcv.progra2.matriz;

import edu.ujcv.progra2.vector.IGVecR2;

public class IGMatR2 {
    // TODO: implementar.
    IGVecR2 f1;
    IGVecR2 f2;

    //double x1,y1;
    //double x2,y2;


    // double[][] m;

    //IGVecR2 f1;
    //IGVecR2 f2;

    //IGVecR2 col1;
    //IGVecR2 col2;



    //public IGMatR2 mul(IGMatR2 b) {
    //}



    //public IGVecR2 colXMat(IGVecR2 col){

    //}

    //public IGMatR2 suma (IGMatR2 b){

    //}

  //  public IGMatR2 escalarXmat(double escalar){
    //    double retval;
      //  return retval;
    //}

    public IGMatR2 rotacion(double angulo, IGVecR2 vector){
        IGMatR2 retval = new IGMatR2();
        retval.f1.setX(this.f1.getX() * Math.cos(angulo));
        retval.f1.setY(this.f1.getY() * (-Math.sin(angulo)));
        retval.f2.setX(this.f2.getX() * Math.cos(angulo));
        retval.f2.setY(this.f2.getY() * Math.sin(angulo));
         return retval;
        }


    public IGVecR2 getF1() {
        return f1;
    }

    public void setF1(IGVecR2 f1) {
        this.f1 = f1;
    }

    public IGVecR2 getF2() {
        return f2;
    }

    public void setF2(IGVecR2 f2) {
        this.f2 = f2;
    }
}
