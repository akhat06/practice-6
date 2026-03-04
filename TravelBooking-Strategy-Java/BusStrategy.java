public class BusStrategy implements ICostCalculationStrategy {

    @Override
    public double calculateCost(TravelRequest request) {
        double baseRate = 0.2;
        double cost = request.getDistance() * baseRate;

        return applyDiscounts(cost, request);
    }

    private double applyDiscounts(double cost, TravelRequest request) {
        if (request.hasChildDiscount()) cost *= 0.9;
        return cost * request.getPassengers();
    }
}
