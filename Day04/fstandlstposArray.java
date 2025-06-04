package 100daysofLeetcode.Day04;

public class fstandlstposArray {
    public int[] searchRange(int[] nums, int target) {
        int l = search(nums, target, true);
        int r = search(nums, target, false);
        return new int[] { l, r };
    }

    static int search(int[] nums, int target, boolean findFirst) {
        int ans = -1;
        int s = 0, e = nums.length - 1;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (target > nums[mid]) {
                s = mid + 1;
            } else if (target < nums[mid]) {
                e = mid - 1;
            } else {
                ans = mid;  
                if (findFirst) {
                    e = mid - 1;
                } else {
                    s = mid + 1;
                }
            }
        }

        return ans;
    }
    
}
