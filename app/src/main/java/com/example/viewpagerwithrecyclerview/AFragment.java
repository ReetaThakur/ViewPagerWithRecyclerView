package com.example.viewpagerwithrecyclerview;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class AFragment extends Fragment {
    private RecyclerView recyclerView;
    private ArrayList<Model> modelArrayList=new ArrayList<>();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_a, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView=view.findViewById(R.id.recyclerView);
        BuildDataForAdapter();
        setAdapter();
    }

    private void setAdapter() {
        FragmentAdapter adapter=new FragmentAdapter(modelArrayList);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adapter);
    }

    private void BuildDataForAdapter() {
        modelArrayList.add(new Model("Reeta Thakur"));
        modelArrayList.add(new Model("Shailee verma"));
        modelArrayList.add(new Model("Rupali Mishra"));
        modelArrayList.add(new Model("Ritu Shirivastrava"));
        modelArrayList.add(new Model("Pranjal Singh"));
        modelArrayList.add(new Model("Leena Shukla"));
        modelArrayList.add(new Model("Ruchi Thakur"));
        modelArrayList.add(new Model("Deeksha Thakur"));
        modelArrayList.add(new Model("Rajkumari Sharma"));
        modelArrayList.add(new Model("Umange Mishra"));
        modelArrayList.add(new Model("Sachin Modi"));
        modelArrayList.add(new Model("Shubham Thakur"));
        modelArrayList.add(new Model("Rahul Yadav"));
        modelArrayList.add(new Model("Abhimanyu Mishra"));
        modelArrayList.add(new Model("Vijay Verma"));
    }
}