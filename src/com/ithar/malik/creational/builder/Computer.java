package com.ithar.malik.creational.builder;

/*
Loosely taken from:
https://www.journaldev.com/1425/builder-design-pattern-in-java
 */

public class Computer {

    private String HDD; //required parameters
    private String RAM; //required parameters

    private boolean isGraphicsCardEnabled;  //optional parameters
    private boolean isBluetoothEnabled;     //optional parameters

    private Computer() {

    }

    public String getHDD() {return HDD;}

    public String getRAM() {return RAM;}

    public boolean isGraphicsCardEnabled() {return isGraphicsCardEnabled;}

    public boolean isBluetoothEnabled() {return isBluetoothEnabled;}

    public void print() {
        System.out.println("The computer build has the following spec:\n"
            + "[HDD="+getHDD()+", RAM="+getRAM()+", GraphicCard="+isGraphicsCardEnabled+", Bluetooth="+isBluetoothEnabled()+"]");
    }

    public static class Builder {

        private String HDD;
        private String RAM;

        private boolean isGraphicsCardEnabled;
        private boolean isBluetoothEnabled;

        public Builder(String hdd, String ram) {
            this.HDD = hdd;
            this.RAM = ram;
        }

        public Computer.Builder hdd(String hdd) {
            this.HDD = hdd;
            return this;
        }

        public Computer.Builder ram(String ram) {
            this.RAM = ram;
            return this;
        }

        public Computer.Builder isGraphicsCardEnabled(boolean enabled) {
            this.isGraphicsCardEnabled = enabled;
            return this;
        }

        public Computer.Builder isBluetoothEnabled(boolean enabled) {
            this.isBluetoothEnabled = enabled;
            return this;
        }

        public Computer build() {

            Computer computer = new Computer();
            computer.HDD = this.HDD;
            computer.RAM = this.RAM;
            computer.isGraphicsCardEnabled = this.isGraphicsCardEnabled;
            computer.isBluetoothEnabled = this.isBluetoothEnabled;
            return computer;
        }
    }

}
