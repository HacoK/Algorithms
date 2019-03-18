public class MathAlgorithm{

    public static double sqrt(double c){
        if(c<0)
            return Double.NaN;
        double err=1e-15;
        double t=c;
        while(Math.abs(t-c/t)>err*t)
            t=(c/t+t)/2.0;
        return t;
    }

    public static void main(String[] args){
        System.out.println(sqrt(2));
        System.out.println(sqrt(3));
        System.out.println(sqrt(5));
    }
}