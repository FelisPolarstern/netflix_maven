package de.felis.masterarbeit.in.model;
import de.felis.masterarbeit.in.reader.ImportHelper;

import java.io.IOException;
import java.time.Instant;
import java.util.List;



public class AccountDetailsIn {
    private final String first_name;
    private final String last_name;
    private final String email_address;
    private final String phone_Number;
    private final String country_of_registration;
    private final String country_of_signup;
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
    private boolean extra_member_primary_account_owner;

    public AccountDetailsIn(String first_name, String last_name, String email_address, String phone_Number, String country_of_registration,
                            String country_of_signup, String primary_lang, boolean cookie_disclosure, String membership_status,
                            Instant customer_creation_timeStamp, boolean profile_transfer_setting, boolean has_rejoinded,
                            boolean netflix_updates, boolean now_on_netflix, boolean netflix_offers, boolean netflix_surveys,
                            boolean netflix_kids_and_family, boolean sms_account_related, boolean sms_content_updates_and_special_offers,
                            boolean test_participation, boolean whats_app, boolean marketing_communications_matched_identifiers, boolean extra_member_account) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.email_address = email_address;
        this.phone_Number = phone_Number;
        this.country_of_registration = country_of_registration;
        this.country_of_signup = country_of_signup;
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
    }

    public String getCountry_of_registration(){
        return country_of_registration;
    }
    public String getCountry_of_signup(){
        return country_of_signup;
    }


}


