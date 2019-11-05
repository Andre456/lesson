package by.belhard.j18.lesson_class.lesson8.try1;

import java.util.InvalidPropertiesFormatException;

public class FuelSysteam {
    private final FuelType type;
    private int maxValue;
    private int currntValue;

    public FuelSysteam(FuelType type, int maxValue, int currntValue) {
        this.type = type;
        this.maxValue = maxValue;
        this.currntValue = currntValue;
    }

    public FuelType getType() {
        return type;
    }

    public int getMaxValue() {
        return maxValue;
    }

    public int getCurrntValue() {
        return currntValue;
    }

    public int fillFuel(int value) {
        if (newValue <= 0)
            throw new InvalidPropertiesFormatException("gtht,jh");
        if (maxValue > currntValue + newValue) {
            int res = newValue - (maxValue - currntValue);
            return res;
        } else {
            currntValue += newValue;
            return 0;
        }


    }

}
