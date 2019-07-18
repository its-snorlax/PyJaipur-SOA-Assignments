package week3.day8;

public class ComplexNumberMultiplication {
    public static void main(String[] args) {
        String s1 = "1+1i";
        String s2 = "1+1i";
        System.out.println(multiply(s1,s2));
    }

    private static String multiply(String a, String b) {
        String breaker = "[+i]";
        String[] splitA = a.split(breaker);
        String[] splitB = b.split(breaker);

        int realA = Integer.parseInt(splitA[0]);
        int imaginaryA = Integer.parseInt(splitA[1]);

        int realB = Integer.parseInt(splitB[0]);
        int imaginaryB = Integer.parseInt(splitB[1]);

        return (realA * realB - imaginaryA * imaginaryB) + "+" + (realA * imaginaryB + imaginaryA * realB) + "i";
    }
}
