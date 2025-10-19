import java.util.Scanner;

public class Input{
    Scanner sc = new Scanner(System.in);
    public int read(String message,int number) {
        System.out.print(message);
        number=sc.nextInt();
        return number;
    }
    public double read(String message) {
        System.out.print(message);
        double number=sc.nextDouble();
        return number;
    }
    public void read(int number,String message) {
        System.out.print(message);
        message=sc.nextLine();
        System.out.println(number+". fenn "+message);
    }
}
