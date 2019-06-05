package com.example.hermespaq;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Maria_Mejia extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maria__mejia);

        button = (Button) findViewById(R.id.volver3);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity();
            }
        });
    }
    public void startActivity() {
        Intent intent = new Intent(this, Customers.class);
        startActivity(intent);
    }
}
