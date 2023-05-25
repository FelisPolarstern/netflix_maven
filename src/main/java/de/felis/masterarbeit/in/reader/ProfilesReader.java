package de.felis.masterarbeit.in.reader;

import de.felis.masterarbeit.in.model.GamePlaySessionIn;
import de.felis.masterarbeit.in.model.ProfilesIn;

import java.io.IOException;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ProfilesReader {

    public static List<ProfilesIn> readGamePlaySession(String path) throws IOException {
        List<List<String>> content = ImportHelper.readCsvFile(path);  //Inhalt der Datei wird geladen
        List<ProfilesIn> returnVal = new ArrayList<>();

        /*
         private final String profileName;
    private final String emailAdress;
    private final Instant profileCreationTime;
    private final int maturityLevel;
    private final boolean hasAutoPlayback;
    private final String maxStramWuality;
    private final boolean profileTransfered;
    private final Instant profileTransferTime;
         */
        for (List<String> listitem : content) {
            String profileName = ImportHelper.toString(listitem.get(0));
            String emailAdress = ImportHelper.toString(listitem.get(1));
            Instant profileCreationTime = ImportHelper.toInstant(listitem.get(2));
            Integer maturityLevel = ImportHelper.toInteger(listitem.get(3));
            Boolean hasAutoPlayback = ImportHelper.toBoolean(listitem.get(4));
            String maxStramWuality = ImportHelper.toString(listitem.get(5));
            Boolean profileTransfered = ImportHelper.toBoolean(listitem.get(6));
            Instant profileTransferTime = ImportHelper.toInstant(listitem.get(7));

            returnVal.add(new ProfilesIn(profileName, emailAdress, profileCreationTime, maturityLevel, hasAutoPlayback, maxStramWuality, profileTransfered,
                    profileTransferTime));
        }
        return returnVal;
    }
}
