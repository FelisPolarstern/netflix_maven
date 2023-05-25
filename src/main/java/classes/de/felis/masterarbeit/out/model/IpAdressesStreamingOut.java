package classes.de.felis.masterarbeit.out.model;

import java.time.LocalDateTime;

public class IpAdressesStreamingOut {
    private final int deviceId;
    private final int countryId;
    private final String localizedDeviceDescription;
    private final String ip;
    private final String regionCodeDisplayName;
    private final LocalDateTime ts;

    public IpAdressesStreamingOut(int deviceId, int countryId, String localizedDeviceDescription, String ip, String regionCodeDisplayName, LocalDateTime ts) {
        this.deviceId = deviceId;
        this.countryId = countryId;
        this.localizedDeviceDescription = localizedDeviceDescription;
        this.ip = ip;
        this.regionCodeDisplayName = regionCodeDisplayName;
        this.ts = ts;
    }
}
