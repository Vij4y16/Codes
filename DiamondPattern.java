public class DiamondPattern {
    public class Dia {
        public static void main(String[] args) {
            diamond(5);
        }
        private static void diamond(int n){
            for (int i = 1; i < n; i++) {
                for (int j = i; j <= n; j++) {
                    System.out.print("  ");
                }
                for (int j = 1; j < i ; j++) {
                    System.out.print("* ");
                }
                for (int j = 1; j <= i ; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("  ");
                }
                for (int j = i; j < n ; j++) {
                    System.out.print("* ");
                }
                for (int j = i; j <= n ; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }

}
