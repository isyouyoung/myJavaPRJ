package Special;

public class Two03 {

    public static void main(String[] args) {

        int result = 0;

        for(int i = 1; i <= 100; i++){
            if(i%2 ==0){
                result += i;
            }
        }

        System.out.println(result);
        
    }
}

// 1부터 100까지 짝수의 합만 더하기