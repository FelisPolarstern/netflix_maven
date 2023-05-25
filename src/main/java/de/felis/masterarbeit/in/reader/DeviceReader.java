package de.felis.masterarbeit.in.reader;

import de.felis.masterarbeit.in.model.DeviceIn;
//import sun.security.x509.IPAddressName;

import java.io.IOException;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class DeviceReader {

    public static List<DeviceIn> readDeviceList(String path) throws IOException {
        List<List<String>> content = ImportHelper.readCsvFileForNetflixData(path);  //Inhalt der Datei wird geladen
        List<DeviceIn> returnVal = new ArrayList<>();

        for(List<String> listitem: content){
                String profileName = ImportHelper.toString(listitem.get(0));
                String esn = ImportHelper.toString(listitem.get(1));
                String deviceType = ImportHelper.toString(listitem.get(2));
                Instant acctFirstPlaybackDate = ImportHelper.toInstant(listitem.get(3));
                Instant acctLastPlaybackDate = ImportHelper.toInstant(listitem.get(4));
                Instant acctFirstPlaybackDateForUseGeneratedPlays = ImportHelper.toInstant(listitem.get(5));
                Instant acctLastPlaybackDateForUserGeneratedPlays = ImportHelper.toInstant(listitem.get(6));
                Instant profileFirstPlaybackDate = ImportHelper.toInstant(listitem.get(7));
                Instant profileLastPlaybackDate = ImportHelper.toInstant(listitem.get(8));
                Instant profileFirstPlaybackDateForUserGeneratedPlays = ImportHelper.toInstant(listitem.get(9));
                Instant profileLastPlaybackDateForUserGeneratedPlays = ImportHelper.toInstant(listitem.get(10));
                Instant deactivationTime = ImportHelper.toInstant(listitem.get(11));
                returnVal.add(new DeviceIn(profileName, esn, deviceType, acctFirstPlaybackDate, acctLastPlaybackDate, acctFirstPlaybackDateForUseGeneratedPlays,
                                acctLastPlaybackDateForUserGeneratedPlays, profileFirstPlaybackDate, profileLastPlaybackDate, profileFirstPlaybackDateForUserGeneratedPlays,
                                profileLastPlaybackDateForUserGeneratedPlays,deactivationTime));
                /*returnVal.add(new DeviceIn(ImportHelper.toString(listitem.get(0)),
                        ImportHelper.toString(listitem.get(1)),  ImportHelper.toString(listitem.get(2)),
                        ImportHelper.toInstant(listitem.get(3)), ImportHelper.toInstant(listitem.get(4)), ImportHelper.toInstant(listitem.get(5)),
                        ImportHelper.toInstant(listitem.get(6)), ImportHelper.toInstant(listitem.get(7)), ImportHelper.toInstant(listitem.get(8)),
                        ImportHelper.toInstant(listitem.get(9)), ImportHelper.toInstant(listitem.get(10)), ImportHelper.toInstant(listitem.get(11))));*/



        }
            return returnVal;
        //Inhalt on content in returnVal

    }

}
