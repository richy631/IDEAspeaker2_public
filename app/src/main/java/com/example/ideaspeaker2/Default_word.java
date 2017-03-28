package com.example.ideaspeaker2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by 立淳 on 2016/12/11.
 */


public class Default_word extends Activity {

    private Speaker speaker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.default_word_main);
        speaker = new Speaker(this);
        letAllViewSpeak();

    }

    public void letAllViewSpeak() {
        final TextView TextView1 = (TextView) findViewById(R.id.textView1);
        TextView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                speaker.speaking(TextView1.getText().toString());
            }
        });
        final TextView TextView2 = (TextView) findViewById(R.id.textView2);
        TextView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                speaker.speaking(TextView2.getText().toString());
            }
        });
        final TextView TextView3 = (TextView) findViewById(R.id.textView3);
        TextView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                speaker.speaking(TextView3.getText().toString());
            }
        });
        final TextView TextView4 = (TextView) findViewById(R.id.textView4);
        TextView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                speaker.speaking(TextView4.getText().toString());
            }
        });
        final TextView TextView5 = (TextView) findViewById(R.id.textView5);
        TextView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                speaker.speaking(TextView5.getText().toString());
            }
        });
        final TextView TextView6 = (TextView) findViewById(R.id.textView6);
        TextView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                speaker.speaking(TextView6.getText().toString());
            }
        });
        final TextView TextView7 = (TextView) findViewById(R.id.textView7);
        TextView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                speaker.speaking(TextView7.getText().toString());
            }
        });
        final TextView TextView8 = (TextView) findViewById(R.id.textView8);
        TextView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                speaker.speaking(TextView8.getText().toString());
            }
        });
        final TextView TextView9 = (TextView) findViewById(R.id.textView9);
        TextView9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                speaker.speaking(TextView9.getText().toString());
            }
        });
        final TextView TextView10 = (TextView) findViewById(R.id.textView10);
        TextView10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                speaker.speaking(TextView10.getText().toString());
            }
        });



        ImageView ImageView1 = (ImageView) findViewById(R.id.imageView1);
        ImageView1.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                Intent pop = new Intent(Default_word.this, Pop.class);
                Bundle bundle = new Bundle();
                bundle.putString("text", TextView1.getText().toString());
                pop.putExtras(bundle);
                startActivityForResult(pop, 1);
                return true;
            }
        });
        ImageView ImageView2 = (ImageView) findViewById(R.id.imageView2);
        ImageView2.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                Intent pop = new Intent(Default_word.this, Pop.class);
                Bundle bundle = new Bundle();
                bundle.putString("text", TextView2.getText().toString());
                pop.putExtras(bundle);
                startActivityForResult(pop, 2);
                return true;
            }
        });
        ImageView ImageView3 = (ImageView) findViewById(R.id.imageView3);
        ImageView3.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                Intent pop = new Intent(Default_word.this, Pop.class);
                Bundle bundle = new Bundle();
                bundle.putString("text", TextView3.getText().toString());
                pop.putExtras(bundle);
                startActivityForResult(pop, 3);
                return true;
            }
        });
        ImageView ImageView4 = (ImageView) findViewById(R.id.imageView4);
        ImageView4.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                Intent pop = new Intent(Default_word.this, Pop.class);
                Bundle bundle = new Bundle();
                bundle.putString("text", TextView4.getText().toString());
                pop.putExtras(bundle);
                startActivityForResult(pop, 4);
                return true;
            }
        });
        ImageView ImageView5 = (ImageView) findViewById(R.id.imageView5);
        ImageView5.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                Intent pop = new Intent(Default_word.this, Pop.class);
                Bundle bundle = new Bundle();
                bundle.putString("text", TextView5.getText().toString());
                pop.putExtras(bundle);
                startActivityForResult(pop, 5);
                return true;
            }
        });
        ImageView ImageView6 = (ImageView) findViewById(R.id.imageView6);
        ImageView6.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                Intent pop = new Intent(Default_word.this, Pop.class);
                Bundle bundle = new Bundle();
                bundle.putString("text", TextView6.getText().toString());
                pop.putExtras(bundle);
                startActivityForResult(pop, 6);
                return true;
            }
        });
        ImageView ImageView7 = (ImageView) findViewById(R.id.imageView7);
        ImageView7.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                Intent pop = new Intent(Default_word.this, Pop.class);
                Bundle bundle = new Bundle();
                bundle.putString("text", TextView7.getText().toString());
                pop.putExtras(bundle);
                startActivityForResult(pop, 7);
                return true;
            }
        });
        ImageView ImageView8 = (ImageView) findViewById(R.id.imageView8);
        ImageView8.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                Intent pop = new Intent(Default_word.this, Pop.class);
                Bundle bundle = new Bundle();
                bundle.putString("text", TextView8.getText().toString());
                pop.putExtras(bundle);
                startActivityForResult(pop, 8);
                return true;
            }
        });
        ImageView ImageView9 = (ImageView) findViewById(R.id.imageView9);
        ImageView9.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                Intent pop = new Intent(Default_word.this, Pop.class);
                Bundle bundle = new Bundle();
                bundle.putString("text", TextView9.getText().toString());
                pop.putExtras(bundle);
                startActivityForResult(pop, 9);
                return true;
            }
        });
        ImageView ImageView10 = (ImageView) findViewById(R.id.imageView10);
        ImageView10.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                Intent pop = new Intent(Default_word.this, Pop.class);
                Bundle bundle = new Bundle();
                bundle.putString("text", TextView2.getText().toString());
                pop.putExtras(bundle);
                startActivityForResult(pop, 10);
                return true;
            }
        });


    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data){
        super.onActivityResult(requestCode,  resultCode, data);
        TextView textview;
        switch(requestCode) {
            case 1:
                Toast.makeText(this, "已修改 : " + data.getExtras().getString("saved"), Toast.LENGTH_SHORT).show();
                textview = (TextView) findViewById(R.id.textView1);
                textview.setText(data.getExtras().getString("saved"));
                break;
            case 2:
                Toast.makeText(this, "已修改 : " + data.getExtras().getString("saved"), Toast.LENGTH_SHORT).show();
                textview = (TextView) findViewById(R.id.textView2);
                textview.setText(data.getExtras().getString("saved"));
                break;
            case 3:
                Toast.makeText(this, "已修改 : " + data.getExtras().getString("saved"), Toast.LENGTH_SHORT).show();
                textview = (TextView) findViewById(R.id.textView3);
                textview.setText(data.getExtras().getString("saved"));
                break;
            case 4:
                Toast.makeText(this, "已修改 : " + data.getExtras().getString("saved"), Toast.LENGTH_SHORT).show();
                textview = (TextView) findViewById(R.id.textView4);
                textview.setText(data.getExtras().getString("saved"));
                break;
            case 5:
                Toast.makeText(this, "已修改 : " + data.getExtras().getString("saved"), Toast.LENGTH_SHORT).show();
                textview = (TextView) findViewById(R.id.textView5);
                textview.setText(data.getExtras().getString("saved"));
                break;
            case 6:
                Toast.makeText(this, "已修改 : " + data.getExtras().getString("saved"), Toast.LENGTH_SHORT).show();
                textview = (TextView) findViewById(R.id.textView6);
                textview.setText(data.getExtras().getString("saved"));
                break;
            case 7:
                Toast.makeText(this, "已修改 : " + data.getExtras().getString("saved"), Toast.LENGTH_SHORT).show();
                textview = (TextView) findViewById(R.id.textView7);
                textview.setText(data.getExtras().getString("saved"));
                break;
            case 8:
                Toast.makeText(this, "已修改 : " + data.getExtras().getString("saved"), Toast.LENGTH_SHORT).show();
                textview = (TextView) findViewById(R.id.textView8);
                textview.setText(data.getExtras().getString("saved"));
                break;
            case 9:
                Toast.makeText(this, "已修改 : " + data.getExtras().getString("saved"), Toast.LENGTH_SHORT).show();
                textview = (TextView) findViewById(R.id.textView9);
                textview.setText(data.getExtras().getString("saved"));
                break;
            case 10:
                Toast.makeText(this, "已修改 : " + data.getExtras().getString("saved"), Toast.LENGTH_SHORT).show();
                textview = (TextView) findViewById(R.id.textView10);
                textview.setText(data.getExtras().getString("saved"));
                break;
        }

    }

}

