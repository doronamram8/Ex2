package com.example.madaim.ex2;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import static android.R.attr.text;

public class MainActivity extends Activity {
    final String MY_TAG="Ex2.MainActivity";
    private int cnt=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(MY_TAG,"onCreateEvent");
        Toast.makeText(this, "Welcome Doron, this is your first java coding experience in Android congratulations!!!", Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onStart() {
        super.onStart();
    Log.i(MY_TAG,"onStartEvent");
    }

    @Override
    protected void onResume() {
        super.onResume();
     Log.i(MY_TAG,"onResumeEvent");
    }

    @Override
    protected void onPause() {
        super.onPause();
     Log.i(MY_TAG,"onPauseEvent");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(MY_TAG,"onStopEvent");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(MY_TAG,"onDestroyEvent");
    }
    public void buttonClicked(View v){
            EditText edName=(EditText) findViewById(R.id.edtext);
            if(edName.getText().length()==0)
                Toast.makeText(this, "you must enter a name", Toast.LENGTH_LONG).show();
        else
            cnt++;
        Toast.makeText(this,"Doron, you clicked The buuton "+cnt+" times",Toast.LENGTH_LONG ).show();
    }
}
