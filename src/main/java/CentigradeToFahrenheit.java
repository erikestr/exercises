public class CentigradeToFahrenheit {

    public static void main(String[] args) {
        System.out.println("Convert 36° C >>> "+ converter(36f));
    }

    public static String converter(float centigrade) {
        return  ((9f * centigrade)/ 5f) + 32 + "° F";
    }
}
