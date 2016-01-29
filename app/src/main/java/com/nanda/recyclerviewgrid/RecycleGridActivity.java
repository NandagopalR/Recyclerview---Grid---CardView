package com.nanda.recyclerviewgrid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nandagopal on 28/1/16.
 */
public class RecycleGridActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private RecycleAdapter mAdapter;
    private List<Detail> mList = new ArrayList<>();

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for (int i = 0; i < 30; i++) {
            mList.add(new Detail("Android", i));
        }
        mRecyclerView = (RecyclerView) findViewById(R.id.cardList);
        mRecyclerView.setLayoutManager(new GridLayoutManager(RecycleGridActivity.this, 2));
        mAdapter = new RecycleAdapter(this, mList);
        mRecyclerView.setAdapter(mAdapter);
        mAdapter.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                makeToast("" + mList.get(position).getPosition());
            }
        });

    }

    /**
     * Called when a grid item is clicked
     *
     * @param input The value of the grid item which is displayed by position
     */
    private void makeToast(String input) {
        Toast.makeText(this, input, Toast.LENGTH_SHORT).show();
    }
}