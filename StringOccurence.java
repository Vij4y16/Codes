public class StringOccurence {
    public static void main(String[] args) {
        String s1= "DABADDABA";
        String s2 =  "BAD";

        int Stringlen = s1.length(), String2len = s2.length(), count = 0 , occurence = 0;

        for (int i=0; i< Stringlen - String2len+1;i++){
            if(s1.charAt(i) == s2.charAt(0)) {
                int ii = i;

                for (int j=0 ; j<String2len;j++) {
                    if(s1.charAt(ii) == s2.charAt(j)) count++;
                    ii = ii+1;
                }
                if (count == String2len) occurence++;
                count = 0;
            }
        }
        for (int i = Stringlen - 1; i >= String2len - 1; i--) {
            if (s1.charAt(i) == s2.charAt(0)) {
                int ii = i;
                for (int j = 0; j < String2len; j++) {
                    if (s1.charAt(ii) == s2.charAt(j)) count++;
                    ii = ii - 1;
                }
                if (count == String2len) occurence++;
                count = 0;
            }
        }

        System.out.println(occurence);
    }
}
