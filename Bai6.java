public class Bai6 {
    public static void main(String[] args) {
        int n = 13;
        String nhiPhan = "";

        if (n == 0) {
            System.out.println("0");
            return;
        }

        while (n > 0) {
            int du = n % 2;
            nhiPhan = du + nhiPhan;
            n = n / 2;
        }

        System.out.println(nhiPhan);
    }
}