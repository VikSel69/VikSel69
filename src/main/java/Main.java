import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String scn = scanner.nextLine();
        String[] words = scn.split(" ");
        System.out.println(new Calculator().mathCalculation(words));

    }
}
