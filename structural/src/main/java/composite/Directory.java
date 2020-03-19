package composite;

import java.util.ArrayList;
import java.util.List;

public class Directory implements SystemEntry {

    private int id;
    private String name;
    private List<SystemEntry> entryList = new ArrayList<>();

    public Directory(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean isDir() {
        return true;
    }

    public List<SystemEntry> getEntryList() {
        return entryList;
    }

    @Override
    public String toString() {

        int fileCount = 0;
        int directoryCount = 0;

        for (SystemEntry entry : entryList) {

            if (entry.isDir()) {
                directoryCount++;
            } else {
                fileCount++;
            }
        }

        return "Directory{" +
                "name='" + id + '\'' +
                ", path='" + name + '\'' +
                ", entryList={dir=" + directoryCount +
                ", file=" + fileCount + "}" +
                '}';
    }
}
