package io.capexmove;

public class ZeroCouponBond implements BondBase {


    private final long maturityDate;
    private final double ethToUSDPrice;
    private final long issueDate;
    private final double couponRate;
    private int couponPayment;
    private int termInMonths;
    private double interestRate;
    private double collateralPledged;
    private int faceValue;
    private int totalPaid;

    public ZeroCouponBond(int faceValue, long issueDate, long maturityDate, double couponRate, Frequency couponFrequency, double ethToUSDPrice) {
        this.faceValue = faceValue;
        this.maturityDate = maturityDate;
        this.issueDate = issueDate;
        this.collateralPledged = 1.25*faceValue;
        this.faceValue = faceValue;
        this.couponRate = couponRate;
        this.ethToUSDPrice = ethToUSDPrice;
        this.couponPayment = (int)((faceValue*couponRate)/100);
    }

    @Override
    public int getFaceValue() {
        return faceValue;
    }

    @Override
    public double getCouponRate() {
        return 0;
    }

    @Override
    public Frequency couponPaymentFrequency() {
        return null;
    }

    @Override
    public double getCollateralPledged() {
        return collateralPledged;
    }

    @Override
    public int collateralValueInCaseOfDefault() {
        return 0;
    }

    @Override
    public long getMaturityDateInMilliSec() {
        return 0;
    }

    @Override
    public int getCouponPayment() {
        return couponPayment;
    }

    @Override
    public double getEthToUSDPrice() {
        return ethToUSDPrice;
    }

    @Override
    public void setEthToUSDPrice(double rate) {

    }

    @Override
    public long getIssueDateInMilliSec() {
        return 0;
    }

    @Override
    public void pay(int amount) {
        totalPaid =+ amount;
    }
}
