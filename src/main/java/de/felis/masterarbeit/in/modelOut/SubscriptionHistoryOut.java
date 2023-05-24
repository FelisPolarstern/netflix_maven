package de.felis.masterarbeit.in.modelOut;

import java.time.Instant;
import java.time.LocalDate;

public class SubscriptionHistoryOut {
    private final int accountID;
    private final Instant subsciptionOpenedTS;
    private final boolean isFreeTralAtSignup;
    private final Instant subscriptionClosedTs;
    private final String isCustomerInitiatedCancel;
    /*String signupPlanCategory;
    int signupMaxConcurrentStreams;
    String signupMaxStreamingQuality;
    String planChangeOldCategroy;
    int planChangeOldMaxConcurrentStreams;
    String planChangeOldMaxStreamingQuality;
    String planChangeNewCategory;
    int planChangeNewMaxConcurrentStreams;
    String planChangeNewMaxStreamingQuality;*/
    /*TODO Logik die String und ints in die Klasse überführen*/
    SubscriptionDetails signUp;
    SubscriptionDetails planChangeOld;

    SubscriptionDetails planChangeNew;
    private final LocalDate planChangeDate;
    private final String cancellationReason;

    public SubscriptionHistoryOut(int accountID, Instant subsciptionOpenedTS, boolean isFreeTralAtSignup, Instant subscriptionClosedTs,
                                  String isCustomerInitiatedCancel, LocalDate planChangeDate, String cancellationReason) {
        this.accountID = accountID;
        this.subsciptionOpenedTS = subsciptionOpenedTS;
        this.isFreeTralAtSignup = isFreeTralAtSignup;
        this.subscriptionClosedTs = subscriptionClosedTs;
        this.isCustomerInitiatedCancel = isCustomerInitiatedCancel;
        this.planChangeDate = planChangeDate;
        this.cancellationReason = cancellationReason;
    }

    public void setSignUp(SubscriptionDetails signUp) {
        this.signUp = signUp;
    }

    public void setPlanChangeOld(SubscriptionDetails planChangeOld) {
        this.planChangeOld = planChangeOld;
    }

    public void setPlanChangeNew(SubscriptionDetails planChangeNew) {
        this.planChangeNew = planChangeNew;
    }
}
