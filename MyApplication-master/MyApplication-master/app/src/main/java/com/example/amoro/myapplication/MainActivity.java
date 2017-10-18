package com.example.amoro.myapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);    // TODO: Mit hív? Miért? //onCreate felülírja az ősosztálya metódust a savedInstanceState-et, elmenti az alkalmazás állapotát
        setContentView(R.layout.activity_main);    // TODO: Mit állít be?// a kezdőfelületet állítja be, a főképernyőt
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);    // TODO: És ezek? az action menüt állítja be
        setSupportActionBar(toolbar);


        // TODO: Mit fog csinálni a gomb?// meghívja a snackbar-t hosszan és Replace with your own action" felírattal
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    //TODO: Mikor hívódik meg? / ha a lefut az OncreatOptionsMenu és értéke true
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    // TODO: Mikor hívódik meg?  ha a lefut az onOptionsItemSelected  és értéke true
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        //TODO: Mit csinál?Mikor? //ha az id értéke megegyezik az R.id.action_settings-el
        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
