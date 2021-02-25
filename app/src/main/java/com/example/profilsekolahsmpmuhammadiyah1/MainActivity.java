package com.example.profilsekolahsmpmuhammadiyah1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void profil(View view){
        Intent intent=new Intent(MainActivity.this, ProfilActivity.class);
        startActivity(intent);
    }
    public void prestasi(View view){
        Intent intent=new Intent(MainActivity.this, PrestasiActivity.class);
        startActivity(intent);
    }
    public void absensi(View view){
        Intent intent=new Intent(MainActivity.this, Visi_Misi_Activity.class);
        startActivity(intent);
    }
    public void tugas(View view){
        Intent intent=new Intent(MainActivity.this, AgendaActivity.class);
        startActivity(intent);
    }
    public void ekstrakulikuler(View view){
        Intent intent=new Intent(MainActivity.this, EkstrakulikulerActivity.class);
        startActivity(intent);
    }

    public void informasi(View view){
        Intent intent=new Intent(MainActivity.this, InformasiActivity.class);
        startActivity(intent);
    }

}