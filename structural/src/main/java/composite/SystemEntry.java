package composite;

import java.util.List;

public interface SystemEntry {

    boolean isDir();

    List<SystemEntry> getEntryList();

    default void add(List<SystemEntry> entryList, SystemEntry entry) {
        if (isDir()) {
            entryList.add(entry);
        }
    }
}
