package Quiz;

public class Arrangement05  {
    public static void main(String[] args) {

        int[] nums = {1,3,7,1,4,7,3,1,9,0,7,3};

        int max = 0;

        for ( int i = 0; i <= nums.length-1; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        System.out.println("출력결과 : " + max + "입니다.");
    }
}