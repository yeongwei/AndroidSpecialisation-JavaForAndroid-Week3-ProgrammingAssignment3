package mooc.vandy.java4android.buildings.logic;

/**
 * This is the House class file that extends Building.
 */
public class House
        extends Building {

    private String mOwner = null;
    private Boolean mPool = false;

    /**
     * Constructor
     * @param length
     * @param width
     * @param lotLength
     * @param lotWidth
     */
    public House(int length, int width, int lotLength, int lotWidth) {
        super(length, width, lotLength, lotWidth);
    }

    public House(int length, int width, int lotLength, int lotWidth, String owner) {
        this(length, width, lotLength, lotWidth);
        mOwner = owner;
    }

    public House(int length, int width, int lotLength, int lotWidth, String owner, boolean pool) {
        this(length, width, lotLength, lotWidth, owner);
        mPool = pool;
    }

    /**
     * Get the owner
     * @return
     */
    public String getOwner() {
        return mOwner;
    }

    /**
     * If there is pool
     * @return
     */
    public boolean hasPool() {
        return mPool;
    }

    /**
     * Sets the owner
     * @param owner
     */
    public void setOwner(String owner) {
        mOwner = owner;
    }

    /**
     * Sets the pool
     * @param pool
     */
    public void setPool(boolean pool) {
        mPool = pool;
    }

    public String toString() {
        String msg = "Owner: ";

        if (getOwner() == null)
            msg += "n/a";
        else
            msg += getOwner();

        if (mPool)
            msg += "; has a pool";

        if (calcLotArea() > calcBuildingArea())
            msg += "; has a big open space";

        return msg;
    }

    /**
     * Determine if remote House object is the same
     * @param object
     * @return
     */
    public boolean equals(Object object) {
        if (object instanceof House)
            return compare((House) object);
        else
            return false;
    }

    /**
     * Comparison assist method
     * @param house
     * @return
     */
    private boolean compare(House house) {
        if (hasSamePool(house) && hasSameBuildingArea(house))
            return true;
        else
            return false;
    }

    /**
     * Determine if remote House has pool
     * @param house
     * @return
     */
    private boolean hasSamePool(House house) {
        return house.mPool = mPool;
    }

    /**
     * Determkine if remote House has same building area
     * @param house
     * @return
     */
    private boolean hasSameBuildingArea(House house) {
        return house.calcBuildingArea() == calcBuildingArea();
    }
}
