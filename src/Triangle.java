import static java.lang.Math.sqrt;

public class Triangle {
    double a;
    double b;
    double c;


    public Triangle(double a, double b,double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double perim(){
        return a+b+c;
    }
    public double calculateArea(){
        double p2=perim()/2;
        return sqrt(p2*(p2-a)*(p2-b)*(p2-c));
    }

    public static boolean checkTriangleValid(double a, double b,double c){
        if(a<(b+c)&&b<(a+b)&&c<(a+b))
            return true;
        else
            return false;
    }

    @Override
    public String toString() {
        return "Treangle  " +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                " S= "+this.calculateArea();
    }
}