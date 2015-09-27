package com.learning.jlovas.buzzer;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class Stats extends ActionBarActivity {

    //grabbing the information back here
    Intent intent =getIntent();
    BuzzerStats buzzerstats = (BuzzerStats)intent.getParcelableExtra("playerOneStatsP2");


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stats);

        //Toast.makeText(getApplicationContext(), "TEST! P1: " + buzzerstats.getTwoPlayer1p() + " points!", Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_stats, menu);
        return true;
    }

    //button linkage
    public void emailStatsButton(View view){
        Intent intent = new Intent(Stats.this, EmailStats.class);
        startActivity(intent);

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
}
