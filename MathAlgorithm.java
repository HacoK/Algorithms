import java.util.Arrays;

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
    
    //二分查找（迭代实现）
    public static int binarySearch(int[] a, int key){
        int lo=0;
        int hi=a.length-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(key<a[mid])
                hi=mid-1;
            else if(key>a[mid])
                lo=mid+1;
            else
                return mid;
        }
        return -1;
    }

    //二分查找（递归实现）
    public static int recursiveBS(int key,int[] a,int lo,int hi){
        if(lo>hi) return -1;
        int mid=lo+(hi-lo)/2;
        if(key<a[mid])
            return recursiveBS(key, a, lo, mid-1);
        else if(key>a[mid])
            return recursiveBS(key, a, mid+1, hi);
        else
            return mid;
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

    public static void Average(String[] args) { 
        int count = 0;       // number input values
        double sum = 0.0;    // sum of input values

        // read data and compute statistics
        while (!StdIn.isEmpty()) {
            double value = StdIn.readDouble();
            sum += value;
            count++;
        }

        // compute the average
        double average = sum / count;

        // print results
        StdOut.println("Average is " + average);
    }

    public static void main(String[] args){
        //白名单过滤
        /*
        int[] whitelist=new In(args[0]).readAllInts();
        Arrays.sort(whitelist);
        while(!StdIn.isEmpty()){
            int key=StdIn.readInt();
            if(binarySearch(whitelist, key)<0)
                StdOut.println(key);
        }
        */

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

        
    }
}
