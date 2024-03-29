package de.felis.masterarbeit.in.reader;

import de.felis.masterarbeit.in.model.ClickstreamIn;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ClickstreamReader {

    public static List<ClickstreamIn> readClickstream(String path) throws IOException {
        List<List<String>>  content = ImportHelper.readCsvFileForNetflixData(path);
        List<ClickstreamIn> returnVal = new ArrayList<>();

        for(List<String> listitem: content){
            returnVal.add(new ClickstreamIn(ImportHelper.toString(listitem.get(0)),ImportHelper.toString(listitem.get(1)), ImportHelper.toString(listitem.get(2)),
                                                ImportHelper.toString(listitem.get(3)), ImportHelper.toString(listitem.get(4)), ImportHelper.toLocalDateTime(listitem.get(5))));
        }
        return returnVal;
    }

}
