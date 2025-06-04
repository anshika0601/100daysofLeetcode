
class InfiniteArray {
    private int[] arr;

    public InfiniteArray(int[] arr) {
        this.arr = arr;
    }

    public int get(int index) {
        if (index >= arr.length) {
            return Integer.MAX_VALUE; // simulate infinity
        }
        return arr[index];
    }
}

public class targetinfinitesorted {

    static int findPos(InfiniteArray arr, int target) {
        int s = 0;
        int e = 1;

        while (arr.get(e) < target) {
            s = e+1;
            e = s * 2+1;
        }

        
        while (s <= e) {
            int mid = s + (e - s) / 2;
            int midVal = arr.get(mid);

            if (midVal == target) return mid + 1; 
            else if (midVal < target) s = mid + 1;
            else e = mid - 1;
        }

        return 0; 
    }

    public static void main(String[] args) {
        int[] data = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        InfiniteArray arr = new InfiniteArray(data);
        int k = 100;
        int ans = findPos(arr, k);
        System.out.println(ans); 
    }
}

