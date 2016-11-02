package se.komut.talasvenska;

/**
 * Created by Jonas on 2016-11-01.
 * Category of phrases, to organize phrases in categories to help the user
 */

class Category {
    private int mId = -1;
    private String mSwedishName = null;
    private String mXlangName = null;

    public Category(int mId, String mSwedishName, String mXlangName) {
        this.mId = mId;
        this.mSwedishName = mSwedishName;
        this.mXlangName = mXlangName;
    }

    public int getmId() {
        return mId;
    }

    public String getmSwedishName() {
        return mSwedishName;
    }

    public String getmXlangName() {
        return mXlangName;
    }
}
