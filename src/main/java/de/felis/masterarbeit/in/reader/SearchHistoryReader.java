package de.felis.masterarbeit.in.reader;

import de.felis.masterarbeit.in.model.IndicatedPreferencesIn;
import de.felis.masterarbeit.in.model.SearchHistoryIn;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SearchHistoryReader {

    public static List<SearchHistoryIn> readSearchHistory(String path) throws IOException {
        List<List<String>> content = ImportHelper.readCsvFile(path);
        List<SearchHistoryIn> returnVal = new ArrayList<>();

        for (List<String> listItem : content) {
            returnVal.add(new SearchHistoryIn
                    (ImportHelper.toString(listItem.get(0)), ImportHelper.toString(listItem.get(1)), ImportHelper.toString(listItem.get(2)),
                     ImportHelper.toBoolean(listItem.get(3)), ImportHelper.toString(listItem.get(4)), ImportHelper.toString(listItem.get(5)),
                     ImportHelper.toString(listItem.get(6)), ImportHelper.toString(listItem.get(7)), ImportHelper.toLocalDateTime(listItem.get(8))));
        }
        return returnVal;
    }
}
