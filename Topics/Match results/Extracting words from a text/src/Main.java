import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        // write your code here
        Pattern numPattern = Pattern.compile("program\\w*", Pattern.CASE_INSENSITIVE);
        Matcher numMatcher = numPattern.matcher(text);


        while (numMatcher.find()) {
            System.out.println(numMatcher.start() + " " + numMatcher.group());
        }


    }
}
