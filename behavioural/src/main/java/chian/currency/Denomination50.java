package chian.currency;

public class Denomination50 implements Denomination {

    private Denomination nextDenomination;

    @Override
    public void next(Denomination denomination) {
        this.nextDenomination = denomination;
    }

    @Override
    public void dispense(int amount) {

        if (amount >= 50) {
            int num = amount / 50;
            int remainder = amount % 50;
            System.out.println("Dispensing £50 * " + num);
            if (remainder != 0) {
                nextDenomination.dispense(remainder);
            }
        } else {
            nextDenomination.dispense(amount);
        }

    }
}
