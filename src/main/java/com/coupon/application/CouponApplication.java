package com.coupon.application;

import com.coupon.configuration.CouponConfiguration;
import com.coupon.deals.CouponResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Environment;

public class CouponApplication extends Application<CouponConfiguration> {

    public static void main(String[] args) throws Exception {
        new CouponApplication().run(args);
    }

    public void run(CouponConfiguration couponConfiguration, Environment environment) throws Exception {
        final CouponResource couponResource = new CouponResource();
        environment.jersey().register(couponResource);

    }
}
