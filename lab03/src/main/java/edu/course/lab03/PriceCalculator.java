package edu.course.lab03;

public class PriceCalculator {
    // Храним поле ИНТЕРФЕЙСНОГО типа (как требует контракт)
    private final DiscountPolicy discountPolicy;

    // Передаем реализацию через конструктор. Мы НЕ создаем ее внутри!
    public PriceCalculator(DiscountPolicy discountPolicy) {
        this.discountPolicy = discountPolicy;
    }

    public double calculateFinalPrice(double price) {
        return discountPolicy.apply(price);
    }
}