package de.felis.masterarbeit.in.reader;

import de.felis.masterarbeit.in.model.InteractiveTitleIn;
import de.felis.masterarbeit.in.model.MyListIn;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MyListReader {
    public static List<MyListIn> readmyList(String path) throws IOException {
        List<List<String>> content = ImportHelper.readCsvFile(path);
        List<MyListIn> returnVal = new ArrayList<>();

        for (List<String> listItem : content) {
            returnVal.add(new MyListIn(ImportHelper.toString(listItem.get(0)), ImportHelper.toString(listItem.get(1)), ImportHelper.toString(listItem.get(2)),
                                        ImportHelper.toInstant(listItem.get(3))));
        }
        return returnVal;
    }
}

