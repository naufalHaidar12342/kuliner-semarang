package com.example.kulinerkotasemarang;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MasakanAdapter extends RecyclerView.Adapter<MasakanAdapter.ViewHolderMasakan> {
    private final ArrayList<Masakan> listMasakan;

    private final RVMasakanListener listener;

    /*konstruktor class MasakanAdapter
    * akan menerima arrayList dari MainActivity beserta listener*/
    public MasakanAdapter(ArrayList<Masakan> listMasakan, RVMasakanListener listener) {
        this.listMasakan = listMasakan;
        this.listener=listener;
    }
    //class ViewHolder, dimana setiap card masakan
    //akan menjadi view holder
    public class ViewHolderMasakan extends RecyclerView.ViewHolder implements View.OnClickListener {
        public TextView txtMasakan, txtDeskripsi, txtHarga;
        public ImageView imgviewMasakan;

        //membuat variabel bertipe RelativeLayout
        // (untuk set gambar dan teks ke dalam card)
        public RelativeLayout cardDetail;

        //konstruktor viewHolder
        public ViewHolderMasakan(@NonNull View itemView) {
            super(itemView);

            //menyambungkan property di xml dengan variabel di java
            txtMasakan= itemView.findViewById(R.id.textMasakan);
            txtDeskripsi= itemView.findViewById(R.id.textDeskripsi);
            txtHarga= itemView.findViewById(R.id.textHarga);
            imgviewMasakan= itemView.findViewById(R.id.imageMasakan);


            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            listener.onClick(view,getBindingAdapterPosition());

        }
    }

    @NonNull
    @Override
    public MasakanAdapter.ViewHolderMasakan onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context konteks= parent.getContext();
        LayoutInflater inflater=LayoutInflater.from(konteks);
        ViewHolderMasakan holder=new ViewHolderMasakan(inflater.inflate(R.layout.card_kuliner,parent,false));
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MasakanAdapter.ViewHolderMasakan holder, int position) {
        Masakan ambilMasakan=listMasakan.get(position);
        holder.txtMasakan.setText(ambilMasakan.getNamaMasakan());
        holder.txtDeskripsi.setText(ambilMasakan.getDescMasakan());
        holder.txtHarga.setText(ambilMasakan.getHargaMasakan());
        holder.imgviewMasakan.setImageResource(ambilMasakan.getIdPhoto());

    }

    @Override
    public int getItemCount() {
        return listMasakan.size();
    }

    public interface RVMasakanListener{
        void onClick(View views, int position);
    }
}
