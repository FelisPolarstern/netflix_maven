package de.felis.masterarbeit.in.model;

import de.felis.masterarbeit.in.reader.*;

import java.io.IOException;
import java.util.List;

public class UserDataIn {
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

    public UserDataIn(String path) throws IOException {

        //Todo Out Klassen schreiben, danach eine Mapper Klasse, die die Daten von einem zum anderen Überträgt, Logik des Übertragens aus den Out Klasen raus, Die Klassen händelt der Mapper
        this.acountDetailsIn = AccountDetailsReader.readAccountDetailsList(path + "ACCOUNT/AccountDetails.csv");;
        this.billingHistoryIn = BillingHistoryReader.readIpAdressesStreaming(path + "PAYMENT_AND_BILLING/BillingHistory.csv");
        this.clickstreamIn = ClickstreamReader.readClickstream(path + "CLICKSTREAM/Clickstream.csv");
        this.deviceIn = DeviceReader.readDeviceList (path + "DEVICES/Devices.csv");
        this.giftSubscriptionsIn = GiftSubscriptionReader.readgiftSubscription (path + "DEVICES/Devices.csv");;
        this.indicatedPreferencesIns = IndicatedPreferencesReader.readSubscriptionHistoryLis(path + "CONTENT_INTERACTION/IndicatedPreferences.csv");
        this.interactiveTitleIns = InteractiveTitleReader.readInteractiveTitle(path + "CONTENT_INTERACTION/InteractiveTitles.csv");
        this.ipAdressesAccountCreationIns = IpAdressesAccountCreationReader.readIpAdressesAccountCreation(path + "IP_ADDRESSES/IpAddressesLogin.csv");
        this.ipAdressesLoginIns = IpAdressesLoginReader.readIpAdressesLogin(path + "IP_ADDRESSES/IpAddressesLogin.csv");
        this.ipAdressesStreamingIns = IpAdressesStreamingReader.readIpAdressesStreaming(path + "IP_ADDRESSES/IpAddressesLogin.csv");
        this.messagesSentByNetflixIns = MessagesSentByNetflixReader.readIpAdressesStreaming(path + "MESSAGES/MessagesSentByNetflix.csv");
        this.myListIns = MyListReader.readmyList(path + "CONTENT_INTERACTION/MyList.csv");
        this.playbackRelatedEventsIns = PlaybackRelatedEventsReader.readPlaybackRelatedEvents(path + "CONTENT_INTERACTION/PlaybackRelatedEvents.csv");
        this.ratingsIns = RatingsReader.readRatings(path + "CONTENT_INTERACTION/Ratings.csv");
        this.searchHistoryIns = SearchHistoryReader.readSearchHistory(path + "CONTENT_INTERACTION/SearchHistory.csv");
        this.subscriptionHistoryIns = SubstriptionHistoryReader.readSubscriptionHistoryLis(path + "ACCOUNT/SubscriptionHistory.csv");
        this.termsOfUseIns = TermsOfUseReader.readSubscriptionDetails(path + "/ACCOUNT/TermsOfUse.csv");
        this.viewingActivityIns = ViewingActivityReader.readSearchHistory(path + "CONTENT_INTERACTION/ViewingActivity.csv");
    }

    public List<AccountDetailsIn> getAcountDetailsIn() {
        return acountDetailsIn;
    }

    public List<BillingHistoryIn> getBillingHistoryIn() {
        return billingHistoryIn;
    }

    public List<ClickstreamIn> getClickstreamIn() {
        return clickstreamIn;
    }

    public List<DeviceIn> getDeviceIn() {
        return deviceIn;
    }

    public List<GiftSubscriptionsIn> getGiftSubscriptionsIn() {
        return giftSubscriptionsIn;
    }

    public List<IndicatedPreferencesIn> getIndicatedPreferencesIns() {
        return indicatedPreferencesIns;
    }

    public List<InteractiveTitleIn> getInteractiveTitleIns() {
        return interactiveTitleIns;
    }

    public List<IpAdressesAccountCreationIn> getIpAdressesAccountCreationIns() {
        return ipAdressesAccountCreationIns;
    }

    public List<IpAdressesLoginIn> getIpAdressesLoginIns() {
        return ipAdressesLoginIns;
    }

    public List<IpAdressesStreamingIn> getIpAdressesStreamingIns() {
        return ipAdressesStreamingIns;
    }

    public List<MessagesSentByNetflixIn> getMessagesSentByNetflixIns() {
        return messagesSentByNetflixIns;
    }

    public List<MyListIn> getMyListIns() {
        return myListIns;
    }

    public List<PlaybackRelatedEventsIn> getPlaybackRelatedEventsIns() {
        return playbackRelatedEventsIns;
    }

    public List<RatingsIn> getRatingsIns() {
        return ratingsIns;
    }

    public List<SearchHistoryIn> getSearchHistoryIns() {
        return searchHistoryIns;
    }

    public List<SubscriptionHistoryIn> getSubscriptionHistoryIns() {
        return subscriptionHistoryIns;
    }

    public List<TermsOfUseIn> getTermsOfUseIns() {
        return termsOfUseIns;
    }

    public List<ViewingActivityIn> getViewingActivityIns() {
        return viewingActivityIns;
    }
}
