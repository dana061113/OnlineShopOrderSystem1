package discounts;

public class FixedAmountDiscountRule implements IDiscountRule {
    private double amount;

    public FixedAmountDiscountRule(double amount) {
        this.amount = amount;
    }

    public double apply(double total) {
        return total - amount;
    }
}
