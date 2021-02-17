package com.example.profilsekolahsmpmuhammadiyah1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class EkstrakulikulerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ekstrakulikuler);
    }
    public void btq(View view){
        Intent intent=new Intent(EkstrakulikulerActivity.this, BtqActivity.class);
        startActivity(intent);
    }
    public void bulutangkis(View view){
        Intent intent=new Intent(EkstrakulikulerActivity.this, BuluTangkisActivity.class);
        startActivity(intent);
    }
    public void futsal(View view){
        Intent intent=new Intent(EkstrakulikulerActivity.this, FutsalActivity.class);
        startActivity(intent);
    }
    public void silat(View view){
        Intent intent=new Intent(EkstrakulikulerActivity.this, SilatActivity.class);
        startActivity(intent);
    }

}