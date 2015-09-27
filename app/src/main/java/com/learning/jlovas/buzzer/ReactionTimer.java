package com.learning.jlovas.buzzer;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class ReactionTimer extends ActionBarActivity {


    //will create a random time to start
    double start = (Math.random()* (0.2000-0.0010) + 0.0010);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reaction_timer);
/*
        //call popup each time you enter the app
        Intent intent = new Intent(this, ReactionInfoPopup.class);
        startActivity(intent);
*/
        //credit for this goes to background changing link
        RelativeLayout background = (RelativeLayout)findViewById(R.id.bg);

        //once time is ready, change background to red
        //INSERT COUNTDOWN TIMER HERE

        //need to tell it to wait until start begins to start


        background.setBackgroundColor(Color.RED);

        Toast.makeText(getApplicationContext(), "Random Time is: " + start + " seconds", Toast.LENGTH_SHORT).show();
    }

    //button press function
    public void pressedButton(View view){
        //if too soon

        //if after


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_reaction_timer, menu);
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
}
