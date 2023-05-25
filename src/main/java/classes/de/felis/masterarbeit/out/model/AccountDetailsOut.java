package classes.de.felis.masterarbeit.out.model;

import java.time.Instant;

public class AccountDetailsOut {
   private int accountID;
    private final String email_address;
    private final String phone_Number;
    private int countryOfRegistrationID;
    private int countryOfSignup;
    private final String primary_lang;
    private final boolean cookie_disclosure;
    private final String membership_status;
    private final Instant customer_creation_timeStamp;
    private final boolean profile_transfer_setting;
    private final boolean has_rejoinded;
    private final boolean netflix_updates;
    private final boolean now_on_netflix;
    private final boolean netflix_offers;
    private final boolean netflix_surveys;
    private final boolean netflix_kids_and_family;
    private final boolean sms_account_related;
    private final boolean sms_content_updates_and_special_offers;
    private final boolean test_participation;
    private final boolean whats_app;
    private final boolean marketing_communications_matched_identifiers;
    private final boolean extra_member_account;
    private final Boolean extra_member_primary_account_owner;
    //TODO wie adde ich das zu der Liste an Länder?


    public AccountDetailsOut(String email_address, String phone_Number,
                             String primary_lang, boolean cookie_disclosure, String membership_status, Instant customer_creation_timeStamp, boolean profile_transfer_setting,
                             boolean has_rejoinded, boolean netflix_updates, boolean now_on_netflix, boolean netflix_offers, boolean netflix_surveys,
                             boolean netflix_kids_and_family, boolean sms_account_related, boolean sms_content_updates_and_special_offers, boolean test_participation,
                             boolean whats_app, boolean marketing_communications_matched_identifiers, boolean extra_member_account, Boolean extraMemberPrimaryAccountOwner) {
        this.email_address = email_address;
        this.phone_Number = phone_Number;
        this.primary_lang = primary_lang;
        this.cookie_disclosure = cookie_disclosure;
        this.membership_status = membership_status;
        this.customer_creation_timeStamp = customer_creation_timeStamp;
        this.profile_transfer_setting = profile_transfer_setting;
        this.has_rejoinded = has_rejoinded;
        this.netflix_updates = netflix_updates;
        this.now_on_netflix = now_on_netflix;
        this.netflix_offers = netflix_offers;
        this.netflix_surveys = netflix_surveys;
        this.netflix_kids_and_family = netflix_kids_and_family;
        this.sms_account_related = sms_account_related;
        this.sms_content_updates_and_special_offers = sms_content_updates_and_special_offers;
        this.test_participation = test_participation;
        this.whats_app = whats_app;
        this.marketing_communications_matched_identifiers = marketing_communications_matched_identifiers;
        this.extra_member_account = extra_member_account;
        this.extra_member_primary_account_owner = extraMemberPrimaryAccountOwner;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public void setCountryOfRegistrationID(int countryOfRegistrationID) {
        this.countryOfRegistrationID = countryOfRegistrationID;
    }

    public void setCountryOfSignup(int countryOfSignup) {
        this.countryOfSignup = countryOfSignup;
    }

    public String getEmail_address() {
        return email_address;
    }

    public String getPhone_Number() {
        return phone_Number;
    }

    public String getPrimary_lang() {
        return primary_lang;
    }

    public boolean isCookie_disclosure() {
        return cookie_disclosure;
    }

    public String getMembership_status() {
        return membership_status;
    }

    public Instant getCustomer_creation_timeStamp() {
        return customer_creation_timeStamp;
    }

    public boolean isProfile_transfer_setting() {
        return profile_transfer_setting;
    }

    public boolean isHas_rejoinded() {
        return has_rejoinded;
    }

    public boolean isNetflix_updates() {
        return netflix_updates;
    }

    public boolean isNow_on_netflix() {
        return now_on_netflix;
    }

    public boolean isNetflix_offers() {
        return netflix_offers;
    }

    public boolean isNetflix_surveys() {
        return netflix_surveys;
    }

    public boolean isNetflix_kids_and_family() {
        return netflix_kids_and_family;
    }

    public boolean isSms_account_related() {
        return sms_account_related;
    }

    public boolean isSms_content_updates_and_special_offers() {
        return sms_content_updates_and_special_offers;
    }

    public boolean isTest_participation() {
        return test_participation;
    }

    public boolean isWhats_app() {
        return whats_app;
    }

    public boolean isMarketing_communications_matched_identifiers() {
        return marketing_communications_matched_identifiers;
    }

    public boolean isExtra_member_account() {
        return extra_member_account;
    }

    public boolean isExtra_member_primary_account_owner() {
        return extra_member_primary_account_owner;
    }


}
