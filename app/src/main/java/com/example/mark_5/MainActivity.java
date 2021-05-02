package com.example.mark_5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    MyAdapter adapter;
    RecyclerView recyclerView;
    ArrayList<ItemModel> list = new ArrayList<>();
    Button btnFragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initButton();


    }
    private void initButton(){
        btnFragment = findViewById(R.id.btn_frag);
        btnFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction =
                        MainActivity.this.getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frag_con, FirstFragment.newInstance());
                transaction.commit();
            }
        });
    }
}