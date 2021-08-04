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


public class BFragment extends Fragment {


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
        modelArrayList.add(new Model("Indoor"));
        modelArrayList.add(new Model("Bhopal"));
        modelArrayList.add(new Model("Surat"));
        modelArrayList.add(new Model("Delhi"));
        modelArrayList.add(new Model("Mumbai"));
        modelArrayList.add(new Model("Kaimer"));
        modelArrayList.add(new Model("Gwalior"));
        modelArrayList.add(new Model("Ujjan"));
        modelArrayList.add(new Model("Jabalpur"));
        modelArrayList.add(new Model("Jaipur"));
        modelArrayList.add(new Model("Chanai"));
        modelArrayList.add(new Model("Asam"));
        modelArrayList.add(new Model("Kantmandu"));
        modelArrayList.add(new Model("Shimla"));
        modelArrayList.add(new Model("Surat"));
    }
}
