package com.learning.jlovas.buzzer;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class TwoPlayers extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two_players);
    }

    public void buttonPress(View view){
        //switchcase method for finding button by ID credit goes here

        switch(view.getId()) {
            case R.id.player1Button:
            //display text that player2 touched button first
                //credit goes here for toast tutorial

                Toast.makeText(getApplicationContext(), "Player One touched first!", Toast.LENGTH_SHORT).show();

                //something here for the increase of points to player 1 in 2pl mode

                finish();
                break;
            case R.id.player2Button:
                //display text that player2 touched button first

                Toast.makeText(getApplicationContext(), "Player Two touched first!", Toast.LENGTH_SHORT).show();
                finish();
                break;


        }


    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_two_players, menu);
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
