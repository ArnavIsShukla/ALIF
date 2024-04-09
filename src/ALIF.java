//Arnav's List of Important Functions
public class ALIF {
    public static int Factorial(int n){
        int f = 0;
        if(n == 1 || n == 0){
            return 1;
        }else if(n < 0){
            return 0;
        }
        else{
            f = n*Factorial(n-1);
            return f;
        }
    }
    public static Object isPrime(int n){
        if(n < 0){
            return null;
        }
        switch(n){
            case 0:
                return null;
            case 1:
                return null;
            case 2:
                return true;
        }
        int f = (int) Math.ceil(Math.sqrt(n));
        for(int i = 2; i <= f; i++){
            if((n % i) == 0){
                return false;
            }
        }
        return true;
    }
    public static int HCF(int a, int b){
        int rem = a % b;
        int GCD = -1;
        if(rem == 0){
            return b;
        }else{
            GCD = HCF(b, rem);
        }
        return GCD;
    }
    public static void Fibonacci(int n){
        int a = 0;
        int b = 1;
        int c;
        System.out.print(0);
        for(int i = 3; i <= n; i++){
            System.out.print(", "+b);
            c = a+b;
            a = b;
            b = c;
        }
    }
    public static void main(String[] args){
    }
}


































