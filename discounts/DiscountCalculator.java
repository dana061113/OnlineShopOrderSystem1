package discounts;

import java.util.ArrayList;
import java.util.List;

public class DiscountCalculator {
    private List<IDiscountRule> rules = new ArrayList<>();

    public void addRule(IDiscountRule rule) {
        rules.add(rule);
    }

    public double calculate(double total) {
        double result = total;
        for (IDiscountRule rule : rules) {
            result = rule.apply(result);
        }
        return result;
    }
}
