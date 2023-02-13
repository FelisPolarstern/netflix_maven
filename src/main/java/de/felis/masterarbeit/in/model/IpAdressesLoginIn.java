package de.felis.masterarbeit.in.model;

import java.time.Instant;
import java.time.LocalDateTime;

public class IpAdressesLoginIn {
    private final String esn;
    private final String country;
    private final String regionCode;
    private final String deviceDescription;
    private final String ip;
    private final LocalDateTime ts;

    public IpAdressesLoginIn(String esn, String country, String regionCode, String deviceDescription, String ip, LocalDateTime ts) {
        this.esn = esn;
        this.country = country;
        this.regionCode = regionCode;
        this.deviceDescription = deviceDescription;
        this.ip = ip;
        this.ts = ts;
    }
}
