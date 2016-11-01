package se.komut.talasvenska;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ToggleButton;

public class Player extends AppCompatActivity {

    private Category mCurrentCategory; //Current category, ex Family

    //id, first step in category, most step does not require a sequence of finished steps
    private Step mCurrentStep;
    private User mUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);



        final ToggleButton recordButton = (ToggleButton) findViewById(R.id.recordButton);
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

    private void startRecording(){

    }

    private void stopRecording(){

    }

    public void listenToSwedish(View v){

    }

    public void listenToYou(View v){
        
    }



}
