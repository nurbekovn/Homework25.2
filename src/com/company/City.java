package com.company;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class City implements Comparable<City> {

    private int code;
    private String name;


    @Override
    public int compareTo(City o) {
        return o.getCode() - this.getCode();
    }
}
