public class TravelRequest {
    private double distance;
    private int passengers;
    private String serviceClass; // "ECONOMY", "BUSINESS"
    private boolean childDiscount;
    private boolean seniorDiscount;
    private boolean baggage;

    public TravelRequest(double distance, int passengers, String serviceClass,
                         boolean childDiscount, boolean seniorDiscount, boolean baggage) {
        this.distance = distance;
        this.passengers = passengers;
        this.serviceClass = serviceClass;
        this.childDiscount = childDiscount;
        this.seniorDiscount = seniorDiscount;
        this.baggage = baggage;
    }

    public double getDistance() { return distance; }
    public int getPassengers() { return passengers; }
    public String getServiceClass() { return serviceClass; }
    public boolean hasChildDiscount() { return childDiscount; }
    public boolean hasSeniorDiscount() { return seniorDiscount; }
    public boolean hasBaggage() { return baggage; }
}
