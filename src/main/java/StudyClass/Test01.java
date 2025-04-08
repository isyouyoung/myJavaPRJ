package StudyClass;

public class Test01 {
    public static void main(String[] args) {

        String log = "127.0.0.1 - Scott [10/Dec/2019:13:55:36 -0700] \"GET /server-status HTTP/1.1\" 200 232";
        // String log = "127.0.0.1 - Scott [10/Dec/2019:13:55:36 -0700] \"POST /server-status HTTP/1.1\" 200 232";
        // String log = "127.0.0.1 - Scott [10/Dec/2019:13:55:36 -0700] \"DELETE /server-status HTTP/1.1\" 200 232";


        //GET

        System.out.println(log.indexOf("\""));
        System.out.println(log.substring(47,2));

/*      int idx = log.indexOf("\"");
        int idx2 = log.indexOf(" ",idx);

        String result = log.substring(idx+1, idx2);

        System.out.println(result);*/
    }
}
