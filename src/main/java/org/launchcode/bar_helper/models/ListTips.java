package org.launchcode.bar_helper.models;

public class ListTips {

    private double listHourlyRate;
    private double listCreditCardTips;
    private double listCashTips;
    private double listTotalClaimed;
    private double listTaxRate;
    private double listTotalHourly;
    private double listDate;

    public ListTips(double listHourlyRate, double listCreditCardTips, double listCashTips, double listTotalClaimed, double listTaxRate, double listTotalHourly, double listDate) {
        this.listHourlyRate = listHourlyRate;
        this.listCreditCardTips = listCreditCardTips;
        this.listCashTips = listCashTips;
        this.listTotalClaimed = listTotalClaimed;
        this.listTaxRate = listTaxRate;
        this.listTotalHourly = listTotalHourly;
        this.listDate = listDate;
    }

    public double getListHourlyRate() {
        return listHourlyRate;
    }

    public void setListHourlyRate(double listHourlyRate) {
        this.listHourlyRate = listHourlyRate;
    }

    public double getListCreditCardTips() {
        return listCreditCardTips;
    }

    public void setListCreditCardTips(double listCreditCardTips) {
        this.listCreditCardTips = listCreditCardTips;
    }

    public double getListCashTips() {
        return listCashTips;
    }

    public void setListCashTips(double listCashTips) {
        this.listCashTips = listCashTips;
    }

    public double getListTotalClaimed() {
        return listTotalClaimed;
    }

    public void setListTotalClaimed(double listTotalClaimed) {
        this.listTotalClaimed = listTotalClaimed;
    }

    public double getListTaxRate() {
        return listTaxRate;
    }

    public void setListTaxRate(double listTaxRate) {
        this.listTaxRate = listTaxRate;
    }

    public double getListTotalHourly() {
        return listTotalHourly;
    }

    public void setListTotalHourly(double listTotalHourly) {
        this.listTotalHourly = listTotalHourly;
    }

    public double getListDate() {
        return listDate;
    }

    public void setListDate(double listDate) {
        this.listDate = listDate;
    }

    @Override
    public String toString() {
        return "Tips For: " + listDate +
                "Hourly Rate: " + listHourlyRate +
                "Credit Card Tips: " + listCreditCardTips +
                "Cash Tips: " + listCashTips +
                "Total Claimed: " + listTotalClaimed +
                "Tax Rate: " + listTaxRate +
                "Total Hourly: " + listTotalHourly;
    }
}
