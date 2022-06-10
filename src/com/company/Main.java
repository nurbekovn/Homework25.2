package com.company;
//      City деген класс тузунуз. (code, name, ...)
//      Эгерде code так сан болсо TreeSet ke салыныз.
//      Аларды чонунан кичинесине караган тартипте чыгарыныз.

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Set<City> city = new HashSet<>();

        city.add(new City(1, "Biskek"));
        city.add(new City(2, "Osh"));
        city.add(new City(3, "Batken"));
        city.add(new City(4, "Jalal-Abad"));
        city.add(new City(5, "Naryn"));
        city.add(new City(6, "Osh"));
        city.add(new City(7, "Talas"));
        city.add(new City(8, "Chuy"));
        city.add(new City(9, "Issyk-Kul"));


        Set<City> treeSet = new TreeSet<>();

        for (City c: city) {
            if (c.getCode()%2==1){
                treeSet.add(c);
            }
        }
        treeSet.forEach(System.out::println);
    }
}
