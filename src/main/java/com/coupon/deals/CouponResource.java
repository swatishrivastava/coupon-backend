package com.coupon.deals;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/coupon-app")
@Produces(MediaType.APPLICATION_JSON)
public class CouponResource {

    @GET
    @Path(("/deals"))
    public DealDto getAllDeals() {
        DealDto dealDto = new DealDto("123",
                "TestDeal",
                "10% discount",
                "chutiya deal");
        return dealDto;
    }


}
