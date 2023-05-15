package com.company.oop.cosmetics.models.products;

import com.company.oop.cosmetics.models.common.GenderType;

public class Product {

    public static final int MIN_LENGTH_PRODUCT_NAME = 3;
    public static final int MAX_LENGTH_PRODUCT_NAME = 10;
    public static final int MIN_LENGTH_BRAND_NAME = 2;
    public static final int MAX_LENGTH_BRAND_NAME = 10;
    private double price;
    private String name;
    private String brand;
    private GenderType gender;

    public Product(String name, String brand, double price, GenderType gender) {


        // finish the constructor and validate data
        //    setPrice(price);
    }
    public double getPrice() {
        return price;
    }

    private void setPrice(double price) {
        if (price <= 0.00) {
            throw new IllegalArgumentException("Product price must be greater than 0. ");
        }
        this.price = price;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("Name cannot be null");
        }
        if (name.length() < MIN_LENGTH_PRODUCT_NAME || name.length() > MAX_LENGTH_PRODUCT_NAME) {
            throw new IllegalArgumentException("Product name must be between 3 and 10 characters.");
        }
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    private void setBrand(String brand) {
        if (brand == null) {
            throw new IllegalArgumentException("Brand name cannot be null");
        }
        if (brand.length() < MIN_LENGTH_BRAND_NAME || brand.length() > MAX_LENGTH_BRAND_NAME) {
            throw new IllegalArgumentException("Brand name must be between 2 and 10 characters.");
        }
        this.brand = brand;
    }

    public GenderType getGender() {
        return gender;
    }

    public void setGender(GenderType gender) {
        this.gender = gender;
    }

    public String print() {
        return "";
        // Format:
        //" #[Name] [Brand]
        // #Price: [Price]
        // #Gender: [Gender]
        // ==="
    }
    
}
