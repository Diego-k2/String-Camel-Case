import java.util.Scanner;

public class Main {

    public static String StringChallenge(String str) {

        String word = "";
        String finalWord = "";
        int contador = 0;

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

        word += "prhj2f0t54b"; //ALTERAR AQUI PARA SUA "Your ChallengeToken:"

        for(int i = 0; i<word.length(); i++){
            String letter = String.valueOf(word.charAt(i));
            if(contador < 3){
                finalWord += letter;
                contador++;
            } else {
                finalWord += "_";
                contador = 0;
            }

        }


        return finalWord;
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println(StringChallenge(s.nextLine()));
    }
}
