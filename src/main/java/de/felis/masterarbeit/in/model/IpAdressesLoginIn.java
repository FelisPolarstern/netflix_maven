package de.felis.masterarbeit.in.model;

import java.time.Instant;

public class IpAdressesLoginIn {
    private final String esn;
    private final String country;
    private final String regionCode;
    private final String ip;
    private final Instant ts;

    public IpAdressesLoginIn(String esn, String country, String regionCode, String ip, Instant ts) {
        this.esn = esn;
        this.country = country;
        this.regionCode = regionCode;
        this.ip = ip;
        this.ts = ts;
    }
}
