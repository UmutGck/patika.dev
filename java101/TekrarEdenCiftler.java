public class TekrarEdenCiftler {
    static boolean find(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] list = {1, 2, 3, 3, 3, 4, 5, 5, 6, 6, 7, 8, 8, 8, 9, 10, 11};
        int[] duplicate = new int[list.length];
        int startIndex = 0;

        for (int i = 0; i < list.length; i++) {
            for (int j = i + 1; j < list.length; j++) {
                if ((list[i] == list[j]) && (list[i] % 2 == 0)) {
                    if (!find(duplicate, list[i])) {
                        duplicate[startIndex++] = list[i];
                    }
                    break;
                }
            }
        }

        for (int value : duplicate) {
            if (value != 0) {
                System.out.println(value);
            }
        }
    }
}
