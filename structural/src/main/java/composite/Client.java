package composite;

public class Client {

    public static void main(String[] args) {

        SystemEntry file1 = new File(488, "usr_profile_1.txt");
        SystemEntry file2 = new File(489, "usr_profile_2.txt");

        SystemEntry usrDir = new Directory(2477, "usr");
        usrDir.add(usrDir.getEntryList(), file1);
        usrDir.add(usrDir.getEntryList(), file2);

        SystemEntry file3 = new File(489, "root_profile.txt");

        SystemEntry rootDir = new Directory(2475, "root");
        rootDir.add(rootDir.getEntryList(), usrDir);
        rootDir.add(rootDir.getEntryList(), file3);

        System.out.println(rootDir.toString());
        System.out.println(usrDir.toString());

        try {
            file1.add(file1.getEntryList(), file2);
        } catch (RuntimeException e) {
            System.out.println("One will not be able to add to a file");
        }
    }

}
