public class TrainStrategy implements ICostCalculationStrategy {

    @Override
    public double calculateCost(TravelRequest request) {
        double baseRate = 0.3;
        double cost = request.getDistance() * baseRate;

        if (request.getServiceClass().equals("BUSINESS")) {
            cost *= 1.2;
        }

        return applyDiscounts(cost, request);
    }

    private double applyDiscounts(double cost, TravelRequest request) {
        if (request.hasChildDiscount()) cost *= 0.85;
        if (request.hasSeniorDiscount()) cost *= 0.9;
        return cost * request.getPassengers();
    }
}
