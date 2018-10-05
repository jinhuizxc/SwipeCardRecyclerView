package com.jinhui.swipecardrecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.jinhui.swipecardrecyclerview.widget.ItemRemovedListener;
import com.jinhui.swipecardrecyclerview.widget.SwipeCardRecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private SwipeCardRecyclerView mRecyclerView;
    private MyAdapter mAdapter;

    List<String> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (SwipeCardRecyclerView) findViewById(R.id.recyclerView);
        // 自定义layout管理器
        mRecyclerView.setLayoutManager(new SwipeCardLayoutManager());

        for (int i = 0; i < 10; i++) {
            list.add(String.valueOf(i));
        }

        mAdapter = new MyAdapter(this, list);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setRemovedListener(new ItemRemovedListener(){

            @Override
            public void onRightRemoved() {
                Toast.makeText(MainActivity.this, list.get(list.size() - 1) + " was right removed", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onLeftRemoved() {
                Toast.makeText(MainActivity.this, list.get(list.size() - 1) + " was left removed", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
