import java.util.Arrays;

import javax.lang.model.util.ElementScanner6;

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

    public static void main(String[] args){
        /*
        System.out.println(sqrt(2));
        System.out.println(sqrt(3));
        System.out.println(sqrt(5));
        */
        /*
        int a[]={1,4,7,9,6,3,2,5,8};
        Arrays.sort(a);
        System.out.println(binarySearch(a,9));
        System.out.print(recursiveBS(9,a,0,a.length-1));
        */
        
    }
}