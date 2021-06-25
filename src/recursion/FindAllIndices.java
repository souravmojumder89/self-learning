package recursion;

public class FindAllIndices {
    public static void main(String[] args) throws Exception {
        int[] arr = new int[]{10, 20, 50, 90, 40, 50, 900, 222, 1290, 50, 100, 200, 300, 50};
        int[] ints = allIndices(arr, 50, 0, 0);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }

    public static int[] allIndices(int[] arr, int x, int idx, int fsf) {
        if (idx == arr.length) return new int[fsf];

        if (arr[idx] == x) fsf++;
        int tempIndex = idx;
        int[] result = allIndices(arr, x, ++idx, fsf);
        if (arr[tempIndex] == x) {
            result[--fsf] = tempIndex;
        }
        return result;
    }
}