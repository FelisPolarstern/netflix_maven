package classes.de.felis.masterarbeit.out.mapper;

import classes.de.felis.masterarbeit.out.model.AccountDetailsOut;
import de.felis.masterarbeit.in.model.*;
import de.felis.masterarbeit.in.reader.AccountDetailsReader;

import java.io.IOException;
import java.util.List;

public class MapperMain {
    String path;
    List<AccountDetailsIn> acountDetailsIn;
    List<BillingHistoryIn> billingHistoryIn;
    List<ClickstreamIn> clickstreamIn;
    List<DeviceIn> deviceIn;
    List<GiftSubscriptionsIn> giftSubscriptionsIn;
    List <IndicatedPreferencesIn> indicatedPreferencesIns;
    List <InteractiveTitleIn> interactiveTitleIns;
    List<IpAdressesAccountCreationIn> ipAdressesAccountCreationIns;
    List<IpAdressesLoginIn> ipAdressesLoginIns;
    List<IpAdressesStreamingIn> ipAdressesStreamingIns;
    List<MessagesSentByNetflixIn> messagesSentByNetflixIns;
    List<MyListIn> myListIns;
    List<PlaybackRelatedEventsIn> playbackRelatedEventsIns;
    List<RatingsIn> ratingsIns;
    List<SearchHistoryIn> searchHistoryIns;
    List<SubscriptionHistoryIn> subscriptionHistoryIns;
    List<TermsOfUseIn> termsOfUseIns;
    List<ViewingActivityIn> viewingActivityIns;
    //Todo: Vorgehen, Account und Profil anlegen + IDs, Countries und Titel anlegen, hier schon aus ID ort rauslesen?, bekommt Pfad wandelt Daten um
    public MapperMain(String path) {
        this.path = path;
    }

    public AccountDetailsOut accountDetails() throws IOException {
        List<AccountDetailsIn> accountDetails = AccountDetailsReader.readAccountDetailsList(path + "ACCOUNT/AccountDetails.csv");
        return null;
    }


}
