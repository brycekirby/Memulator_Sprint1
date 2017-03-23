package edu.kirbybpvcu.memulator_sprint1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.view.View.OnClickListener;
import android.content.Intent;
import android.view.View;


public class Memulator extends AppCompatActivity {


    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;

    private TextView Text1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        Button NewClassVar = (Button) findViewById(R.id.button4);


        NewClassVar.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Memulator.this, FinalGradePage.class));
            }


        });

    }
}
