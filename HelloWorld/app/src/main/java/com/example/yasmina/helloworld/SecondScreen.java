package com.example.yasmina.helloworld;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by yasmina on 6-11-2014.
 */
public class SecondScreen extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.second_layout);

        Intent activityThatCalled = getIntent();

        String previousActivity = activityThatCalled.getExtras().getString("callingActivity");

        TextView callingActivityMessage = (TextView)
                findViewById(R.id.call_act_info_text_view);
        callingActivityMessage.append(" " + previousActivity);
}

    public void SendName(View view) {
        EditText NameET =  (EditText) findViewById(R.id.name_edit_text);

        String Name = String.valueOf(NameET.getText());

        Intent goBack = new Intent();

        goBack.putExtra("Name", Name);

        setResult(RESULT_OK, goBack);

        finish();
    }
    }
