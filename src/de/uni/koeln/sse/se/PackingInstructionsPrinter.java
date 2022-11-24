package de.uni.koeln.sse.se;

public class PackingInstructionsPrinter implements Visitor{


    private String tmpString;

    /**
     * Visits a HouseholdItem Glass g
     *
     * @param g
     */
    @Override
    public void visitGlass(Glass g) {
        tmpString = "should be wrapped with Bubble wraps and packed in a box with dimension: ";
        System.out.println(g.getName() + ":");
        System.out.println(" >" + tmpString + (g.getHeight()+1) + "x" + (g.getLenght()+1) + "x" + (g.getWidth()+1));
    }

    /**
     * Visits a HouseholdItem Furniture f
     *
     * @param f
     */
    @Override
    public void visitFurniture(Furniture f) {
        tmpString = "should be covered with waterproof covers with area of: ";
        System.out.println(f.getName() + ":");
        System.out.println(" >" + tmpString + f.getHeight() + "x" + f.getLenght() + "x" + f.getWidth());
    }

    /**
     * Visits a HouseholdItem Electronic e
     *
     * @param e
     */
    @Override
    public void visitElectronic(Electronic e) {
        tmpString = "should be covered with Polyethylene foam film and packed in a box with dimension: ";
        System.out.println(e.getName() + ":");
        System.out.println(" >" + tmpString + (e.getHeight()+1) + "x" + (e.getLenght()+1) + "x" + (e.getWidth()+1));
    }

    public String printPackingInstructions(HouseholdItem h) {
        tmpString = "";
        h.accept(this);
        return tmpString;
    }
}
