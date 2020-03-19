package composite;

import java.util.List;

public class File implements SystemEntry {

    private int id;
    private String name;

    public File(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean isDir() {
        return false;
    }

    @Override
    public List<SystemEntry> getEntryList() {
        throw new RuntimeException("A file does not have a list.");
    }

    @Override
    public String toString() {
        return "File{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
