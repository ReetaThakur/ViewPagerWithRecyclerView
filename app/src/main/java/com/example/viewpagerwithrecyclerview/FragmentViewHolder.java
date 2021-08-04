package com.example.viewpagerwithrecyclerview;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class FragmentViewHolder  extends RecyclerView.ViewHolder {
    private TextView item;
    public FragmentViewHolder(@NonNull  View itemView) {
        super(itemView);
        item=itemView.findViewById(R.id.name);
    }
    public void setData(Model model){
        item.setText(model.getName());
    }
}
