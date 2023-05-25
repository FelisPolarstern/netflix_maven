package de.felis.masterarbeit.in.model;

import java.time.Instant;


public class AccountDetailsIn {
    private final String firstName;
    private final String lastName;
    private final String emailAddress;
    private final String phoneNumber;
    private final String countryOfRegistration;
    private final String countryOfSignup;
    private final String primary_lang;
    private final boolean cookieDisclosure;
    private final String membershipStatus;
    private final Instant customerCreationTimeStamp;
    private final boolean profileTransferSetting;
    private final boolean hasRejoinded;
    private final boolean netflixUpdates;
    private final boolean nowOnNetflix;
    private final boolean netflixOffers;
    private final boolean netflixSurveys;
    private final boolean netflixKidsAndFamily;
    private final boolean smsAccountRelated;
    private final boolean smsContentUpdatesAndSpecialOffers;
    private final boolean testParticipation;
    private final boolean whatsapp;
    private final boolean marketingCommunicationsMatchedIdentifiers;
    private final boolean extraMemberAccount;
    private Boolean extraMemberPrimaryAccountOwner;

    public AccountDetailsIn(String first_name, String lastName, String emailAddress, String phone_Number, String country_of_registration,
                            String country_of_signup, String primary_lang, boolean cookie_disclosure, String membership_status,
                            Instant customer_creation_timeStamp, boolean profile_transfer_setting, boolean has_rejoinded,
                            boolean netflix_updates, boolean now_on_netflix, boolean netflix_offers, boolean netflix_surveys,
                            boolean netflix_kids_and_family, boolean sms_account_related, boolean sms_content_updates_and_special_offers,
                            boolean test_participation, boolean whats_app, boolean marketing_communications_matched_identifiers, boolean extra_member_account,
                            Boolean extraMemberPrimaryAccountOwner) {
        this.firstName = first_name;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.phoneNumber = phone_Number;
        this.countryOfRegistration = country_of_registration;
        this.countryOfSignup = country_of_signup;
        this.primary_lang = primary_lang;
        this.cookieDisclosure = cookie_disclosure;
        this.membershipStatus = membership_status;
        this.customerCreationTimeStamp = customer_creation_timeStamp;
        this.profileTransferSetting = profile_transfer_setting;
        this.hasRejoinded = has_rejoinded;
        this.netflixUpdates = netflix_updates;
        this.nowOnNetflix = now_on_netflix;
        this.netflixOffers = netflix_offers;
        this.netflixSurveys = netflix_surveys;
        this.netflixKidsAndFamily = netflix_kids_and_family;
        this.smsAccountRelated = sms_account_related;
        this.smsContentUpdatesAndSpecialOffers = sms_content_updates_and_special_offers;
        this.testParticipation = test_participation;
        this.whatsapp = whats_app;
        this.marketingCommunicationsMatchedIdentifiers = marketing_communications_matched_identifiers;
        this.extraMemberAccount = extra_member_account;
        this.extraMemberPrimaryAccountOwner = extraMemberPrimaryAccountOwner;
    }

    public String getCountryOfRegistration(){
        return countryOfRegistration;
    }
    public String getCountryOfSignup(){
        return countryOfSignup;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getPrimary_lang() {
        return primary_lang;
    }

    public boolean isCookieDisclosure() {
        return cookieDisclosure;
    }

    public String getMembershipStatus() {
        return membershipStatus;
    }

    public Instant getCustomerCreationTimeStamp() {
        return customerCreationTimeStamp;
    }

    public boolean isProfileTransferSetting() {
        return profileTransferSetting;
    }

    public boolean isHasRejoinded() {
        return hasRejoinded;
    }

    public boolean isNetflixUpdates() {
        return netflixUpdates;
    }

    public boolean isNowOnNetflix() {
        return nowOnNetflix;
    }

    public boolean isNetflixOffers() {
        return netflixOffers;
    }

    public boolean isNetflixSurveys() {
        return netflixSurveys;
    }

    public boolean isNetflixKidsAndFamily() {
        return netflixKidsAndFamily;
    }

    public boolean isSmsAccountRelated() {
        return smsAccountRelated;
    }

    public boolean isSmsContentUpdatesAndSpecialOffers() {
        return smsContentUpdatesAndSpecialOffers;
    }

    public boolean isTestParticipation() {
        return testParticipation;
    }

    public boolean isWhatsapp() {
        return whatsapp;
    }

    public boolean isMarketingCommunicationsMatchedIdentifiers() {
        return marketingCommunicationsMatchedIdentifiers;
    }

    public boolean isExtraMemberAccount() {
        return extraMemberAccount;
    }

    public boolean isExtraMemberPrimaryAccountOwner() {
        return extraMemberPrimaryAccountOwner;
    }
}


