package se.komut.talasvenska;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Player extends AppCompatActivity {

    private Category mCurrentCategory; //Current category, ex Family

    //id, first step in category, most step does not require a sequence of finished steps
    private Step mCurrentStep;
    private User mUser,

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);
    }





}
