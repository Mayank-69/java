public class fibonacci{
    private static int sum=0;
    private static int fib(int n){
        if(n<=1){
            return n;
        }
        return fib(n-1)+fib(n-2);
    }
    public static void main(String args[]){
        for(int i=0;i<5;i++){
            sum+=fib(i);
        }
        System.out.prinln("Sum: "+ sum);
    }
}