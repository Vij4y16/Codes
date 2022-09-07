public class HillPattern {
    public static void main(String[] args) {
        Hill(10);
    }
    private static void Hill(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i ; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j < i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
