package com.example.career_predictor;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;



public class Myadapter extends RecyclerView.Adapter<Myadapter.MyViewHolder> {

    String data1[];
    Context context;
    int images[];

    public Myadapter(Context ct, String s1[], int img[]) {
        context = ct;
        data1 = s1;
        images = img;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.my_row, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.myText1.setText(data1[position]);
        holder.myImage.setImageResource(images[position]);


    }

    @Override
    public int getItemCount() {

        return data1.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView myText1;
        ImageView myImage;

        public MyViewHolder(View itemView) {
            super(itemView);
            myText1 = itemView.findViewById(R.id.myText1);
            myImage = itemView.findViewById(R.id.myimageView);
            itemView.setClickable(true);
            itemView.setOnClickListener(this);
        }


        @Override
        public void onClick(View v) {

            final Intent intent;
            if (getAdapterPosition() == 0)
            {
                intent =  new Intent(context, Auditor.class);
            }
            else if (getAdapterPosition() == 1)
            {
                intent =  new Intent(context, Financial_Analyst.class);
            }
            else if (getAdapterPosition() == 2)
            {
                intent =  new Intent(context, Statistician.class);
            }
            else if (getAdapterPosition() == 3)
            {
                intent =  new Intent(context, Manager.class);
            }
            else if (getAdapterPosition() == 4)
            {
                intent =  new Intent(context, Consultant.class);
            }
            else if (getAdapterPosition() == 5)
            {
                intent =  new Intent(context, Archivist.class);
            }
            else if (getAdapterPosition() == 6)
            {
                intent =  new Intent(context, Teacher.class);
            }
            else if (getAdapterPosition() == 7)
            {
                intent =  new Intent(context, Journalist.class);
            }
            else if (getAdapterPosition() == 8)
            {
                intent =  new Intent(context, Psychologist.class);
            }
            else if (getAdapterPosition() == 9)
            {
                intent =  new Intent(context, Counsellor.class);
            }
            else if (getAdapterPosition() == 10)
            {
                intent =  new Intent(context, Clinical_Psycho.class);
            }

            else
                {
                intent =  new Intent(context, Auditor.class);
            }
            context.startActivity(intent);
        }


    }
}














