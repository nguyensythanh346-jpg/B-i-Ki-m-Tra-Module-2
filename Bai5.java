public class Bai5 {
    public static void main(String[] args) {
        int[] arr = {1, 4, 7, 9, 12};
        int x = 9;

        int ketQua = timKiemNhiPhan(arr, x);

        if (ketQua != -1) {
            System.out.println("Vị trí " + ketQua);
        } else {
            System.out.println("Không tìm thấy");
        }
    }

    public static int timKiemNhiPhan(int[] arr, int x) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == x) {
                return mid;
            } else if (arr[mid] < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
}