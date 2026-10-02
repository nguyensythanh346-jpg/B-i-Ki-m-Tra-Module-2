public class Bai4 {
    public static void main(String[] args) {
        int a = 12;
        int b = 18;

        int ucln = timUCLN(a, b);

        int tuSoMoi = a / ucln;
        int mauSoMoi = b / ucln;
        System.out.println(tuSoMoi + "/" + mauSoMoi);
    }

    public static int timUCLN(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}