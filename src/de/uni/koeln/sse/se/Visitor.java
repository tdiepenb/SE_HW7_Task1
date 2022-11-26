package de.uni.koeln.sse.se;

public interface Visitor {

    /**
     * Visits a HouseholdItem Glass g
     *
     * @param g
     */
    public void visitGlass(Glass g);

    /**
     * Visits a HouseholdItem Furniture f
     *
     * @param f
     */
    public void visitFurniture(Furniture f);

    /**
     * Visits a HouseholdItem Electronic e
     *
     * @param e
     */
    public void visitElectronic(Electronic e);


}
