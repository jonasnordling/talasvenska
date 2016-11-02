package se.komut.talasvenska;

import android.media.MediaPlayer;
import android.media.MediaRecorder;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ToggleButton;

import java.io.IOException;

public class Player extends AppCompatActivity {

    private static final String LOG_TAG_RECORD = "Player record";
    private static final String LOG_TAG_PLAY_SWEDISH = "Player play swedish";
    private static final String LOG_TAG_PLAY_USER = "Player play user";
    private static final String LOG_TAG_GENERAL = "Player";

    private static final String AUDIO_FILE_EXTENSION = ".3gp";

    private String mAudioFileStorePath = null;

    private Category mCurrentCategory; //Current category, ex Family

    //id, first step in category, most step does not require a sequence of finished steps
    private Step mCurrentStep = null;
    private User mUser = null;

    private MediaRecorder mRecorder = null;
    private MediaPlayer mPlayer = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);

        final ToggleButton recordButton = (ToggleButton) findViewById(R.id.recordButton);

        if (recordButton != null) {
            recordButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        startRecording();
                    } else {
                        stopRecording();
                    }
                }
            });
        }


        setmAudioFileStorePath(Environment.getExternalStorageDirectory().getAbsolutePath()+"/");

    }

    @Override
    public void onPause(){
        super.onPause();
        if(mRecorder != null){
            mRecorder.release();
            mRecorder = null;
        }

        if(mPlayer != null){
            mPlayer.release();
            mPlayer = null;
        }
    }

    //Todo Implement time limt on recording
    private void startRecording(){
        mRecorder = new MediaRecorder();
        mRecorder.setAudioSource(MediaRecorder.AudioSource.MIC);
        mRecorder.setOutputFormat(MediaRecorder.OutputFormat.THREE_GPP);
        mRecorder.setOutputFile(getUserFilename());
        mRecorder.setAudioEncoder(MediaRecorder.AudioEncoder.AMR_NB);

        try {
            mRecorder.prepare();
        }catch (IOException e) {
            Log.e(LOG_TAG_RECORD, "prepare() failed");
        }

        mRecorder.start();
    }

    private void stopRecording(){
        mRecorder.stop();
        mRecorder.release();
        mRecorder = null;
    }

    public void listenToSwedish(View v){
        mPlayer = new MediaPlayer();
        try{
            mPlayer.setDataSource(getSwedishFilename());
            mPlayer.prepare();
            mPlayer.start();
        }catch(IOException e){
            Log.e(LOG_TAG_PLAY_SWEDISH,"prepare() failed");
        }
    }

    public void listenToYou(View v){
        mPlayer = new MediaPlayer();
        try{
            mPlayer.setDataSource(getUserFilename());
            mPlayer.prepare();
            mPlayer.start();
        }catch(IOException e){
            Log.e(LOG_TAG_PLAY_USER,"prepare() failed");
        }
    }
    /* If we need this
    private void stopPlaying(){
        mPlayer.release();
        mPlayer = null;
    }
    */

    public Step getCurrentStep(){ return mCurrentStep; }
    public void setCurrentStep(Step step){this.mCurrentStep = step; }

    public User getmUser() {return mUser; }
    public void setmUser(User mUser) {this.mUser = mUser; }

    public String getmAudioFileStorePath(){return mAudioFileStorePath;}
    public void setmAudioFileStorePath(String path){this.mAudioFileStorePath = path;}

    public String getUserFilename(){ return mAudioFileStorePath+getCurrentStep().getUserSoundfile()+AUDIO_FILE_EXTENSION; }
    public String getSwedishFilename(){ return mAudioFileStorePath+getCurrentStep().getSwedishSoundfile()+AUDIO_FILE_EXTENSION; }
    public String getXlangFilename(){ return mAudioFileStorePath+getCurrentStep().getXlangSoundfile()+AUDIO_FILE_EXTENSION; }

}
