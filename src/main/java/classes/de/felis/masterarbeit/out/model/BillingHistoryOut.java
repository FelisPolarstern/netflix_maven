package classes.de.felis.masterarbeit.out.model;

import java.time.LocalDate;

public class BillingHistoryOut {
    private final int accountId;
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
    private final int countryId;
    private final LocalDate nextBillingDate;

    public BillingHistoryOut(int accountId, LocalDate transactionDate, LocalDate servicePeriodStartDate,
                             LocalDate servicePeriodEndDate, String description, String paymentType, String mopLast4,
                             LocalDate mopCreationDate, String mopPmtProcessorDesc, Float itemPriceAmt, String currency,
                             Float taxAmt, Float grossSaleAmt, String pmtTxnType, String pmtStatus, String finalInvoiceResult,
                             int countryId, LocalDate nextBillingDate) {
        this.accountId = accountId;
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
        this.taxAmt = taxAmt;
        this.grossSaleAmt = grossSaleAmt;
        this.pmtTxnType = pmtTxnType;
        this.pmtStatus = pmtStatus;
        this.finalInvoiceResult = finalInvoiceResult;
        this.countryId = countryId;
        this.nextBillingDate = nextBillingDate;
    }
}
