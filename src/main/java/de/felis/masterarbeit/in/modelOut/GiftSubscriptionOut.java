package de.felis.masterarbeit.in.modelOut;

import java.time.Instant;
import java.time.LocalDate;

public class GiftSubscriptionOut {
    private final int accountID;
    private final LocalDate expirationDate;
    private final String offerDescription;
    private final Instant redemtionDate;
    private final Instant purchaseDate;
    private final int purchaseCountryId;
    private final Float purchasePrice;
    private final Float purchasedDiscounted;
    private final String purchasedBy;
    private final String customizationMessage;

    public GiftSubscriptionOut(int accountID, LocalDate expirationDate, String offerDescription, Instant redemtionDate,
                               Instant purchaseDate, int purchaseCountryId, Float purchasePrice, Float purchasedDiscounted,
                               String purchasedBy, String customizationMessage) {
        this.accountID = accountID;
        this.expirationDate = expirationDate;
        this.offerDescription = offerDescription;
        this.redemtionDate = redemtionDate;
        this.purchaseDate = purchaseDate;
        this.purchaseCountryId = purchaseCountryId;
        this.purchasePrice = purchasePrice;
        this.purchasedDiscounted = purchasedDiscounted;
        this.purchasedBy = purchasedBy;
        this.customizationMessage = customizationMessage;
    }
}
