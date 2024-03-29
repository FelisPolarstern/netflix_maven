package de.felis.masterarbeit.in.reader;

import de.felis.masterarbeit.in.model.TermsOfUseIn;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TermsOfUseReader {

    public static List<TermsOfUseIn> readSubscriptionDetails(String path) throws IOException {
        List<List<String>> content = ImportHelper.readCsvFileForNetflixData(path);
        List<TermsOfUseIn> returnVal = new ArrayList<>();

        for (List<String> listitem : content) {
            returnVal.add(new TermsOfUseIn(ImportHelper.toLocalDateTime(listitem.get(0))));
        }
        return returnVal;
    }
}
