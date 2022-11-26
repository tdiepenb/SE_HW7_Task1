package de.uni.koeln.sse.se;

public class MovingCostCalculator implements Visitor {

    private Double tmpCost;
    private String name;


    /**
     * Visits a HouseholdItem Glass g
     *
     * @param g
     */
    @Override
    public void visitGlass(Glass g) {
        tmpCost = 0.0;

        Double pricePerMeter = 0.0;
        switch (g.getTickness()) {
            case 1:
                pricePerMeter = 2.0;
                break;
            case 2:
                pricePerMeter = 1.2;
                break;
            case 3:
                pricePerMeter = 0.7;
                break;
            default:
                System.out.println("Glass Thickness is not known. Please check the Glass Thickness for:" + g.getName());
                return;
        }
        tmpCost = (((double) g.getLenght()) / 100.0) * pricePerMeter;

        System.out.println("Total Cost for " + g.getName() + " is: " + tmpCost + " Euros");

    }

    /**
     * Visits a HouseholdItem Furniture f
     *
     * @param f
     */
    @Override
    public void visitFurniture(Furniture f) {
        tmpCost = 0.0;

        tmpCost = 5.0 * (((double) f.getWeight()) / 20.0);
        System.out.println("Total Cost for " + f.getName() + " is: " + tmpCost + " Euros");

    }

    /**
     * Visits a HouseholdItem Electronic e
     *
     * @param e
     */
    @Override
    public void visitElectronic(Electronic e) {
        tmpCost = 0.0;

        if (e.getFragile()) {
            tmpCost = 5.0 * (((double) e.getWeight()) / 10.0);
        } else {
            tmpCost = 5.0 * (((double) e.getWeight()) / 15.0);
        }

        System.out.println("Total Cost for " + e.getName() + " is: " + tmpCost + " Euros");

    }

    public Double calculateMovingCost(HouseholdItem h) {
        tmpCost = 0.0;
        h.accept(this);
        return tmpCost;
    }
}
