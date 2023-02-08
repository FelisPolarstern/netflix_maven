import de.felis.masterarbeit.in.model.AccountDetailsIn;
import de.felis.masterarbeit.in.model.DeviceIn;
import de.felis.masterarbeit.in.model.SubscriptionHistoryIn;
import de.felis.masterarbeit.in.reader.AccountDetailsReader;
import de.felis.masterarbeit.in.reader.DeviceReader;
import de.felis.masterarbeit.in.reader.SubstriptionHistoryReader;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main (String[] args) throws IOException {
        //System.out.println(Locale.forLanguageTag("de-de").getDisplayCountry());
        //AccountDetailsImport test = new AccountDetailsImport("../Daten/Anonymisiert/netflix-report/ACCOUNT/AccountDetails.csv");
       // DevicesImport testDevices = new DevicesImport("../Daten/Anonymisiert/netflix-report/DEVICES/Devices.csv");
        //List<AccountDetailsIn> testAccountDetails = AccountDetailsReader.readAccountDetailsList("../Daten/Anonymisiert/netflix-report/ACCOUNT/AccountDetails.csv");
        //List<DeviceIn> testDevices = DeviceReader.readDeviceList ("../Daten/Anonymisiert/netflix-report/DEVICES/Devices.csv");
        List<SubscriptionHistoryIn> testSubscriptionHistory = SubstriptionHistoryReader.readSubscriptionHistoryLis("../Daten/Anonymisiert/netflix-report/ACCOUNT/SubscriptionHistory.csv");
    }
}
