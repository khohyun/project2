package com.example.myproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView Text1,Text2;
    CheckBox ChkAgree;
    RadioGroup Rgruop1;
    RadioButton Rdog,Rcat,Rrabbit;
    Button btnok;
    ImageView imgpet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("애완동물 사진 보기");

        Text1 = findViewById(R.id.Text1);
        ChkAgree = findViewById(R.id.ChkAgree);
        Text2 = findViewById(R.id.Text2);
        Rgruop1 = findViewById(R.id.Rgroup1);
        Rdog = findViewById(R.id.Rdog);
        Rcat = findViewById(R.id.Rcat);
        Rrabbit = findViewById(R.id.Rrabbit);
        btnok = findViewById(R.id.btnok);
        imgpet = findViewById(R.id.imgpet);

        ChkAgree.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(ChkAgree.isChecked() == true) {
                    Text2.setVisibility(View.VISIBLE);
                    Rgruop1.setVisibility(View.VISIBLE);
                    btnok.setVisibility(View.VISIBLE);
                    imgpet.setVisibility(View.VISIBLE);
                }
                else {
                    Text2.setVisibility(View.INVISIBLE);
                    Rgruop1.setVisibility(View.INVISIBLE);
                    btnok.setVisibility(View.INVISIBLE);
                    imgpet.setVisibility(View.INVISIBLE);
                }
            }
        });

        btnok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (Rgruop1.getCheckedRadioButtonId()) {
                    case R.id.Rdog:
                        imgpet.setImageResource(R.drawable.dog1);
                        break;
                    case R.id.Rcat:
                        imgpet.setImageResource(R.drawable.cat1);
                        break;
                    case R.id.Rrabbit:
                        imgpet.setImageResource(R.drawable.rabbit1);
                        break;
                    default:
                        Toast.makeText(getApplicationContext(),"동물 먼저 선택하세요",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
