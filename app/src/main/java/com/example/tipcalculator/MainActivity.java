package com.example.tipcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private double currentBillTotal; //סכום החיוב
    private int currentCustomPrecent; // אחוז הטיפ שנקבע בסיק בר

    private EditText billEditText;
    private EditText tip10EditText;
    private EditText total10EditText;
    private EditText tip15EditText;
    private EditText total15EditText;
    private EditText tip20EditText;
    private EditText total20EditText;

    private TextView customTipTextView;
    private EditText tipCustomEditText;

    private EditText totalCustomEditText;

    private SeekBar customSeekBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
