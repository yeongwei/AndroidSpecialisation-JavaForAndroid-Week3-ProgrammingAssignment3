package mooc.vandy.java4android.buildings.logic;

/**
 * This is the cottage class file.  It is a subclass of House.
 */
public class Cottage 
       extends House {

    private boolean mSecondFloor = false;

    /**
     * Constuctors
     * @param dimension
     * @param lotLength
     * @param lotWidth
     */
    public Cottage(int dimension, int lotLength, int lotWidth) {
        super(dimension / 2, dimension / 2, lotLength, lotWidth);
    }

    public Cottage(int dimension, int lotLength, int lotWidth, String owner, boolean secondFloor) {
        super(dimension / 2, dimension / 2, lotLength, lotWidth, owner);
        mSecondFloor = secondFloor;
    }

    public boolean hasSecondFloor() {
        return mSecondFloor;
    }

    public String toString() {
        String msg = "";
        if (getOwner() == null)
            msg += "n/a";
        else
            msg += getOwner();

        msg += "; is a cottage";

        return msg;
    }
}