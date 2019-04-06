import java.util.Scanner;

public class Palindrome {
    public static void palindrome() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string below to confirm it is a palindrome");
        String string = scan.nextLine();
        scan.close();
        String word = string.replaceAll("\\s+","");

        StringBuilder sb = new StringBuilder();
        for (int i=0; i<word.length(); i++) {
            if (Character.isLetter(word.charAt(i))) {
                sb.append(word.charAt(i));
            }
        }

        if (sb.toString().equalsIgnoreCase(sb.reverse().toString())) {
            System.out.println("It is true that '" + string + "' is a palindrome");
        }
        else {
            System.out.println("It is false that '" + string+ "' is a palindrome");
        }
    }
}