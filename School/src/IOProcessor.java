import java.util.Scanner;

public class IOProcessor {
    public void print(String s) {
        System.out.print(s);
    }
    public String read(String s) {
        Scanner scan = new Scanner(System.in);
        s = scan.nextLine();
        return s;
    }
}
