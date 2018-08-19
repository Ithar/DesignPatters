package com.ithar.malik.creational.builder;


/*
THE PATTERN:
    The Builder pattern allows us to write readable, understandable code to set up complex objects instead of having
    an extremely large contractor for objects.

WHEN TO USE:
    * If you find yourself in a situation where you keep on adding new parameters to a constructor.
    * If you have optional parameters for a constructor.

DISADVANTAGE:
    * Developers may forget to add support for a new attribute to the builder

EXAMPLE:
// https://www.journaldev.com/1425/builder-design-pattern-in-java
// https://www.javaworld.com/article/2074938/core-java/too-many-parameters-in-java-methods-part-3-builder-pattern.html
// https://dzone.com/articles/design-patterns-the-builder-pattern

Created by ithar.malik on 17/08/2018
*/
public class ApplicationRun {

    public static void main(String[] args) {

        Computer computer = new Computer.Builder("64GB", "1024 RAM")
                            .isBluetoothEnabled(true)
                            .isGraphicsCardEnabled(false)
                            .build();
        computer.print();

        System.out.print("==========");

        Person person = new Person.Builder()
                        .givenName("Ithar")
                        .surName("Malik")
                        .email("test@testing.com")
                        .age(36)
                        .phoneNumber("+44 7892939933")
                        .build();

        person.print();
    }

}
