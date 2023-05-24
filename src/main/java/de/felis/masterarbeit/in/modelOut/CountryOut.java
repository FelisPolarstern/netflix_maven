package de.felis.masterarbeit.in.modelOut;

public class CountryOut {
    private final int countryId;
    private final String countryCode;
    private final String CountryName;

    public CountryOut(int countryId, String countryCode, String countryName) {
        this.countryId = countryId;
        this.countryCode = countryCode;
        CountryName = countryName;
    }
}
