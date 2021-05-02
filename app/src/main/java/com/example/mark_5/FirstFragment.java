package com.example.mark_5;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class FirstFragment extends Fragment {
    MyAdapter adapter;
    RecyclerView recyclerView;
    ArrayList<ItemModel> list = new ArrayList<>();

    public static FirstFragment newInstance() {

        Bundle args = new Bundle();

        FirstFragment fragment = new FirstFragment();
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_first, container, false);
        recyclerView = view.findViewById(R.id.rv);
        setupRV();
        return view;
    }

    private void setupRV(){
        adapter = new MyAdapter();
        recyclerView.setAdapter(adapter);

        RecyclerView.LayoutManager manager = new LinearLayoutManager(requireContext(),
                RecyclerView.VERTICAL, false);
        recyclerView.setLayoutManager(manager);

        list = new ArrayList<>();
        list.add(new ItemModel("Картофельные рулетки", R.drawable.rulety));
        list.add(new ItemModel("Рисовые котлеты", R.drawable.kotlety));
        list.add(new ItemModel("Рататуй", R.drawable.ratatui));
        list.add(new ItemModel("Овощное рагу", R.drawable.ragu));
        list.add(new ItemModel("Овощная лазанья", R.drawable.lazanya));
        list.add(new ItemModel("Лобио", R.drawable.lobio));
        list.add(new ItemModel("Булгур по турецки", R.drawable.bulgur));
        list.add(new ItemModel("Лагман", R.drawable.lagman));
        list.add(new ItemModel("Морковный торт", R.drawable.tort));
        adapter.addText(list);
    }
}