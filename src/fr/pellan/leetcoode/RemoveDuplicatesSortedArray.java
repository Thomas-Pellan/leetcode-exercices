package fr.pellan.leetcoode;

public class RemoveDuplicatesSortedArray {

    public static void main (String[] args){

        testOutput(new int[] {1, 1, 1}, new int[] {1});
        testOutput(new int[] {0, 0, 1, 1, 2, 2}, new int[] {0, 1, 2});
        testOutput(new int[] {0, 0, 1, 1, 2}, new int[] {0, 1, 2});
        testOutput(new int[] {0, 0, 1, 1, 2, 3, 4, 5, 5, 6}, new int[]  {0, 1, 2, 3, 4, 5, 6});
    }

    private static void testOutput(int[] nums, int[] expectedNums){

        int k = removeDuplicates(nums); // Calls your implementation

        assert k == expectedNums.length;
        for (int i = 0; i < k; i++) {
            assert nums[i] == expectedNums[i];
        }
    }

    //TODO : failed first time, redo later
    private static int removeDuplicates(int[] nums){
        return 0;
    }

    /*private static int removeDuplicates(int[] nums){
        int numberOfDuplicates = 0;
        int currentPosition = 0;

        while(currentPosition + numberOfDuplicates < nums.length) {
            int nextPosition = currentPosition + 1;

            // get the first position where the int does not equal the current one
            while (nextPosition + numberOfDuplicates <= nums.length && nums[nextPosition] == nums[currentPosition]) {
                numberOfDuplicates++;
                nextPosition++;
            }

            //re write the elements of the arrays from that position
            int nextRewritePosition = currentPosition + 1;
            for(int i = nextPosition; i < nums.length; i++){
                nums[nextRewritePosition] = nums[i];
                nextRewritePosition++;
            }

            currentPosition++;
        }

        return nums.length - numberOfDuplicates;
    }*/
}
