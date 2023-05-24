package de.felis.masterarbeit.in.modelOut;

import java.time.LocalDateTime;

public class TermsOfUseOut {
    private final int accountID;
    private final int termsOfUseId;
    private final LocalDateTime touAcceptedDate;

    public TermsOfUseOut(int accountID, int termsOfUseId, LocalDateTime touAcceptedDate) {
        this.accountID = accountID;
        this.termsOfUseId = termsOfUseId;
        this.touAcceptedDate = touAcceptedDate;
    }
}
