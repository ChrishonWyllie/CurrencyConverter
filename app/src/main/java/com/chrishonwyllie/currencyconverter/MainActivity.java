package com.chrishonwyllie.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    public void convert(View view) {

        EditText dollarField = (EditText)findViewById(R.id.currencyField);

        Double dollarAmount = Double.parseDouble(dollarField.getText().toString());

        Double poundAmount = dollarAmount * 0.65;

        Log.i("pound amount", poundAmount.toString());

        Toast.makeText(getApplicationContext(), poundAmount.toString() + " pounds", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
