public class St25032804 {
    public static void main(String[] args) {
        int num = 99;

        System.out.println( (num > 100) && (num < 200) );
        // num이 100보다 크고!!!! (and) 200보디 작은가? => false
        System.out.println( (num == 99) || (num == 100) );
        // num이 99와 같거나!! (or) 100와 같은가 => true
        System.out.println( !(num == 100) );
        // num이 100와 같지 않는가?? => true
    }
}
