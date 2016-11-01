package se.komut.talasvenska;

/**
 * Created by Jonas on 2016-11-01.
 */

public class Step {
    private int mId;

    private int mOrder; //Order in category
    private boolean mSequential;

    private String mSwedishText;
    private String mXlangText;

    private String mSwedishSoundfile;
    private String mXlangSoundfile;
    private String mUserSoundfile;

    public int getmId(){
        return mId;
    }

    public int getmOrder() {
        return mOrder;
    }

    public void setmOrder(int mOrder) {
        this.mOrder = mOrder;
    }

    public boolean ismSequential() {
        return mSequential;
    }

    public void setmSequential(boolean mSequential) {
        this.mSequential = mSequential;
    }

    public String getmSwedishText() {
        return mSwedishText;
    }

    public void setmSwedishText(String mSwedishText) {
        this.mSwedishText = mSwedishText;
    }

    public String getmXlangText() {
        return mXlangText;
    }

    public void setmXlangText(String mXlangText) {
        this.mXlangText = mXlangText;
    }

    public String getmSwedishSoundfile() {
        return mSwedishSoundfile;
    }

    public void setmSwedishSoundfile(String mSwedishSoundfile) {
        this.mSwedishSoundfile = mSwedishSoundfile;
    }

    public String getmXlangSoundfile() {
        return mXlangSoundfile;
    }

    public void setmXlangSoundfile(String mXlangSoundfile) {
        this.mXlangSoundfile = mXlangSoundfile;
    }

    public String getmUserSoundfile() {
        return mUserSoundfile;
    }

    public void setmUserSoundfile(String mUserSoundfile) {
        this.mUserSoundfile = mUserSoundfile;
    }
}
