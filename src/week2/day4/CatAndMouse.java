package week2.day4;

public class CatAndMouse {
    public static void main(String[] args) {
        System.out.println(catAndMouse(1,2,3));
        System.out.println("--------------");
        System.out.println(catAndMouse(1,3,2));
        System.out.println("--------------");
    }

    private static String catAndMouse(int catA, int catB, int mouseC) {
        int distanceOfCatA = mouseC - catA;
        int distanceOfCatB = mouseC - catB;

        if (Math.abs(distanceOfCatA) > Math.abs(distanceOfCatB)){
            return "Cat B";
        }else if (Math.abs(distanceOfCatA) < Math.abs(distanceOfCatB)){
            return "Cat A";
        }else{
            return "Mouse C";
        }
    }
}
