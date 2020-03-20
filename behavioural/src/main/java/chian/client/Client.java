package chian.client;

import chian.currency.Denomination;
import chian.currency.Denomination10;
import chian.currency.Denomination20;
import chian.currency.Denomination50;

import java.util.Scanner;

public class Client {

    public static void main(String[] args) {

        Denomination denomination = ATMChain();

        System.out.print("Enter amount to dispense: ");
        Scanner input = new Scanner(System.in);
        int amount = input.nextInt();

        denomination.dispense(amount);
    }

    private static Denomination ATMChain() {

        Denomination fifty = new Denomination50();
        Denomination twenty = new Denomination20();
        Denomination ten = new Denomination10();

        fifty.next(twenty);
        twenty.next(ten);

        return fifty;
    }

}
