package ss18.bai_tap;

public class PhoneNumber {
    private static final String PHONENUMBER_REGEX = "^\\d{2}-0\\d{9}$";

    private static boolean validate(String regex){
        return regex.matches(PHONENUMBER_REGEX);
    }

    public static void main(String[] args) {
        String str1 = "98-0123456789";
        String str2 = "82-a12a456789";
        String str3 = "82-2122456789";

        System.out.println(validate(str1));
        System.out.println(validate(str2));
        System.out.println(validate(str3));
    }
}
