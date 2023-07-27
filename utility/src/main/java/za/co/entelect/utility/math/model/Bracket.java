package za.co.entelect.utility.math.model;

public class Bracket {
    private double threshold;

    private double taxPercentage;

    public Bracket(double threshold, double taxPercentage) {
        this.threshold = threshold;
        this.taxPercentage = taxPercentage;
    }

    public double getThreshold() {
        return threshold;
    }

    public void setThreshold(double threshold) {
        this.threshold = threshold;
    }

    public double getTaxPercentage() {
        return taxPercentage;
    }

    public void setTaxPercentage(double taxPercentage) {
        this.taxPercentage = taxPercentage;
    }
}
