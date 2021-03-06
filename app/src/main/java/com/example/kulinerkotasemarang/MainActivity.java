package com.example.kulinerkotasemarang;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    /*Pada file XML, komponen yang sudah ditambahkan,
    * belum memiliki logic. Oleh karena itu, kita berikan
    * logic di dalam file java yang berkaitan dengan activity-nya*/
    private RecyclerView recViewKuliner;

    //
    private ArrayList<Masakan> listMasakan;

    //memanggil interface class RVMasakanListener
    private MasakanAdapter.RVMasakanListener listener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //menghubungkan RecyclerView dengan id recyclerView pada XML
        recViewKuliner=findViewById(R.id.RecyclerViewMasakan);

        //memanggil fungsi isi data untuk mengisi arrayList
        isiData();

        //memanggil fungsi onclicklistener yang akan mengirim data
        // melalui intent
        setOnClickListener();

        //set adapter yang digunakan untuk recyclerView
        // (akan mengirim arrayList dari mainActivity dan listener)
        recViewKuliner.setAdapter(new MasakanAdapter(listMasakan,listener));

        //set tipe layout yang akan digunakan oleh recyclerView
        recViewKuliner.setLayoutManager(new LinearLayoutManager(this));

    }
    // fungsi onclick (ketika viewholder/card di klik)
    private void setOnClickListener() {
        listener= new MasakanAdapter.RVMasakanListener() {
            @Override
            public void onClick(View views, int position) {
                //mengirimkan data lewat intent
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
                "Lunpia Kering",
                "Lunpia goreng dengan isian tunas bambu (1 box/10 buah)",
                "Rp. 15.000",
                R.drawable.lumpia_kering
        ));

        listMasakan.add(new Masakan(
                "Bandeng Juwana-Elrina",
                "Ikan Bandeng dengan duri yang lunak. ",
                "Rp. 170.000/kg",
                R.drawable.bandeng_juwana_elrina
        ));

        listMasakan.add(new Masakan(
                "Wingko Babat",
                "Kue yang terbuat dari kelapa muda, tepung beras, ketan dan gula. " +
                        "Tersedia dalam berbagai rasa, seperti coklat, original (kelapa muda), " +
                        "nangka, durian, dan sebagainya. (1 besek)",
                "Rp. 70.000",
                R.drawable.wingko_kelapa_muda
        ));

        listMasakan.add(new Masakan(
                "Roti Ganjel Rel",
                "Roti berbentuk balok, berwarna coklat yang ditaburi biji wijen " +
                        "dan diberi perasa kayu manis dan gula jawa.",
                "Rp. 50.000",
                R.drawable.roti_ganjel_rel
        ));


    }
}