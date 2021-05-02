package com.example.mark_5;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {

    TextView textView;
    ImageView imageView;
    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        textView = itemView.findViewById(R.id.txt_name);
        imageView = itemView.findViewById(R.id.img_1);
    }
    public void onBind(ItemModel list){
        textView.setText(list.name);
        imageView.setImageResource(list.img);

    }

}
