package mooc.vandy.java4android.buildings.logic;

/**
 * This is the Building class file.
 */
public class Building {

    private int mLength;
    private int mWidth;
    private int mLotLength;
    private int mLotWidth;

    /**
     * This is a constructor
     * @param length
     * @param width
     * @param lotLength
     * @param lotWidth
     */
    public Building(int length, int width, int lotLength,int lotWidth) {
        mLength = length;
        mWidth = width;
        mLotLength = lotLength;
        mLotWidth = lotWidth;
    }

    /**
     * Returns the length
     * @return
     */
    public int getLength() {
        return mLength;
    }

    /**
     * Returns the width
     * @return
     */
    public int getWidth() {
        return mWidth;
    }

    /**
     * Returns the log length
     * @return
     */
    public int getLotLength() {
        return mLotLength;
    }

    /**
     * Returns the log width
     * @return
     */
    public int getLotWidth() {
        return mLotWidth;
    }

    /**
     * Sets the length
     * @param length
     */
    public void setLength(int length) {
        mLength = length;
    }

    /**
     * Sets the width
     * @param width
     */
    public void setWidth(int width) {
        mWidth = width;
    }

    /**
     * Sets the log length
     * @param lotLength
     */
    public void setLotLength(int lotLength) {
        mLotLength = lotLength;
    }

    /**
     * Sets the log width
     * @param lotWidth
     */
    public void setLotWidth(int lotWidth) {
        mLotWidth = lotWidth;
    }

    /**
     * Calculates the area based on length and width
     * @return
     */
    public int calcBuildingArea() {
        return mWidth * mLength;
    }

    /**
     * Calcutes the lot area based on the lotLength and lotWidth
     * @return
     */
    public int calcLotArea() {
        return mLotWidth * mLotLength;
    }

    public String toString() {
        return "";
    }

}
