package Quiz;

public class Star02 {
    public static void main(String[] args) {
        for (int i = 0; i < 7; i++) {
            if (i < 4) {
                for (int j = 0; j <= i; j++) {
                    System.out.print("*");
                }
            } else {
                for (int j = 6; j >= i; j--) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}

// 바깥for문 = 0 시작 조건만족 6번째 if 로 들어가서
// j 식도 참이면서 별하나 출력 *
// 그담 나와서 i가 1이됨 다시 if문 6번째줄 들어감
// 이번엔 i가 1이기 때문에 j = 0 한번 j = 1 두번 만족
// 별이 두개나오고 나가서 println 실행
// *
// ** 완성
// 또 5번째줄 이번엔 i가 2고 if 문 6번째줄 들어감
// 이번엔 3번째 만족 별 3개 생성
// 이번엔 i가 3임
// 마지막 6번째줄 통과가가능함
// j 0 1 2 3 해서 4번 가능 별 4개생성
// 이제6번째줄에서 막힘
// 10번으로 넘어왔음 i가 4임 j가6이니까 만족함
// 한번만족후 별하나생성후 j 5 i 4 또 만족 별 두개됨
//그담 j4 i4 또 만족 별 3개 여기까지 후 줄바꿈
// 이렇게 두번 반복 별 2개
// 별개 1개 출력
// i가 7일때 if 문도 만족안되고  for 문도 만족안되서 아무것도안됨
// 종료
