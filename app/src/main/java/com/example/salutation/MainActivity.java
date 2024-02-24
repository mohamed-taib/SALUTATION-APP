package com.example.salutation;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    EditText ed ;
    RadioButton h , f ;
    RadioGroup r ;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed=findViewById(R.id.editTextText) ;
        h=findViewById(R.id.radioButton) ;
        f=findViewById(R.id.radioButton2) ;
        r=findViewById(R.id.radio) ;

    }

    public void Click(View view) {
        if (f != null && f.isChecked()) {
            if (ed != null && ed.getText() != null) {
                String name = ed.getText().toString();
                if (!name.isEmpty()) {
                    //Toast.makeText(this, "Bonjour madame " + name, Toast.LENGTH_LONG).show();
                    Snackbar.make(view , "Bonjour madame " + name,Snackbar.LENGTH_LONG).show();
                } else {
                    Log.e("MainActivity", "EditText is empty when 'Femme' is selected");
                }
            } else {
                Log.e("MainActivity", "EditText is null when 'Femme' is selected");
            }
        } else if (h != null && h.isChecked()) {
            if (ed != null && ed.getText() != null) {
                String name = ed.getText().toString();

                if (!name.isEmpty()) {
                    Toast.makeText(this, "Bonjour monsieur " + name, Toast.LENGTH_LONG).show();
                    //Snackbar.make(view , "Bonjour monsieur " + name,Snackbar.LENGTH_LONG).show();
                } else {
                    Log.e("MainActivity", "EditText is empty when 'Homme' is selected");
                }
            } else {
                Log.e("MainActivity", "EditText is null when 'Homme' is selected");
            }
        }
    }

}


