package com.coupon.deals;


public class DealDto {

    private String id;
    private String name;
    private String discount;
    private String description;

    public DealDto(String id, String name, String discount, String description) {
        this.id = id;
        this.name = name;
        this.discount = discount;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDiscount() {
        return discount;
    }

    public String getDescription() {
        return description;
    }


}



