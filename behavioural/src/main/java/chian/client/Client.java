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

        Denomination d10 = new Denomination10();

        Denomination d20 = new Denomination20();
        d20.next(d10);

        Denomination d50 = new Denomination50();
        d50.next(d20);

        return d50;
    }

}
