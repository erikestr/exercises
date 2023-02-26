public class StrignReverse {

    public static void main(String[] args) {

        System.out.println(reversePhrase("Welcome to the first test!"));
        System.out.println(reverseBySpaces("Welcome to the first test!"));
    }

    public static String reversePhrase(String phrase) {
        String output = "";

        for(int character = phrase.length()-1; character != -1; character--){
            output = output +  phrase.charAt(character);
        }

        return output;
    }

    public static String reverseBySpaces(String phrase) {
        String output = "";

        String[] words = phrase.split(" ");

        for (String word : words) {
            String temp = "";
            for(int character = word.length()-1; character != -1; character--){
                temp = temp +  word.charAt(character);
            }

            output = output +  temp + " ";
        }

        return output;
    }
}
