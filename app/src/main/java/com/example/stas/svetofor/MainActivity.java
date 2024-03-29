package com.example.stas.svetofor;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RelativeLayout;


public class MainActivity extends Activity {
    private RelativeLayout mRelativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRelativeLayout = (RelativeLayout)findViewById(R.id.relativeLayout);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void clickButtonRed(View view) {
        mRelativeLayout.setBackgroundColor(getResources().getColor(R.color.colorRed));
    }
    public void clickButtonGreen(View view) {
        mRelativeLayout.setBackgroundColor(getResources().getColor(R.color.colorGreen));
    }
    public void clickButtonYellow(View view) {
        mRelativeLayout.setBackgroundColor(getResources().getColor(R.color.colorYellow));
    }

    public void clickAbout(MenuItem item) {
        Intent intent;
        intent = new Intent(MainActivity.this, AboutActivity.class);
        startActivity(intent);
    }
}
