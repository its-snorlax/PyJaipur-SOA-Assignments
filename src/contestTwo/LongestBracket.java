package contestTwo;

public class LongestBracket {
    public static void main(String[] args) {
        findLongestBracket(")((())))(()())"); //6,2
        findLongestBracket("))(");
        findLongestBracket(")((())))(()())");
        findLongestBracket("(())()()");
        findLongestBracket("(())");
    }

    private static void findLongestBracket(String str) {
        int[] arrayOne = new int[str.length()];
        int[] arrayTwo = new int[str.length()];
        int last = 0;
        int maximumLength = 0, noOfValidBracket = 0;

        if (str.length() == 0) {
            System.out.println("0 1");
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                arrayTwo[last++] = i;
                arrayOne[i] = 0;
            } else {
                if (last == 0) {
                    arrayOne[i] = 0;
                } else {
                    int k = arrayTwo[--last], currentMax = 0;
                    if (k > 0) {
                        currentMax = i - k + 1 + arrayOne[k - 1];
                    } else {
                        currentMax = i - k + 1;
                    }

                    arrayOne[i] = currentMax;

                    if (currentMax > maximumLength) {
                        maximumLength = currentMax;
                        noOfValidBracket = 1;
                    } else if (currentMax == maximumLength) {
                        noOfValidBracket++;
                    }
                }
            }
        }
        System.out.println(maximumLength + " " + noOfValidBracket);
    }
}
