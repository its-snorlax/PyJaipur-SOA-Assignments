package week2.day6;

import java.util.ArrayList;

public class BonAppetit {
    public static void main(String[] args) {
        ArrayList<Integer> bill = new ArrayList<>();
        bill.add(3);
        bill.add(10);
        bill.add(2);
        bill.add(9);

        bonAppetit(bill,1,12);
        System.out.println("--------------------");
        bonAppetit(bill,1,7);
    }

    private static void bonAppetit(ArrayList<Integer> bill, int k, int b) {
        int totalBill = 0;
        for (Integer integer : bill) {
            totalBill = totalBill + integer;
        }
        totalBill = totalBill - bill.get(k);
        int moneyShouldRefund = b - (totalBill / 2);
        if(moneyShouldRefund == 0){
            System.out.println("Bon Appetit");
        }else {
            System.out.println(moneyShouldRefund);
        }
    }
}
