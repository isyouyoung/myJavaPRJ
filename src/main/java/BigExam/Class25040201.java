package BigExam;

public class Class25040201 {
    public static void main(String[] args) {

        String log = "127.0.01 - frank [10/Oct/2000:13:55:36 -0700] \"GET /apache_pb.gif HTTP/1.0\" 200";
        // 로그 문자열 선언, 이 안에 URL 경로가 포함되어 있음.

        int start = log.indexOf("GET") + 4;
        // "GET"이 시작되는 위치를 찾아서, 그 뒤로부터 URL이 시작되므로 +4 (공백 포함해서)

        int end = log.indexOf("HTTP") - 1;
        // "HTTP"가 시작되는 위치 바로 앞까지가 URL이므로 -1

        String url = log.substring(start, end);
        // 시작~끝 인덱스를 이용해 substring으로 URL만 추출

        System.out.println(url);
        // 결과 출력: /apache_pb.gif
    }
}

// 🔍 작동 원리 설명
//1. log.indexOf("GET") + 4
//"GET"의 시작 인덱스를 찾고,
//
//그 뒤 공백까지 포함해 4글자 건너뛰면 /apache_pb.gif 가 시작됨
//
//2. log.indexOf("HTTP") - 1
//"HTTP" 시작 인덱스를 찾고,
//
//그 바로 앞 공백까지가 URL의 끝 위치 → 그래서 -1
//
//3. substring(start, end)
//start부터 end-1까지 잘라낸 문자열을 추출 → 즉, URL만 정확히 뽑아냄

// 조금 다른 해석
//public class Exam02 {
//    public static void main(String[] args) {
//        String log = "127.0.0.1 - frank [10/Oct/2000:13:55:36 -0700] \"GET /apache_pb.gif HTTP/1.0\" 200";
//
//        // "GET " 다음부터 시작해서 " HTTP" 직전까지 추출
//        int start = log.indexOf("GET") + 4;  // "GET " (공백 포함) 이후가 경로 시작
//        int end = log.indexOf("HTTP") - 1;   // "HTTP" 앞의 공백 직전까지가 경로 끝
//
//        String url = log.substring(start, end);
//        System.out.println(url);  // 출력: /apache_pb.gif
//    }
//}
