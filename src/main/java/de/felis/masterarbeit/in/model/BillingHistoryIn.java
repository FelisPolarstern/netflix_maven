package de.felis.masterarbeit.in.model;

import java.time.LocalDate;

public class BillingHistoryIn {
    private final LocalDate transactionDate;
    private final LocalDate servicePeriodStartDate;
    private final LocalDate servicePeriodEndDate;
    private final String description;
    private final String paymentType;
    private final String mopLast4;
    private final LocalDate mopCreationDate;
    private final String MopPmtProcessorDesc;
    private final Float itemPriceAmt;
    private final String currency;
    private final Float taxAmt;
    private final Float grossSaleAmt;
    private final String pmtTxnType;
    private final String pmtStatus;
    private final String finalInvoiceResult;
    private final String country;
    private final LocalDate nextBillingDate;

    public BillingHistoryIn(LocalDate transactionDate, LocalDate servicePeriodStartDate, LocalDate servicePeriodEndDate,
                            String description, String paymentType, String mopLast4, LocalDate mopCreationDate, String mopPmtProcessorDesc,
                            Float itemPriceAmt, String currency, Float taxamt, Float grossSaleAmt, String pmtTxnType,
                            String pmtStatus, String finalInvoiceResult, String country, LocalDate nextBillingDate) {
        this.transactionDate = transactionDate;
        this.servicePeriodStartDate = servicePeriodStartDate;
        this.servicePeriodEndDate = servicePeriodEndDate;
        this.description = description;
        this.paymentType = paymentType;
        this.mopLast4 = mopLast4;
        this.mopCreationDate = mopCreationDate;
        MopPmtProcessorDesc = mopPmtProcessorDesc;
        this.itemPriceAmt = itemPriceAmt;
        this.currency = currency;
        this.taxAmt = taxamt;
        this.grossSaleAmt = grossSaleAmt;
        this.pmtTxnType = pmtTxnType;
        this.pmtStatus = pmtStatus;
        this.finalInvoiceResult = finalInvoiceResult;
        this.country = country;
        this.nextBillingDate = nextBillingDate;
    }
}
