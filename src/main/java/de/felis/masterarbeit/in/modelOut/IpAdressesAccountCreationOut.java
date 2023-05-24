package de.felis.masterarbeit.in.modelOut;

import java.time.Instant;

public class IpAdressesAccountCreationOut {
    private final int deviceId;
    private final int countryId;
    private final String localizedDeviceDescriptionId;
    private final String deviceDescriptionId;
    private final String ip;
    private final String regionCodedisplayName;
    private final Instant ts;

    public IpAdressesAccountCreationOut(int deviceId, int countryId, String localizedDeviceDescriptionId, String deviceDescriptionId, String ip, String regionCodedisplayName, Instant ts) {
        this.deviceId = deviceId;
        this.countryId = countryId;
        this.localizedDeviceDescriptionId = localizedDeviceDescriptionId;
        this.deviceDescriptionId = deviceDescriptionId;
        this.ip = ip;
        this.regionCodedisplayName = regionCodedisplayName;
        this.ts = ts;
    }
}
