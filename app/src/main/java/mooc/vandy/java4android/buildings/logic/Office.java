package mooc.vandy.java4android.buildings.logic;

/**
 * This is the office class file, it is a subclass of Building.
 */
public class Office
        extends Building {

    private String mBusinessName = null;
    private int mParkingSpaces = 0;
    private static int sTotalOffices = 0;

    /**
     * Constructors
     * @param length
     * @param width
     * @param lotLength
     * @param lotWidth
     */
    public Office(int length, int width, int lotLength, int lotWidth) {
        super(length, width, lotLength, lotWidth);
        sTotalOffices += 1;
    }

    public Office(int length, int width, int lotLength, int lotWidth, String businessName) {
        this(length, width, lotLength, lotWidth);
        mBusinessName = businessName;
    }

    public Office(int length, int width, int lotLength, int lotWidth, String businessName, int parkingSpaces) {
        this(length, width, lotLength, lotWidth, businessName);
        mParkingSpaces = parkingSpaces;
    }

    /**
     * Returns the business name
     * @return
     */
    public String getBusinessName() {
        return mBusinessName;
    }

    /**
     * Returns the parking spaces
     * @return
     */
    public int getParkingSpaces() {
        return mParkingSpaces;
    }

    /**
     * Sets the business name
     * @param businessName
     */
    public void setBusinessName(String businessName) {
        mBusinessName = businessName;
    }

    /**
     * Sets the parking spaces
     * @param parkingSpaces
     */
    public void setParkingSpaces(int parkingSpaces) {
        mParkingSpaces = parkingSpaces;
    }

    public String toString() {
        String msg = "Business: ";

        if (getBusinessName() == null)
            msg += "unoccupied";
        else
            msg += getBusinessName();

        if (getParkingSpaces() > 0)
            msg += "; has " + getParkingSpaces() + " parking spaces";

        msg += " (total offices: " + sTotalOffices + ")";
        return msg;
    }

    /**
     * Compare with another Office object
     * @param object
     * @return
     */
    public boolean equals(Object object) {
        if (object instanceof Office)
            return compare((Office) object);
        else
            return false;
    }

    /**
     * Comparison assist method
     * @param office
     * @return
     */
    private boolean compare(Office office) {
        if (hasSameOfficeArea(office) && hasSameParkingSpaces(office))
            return true;
        else
            return false;
    }

    /**
     * Determine if remote Office has same building area
     * @param office
     * @return
     */
    private boolean hasSameOfficeArea(Office office) {
        return office.calcBuildingArea() == calcBuildingArea();
    }

    /**
     * Determine if remote Office has same parking spaces
     * @param office
     * @return
     */
    private boolean hasSameParkingSpaces(Office office) {
        return office.getParkingSpaces() == getParkingSpaces();
    }
}
