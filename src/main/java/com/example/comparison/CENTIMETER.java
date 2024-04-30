package com.example.comparison;

public enum CENTIMETER {

    CM("CM"),centimeter("centimeter" ),cm("cm");

    private final String abbreviation;

    CENTIMETER(String abbreviation) {

        this.abbreviation = abbreviation;
    }

    public String getAbbreviation() {
        return abbreviation;
    }
}
