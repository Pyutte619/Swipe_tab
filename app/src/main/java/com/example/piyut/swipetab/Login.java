package com.example.piyut.swipetab;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.parse.ParseUser;

/**
 * Created by piyut on 21/03/2015.
 */
public class Login extends Activity implements View.OnClickListener{
    private ParseUser currentUser;
    Button buttonFb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);

        buttonFb= (Button) findViewById(R.id.button);
        buttonFb.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

    }
}
