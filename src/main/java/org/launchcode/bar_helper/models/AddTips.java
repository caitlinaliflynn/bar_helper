package org.launchcode.bar_helper.models;

public class AddTips {

    private double hourlyRate;
    private double creditCardTips;
    private double cashTips;
    private double totalClaimed;
    private double taxRate;
    private double totalHourly;

    public AddTips(double hourlyRate, double creditCardTips, double cashTips, double totalClaimed, double taxRate, double totalHourly) {
        this.hourlyRate = hourlyRate;
        this.creditCardTips = creditCardTips;
        this.cashTips = cashTips;
        this.totalClaimed = totalClaimed;
        this.taxRate = taxRate;
        this.totalHourly = totalHourly;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double getCreditCardTips() {
        return creditCardTips;
    }

    public void setCreditCardTips(double creditCardTips) {
        this.creditCardTips = creditCardTips;
    }

    public double getCashTips() {
        return cashTips;
    }

    public void setCashTips(double cashTips) {
        this.cashTips = cashTips;
    }

    public double getTotalClaimed() {
        return totalClaimed;
    }

    public void setTotalClaimed(double totalClaimed) {
        this.totalClaimed = totalClaimed;
    }

    public double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(double taxRate) {
        this.taxRate = taxRate;
    }

    public double getTotalHourly() {
        return totalHourly;
    }

    public void setTotalHourly(double totalHourly) {
        this.totalHourly = totalHourly;
    }

    @Override
    public String toString() {
        return "Tips" + '\n' +
                "Hourly Rate: " + hourlyRate + '\n' +
                "Credit Card Tips: " + creditCardTips + '\n' +
                "Cash Tips: " + cashTips + '\n' +
                "Total Claimed: " + totalClaimed +
                "Tax Rate: " + totalHourly +
                "Total Hourly: " + totalHourly;
    }
}
