package com.example.navigationtry;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CareerPathAdapter extends RecyclerView.Adapter<CareerPathAdapter.ViewHolder>{
    //    private CareerPathModel[] listdata;
    ArrayList<CareerPathModel> listdata = new ArrayList<>();

    // RecyclerView recyclerView;
    public CareerPathAdapter(ArrayList<CareerPathModel> listdata) {
        this.listdata = listdata;

    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.item_career_path, parent, false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final ArrayList<CareerPathModel>  myListData = listdata;
        holder.textView.setText(listdata.get(position).getDescription());
        holder.imageView.setImageResource(listdata.get(position).getImgId());
        holder.leanear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(),"click on item: "+myListData.get(position).getDescription(),Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return listdata.size();

    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView imageView;
        public TextView textView;
        public LinearLayout leanear;
        public ViewHolder(View itemView) {
            super(itemView);
            this.imageView = (ImageView) itemView.findViewById(R.id.img_career);
            this.textView = (TextView) itemView.findViewById(R.id.tv_career);
            leanear = (LinearLayout)itemView.findViewById(R.id.llayout);
        }
    }
}