package de.felis.masterarbeit.in.model;

import java.time.Instant;

public class IpAdressesAccountCreationIn {
    private final String esn;
    private final String country;
    private final String localizedDeviceDescription;
    private final String deviceDescription;
    private final String ip;
    private final String regionCodedisplayName;
    private final Instant ts;

    public IpAdressesAccountCreationIn(String esn, String country, String localizedDeviceDescription,
                                       String deviceDescription, String ip, String regionCodedisplayName,
                                       Instant ts) {
        this.esn = esn;
        this.country = country;
        this.localizedDeviceDescription = localizedDeviceDescription;
        this.deviceDescription = deviceDescription;
        this.ip = ip;
        this.regionCodedisplayName = regionCodedisplayName;
        this.ts = ts;
    }
}
