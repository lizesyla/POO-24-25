package group_04.java_03;

public class KlasaString {
    public static void main(String[] args){
        String emri = "FIEK";
        String drejtimi = new String("FIEK");
        String newDrejtimi = drejtimi.intern();
        String test = "FIEK";

        System.out.println("emri == drejtimi: " + (emri == drejtimi));
        System.out.println("emri == newDrejtimi: " + (emri == newDrejtimi));
        System.out.println("emri == test: " + (emri == test));

        if(emri.equals(drejtimi)){
            System.out.println("Permbajtja eshte e njejte!");
        }

        System.out.println("Vlera fillestare: " + emri);
        emri += " - UP";
        System.out.println("Vlera e ndryshuar: " + emri);

//        length
        System.out.println("length: " + emri.length());
        System.out.println("toCharArray: " + emri.toCharArray());
        char[] strChars = emri.toCharArray();
        String newEmri = new String(strChars);
        System.out.println("charAt: " + emri.charAt(0));
        System.out.println("replace: " + emri.replace("F", "UP - F"));
        System.out.println("subsring: " + emri.substring(0, 3));
        emri.isEmpty();
        emri.toUpperCase();
        emri.toLowerCase();
        String permbajtja = "     Permbajtja e librit     ";
        permbajtja = permbajtja.trim();
        System.out.println(permbajtja);
        System.out.println(reverse(permbajtja));


    }

    public static String reverse(String emri){
        /*
        String reverse = "";
        for(int i = emri.length() - 1; i >=0; i--){
            reverse += emri.charAt(i);
        }
        return reverse;
         */
        char[] reverseChars = new char[emri.length()];
        int iterator = emri.length() - 1;
        String lowerEmri = emri.toLowerCase();
        String upperReverse = emri.substring(
                emri.length() -1).toUpperCase();
        char upperChar = upperReverse.charAt(0);
        for(char c : lowerEmri.toCharArray()){
            if(iterator == 0){
                reverseChars[0] = upperChar;
                break;
            }
            reverseChars[iterator--] = c;
        }
        return new String(reverseChars);
    }
}

