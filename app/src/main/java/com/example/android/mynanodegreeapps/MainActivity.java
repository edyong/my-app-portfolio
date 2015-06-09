package com.example.android.mynanodegreeapps;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button spotifyBtn = (Button) findViewById(R.id.spotifyBtn);
        Button scoresBtn = (Button) findViewById(R.id.scoresBtn);
        Button libraryBtn = (Button) findViewById(R.id.libraryBtn);
        Button buildBtn = (Button) findViewById(R.id.buildBtn);
        Button xyzBtn = (Button) findViewById(R.id.xyzBtn);
        Button capstoneBtn = (Button) findViewById(R.id.capstoneBtn);

        spotifyBtn.setOnClickListener(this);
        scoresBtn.setOnClickListener(this);
        libraryBtn.setOnClickListener(this);
        buildBtn.setOnClickListener(this);
        xyzBtn.setOnClickListener(this);
        capstoneBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        switch(v.getId()){
            case R.id.spotifyBtn:
                Toast.makeText(this, "You have clicked Spotify Streamer", Toast.LENGTH_SHORT).show();
                break;

            case R.id.scoresBtn:
                Toast.makeText(this, "You have clicked Scores App", Toast.LENGTH_SHORT).show();
                break;

            case R.id.libraryBtn:
                Toast.makeText(this, "You have clicked Library App", Toast.LENGTH_SHORT).show();
                break;

            case R.id.buildBtn:
                Toast.makeText(this, "You have clicked Build It Bigger", Toast.LENGTH_SHORT).show();
                break;

            case R.id.xyzBtn:
                Toast.makeText(this, "You have clicked XYZ Reader", Toast.LENGTH_SHORT).show();
                break;

            case R.id.capstoneBtn:
                Toast.makeText(this, "You have clicked Capstone", Toast.LENGTH_SHORT).show();
                break;

        }
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


//    public void spotifyStreamer(View view) {
//        Toast.makeText(this, "You have clicked Spotify Streamer", Toast.LENGTH_LONG).show();
//    }
//
//    public void scoresApp(View view) {
//        Toast.makeText(this, "You have clicked Scores App", Toast.LENGTH_LONG).show();
//    }
//
//    public void libraryApp(View view) {
//        Toast.makeText(this, "You have clicked Library App", Toast.LENGTH_LONG).show();
//    }
//
//    public void buildItBigger(View view) {
//        Toast.makeText(this, "You have clicked Build It Bigger", Toast.LENGTH_LONG).show();
//    }
//
//    public void xyzReader(View view) {
//        Toast.makeText(this, "You have clicked XYZ Reader", Toast.LENGTH_LONG).show();
//    }
//
//    public void capstone(View view) {
//        Toast.makeText(this, "You have clicked Capstone", Toast.LENGTH_LONG).show();
//    }
}
