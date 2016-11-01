package se.komut.talasvenska;

/**
 * Created by Jonas on 2016-11-01.
 */

public class User {
    private int mId;
    private String mUsername;
    private String mFirstName;
    private String mLastName;
    private int mXlangId;
    private int mCountryOrRegion;

    public int getmId() {
        return mId;
    }

    public String getmUsername() {

        return mUsername;
    }

    public void setmUsername(String mUsername) {
        this.mUsername = mUsername;
    }

    public String getmFirstName() {
        return mFirstName;
    }

    public void setmFirstName(String mFirstName) {
        this.mFirstName = mFirstName;
    }

    public String getmLastName() {
        return mLastName;
    }

    public void setmLastName(String mLastName) {
        this.mLastName = mLastName;
    }

    public int getmXlangId() {
        return mXlangId;
    }

    public void setmXlangId(int mXlangId) {
        this.mXlangId = mXlangId;
    }

    public int getmCountryOrRegion() {
        return mCountryOrRegion;
    }

    public void setmCountryOrRegion(int mCountryOrRegion) {
        this.mCountryOrRegion = mCountryOrRegion;
    }
}
