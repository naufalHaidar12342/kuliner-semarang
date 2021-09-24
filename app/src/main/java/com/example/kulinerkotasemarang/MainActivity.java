package com.example.kulinerkotasemarang;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recViewKuliner;
    //
    private ArrayList<Masakan> listMasakan;

    //
    private MasakanAdapter.RVMasakanListener listener;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //
        recViewKuliner=findViewById(R.id.RecyclerViewMasakan);

        //
        isiData();
        setOnClickListener();
        recViewKuliner.setAdapter(new MasakanAdapter(listMasakan,listener));
        recViewKuliner.setLayoutManager(new LinearLayoutManager(this));

    }

    private void setOnClickListener() {
        listener= new MasakanAdapter.RVMasakanListener() {
            @Override
            public void onClick(View views, int position) {
                Intent intent = new Intent(getApplicationContext(), detail_masakan.class);
                intent.putExtra("namaMasakan", listMasakan.get(position).getNamaMasakan());
                intent.putExtra("deskripsi", listMasakan.get(position).getDescMasakan());
                intent.putExtra("harga", listMasakan.get(position).getHargaMasakan());
                intent.putExtra("gambar_id",listMasakan.get(position).getIdPhoto());
                startActivity(intent);
            }
        };
    }

    private void isiData(){
        this.listMasakan=new ArrayList<>();
        //
        listMasakan.add(new Masakan(
                "Sate Ayam",
                "Sate ayam 20 tusuk dengan sambal kacang terpisah",
                "Rp. 15.000",
                R.drawable.chicken_satay_bali
        ));

        listMasakan.add(new Masakan(
                "Mie Goreng",
                "Mie kuning dengan pedas sesuai selera (1-4 cabai)",
                "Rp. 12.000",
                R.drawable.fried_noodle
        ));

        listMasakan.add(new Masakan(
                "Mie Rebus",
                "Mie kuning rebus dengan kuah dipisah.",
                "Rp. 12.000",
                R.drawable.instant_noodle
        ));

        listMasakan.add(new Masakan(
                "Mie Kwetiau",
                "Mie kuning rebus dengan kuah dipisah.",
                "Rp. 12.000",
                R.drawable.instant_noodle
        ));


    }
}