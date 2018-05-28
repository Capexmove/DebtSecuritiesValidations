package io.capexmove;


public interface BondBase {

    enum Frequency {
        Monthly,
        Quarterly,
        Half_Yearly,
        Yearly
    }

    int getFaceValue();

    double getCouponRate();

    Frequency couponPaymentFrequency();

    double getCollateralPledged();

    int collateralValueInCaseOfDefault();

    long getMaturityDateInMilliSec();

    int getCouponPayment();

    double getEthToUSDPrice();

    void setEthToUSDPrice(double rate);

    long getIssueDateInMilliSec();

    void pay(int amount);
}
