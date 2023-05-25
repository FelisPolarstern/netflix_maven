package de.felis.masterarbeit.in.model;

public class CountryIn {
    private final int countryId;
    private final String countryCode;
    private final String CountryDescription;

    public CountryIn(int countryId, String countryCode, String countryDescription) {
        this.countryId = countryId;
        this.countryCode = countryCode;
        CountryDescription = countryDescription;
    }
}
