package Quiz;

public class Arrangement0201 {
    public static void main(String[] args) {

        int[] nums = {1, 3, 7, 1, 4, 7, 3, 1, 9, 0, 7, 3};

        int max = nums[0];  // 첫 번째 값을 초기 최대값으로 설정

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];  // 현재 값이 더 크면 max 갱신
            }
        }
        System.out.println("최댓값: " + max + "입니다.");
    }
}

