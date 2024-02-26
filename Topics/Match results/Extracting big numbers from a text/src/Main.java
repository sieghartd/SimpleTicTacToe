import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String stringWithNumbers = scanner.nextLine();

        // write your code here
        Pattern numPattern = Pattern.compile("!*([0-9]!*){10,}");
        Matcher numMatcher = numPattern.matcher(stringWithNumbers);
        int length;

        while (numMatcher.find()) {
            length = numMatcher.end() - numMatcher.start();
            System.out.println(numMatcher.group() + ":" + length);
        }
    }
}
