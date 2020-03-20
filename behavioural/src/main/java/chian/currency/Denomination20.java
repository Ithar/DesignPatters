package chian.currency;

public class Denomination20 implements Denomination {

    private Denomination nextDenomination;

    @Override
    public void next(Denomination denomination) {
        this.nextDenomination = denomination;
    }

    @Override
    public void dispense(int amount) {

        if (amount >= 20) {
            int num = amount / 20;
            int remainder = amount % 20;
            System.out.println("Dispensing £20 * " + num);
            if (remainder != 0) {
                nextDenomination.dispense(remainder);
            }
        } else {
            nextDenomination.dispense(amount);
        }

    }
}
