// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String a= "안녕하세요";
//        StringBuffer sb = new StringBuffer("123");
//        sb.append(a);
//        System.out.println(sb);

        StringBuilder abc = new StringBuilder("123");
        abc.append(a);
        System.out.println(abc);
    }
}