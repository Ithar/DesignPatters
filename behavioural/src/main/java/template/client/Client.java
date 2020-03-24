package template.client;

import template.domain.GlassHouse;
import template.domain.HouseTemplate;
import template.domain.WoodenHouse;

public class Client {

    public static void main(String[] args) {

        HouseTemplate woodHouse = new WoodenHouse();
        woodHouse.buildHouse();

        System.out.println("************");

        HouseTemplate glassHouse = new GlassHouse();
        glassHouse.buildHouse();
    }

}