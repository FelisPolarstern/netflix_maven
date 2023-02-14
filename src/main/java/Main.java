import de.felis.masterarbeit.in.model.*;
import de.felis.masterarbeit.in.reader.*;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main (String[] args) throws IOException {
        /* Klassentests */
        String pathMacBook = "/Users/nadjajust/Documents/Uni/Master/Masterarbeit/netflix-report/";
        String pathMacMini = "../Daten/Anonymisiert/netflix-report/";

        /*List<AccountDetailsIn> testAccountDetails = AccountDetailsReader.readAccountDetailsList(pathMacBook + "ACCOUNT/AccountDetails.csv");
        List<BillingHistoryIn> testBillingHistory = BillingHistoryReader.readIpAdressesStreaming(pathMacBook + "PAYMENT_AND_BILLING/BillingHistory.csv");
        List<ClickstreamIn> testclickstream= ClickstreamReader.readClickstream(pathMacBook + "CLICKSTREAM/Clickstream.csv");
        List<DeviceIn> testDevices = DeviceReader.readDeviceList (pathMacBook + "DEVICES/Devices.csv");
        List<IndicatedPreferencesIn> indicatedPreferencesTest = IndicatedPreferencesReader.readSubscriptionHistoryLis(pathMacBook + "CONTENT_INTERACTION/IndicatedPreferences.csv");
        List<InteractiveTitleIn> testInteractiveTitle = InteractiveTitleReader.readInteractiveTitle(pathMacBook + "CONTENT_INTERACTION/InteractiveTitles.csv");
        List<IpAdressesLoginIn> testIpAdressesLogin = IpAdressesLoginReader.readIpAdressesLogin(pathMacBook + "IP_ADDRESSES/IpAddressesLogin.csv");
        List<IpAdressesStreamingIn> testIpAdressesStreaming = IpAdressesStreamingReader.readIpAdressesStreaming(pathMacBook + "IP_ADDRESSES/IpAddressesLogin.csv");
        List<MessagesSentByNetflixIn> testMessagesSentByNetflix = MessagesSentByNetflixReader.readIpAdressesStreaming(pathMacBook + "MESSAGES/MessagesSentByNetflix.csv");
        List<MyListIn> myListTest = MyListReader.readmyList(pathMacBook + "CONTENT_INTERACTION/MyList.csv");
        List<PlaybackRelatedEventsIn> testPlaybackRelatedEvents = PlaybackRelatedEventsReader.readPlaybackRelatedEvents(pathMacBook + "CONTENT_INTERACTION/PlaybackRelatedEvents.csv");
        List<RatingsIn> testRatings = RatingsReader.readRatings(pathMacBook + "CONTENT_INTERACTION/Ratings.csv");
        List <SearchHistoryIn> testSearchhistory = SearchHistoryReader.readSearchHistory(pathMacBook + "CONTENT_INTERACTION/SearchHistory.csv");
        List<SubscriptionHistoryIn> testSubscriptionHistory = SubstriptionHistoryReader.readSubscriptionHistoryLis(pathMacBook + "ACCOUNT/SubscriptionHistory.csv");
        List <TermsOfUseIn> termsofUseTest = TermsOfUseReader.readSubscriptionDetails(pathMacBook + "/ACCOUNT/TermsOfUse.csv");*/
        List <ViewingActivityIn> testVieweingActivity = ViewingActivityReader.readSearchHistory(pathMacBook + "CONTENT_INTERACTION/ViewingActivity.csv");




    }
}
