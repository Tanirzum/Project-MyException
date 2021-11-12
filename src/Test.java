import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws ScannerException {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int x = scanner.nextInt();
            if (x != 0) {
                throw new ScannerException("Ползователь ввел что-то кроме нуля");
            }
        }
    }
}