package de.felis.masterarbeit.in.reader;

import de.felis.masterarbeit.in.model.InteractiveTitleIn;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class InteractiveTitleReader {

    public static List<InteractiveTitleIn> readSubscriptionHistoryList(String path) throws IOException {
        List<List<String>> content = ImportHelper.readCsvFile(path);
        List<InteractiveTitleIn> returnVal = new ArrayList<>();
        for (List<String> listItem : content) {
            returnVal.add(new InteractiveTitleIn(ImportHelper.toString(listItem.get(0)), ImportHelper.toString(listItem.get(1)), ImportHelper.toString(listItem.get(2)),
                    ImportHelper.toString(listItem.get(3)), ImportHelper.toBoolean(listItem.get(4)), ImportHelper.toString(listItem.get(5)),
                    ImportHelper.toLocalDateTime(listItem.get(6))));
        }
        System.out.println(returnVal + "+");
        return returnVal;
    }
    }
