import java.util.Scanner;

public class  main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        
        if(x < x1)
            System.out.print("Right");
        else if( x >= x1)
            System.out.print("Left");
        
        scanner.close();
    }
}
