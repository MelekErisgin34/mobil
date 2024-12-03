package com.example.uygulama1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btnTikla;

    EditText etAd;

    TextView tvmesaj;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


            btnTikla=findViewById(R.id.button_tikla);
            etAd=findViewById(R.id.editTextText);
            tvmesaj=findViewById(R.id.TextView_Mesaj);

           btnTikla.setOnClickListener(new View.OnClickListener() {


               @Override
               public void onClick(View v) {
                   String ad=etAd.getText().toString();
                   Toast.makeText(MainActivity.this, "Hosgeldiniz"+ad, Toast.LENGTH_SHORT).show();
                   tvmesaj.setText("hosgeldiniz"+ad);

                  mesajver(ad);
               }

               private void mesajver(String ad) {
                   Toast.makeText(MainActivity.this, "Hosgeldiniz "+ad, Toast.LENGTH_SHORT).show();


               }
           });




    }
}