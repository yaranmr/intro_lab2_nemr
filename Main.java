import java.util.*;
public class LabProgram {
    
    public static int fibonacci(int n) {
        int f0 = 0, f1 = 1, f;
        for (int i = 0; i < n; i++) {
            f = f0 + f1;
            f0 = f1;
            f1 = f;
        }
        return f0;
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int startNum;

        startNum = scnr.nextInt();
        
        System.out.println("fibonacci(" + startNum + ") is " + fibonacci(startNum));
    }
}
