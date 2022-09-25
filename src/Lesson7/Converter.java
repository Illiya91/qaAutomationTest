package Lesson7;

public interface Converter {


    void fah();

    public static double convert(double fah) {
        double convert;
        double cel = (5/9) * fah -32;
        return fah;
    }



class KelvinConverter implements Converter{
    public void Kelvin() {
        System.out.println("Result " );

    }



    public void fah() {

    }
}

class FahrenheitConverter implements Converter{



    public void fah() {

    }
}

    public static void main(String[] args) {
     KelvinConverter kelvinConverter = new KelvinConverter();

    }
}