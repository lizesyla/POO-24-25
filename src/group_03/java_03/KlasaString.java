package group_03.java_03;

public class KlasaString {
    public static void main(String[] args){
        String emri1 = "FIEK";
        String emri2 = new String("FIEK");
        String emri3 = emri2.intern();
        String emri4 = "FIEK";

        System.out.println("emri1 == emri2: " + (emri1 == emri2));
        System.out.println("emri1 == emri3: " + (emri1 == emri3));
        System.out.println("emri1 == emri4: " + (emri1 == emri4));

        System.out.println("emri1.equals(emri2): "
                +  (emri1.equals(emri2))
        );

        if(emri1.equals(emri2)){
            System.out.println("Permbajtjet jane te njejta!");
        }

        System.out.println(emri1);
        emri1 += " - UP";
        System.out.println(emri1);

//        length
        System.out.println("string length: " + emri1.length());
        char[] chars = emri1.toCharArray();
        String emri5 = new String(chars);
//        charAt
        char c5 = emri1.charAt(4);
//        substring
        String substring = emri1.substring(1, 3); //[1, 3)
        emri1.toUpperCase();
        emri1.toLowerCase();
        String emri6 = "This is a test";
        // ["This", "is", "a", "test"]
        // ["Th", "s ", "s a test"]
        String[] array = emri6.split("i");
        // This was a test
        String replace = emri6.replace("i", "was");

        String emri7 = "This is a test";
        String reverseEmri7 = reverse(emri7);
        System.out.println(reverseEmri7);
//        OOP en temirthsH
    }

    public static String reverse(String value){
//        String reverse = "";
//        for(int i = value.length() - 1; i>=0;i--){
//            reverse += value.charAt(i);
//        }
//        return reverse;
        int length = value.length();
        String lowerValue = value.toLowerCase();
        String upperValue = value.substring(
                length-1).toUpperCase();
        char upperChar = upperValue.charAt(0);
        char[] reverseChars = new char[length];
        for(int i = length - 1; i>=0;i--){
            if(i == length - 1){
                reverseChars[0] = upperChar;
                continue;
            }
            reverseChars[length - 1 - i] = lowerValue.charAt(i);
        }
        return new String(reverseChars);
    }

}
