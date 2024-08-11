package com.sultaale.patterns.iterator;

import java.util.ArrayList;

public class MenuTestDrive {
    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        CafeMenu menuCafe = new CafeMenu();
        ArrayList<Menu> menus = new ArrayList<>();
        menus.add(new DinerMenu());
        menus.add(new CafeMenu());
        menus.add(new PancakeHouseMenu());
        Waitress waitress = new Waitress(menus);

        waitress.printMenu();
    }
}
