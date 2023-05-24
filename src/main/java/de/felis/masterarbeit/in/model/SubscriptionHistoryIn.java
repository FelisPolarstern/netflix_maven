package de.felis.masterarbeit.in.model;

import java.time.Instant;
import java.time.LocalDate;

public class SubscriptionHistoryIn {

    Instant subsciptionOpenedTS;
    boolean isFreeTralAtSignup;
    Instant subscriptionClosedTs;
    String isCustomerInitiatedCancel;
    String signupPlanCategory;
    int signupMaxConcurrentStreams;
    String signupMaxStreamingQuality;
    LocalDate planChangeDate;
    String planChangeOldCategroy;
    int planChangeOldMaxConcurrentStreams;
    String planChangeOldMaxStreamingQuality;
    String planChangeNewCategory;
    int planChangeNewMaxConcurrentStreams;
    String planChangeNewMaxStreamingQuality;
    String cancellationReason;
    //ToDO das ist ne Liste
    public SubscriptionHistoryIn(Instant subsciptionOpenedTS, boolean isFreeTralAtSignup, Instant subscriptionClosedTs,
                                 String isCustomerInitiatedCancel, String signupPlanCategory, int signupMaxConcurrentStreams,
                                 String signupMaxStreamingQuality, LocalDate planChangeDate, String planChangeOldCategroy, int planChangeOldMaxConcurrentStreams,
                                 String planChangeOldMaxStreamingQuality, String planChangeNewCategory, int planChangeNewMaxConcurrentStreams,
                                 String planChangeNewMaxStreamingQuality, String cancellationReason) {
        this.subsciptionOpenedTS = subsciptionOpenedTS;
        this.isFreeTralAtSignup = isFreeTralAtSignup;
        this.subscriptionClosedTs = subscriptionClosedTs;
        this.isCustomerInitiatedCancel = isCustomerInitiatedCancel;
        this.signupPlanCategory = signupPlanCategory;
        this.signupMaxConcurrentStreams = signupMaxConcurrentStreams;
        this.signupMaxStreamingQuality = signupMaxStreamingQuality;
        this.planChangeDate = planChangeDate;
        this.planChangeOldCategroy = planChangeOldCategroy;
        this.planChangeOldMaxConcurrentStreams = planChangeOldMaxConcurrentStreams;
        this.planChangeOldMaxStreamingQuality = planChangeOldMaxStreamingQuality;
        this.planChangeNewCategory = planChangeNewCategory;
        this.planChangeNewMaxConcurrentStreams = planChangeNewMaxConcurrentStreams;
        this.planChangeNewMaxStreamingQuality = planChangeNewMaxStreamingQuality;
        this.cancellationReason = cancellationReason;
    }

    public Instant getSubsciptionOpenedTS() {
        return subsciptionOpenedTS;
    }

    public boolean isFreeTralAtSignup() {
        return isFreeTralAtSignup;
    }

    public Instant getSubscriptionClosedTs() {
        return subscriptionClosedTs;
    }

    public String getIsCustomerInitiatedCancel() {
        return isCustomerInitiatedCancel;
    }

    public String getSignupPlanCategory() {
        return signupPlanCategory;
    }

    public int getSignupMaxConcurrentStreams() {
        return signupMaxConcurrentStreams;
    }

    public String getSignupMaxStreamingQuality() {
        return signupMaxStreamingQuality;
    }

    public LocalDate getPlanChangeDate() {
        return planChangeDate;
    }

    public String getPlanChangeOldCategroy() {
        return planChangeOldCategroy;
    }

    public int getPlanChangeOldMaxConcurrentStreams() {
        return planChangeOldMaxConcurrentStreams;
    }

    public String getPlanChangeOldMaxStreamingQuality() {
        return planChangeOldMaxStreamingQuality;
    }

    public String getPlanChangeNewCategory() {
        return planChangeNewCategory;
    }

    public int getPlanChangeNewMaxConcurrentStreams() {
        return planChangeNewMaxConcurrentStreams;
    }

    public String getPlanChangeNewMaxStreamingQuality() {
        return planChangeNewMaxStreamingQuality;
    }

    public String getCancellationReason() {
        return cancellationReason;
    }
}
