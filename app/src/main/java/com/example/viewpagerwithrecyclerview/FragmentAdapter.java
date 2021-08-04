package com.example.viewpagerwithrecyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FragmentAdapter extends RecyclerView.Adapter<FragmentViewHolder> {
    private ArrayList<Model> modelsList;
    public FragmentAdapter(ArrayList<Model>modelsList){
        this.modelsList=modelsList;
    }
    @NonNull
    @Override
    public FragmentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);
        return new FragmentViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull  FragmentViewHolder holder, int position) {
        Model model=modelsList.get(position);
        holder.setData(model);

    }

    @Override
    public int getItemCount() {
        return modelsList.size();
    }
}
