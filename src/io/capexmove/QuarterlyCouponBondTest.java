package io.capexmove;

import junit.framework.TestCase;

import java.util.Date;

public class QuarterlyCouponBondTest extends TestCase {

    private QuarterlyCouponBond quarterlyCouponBond;

    public void setUp() throws Exception {
        super.setUp();
        Date date = new Date();
        quarterlyCouponBond = new QuarterlyCouponBond(1000,
                                                            date.getTime(),
                                                            154624758,
                                                            10,
                                                            BondBase.Frequency.Quarterly,
                                                            500
                                                            );
    }

    public void testQuarterlyCouponBondIsConstructedProperly() {
        assertEquals(0,quarterlyCouponBond.getCouponPayment());
        assertEquals(0,quarterlyCouponBond.getEthToUSDPrice());
        assertEquals(0,quarterlyCouponBond.getEthToUSDPrice());
    }

    public void testCouponPayments() {
        assertEquals(0,quarterlyCouponBond.getCouponPayment());
    }


    public void tearDown() throws Exception {
    }

}