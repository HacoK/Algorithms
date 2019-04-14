public class StringProcess{
    public static boolean isPalindrome(String s){
        int N=s.length();
        for(int i=0;i<N/2;i++){
            if(s.charAt(i)!=s.charAt(N-1-i))
                return false;
        }
        return true;
    }

    public static String[] splitFileName(String filename){
        String[] result=new String[2];
        int dot=filename.lastIndexOf('.');
        String base=filename.substring(0,dot);
        String extension=filename.substring(dot+1,filename.length());
        result[0]=base;
        result[1]=extension;
        return result;
    }

    public static void printSpecificLine(String query){
        if(!StdIn.isEmpty()){
            String s=StdIn.readLine();
            if(s.contains(query))
                StdOut.println(s);
        }
    }

    public static String[] splitWords(){
        String input=StdIn.readAll();
        return input.split("//s");
    }

    public static boolean isSorted(String[] a){
        for(int i=1;i<a.length;i++){
            if(a[i-1].compareTo(a[i])>0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        
    }
}