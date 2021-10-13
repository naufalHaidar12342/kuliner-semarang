package com.example.kulinerkotasemarang;

import androidx.annotation.DrawableRes;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class detail_masakan extends AppCompatActivity {
    TextView terimaMasakan, terimaDesc, terimaHarga;
    ImageView terimaIDGambar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_masakan);

        //menyambungkan xml dengan variabel di java
        terimaMasakan= findViewById(R.id.masakanDetail);
        terimaDesc=findViewById(R.id.deskripsiDetail);
        terimaHarga=findViewById(R.id.hargaDetail);
        terimaIDGambar= findViewById(R.id.imgDetail);

        String masakan="",shortdesc="",harga="";
        int img=0 ;

        //mengambil kiriman dari intent pada activity pertama
        Bundle extra=getIntent().getExtras();
        if (extra!=null){
            masakan=extra.getString("namaMasakan");
            shortdesc=extra.getString("deskripsi");
            harga= extra.getString("harga");
            //img= extra.getInt("gambar_detail",0);
            img=getIntent().getIntExtra("gambar_id",0);


        }

        //set text dan gambar di activity kedua
        //(detail masakan)
        terimaMasakan.setText(masakan);
        terimaDesc.setText(shortdesc);
        terimaHarga.setText(harga);
        terimaIDGambar.setImageResource(img);
        //Glide.with(this).load(img).into(terimaIDGambar);
    }
}