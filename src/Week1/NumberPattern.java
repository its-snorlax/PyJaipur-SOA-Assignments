package Week1;

public class NumberPattern {
    public static void main(String[] args) {
        printIt(5);
    }

    static void printIt(int number){
        for (int i=number; i>=1;i--){
            for (int j=1; j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
