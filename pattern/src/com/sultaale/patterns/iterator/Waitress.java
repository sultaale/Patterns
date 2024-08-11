package com.sultaale.patterns.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Waitress {
    List<Menu> menus;


    public Waitress(ArrayList<Menu> menus) {
        this.menus = menus;
    }

    public void printMenu() {
      Iterator<Menu> menuIterator = menus.iterator();
      while (menuIterator.hasNext()) {
          Menu menu = menuIterator.next();
          printMenu(menu.createIterator());
      }
    }

    public void printMenu(Iterator<MenuItem> iterator) {
        while(iterator.hasNext()) {
            MenuItem menuItem = iterator.next();
            System.out.print(menuItem.getName());
            System.out.print(menuItem.getPrice() + " __ ");
            System.out.println(menuItem.getDescription());
        }
    }
}
