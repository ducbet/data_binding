package com.example.tmd.data_binding;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private ItemAdapter mAdapter;
    private List<Item> mList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        mList = new ArrayList<>();
        mList.add(new Item(R.mipmap.ic_launcher, "TMD"));
        mList.add(new Item(R.mipmap.ic_launcher, "123"));
        mList.add(new Item(R.mipmap.ic_launcher, "asjdkajsdk"));
        mAdapter = new ItemAdapter(this, mList);
        mRecyclerView.setLayoutManager(
                new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        mRecyclerView.setAdapter(mAdapter);
    }
}
