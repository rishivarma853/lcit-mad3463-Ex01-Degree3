import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = Prompt.requestInt("\n  Enter a (int) :  ");
        int b = Prompt.requestInt("\n  Enter b (int) :  ");
        int c = Prompt.requestInt("\n  Enter c (int) :  ");
        double x = Prompt.requestDouble("\n  Enter x (double) :  ");
        System.out.println("\n\n  The Value of the Polynomial is :  " + eval(a,b,c,x));
    }
    public static double eval(int a, int b, int c, double x) {
        double da = (double) a; double db = (double) b; double dc = (double) c;
        return (((da+db)/2)*(Math.pow(x,3))) + ((Math.pow((da+db),2))*(Math.pow(x,2))) + da + db + dc;
    }
}
class Prompt {
    private static final Scanner scan = new Scanner(System.in);
    public static int requestInt(String message) {
        System.out.print(message);
        return scan.nextInt();
    }
    public static double requestDouble(String message) {
        System.out.print(message);
        return scan.nextDouble();
    }
}