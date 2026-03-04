public class PlaneStrategy implements ICostCalculationStrategy {

    @Override
    public double calculateCost(TravelRequest request) {
        double baseRate = 0.5; // цена за км
        double cost = request.getDistance() * baseRate;

        if (request.getServiceClass().equals("BUSINESS")) {
            cost *= 1.5;
        }

        if (request.hasBaggage()) {
            cost += 30;
        }

        return applyDiscounts(cost, request);
    }

    private double applyDiscounts(double cost, TravelRequest request) {
        if (request.hasChildDiscount()) cost *= 0.8;
        if (request.hasSeniorDiscount()) cost *= 0.85;
        return cost * request.getPassengers();
    }
}
