package edu.ujcv.progra2.vector;

public class IGVecR4 {

    private double w;
    private double x;
    private double y;
    private double z;

    public IGVecR4 suma(IGVecR4 b){
        IGVecR4 retval = new IGVecR4();

        retval.w = w + b.w;
        retval.x = x + b.x;
        retval.y = y + b.y;
        retval.z = z + b.z;

        return retval;
    }

    public IGVecR4 resta(IGVecR4 b){
        IGVecR4 retval = new IGVecR4();

        retval.w = w - b.w;
        retval.x = x - b.x;
        retval.y = y - b.y;
        retval.z = z - b.z;

        return retval;

    }

    //producto.
    public  IGVecR4 escalarPorVector(double alpha){

        IGVecR4 retval = new IGVecR4();

        retval.w = (alpha * w);
        retval.x = (alpha * x);
        retval.y = (alpha * y);
        retval.z = (alpha * z);

        return retval;
    }

    public double productoPunto(IGVecR4 b){
        //TODO: implementar
        return 0.0;
    }


    // no esta definido en R4.!!!!!
    //public IGVecR4 productoCruz(IGVecR4 b){

    //}


    public double angulo(IGVecR4 b){
        //TODO: implementar
        return 0.0;
    }

    public double magnitud(){
        return Math.sqrt(productoPunto(this));
    }
}
