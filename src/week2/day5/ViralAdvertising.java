package week2.day5;

public class ViralAdvertising {
    public static void main(String[] args) {
        System.out.println(viralAdvertising(3));
    }

    private static int viralAdvertising(int days) {
        int likes = 0;
        int people = 5;
        for (int i=1; i<=days;i++){
            likes = likes + (people/2);
            people = (people / 2)*3;
        }
        return likes;
    }
}
