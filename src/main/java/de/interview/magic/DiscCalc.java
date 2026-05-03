package de.interview.magic;

public class DiscCalc {

    public double calculate(double price, int type) {
        if (type == 1) {
            return price * 0.9;
        } else if (type == 2) {
            return price * 0.8;
        } else if (type == 3) {
            return price * 0.95;
        }

        return price;
    }
}
