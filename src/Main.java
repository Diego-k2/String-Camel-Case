import java.util.Scanner;

public class Main {

    public static String StringChallenge(String str) {

        String word = "";

        for(int i = 0; i<str.length(); i++) {

          String letter = String.valueOf(str.charAt(i)).toLowerCase();

          if(letter.matches("[^a-z]+")){
              String upperCase = String.valueOf(str.charAt(i + 1)).toUpperCase();
              word += upperCase;
              i++;
          } else {
              word += letter;
          }
        }

        return word;
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println(StringChallenge(s.nextLine()));
    }
}
