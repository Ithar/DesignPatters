package builder.staticclass;

public class Client {

    public static void main(String[] args) {

        Person p1 = new Person.Builder()
                .givenName("Jane")
                .surName("Doe")
                .age(28)
                .address("Unknown")
                .email("jane.doe@missing.com")
                .phoneNumber("078077877878")
                .build();

        p1.print();
    }
}
