public class Removechar {
    public static void main(String[] args) {
        String str = "hello";
        String s = "";
        char remove = 'h';
        for(int i=0;i<str.length();i++) {
            if(str.charAt(i)!=remove)
                s += str.charAt(i);
        }
        System.out.println(s);
    }
}
