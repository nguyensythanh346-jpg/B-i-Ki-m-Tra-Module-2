 import java.util.HashMap;
import java.util.Map;

    public class Bai1 {
        public static void main(String[] args) {
            int[] orders = {3, 1, 3, 2, 1, 3};

            Map<Integer, Integer> countMap = new HashMap<>();
            for (int mon : orders) {
                countMap.put(mon, countMap.getOrDefault(mon, 0) + 1);
            }

            int maxCount = 0;
            int bestMon = -1;

            for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
                if (entry.getValue() > maxCount) {
                    maxCount = entry.getValue();
                    bestMon = entry.getKey();
                }
            }
            System.out.println(bestMon + " bán chạy nhất (" + maxCount + " lần)");
        }
    }
