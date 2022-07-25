public class FindFirstAndLastPositionOfElementInSortedArray {

    public int[] searchRange(int[] nums, int target) {
        boolean startFound = false;
        int start = -1;
        int end = -1;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == target && !startFound){
                startFound = true;
                start = i;
                end = i;
                continue;
            }
            if(startFound){
                if (nums[i] != target) {
                    end = i-1;
                    break;
                }else{
                    end = i;
                }
            }
        }

        return new int[]{start, end};
    }

}
