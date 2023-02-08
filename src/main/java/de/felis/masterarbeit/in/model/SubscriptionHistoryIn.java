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
}
