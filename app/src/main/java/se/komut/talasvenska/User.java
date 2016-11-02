package se.komut.talasvenska;

/**
 * Created by Jonas on 2016-11-01.
 *
 * Encapsulates a user
 */

class User {
    private int mId = -1;
    private String mUsername = null;
    private String mFirstName = null;
    private String mLastName = null;
    private int mXlangId = -1;
    private int mCountryOrRegion = -1;

    public User(String mUsername, int mId, int mXlangId) {
        this.mUsername = mUsername;
        this.mId = mId;
        this.mXlangId = mXlangId;
    }

    public int getmId() { return mId; }

    public String getmUsername() {return mUsername; }

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
