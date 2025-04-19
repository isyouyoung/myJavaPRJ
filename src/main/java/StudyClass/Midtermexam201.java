package StudyClass;

public class Midtermexam201 {
    public static void main(String[] args) {
        String log = "127.0.01 - frank [10/Oct/2000:13:55:36 -0700] \"GET /apache_pb.gif HTTP/1.0\" 200";
        // 로그 문자열 선언, 이 안에 URL 경로가 포함되어 있음.

        int start = log.indexOf("GET") + 4;
        // "GET"이 시작되는 위치를 찾아서, 그 뒤로부터 URL이 시작되므로 +4 (공백 포함해서)

        int end = log.indexOf("HTTP") -1;
        // "HTTP"가 시작되는 위치 바로 앞까지가 URL이므로 -1

        String url = log.substring(start,end);
        // 시작~끝 인덱스를 이용해 substring으로 URL만 추출

        System.out.println(url);
        // 결과 출력: /apache_pb.gif
    }
}
