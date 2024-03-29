package classes.de.felis.masterarbeit.out.model;

public class SubscriptionDetails {
    private final String planCategory;
    private final int maxConcurrentStreams;
    private final String maxStreamingQuality;

    public SubscriptionDetails(String planCategory, int maxConcurrentStreams, String maxStreamingQuality) {
        this.planCategory = planCategory;
        this.maxConcurrentStreams = maxConcurrentStreams;
        this.maxStreamingQuality = maxStreamingQuality;
    }
}
