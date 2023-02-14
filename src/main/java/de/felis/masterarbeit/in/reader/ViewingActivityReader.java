package de.felis.masterarbeit.in.reader;

import de.felis.masterarbeit.in.model.SearchHistoryIn;
import de.felis.masterarbeit.in.model.ViewingActivityIn;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ViewingActivityReader {
    public static List<ViewingActivityIn> readSearchHistory(String path) throws IOException {
        List<List<String>> content = ImportHelper.readCsvFile(path);
        List<ViewingActivityIn> returnVal = new ArrayList<>();

        for (List<String> listItem : content) {
            returnVal.add(new ViewingActivityIn(
                            ImportHelper.toString(listItem.get(0)), ImportHelper.toLocalDateTime(listItem.get(1)), ImportHelper.toDuration(listItem.get(2)),
                            ImportHelper.toString(listItem.get(3)), ImportHelper.toString(listItem.get(4)), ImportHelper.toString(listItem.get(5)),
                            ImportHelper.toString(listItem.get(6)), ImportHelper.toDuration(listItem.get(7)), ImportHelper.toDuration(listItem.get(8)),
                            ImportHelper.toString(listItem.get(9))));
        }
        return returnVal;}
}
