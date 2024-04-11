public class AdvancedPattern {
    public static void main(String[] args) {
        int n = 5;
        int cont = 0;
        char d = ' ';
        for (int i = 1; i <= n; i++) {
            d = 'A';
            cont = 1;
            for (int j = 1; j <= i; j++) {
                if (i % 2 == 0) {
                    System.out.print(d + " ");
                    d++;
                } else {
                    System.out.println(cont + " ");
                    cont++;
                }
            }
            System.out.println();
        }
    }
}
