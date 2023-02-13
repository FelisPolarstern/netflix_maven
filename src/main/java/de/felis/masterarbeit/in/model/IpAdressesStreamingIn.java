package de.felis.masterarbeit.in.model;

import java.time.Instant;

public class IpAdressesStreamingIn {
    private final String esn;
    private final String country;
    private final String localizedDeviceDescription;
    private final String ip;
    private final String regionCodeDisplayName;
    private final Instant ts;

    public IpAdressesStreamingIn(String esn, String country, String localizedDeviceDescription, String ip,
                                 String regionCodeDisplayName, Instant ts) {
        this.esn = esn;
        this.country = country;
        this.localizedDeviceDescription = localizedDeviceDescription;
        this.ip = ip;
        this.regionCodeDisplayName = regionCodeDisplayName;
        this.ts = ts;
    }
}
