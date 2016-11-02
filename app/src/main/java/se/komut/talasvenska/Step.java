package se.komut.talasvenska;

/**
 * Created by Jonas on 2016-11-01.
 *
 * A Step is normally one phrase to practice on. Sequential steps enforce a certain order of steps for special use
 */

class Step {
    private int mId = -1;

    private int mOrder = 0; //Order in category
    private boolean mSequential = false;

    private String mSwedishText = null;
    private String mXlangText = null;

    private String mSwedishSoundfile = null;
    private String mXlangSoundfile = null;
    private String mUserSoundfile = null;

    public Step(int mId, String mSwedishText, String mXlangText, String mSwedishSoundfile, String mXlangSoundfile) {
        this.mId = mId;
        this.mSwedishText = mSwedishText;
        this.mXlangText = mXlangText;
        this.mSwedishSoundfile = mSwedishSoundfile;
        this.mXlangSoundfile = mXlangSoundfile;
    }

    public int getId(){
        return mId;
    }

    public int getOrder() {
        return mOrder;
    }

    public void setOrder(int mOrder) {
        this.mOrder = mOrder;
    }

    public boolean isSequential() {
        return mSequential;
    }

    public void setSequential(boolean mSequential) {
        this.mSequential = mSequential;
    }

    public String getSwedishText() {
        return mSwedishText;
    }

    public void setSwedishText(String mSwedishText) {
        this.mSwedishText = mSwedishText;
    }

    public String getXlangText() {
        return mXlangText;
    }

    public void setXlangText(String mXlangText) {
        this.mXlangText = mXlangText;
    }

    String getSwedishSoundfile() {
        return mSwedishSoundfile;
    }

    public void setSwedishSoundfile(String mSwedishSoundfile) {
        this.mSwedishSoundfile = mSwedishSoundfile;
    }

    String getXlangSoundfile() {
        return mXlangSoundfile;
    }

    public void setXlangSoundfile(String mXlangSoundfile) {
        this.mXlangSoundfile = mXlangSoundfile;
    }

    String getUserSoundfile() {
        return mUserSoundfile;
    }

    public void setUserSoundfile(String mUserSoundfile) {
        this.mUserSoundfile = mUserSoundfile;
    }
}
