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

    public MasakanAdapter(ArrayList<Masakan> listMasakan, RVMasakanListener listener) {
        this.listMasakan = listMasakan;
        this.listener=listener;
    }

    public class ViewHolderMasakan extends RecyclerView.ViewHolder implements View.OnClickListener {
        public TextView txtMasakan, txtDeskripsi, txtHarga;
        public ImageView imgviewMasakan;

        //
        public RelativeLayout cardDetail;

        public ViewHolderMasakan(@NonNull View itemView) {
            super(itemView);

            //
            txtMasakan= itemView.findViewById(R.id.textMasakan);
            txtDeskripsi= itemView.findViewById(R.id.textDeskripsi);
            txtHarga= itemView.findViewById(R.id.textHarga);
            imgviewMasakan= itemView.findViewById(R.id.imageMasakan);

            //
//            this.cardDetail= (RelativeLayout) itemView.findViewById(R.id.masakanLayout);

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

        /*

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Toast.makeText(holder.itemView.getContext(),ambilMasakan.getDescMasakan(),Toast.LENGTH_LONG).show();
            }
        });
*/
    }

    @Override
    public int getItemCount() {
        return listMasakan.size();
    }

    public interface RVMasakanListener{
        void onClick(View views, int position);
    }
}
