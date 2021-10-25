package com.example.recyclev_tugas;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class ContentAdapter extends RecyclerView.Adapter<ContentAdapter.ContentViewHolder> {

    private ArrayList<Content> datalist;

    public ContentAdapter (ArrayList<Content>datalist){
        this.datalist = datalist;
    }

    @NonNull
    @Override
    public ContentAdapter.ContentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item, parent, false);
        return new ContentViewHolder(view);
    }

    public void onBindViewHolder(ContentViewHolder holder, int position){
        holder.txtStatus.setText(datalist.get(position).getStatus());
        holder.txtNama.setText(datalist.get(position).getNama());
        holder.profile_image.setImageResource(datalist.get(position).getPhoto());
    }

    @Override
    public int getItemCount() {
        return (datalist != null) ? datalist.size() : 0;
    }

    public class ContentViewHolder extends RecyclerView.ViewHolder{
        private TextView txtStatus, txtNama;
        private CircleImageView profile_image;

        public ContentViewHolder(View itemView){
            super(itemView);
            txtStatus = (TextView) itemView.findViewById(R.id.txt_status);
            txtNama = (TextView) itemView.findViewById(R.id.txt_nama);
            profile_image= (CircleImageView) itemView.findViewById(R.id.profile_image);
        }
    }

}
