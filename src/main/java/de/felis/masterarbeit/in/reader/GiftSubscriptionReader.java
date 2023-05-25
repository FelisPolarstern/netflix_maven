package de.felis.masterarbeit.in.reader;

import de.felis.masterarbeit.in.model.GiftSubscriptionsIn;
//import sun.security.x509.IPAddressName;

import java.io.IOException;
import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class GiftSubscriptionReader {
    public static List <GiftSubscriptionsIn> readgiftSubscription(String path) throws IOException {
        List<List<String>> content = ImportHelper.readCsvFileForNetflixData(path);  //Inhalt der Datei wird geladen
        List<GiftSubscriptionsIn> returnVal = new ArrayList<>();

        for (List<String> listitem : content) {
            LocalDate expirationDate = ImportHelper.toLocalDate(listitem.get(0));
            String offerDescription = ImportHelper.toString(listitem.get(1));
            Instant redemtionDate = ImportHelper.toInstant(listitem.get(2));
            Instant purchaseDate = ImportHelper.toInstant(listitem.get(3));
            String purchaseCountryCode = ImportHelper.toString(listitem.get(4));
            Float purchasePrice = ImportHelper.toFloat(listitem.get(5));
            Float purchasedDiscounted = ImportHelper.toFloat(listitem.get(6));
            String purchasedBy = ImportHelper.toString(listitem.get(7));
            String customizationMessage = ImportHelper.toString(listitem.get(8));
            returnVal.add(new GiftSubscriptionsIn(expirationDate, offerDescription, redemtionDate, purchaseDate, purchaseCountryCode, purchasePrice, purchasedDiscounted,
                    purchasedBy, customizationMessage));
        }
        return returnVal;
    }
}

