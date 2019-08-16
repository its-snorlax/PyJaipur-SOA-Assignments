package week4.day18and19;

public class UglyNumber {
    public static void main(String[] args) {
        System.out.println(nthUglyNumber(10));
    }

    private static int nthUglyNumber(int n) {
        int[] output = new int[n];
        output[0] = 1;
        int m2 = 0, m3 = 0, m5 = 0;

        for (int i = 1; i < output.length; i++) {
            int multipleOfTwo = output[m2] * 2;
            int multipleOfThree = output[m3] * 3;
            int multipleOfFive = output[m5] * 5;

            int nextUglyNumber = Math.min(multipleOfFive, Math.min(multipleOfTwo, multipleOfThree));

            if (nextUglyNumber == multipleOfTwo) {
                output[i] = nextUglyNumber;
                m2++;
            }
            if (nextUglyNumber == multipleOfThree) {
                output[i] = nextUglyNumber;
                m3++;
            }
            if (nextUglyNumber == multipleOfFive) {
                output[i] = nextUglyNumber;
                m5++;
            }
        }

        return output[output.length - 1];
    }
}
