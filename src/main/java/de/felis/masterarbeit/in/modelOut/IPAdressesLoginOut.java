package de.felis.masterarbeit.in.modelOut;

import java.time.LocalDateTime;

public class IPAdressesLoginOut {
    private final int deviceId;
    private final int countryId;
    private final String regionCode;
    private final String deviceDescription;
    private final String ip;
    private final LocalDateTime ts;

    public IPAdressesLoginOut(int deviceId, int countryId, String regionCode, String deviceDescription, String ip, LocalDateTime ts) {
        this.deviceId = deviceId;
        this.countryId = countryId;
        this.regionCode = regionCode;
        this.deviceDescription = deviceDescription;
        this.ip = ip;
        this.ts = ts;
    }
}
