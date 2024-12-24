package com.example.uygulama1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    CheckBox checkBoxCorba,checkBoxKofte,checkBoxPilav,checkBoxSarma,checkBoxSutlac;
    EditText editTextCorba,editTextKofte,editTextPilav,editTextSarma,editTextSutlac;

    Button buttonSiparis;

    TextView textViewOzet;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        checkBoxCorba = findViewById(R.id.checkBox_corba);
        checkBoxKofte = findViewById(R.id.checkBox_kofte);
        checkBoxPilav = findViewById(R.id.checkBox_pilav);
        checkBoxSarma = findViewById(R.id.checkBox_sarma);
        checkBoxSutlac = findViewById(R.id.checkBox_sutlac);
        editTextCorba = findViewById(R.id.editTextNumber_corba);
        editTextKofte = findViewById(R.id.editTextNumber_kofte);
        editTextPilav = findViewById(R.id.editTextNumber_pilav);
        editTextSarma = findViewById(R.id.editTextNumber_sarma);
        editTextSutlac = findViewById(R.id.editTextNumber_sutlac);
        buttonSiparis = findViewById(R.id.button_siparis);
        textViewOzet = findViewById(R.id.textView_ozet);

        buttonSiparis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float corbaFiyat=100,kofteFiyat=200,pilavFiyat=100,sarmaFiyat=350,sutlacFiyat=140;
                float toplamTutar=0;
                String s="Sipariş Özeti:\n --------------\n";



                if (checkBoxCorba.isChecked()) {
                    String corbaAdetStr = editTextCorba.getText().toString();
                    if (!corbaAdetStr.isEmpty()) {
                        int corbaAdet = Integer.parseInt(corbaAdetStr);
                        s += ("Çorba: " + corbaAdet + " adet\n");
                        toplamTutar += corbaAdet * corbaFiyat;
                    }
                }

                if (checkBoxKofte.isChecked()) {
                    String kofteAdetStr = editTextKofte.getText().toString();
                    if (!kofteAdetStr.isEmpty()) {
                        int kofteAdet = Integer.parseInt(kofteAdetStr);
                        s += ("Köfte: " + kofteAdet + " adet\n");
                        toplamTutar += kofteAdet * kofteFiyat;
                    }
                }



                if (checkBoxPilav.isChecked()) {
                    String pilavAdetStr = editTextPilav.getText().toString();
                    if (!pilavAdetStr.isEmpty()) {
                        int pilavAdet = Integer.parseInt(pilavAdetStr);
                        s += ("Pilav: " + pilavAdet + " adet\n");
                        toplamTutar += pilavAdet * pilavFiyat;
                    }
                }

                if (checkBoxSarma.isChecked()) {
                    String sarmaAdetStr = editTextSarma.getText().toString();
                    if (!sarmaAdetStr.isEmpty()) {
                        int sarmaAdet = Integer.parseInt(sarmaAdetStr);
                        s += ("Sarma: " + sarmaAdet + " adet\n");
                        toplamTutar += sarmaAdet * sarmaFiyat;
                    }
                }


                if (checkBoxSutlac.isChecked()) {
                    String sutlacAdetStr = editTextSutlac.getText().toString();
                    if (!sutlacAdetStr.isEmpty()) {
                        int sutlacAdet = Integer.parseInt(sutlacAdetStr);
                        s += ("Sütlaç: " + sutlacAdet + " adet\n");
                        toplamTutar += sutlacAdet * sutlacFiyat;
                    }
                }

                textViewOzet.setText(s+"---\nToplam Tutar :"+toplamTutar);

            }
        });
    }




}