package builder.staticclass;

public class Person {

    private String givenName;
    private String surName;
    private int age;
    private String eMail;
    private String phone;
    private String address;

    public static class Builder {

        private String givenName="";
        private String surName="";
        private int age = 0;
        private String eMail = "";
        private String phone = "";
        private String address = "";

        public Person.Builder givenName(String givenName){
            this.givenName = givenName;
            return this;
        }

        public Person.Builder surName(String surName){
            this.surName = surName;
            return this;
        }

        public Person.Builder age(int val){
            age = val;
            return this;
        }

        public Person.Builder email(String val){
            eMail = val;
            return this;
        }

        public Person.Builder phoneNumber(String val){
            phone = val;
            return this;
        }

        public Person.Builder address(String val){
            address = val;
            return this;
        }

        public Person build(){
            return new Person(this);
        }
    }

    private Person(){
        super();
    }

    private Person(Person.Builder builder){
        givenName = builder.givenName;
        surName = builder.surName;
        age = builder.age;
        eMail = builder.eMail;
        phone = builder.phone;
        address = builder.address;
    }

    public String getGivenName(){
        return givenName;
    }

    public String getSurName(){
        return surName;
    }

    public int getAge(){
        return age;
    }

    public String getEmail(){
        return eMail;
    }

    public String getPhone(){
        return phone;
    }

    public String getAddress(){
        return address;
    }

    public void print(){
        System.out.println(
                "\nName: " + givenName + " " + surName + "\n" +
                        "Age: " + age + "\n" +
                        "eMail: " + eMail + "\n" +
                        "Phone: " + phone + "\n" +
                        "Address: " + address + "\n"
        );
    }

}
