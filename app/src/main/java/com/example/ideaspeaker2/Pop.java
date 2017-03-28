package com.example.ideaspeaker2;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.widget.TextViewCompat;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;


/**
 * Created by 立淳 on 2016/12/7.
 */
public class Pop extends Activity {

    private String sentence;
    public static Speaker speaker;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.popwindow);

        Intent intent = getIntent();
        Bundle b = intent.getExtras();
        if (b != null) {
            sentence = b.getString("text");
        }

        speaker = new Speaker(this);
        final EditText editText = (EditText) findViewById(R.id.editText);
        Button save = (Button) findViewById(R.id.save);
        Button speak = (Button) findViewById(R.id.speak);


        editText.setText(sentence);
        editText.setSelection(editText.getText().length());

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //text.setText(editText.getText().toString());
                Intent i = new Intent();
                Bundle b = new Bundle();
                b.putString("saved", editText.getText().toString());
                i.putExtras(b);
                setResult(RESULT_OK, i);
                finish();
            }
        });
        speak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                speaker.speaking(editText.getText().toString());
            }
        });


        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int) (width * 0.8), (int) (height * 0.6));


    }

}
