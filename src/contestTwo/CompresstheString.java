package contestTwo;

public class CompresstheString {
    public static void main(String[] args) {
        System.out.println(compresString("uduuuduuddhhshhhbbbcbhfdjjjxhhxxxjjdjndp"));
    }

    private static String compresString(String inputString) {
        if (inputString.length() < 2){
            return String.valueOf(inputString.charAt(0));
        }
        StringBuilder result = new StringBuilder();
        int i = 0;
        int count = 0;
        while (i < inputString.length() - 1) {
            count++;
            if (inputString.charAt(i) != inputString.charAt(i + 1)) {
                if (count > 1) {
                    result.append(inputString.charAt(i)).append(count);
                    count = 0;
                }else {
                    result.append(inputString.charAt(i));
                    count = 0;
                }
            }
            i++;
        }
        result.append(inputString.charAt(i));
        return result.toString();
    }
}
