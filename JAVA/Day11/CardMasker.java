package Day11;

public class CardMasker {
    public static String maskCardNumber(String cardNumber) {
        String digitsOnly = cardNumber.replaceAll(" ", "");
        
        if (digitsOnly.length() != 16) {
            return "Invalid card number";
        }

        String lastFour = digitsOnly.substring(12);

        return "**** **** **** " + lastFour;
    }

    public static void main(String[] args) {
        System.out.println(maskCardNumber("1234 5678 9012 3456")); 
        System.out.println(maskCardNumber("9876 5432 1098 7654")); 
       }
}
