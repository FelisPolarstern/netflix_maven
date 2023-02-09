import de.felis.masterarbeit.in.model.*;
import de.felis.masterarbeit.in.reader.*;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main (String[] args) throws IOException {
        /* Klassentests */
        /*
        List<AccountDetailsIn> testAccountDetails = AccountDetailsReader.readAccountDetailsList("../Daten/Anonymisiert/netflix-report/ACCOUNT/AccountDetails.csv");
        List<ClickstreamIn> clickstreamTest = ClickstreamReader.readClickstream("/Users/nadjajust/Documents/Uni/Master/Masterarbeit/netflix-report/CLICKSTREAM/Clickstream.csv");
        DevicesImport testDevices = new DevicesImport("../Daten/Anonymisiert/netflix-report/DEVICES/Devices.csv");
        List <IndicatedPreferencesIn> indicatedPreferencesTest = IndicatedPreferencesReader.readSubscriptionHistoryLis("/Users/nadjajust/Documents/Uni/Master/Masterarbeit/netflix-report/CONTENT_INTERACTION/IndicatedPreferences.csv");

        List<DeviceIn> testDevices = DeviceReader.readDeviceList ("../Daten/Anonymisiert/netflix-report/DEVICES/Devices.csv");
        List<SubscriptionHistoryIn> testSubscriptionHistory = SubstriptionHistoryReader.readSubscriptionHistoryLis("../Daten/Anonymisiert/netflix-report/ACCOUNT/SubscriptionHistory.csv");
        */
        //System.out.println(Locale.forLanguageTag("de-de").getDisplayCountry());
        List<InteractiveTitleIn> interactiveTitletest = InteractiveTitleReader.readSubscriptionHistoryList("/Users/nadjajust/Documents/Uni/Master/Masterarbeit/netflix-report/CONTENT_INTERACTION/InteractiveTitles.csv");
    }
}
