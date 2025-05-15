package BigExam;

public class Class25040202 {
    public static void main(String[] args) {

        String log = "127.0.01 - frank [10/Oct/2000:13:55:36 -0700] \"GET /apache_pb.gif HTTP/1.0\" 200";

        int start = log.indexOf("GET") + 4;
        int end = log.indexOf("HTTP") - 1;

        String url = log.substring(start,end);

        System.out.println(url);

    }
}
