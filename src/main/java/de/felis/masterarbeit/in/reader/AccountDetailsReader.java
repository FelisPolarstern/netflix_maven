package de.felis.masterarbeit.in.reader;

import de.felis.masterarbeit.in.model.AccountDetailsIn;
import de.felis.masterarbeit.in.model.DeviceIn;

import java.io.IOException;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class AccountDetailsReader {
    // public static List<DeviceIn> readDeviceList(String path) throws IOException
    public static List<AccountDetailsIn> readAccountDetailsList(String path) throws IOException{
        List<List<String>>  content = ImportHelper.readCsvFile(path);
        List<AccountDetailsIn> returnVal = new ArrayList<>();

        for(List<String> listitem: content){
            String firstName = ImportHelper.toString(listitem.get(0));
            String lastName = ImportHelper.toString(listitem.get(1));
            String emailAdress =ImportHelper.toString(listitem.get(2));
            String phoneNumber = ImportHelper.toString(listitem.get(3));
            String countryOfRegistration = ImportHelper.toString(listitem.get(4));
            String countryOfSignup = ImportHelper.toString(listitem.get(5));
            String primaryLang = ImportHelper.toString(listitem.get(6));
            Boolean cookieDisclosure = ImportHelper.toBoolean(listitem.get(7));
            String membershipStatus = ImportHelper.toString(listitem.get(8));
            Instant customerCreationTimestamp =ImportHelper.toInstant(listitem.get(9));
            boolean profileTranserSetting = ImportHelper.toBoolean(listitem.get(10));
            boolean hasRejoined = ImportHelper.toBoolean(listitem.get(11));
            boolean netflixUpadate = ImportHelper.toBoolean(listitem.get(12));
            boolean nowOnNetflix = ImportHelper.toBoolean(listitem.get(13));
            boolean netflixOffers = ImportHelper.toBoolean(listitem.get(14));
            boolean netflixSurveys = ImportHelper.toBoolean(listitem.get(15));
            boolean netflixKidsAndFamiliy = ImportHelper.toBoolean(listitem.get(16));
            boolean smsAccountRelated = ImportHelper.toBoolean(listitem.get(17));
            boolean smsComtentUpdatesAndSpecialOffers = ImportHelper.toBoolean(listitem.get(18));
            boolean testParticipation = ImportHelper.toBoolean(listitem.get(19));
            boolean whatsApp = ImportHelper.toBoolean(listitem.get(20));
            boolean marketingCommunicationsMatchedIdentifiers = ImportHelper.toBoolean(listitem.get(21));
            boolean extraMemberAccount = ImportHelper.toBoolean(listitem.get(22));

            returnVal.add(new AccountDetailsIn(firstName, lastName, emailAdress, phoneNumber, countryOfRegistration, countryOfSignup, primaryLang,cookieDisclosure, membershipStatus,
                    customerCreationTimestamp, profileTranserSetting, hasRejoined, netflixUpadate, nowOnNetflix, netflixOffers, netflixSurveys, netflixKidsAndFamiliy,
                    smsAccountRelated, smsComtentUpdatesAndSpecialOffers, testParticipation, whatsApp, marketingCommunicationsMatchedIdentifiers, extraMemberAccount));
        }

        return returnVal;
    }

}
