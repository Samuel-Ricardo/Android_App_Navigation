package com.example.appnavegaodetelas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class second_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_page);
        Button navigateor_button = (Button) findViewById(R.id.button);
    }

    public void navigate_to_first_page(View view){

        Intent itent = new Intent(this, MainActivity.class);
        startActivity(itent);
    }
}
