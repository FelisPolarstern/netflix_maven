import de.felis.masterarbeit.in.model.*;
import de.felis.masterarbeit.in.reader.*;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main (String[] args) throws IOException {
        /* Klassentests */
        String pathMacBook = "/Users/nadjajust/Documents/Uni/Master/Masterarbeit/netflix-report/";
        String pathMacMini = "../Daten/Anonymisiert/netflix-report/";

        List<AccountDetailsIn> testAccountDetails = AccountDetailsReader.readAccountDetailsList(pathMacMini + "ACCOUNT/AccountDetails.csv");
        List<BillingHistoryIn> testBillingHistory = BillingHistoryReader.readIpAdressesStreaming(pathMacMini + "PAYMENT_AND_BILLING/BillingHistory.csv");
        List<ClickstreamIn> testclickstream= ClickstreamReader.readClickstream(pathMacMini + "CLICKSTREAM/Clickstream.csv");
        List<DeviceIn> testDevices = DeviceReader.readDeviceList (pathMacMini + "DEVICES/Devices.csv");
        List<IndicatedPreferencesIn> indicatedPreferencesTest = IndicatedPreferencesReader.readSubscriptionHistoryLis(pathMacMini + "CONTENT_INTERACTION/IndicatedPreferences.csv");
        List<InteractiveTitleIn> testInteractiveTitle = InteractiveTitleReader.readInteractiveTitle(pathMacMini + "CONTENT_INTERACTION/InteractiveTitles.csv");
        List<IpAdressesLoginIn> testIpAdressesLogin = IpAdressesLoginReader.readIpAdressesLogin(pathMacMini + "IP_ADDRESSES/IpAddressesLogin.csv");
        List<IpAdressesStreamingIn> testIpAdressesStreaming = IpAdressesStreamingReader.readIpAdressesStreaming(pathMacMini + "IP_ADDRESSES/IpAddressesLogin.csv");
        List<MessagesSentByNetflixIn> testMessagesSentByNetflix = MessagesSentByNetflixReader.readIpAdressesStreaming(pathMacMini + "MESSAGES/MessagesSentByNetflix.csv");
        List<MyListIn> myListTest = MyListReader.readmyList(pathMacMini + "CONTENT_INTERACTION/MyList.csv");
        List<PlaybackRelatedEventsIn> testPlaybackRelatedEvents = PlaybackRelatedEventsReader.readPlaybackRelatedEvents(pathMacMini + "CONTENT_INTERACTION/PlaybackRelatedEvents.csv");
        List<RatingsIn> testRatings = RatingsReader.readRatings(pathMacMini + "CONTENT_INTERACTION/Ratings.csv");
        List <SearchHistoryIn> testSearchhistory = SearchHistoryReader.readSearchHistory(pathMacMini + "CONTENT_INTERACTION/SearchHistory.csv");
        List<SubscriptionHistoryIn> testSubscriptionHistory = SubstriptionHistoryReader.readSubscriptionHistoryLis(pathMacMini + "ACCOUNT/SubscriptionHistory.csv");
        List <TermsOfUseIn> termsofUseTest = TermsOfUseReader.readSubscriptionDetails(pathMacMini + "/ACCOUNT/TermsOfUse.csv");
        List <ViewingActivityIn> testVieweingActivity = ViewingActivityReader.readSearchHistory(pathMacMini + "CONTENT_INTERACTION/ViewingActivity.csv");
        List<CountryIn> testCountryIn = CountryReader.readCountryIn("../Daten/Countries.csv");



    }
}
