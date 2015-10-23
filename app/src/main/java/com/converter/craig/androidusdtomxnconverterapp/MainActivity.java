package com.converter.craig.androidusdtomxnconverterapp;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {

    public void convertBtnClick(View view){
        EditText input = (EditText) findViewById(R.id.usdAmt);
        TextView output = (TextView) findViewById(R.id.mxnAmt);
        String convertedOutput = String.valueOf(convertUSDToMxn(Double.parseDouble(input.getText().toString())));

        output.setText(convertedOutput);
        Toast.makeText(getApplicationContext(), convertedOutput, Toast.LENGTH_LONG).show();
    }

    public double convertUSDToMxn(double usdAmt){
        double mxnConversionRate = 16.60;
       return usdAmt * mxnConversionRate;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
}
