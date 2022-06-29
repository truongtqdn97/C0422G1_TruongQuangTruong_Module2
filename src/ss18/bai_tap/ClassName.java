package ss18.bai_tap;

public class ClassName {
    private static final String CLASSNAME_REGEX = "^(C|A|B)\\d{4}[GHIKLM]$";

    public static boolean validate(String regex){
        return regex.matches(CLASSNAME_REGEX);
    }

    public static void main(String[] args) {
        String str1 = "C0422G1";
        String str2 = "C0422G";
        System.out.println(validate(str1));
        System.out.println(validate(str2));
    }
}
