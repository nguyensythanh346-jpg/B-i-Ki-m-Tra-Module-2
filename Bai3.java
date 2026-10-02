public class Bai3 {
    public static void main(String[] args) {
        String cau = "hoc lap trinh tai Codegym";

        String[] cacTu = cau.split(" ");

        String tuDaiNhat = "";

        for (String tu : cacTu) {
            if (tu.length() > tuDaiNhat.length()) {
                tuDaiNhat = tu;
            }
        }

        System.out.println(cacTu.length + " từ, từ dài nhất: \"" + tuDaiNhat + "\"");
    }
}