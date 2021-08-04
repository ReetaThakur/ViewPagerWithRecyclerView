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


public class CFragment extends Fragment {
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
        modelArrayList.add(new Model("Munnar"));
        modelArrayList.add(new Model("Love Lacke"));
        modelArrayList.add(new Model("Bhootan"));
        modelArrayList.add(new Model("Paris"));
        modelArrayList.add(new Model("Taj Mahal"));
        modelArrayList.add(new Model("Holy city Varanasi"));
        modelArrayList.add(new Model("Harmandir"));
        modelArrayList.add(new Model("Golden City"));
        modelArrayList.add(new Model("Red Fort"));
        modelArrayList.add(new Model("Gateway of India"));
        modelArrayList.add(new Model("Mecca Masjid"));
        modelArrayList.add(new Model("Amer Fort"));
        modelArrayList.add(new Model("Beaches of Goa"));
        modelArrayList.add(new Model("Periyar National Park"));
        modelArrayList.add(new Model("Agra Fort"));
    }
}