package classes.Database_Import;
import java.io.IOException;
import java.time.Instant;
import java.util.List;



public class AccountDetailsImport {
    private String first_name;
    private String last_name;
    private String email_address;
    private String phone_Number;
    private String country_of_registration;
    private String country_of_signup;
    private String primary_lang;
    private boolean cookie_disclosure;
    private String membership_status;
    private Instant customer_creation_timeStamp;
    private boolean profile_transfer_setting;
    private boolean has_rejoinded;
    private boolean netflix_updates;
    private boolean now_on_netflix;
    private boolean netflix_offers;
    private boolean netflix_surveys;
    private boolean netflix_kids_and_family;
    private boolean sms_account_related;
    private boolean sms_content_updates_and_special_offers;
    private boolean test_participation;
    private boolean whats_app;
    private boolean marketing_communications_matched_identifiers;
    private boolean extra_member_account;
    private boolean extra_member_primary_account_owner;

    public AccountDetailsImport(String path) throws IOException {
        List<String> AccountDetailsImport = ImporterHelperClass.ImportHelper(path, 24);
        this.first_name = TypeTransformationHelper.toString(AccountDetailsImport.get(0));
        this.last_name =  TypeTransformationHelper.toString(AccountDetailsImport.get(1));
        this.email_address =  TypeTransformationHelper.toString(AccountDetailsImport.get(2));
        this.phone_Number =  TypeTransformationHelper.toString(AccountDetailsImport.get(3));
        this.country_of_registration =  TypeTransformationHelper.toString(AccountDetailsImport.get(4));
        this.country_of_signup =  TypeTransformationHelper.toString(AccountDetailsImport.get(5));
        this.primary_lang =  TypeTransformationHelper.toString(AccountDetailsImport.get(6));
        this.cookie_disclosure = TypeTransformationHelper.toBoolean(AccountDetailsImport.get(7));
        this.membership_status = TypeTransformationHelper.toString(AccountDetailsImport.get(8));
        this.customer_creation_timeStamp = TypeTransformationHelper.toInstant(AccountDetailsImport.get(9));
        this.profile_transfer_setting = TypeTransformationHelper.toBoolean(AccountDetailsImport.get(10));
        this.has_rejoinded = TypeTransformationHelper.toBoolean(AccountDetailsImport.get(11));
        this.netflix_updates = TypeTransformationHelper.toBoolean(AccountDetailsImport.get(12));
        this.now_on_netflix = TypeTransformationHelper.toBoolean(AccountDetailsImport.get(13));
        this.netflix_offers = TypeTransformationHelper.toBoolean(AccountDetailsImport.get(14));
        this.netflix_surveys = TypeTransformationHelper.toBoolean(AccountDetailsImport.get(15));
        this.netflix_kids_and_family = TypeTransformationHelper.toBoolean(AccountDetailsImport.get(16));
        this.sms_account_related = TypeTransformationHelper.toBoolean(AccountDetailsImport.get(17));
        this.sms_content_updates_and_special_offers = TypeTransformationHelper.toBoolean(AccountDetailsImport.get(18));
        this.test_participation = TypeTransformationHelper.toBoolean(AccountDetailsImport.get(19));
        this.whats_app = TypeTransformationHelper.toBoolean(AccountDetailsImport.get(20));
        this.marketing_communications_matched_identifiers = TypeTransformationHelper.toBoolean(AccountDetailsImport.get(21));
        this.extra_member_account = TypeTransformationHelper.toBoolean(AccountDetailsImport.get(22));
        this.extra_member_primary_account_owner = TypeTransformationHelper.toBoolean(AccountDetailsImport.get(23));
    }
    public String getCountry_of_registration(){
        return country_of_registration;
    }
    public String getCountry_of_signup(){
        return country_of_signup;
    }


}


