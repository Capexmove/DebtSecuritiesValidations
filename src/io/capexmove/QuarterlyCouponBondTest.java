package io.capexmove;

import junit.framework.TestCase;

import java.util.Date;

public class QuarterlyCouponBondTest extends TestCase {

    private QuarterlyCouponBond quarterlyCouponBond;

    public void setUp() throws Exception {
        super.setUp();
        Date date = new Date();
        quarterlyCouponBond = createQuarterlyBond();
    }

    private QuarterlyCouponBond createQuarterlyBond() {
        return new QuarterlyCouponBond(1000,
                                                            1514797984,
                                                            154624758,
                                                            10,
                                                            BondBase.Frequency.Quarterly,
                                                            500
                                                            );
    }

    public void testQuarterlyCouponBondIsConstructedProperly() {
        assertEquals(10.0,quarterlyCouponBond.getCouponRate(),0.01);
        assertEquals(100,quarterlyCouponBond.getCouponPayment());
        assertEquals(500.0,quarterlyCouponBond.getEthToUSDPrice());
        assertEquals(1514797984,quarterlyCouponBond.getIssueDateInMilliSec());
        assertEquals(154624758,quarterlyCouponBond.getMaturityDateInMilliSec());
    }

    public void testCouponPaymentValue() {
        assertEquals(100,quarterlyCouponBond.getCouponPayment());
    }

    public void testTotalPaymentDueAfterVariousCouponPayment() {
        assertEquals(100,quarterlyCouponBond.getCouponPayment());
    }

    public void tearDown() throws Exception {
    }

}