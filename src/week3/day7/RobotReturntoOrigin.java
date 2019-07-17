package week3.day7;

public class RobotReturntoOrigin {
    public static void main(String[] args) {
        String input = "LL";
        System.out.println(judgeCircle(input));
        System.out.println("-----------------");
        String input1 = "UD";
        System.out.println(judgeCircle(input1));
    }

    private static boolean judgeCircle(String moves) {
        int UD = 0;
        int LR = 0;
        for (int i=0 ;i<moves.length();i++){
            char currentMove = moves.charAt(i);
            if(currentMove == 'U'){
                UD++;
            }else if (currentMove == 'D'){
                UD--;
            }else if (currentMove == 'L'){
                LR++;
            }else if (currentMove == 'R'){
                LR--;
            }
        }

        return LR == 0 && UD == 0;
    }
}
