package com.cieep.ejercicio01;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView lblTiempo;
    private TextView lblTemperatura;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lblTiempo = findViewById(R.id.lblTiempo);
        lblTemperatura = findViewById(R.id.lblTemperatura);
        lblTiempo.setText("");
        lblTemperatura.setText("");
    }

    public void setTemperatura(View view) {
        Button btn = (Button) view;
        lblTemperatura.setText(btn.getText());
    }

    public void setTiempo(View view) {
        Button btn = (Button) view;
        lblTiempo.setText(btn.getText());
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("TIME", lblTiempo.getText().toString());
        outState.putString("TEMP", lblTemperatura.getText().toString());
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        lblTemperatura.setText(savedInstanceState.getString("TIME"));
        lblTiempo.setText(savedInstanceState.getString("TEMP"));
    }
}