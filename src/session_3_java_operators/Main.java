package session_3_java_operators;

public class Main {

    public static void main(String[] args) {
        int x = 3;
        int y = ++x * 5 / x-- + --x;

        System.out.println(x);
        System.out.println(y);
    }
}