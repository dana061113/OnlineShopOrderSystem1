package discounts;

public class PercentageDiscountRule implements IDiscountRule {
    private double percent;

    public PercentageDiscountRule(double percent) {
        this.percent = percent;
    }

    public double apply(double total) {
        return total - (total * percent / 100);
    }
}
