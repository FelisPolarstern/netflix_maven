package de.felis.masterarbeit.in.reader;

import de.felis.masterarbeit.in.model.IndicatedPreferencesIn;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class IndicatedPreferencesReader {

    public static List<IndicatedPreferencesIn> readSubscriptionHistoryLis(String path) throws IOException {
        List<List<String>> content = ImportHelper.readCsvFile(path);
        List<IndicatedPreferencesIn> returnVal = new ArrayList<>();

        for (List<String> listItem : content) {
            returnVal.add(new IndicatedPreferencesIn(ImportHelper.toString(listItem.get(0)), ImportHelper.toString(listItem.get(1)), ImportHelper.toBoolean(listItem.get(2)),
                                                    ImportHelper.toBoolean(listItem.get(3)), ImportHelper.toInstant(listItem.get(4))));
        }
        return returnVal;
    }
}
