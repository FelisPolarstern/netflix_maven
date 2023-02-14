package de.felis.masterarbeit.in.model;

import java.time.Instant;
import java.time.LocalDate;

public class GiftSubscriptionsIn {
    private final LocalDate expirationDate;
    private final String offerDescription;
    private final Instant redemtionDate;
    private final Instant purchaseDate;
    private final String purchaseCountryCode;
    private final Float purchasePrice;
    private final Float purchasedDiscounted;
    private final String purchasedBy;
    private final String customizationMessage;

    public GiftSubscriptionsIn(LocalDate expirationDate, String offerDescription, Instant redemtionDate, Instant purchaseDate, String purchaseCountryCode,
                               Float purchasePrice, Float purchasedDiscounted, String purchasedBy, String customizationMessage) {
        this.expirationDate = expirationDate;
        this.offerDescription = offerDescription;
        this.redemtionDate = redemtionDate;
        this.purchaseDate = purchaseDate;
        this.purchaseCountryCode = purchaseCountryCode;
        this.purchasePrice = purchasePrice;
        this.purchasedDiscounted = purchasedDiscounted;
        this.purchasedBy = purchasedBy;
        this.customizationMessage = customizationMessage;
    }
}
