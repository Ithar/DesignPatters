package chian.currency;

public interface Denomination {

    void next(Denomination denomination);
    void dispense(int amount);
}
