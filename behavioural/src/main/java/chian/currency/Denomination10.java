package chian.currency;

public class Denomination10 implements Denomination {

    private Denomination nextDenomination;

    @Override
    public void next(Denomination denomination) {
        this.nextDenomination = denomination;
    }

    @Override
    public void dispense(int amount) {

        if (amount >= 10) {
            int num = amount / 10;
            int remainder = amount % 10;
            System.out.println("Dispensing £10 * " + num);
            if (remainder != 0) {
                nextDenomination.dispense(remainder);
            }
        } else {
            nextDenomination.dispense(amount);
        }

    }
}
