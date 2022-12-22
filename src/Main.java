public class Main {
    public static void main(String[] args) {
        String s1 = "x3z ? xYz ! R1 && __";
        System.out.println(s1.replaceAll("[a-z]|[0-9]","*"));
    }
}
