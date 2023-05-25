package classes.de.felis.masterarbeit.out.model;

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
