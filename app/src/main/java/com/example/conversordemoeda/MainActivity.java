package com.example.conversordemoeda;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText input =findViewById(R.id.editText);
        Button button = findViewById(R.id.button);
        TextView textView = findViewById(R.id.result);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(input.getText().toString().equals("")){
                    Toast.makeText(view.getContext(),"Campos Vazios!",Toast.LENGTH_SHORT).show();
                }else{


                    double real = Double.parseDouble(input.getText().toString());
                    input.setText("");
                    textView.setText(String.format("$ %.2f", real/5.57));
                }



            }
        });

    }
}