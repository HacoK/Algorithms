import java.util.Arrays;
import java.util.List;

//import java.util.Arrays;

public class MathAlgorithm{
    //计算平方根（牛顿迭代法）
    public static double sqrt(double c){
        if(c<0)
            return Double.NaN;
        double err=1e-15;
        double t=c;
        while(Math.abs(t-c/t)>err*t)
            t=(c/t+t)/2.0;
        return t;
    }

    public static void RandomSeq (String[] args) {

        // command-line arguments
        int n = Integer.parseInt(args[0]);

        // for backward compatibility with Intro to Programming in Java version of RandomSeq
        if (args.length == 1) {
            // generate and print n numbers between 0.0 and 1.0
            for (int i = 0; i < n; i++) {
                double x = StdRandom.uniform();
                StdOut.println(x);
            }
        }

        else if (args.length == 3) {
            double lo = Double.parseDouble(args[1]);
            double hi = Double.parseDouble(args[2]);

            // generate and print n numbers between lo and hi
            for (int i = 0; i < n; i++) {
                double x = StdRandom.uniform(lo, hi);
                StdOut.printf("%.2f\n", x);
            }
        }

        else {
            throw new IllegalArgumentException("Invalid number of arguments");
        }
    }
    
    public static void main(String[] args){

        //模拟T次掷硬币
        /*
        int T=Integer.parseInt(args[0]);
        Counter heads=new Counter("heads");
        Counter tails=new Counter("tails");
        for(int t=0;t<T;t++)
            if(StdRandom.bernoulli(0.5))
                heads.increment();
            else tails.increment();
        StdOut.println(heads);
        StdOut.println(tails);
        int d=heads.tally()-tails.tally();
        StdOut.println("delta: "+Math.abs(d));
        */

        //模拟T次掷骰子
        /*
        int T=Integer.parseInt(args[0]);
        int SIDES=6;
        Counter[] rolls=new Counter[SIDES+1];
        for(int i=1;i<=SIDES;i++)
            rolls[i]=new Counter(i+"'s");
        for(int t=0;t<T;t++){
            int result=StdRandom.uniform(1,SIDES+1);
            rolls[result].increment();
        }
        for(int i=1;i<=SIDES;i++)
            StdOut.println(rolls[i]);
        */

        //估算长方形面积(浮点数表示0.1存在精度丢失问题)
        /*
        double xlo=Double.parseDouble(args[0]);
        double xhi=Double.parseDouble(args[1]);
        double ylo=Double.parseDouble(args[2]);
        double yhi=Double.parseDouble(args[3]);
        int T=Integer.parseInt(args[4]);

        Interval1D xinterval=new Interval1D(xlo,xhi);
        Interval1D yinterval=new Interval1D(ylo,yhi);
        Interval2D box=new Interval2D(xinterval,yinterval);
        box.draw();

        Counter c=new Counter("hits");
        for(int t=0;t<T;t++){
            double x=Math.random();
            double y=Math.random();
            Point2D p=new Point2D(x,y);
            if(box.contains(p)) c.increment();
            else                p.draw();
        }
        StdOut.println(c);
        StdOut.println(box.area());
        */
        
    }
}
