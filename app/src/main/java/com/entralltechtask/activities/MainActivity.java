package com.entralltechtask.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;

import com.entralltechtask.R;
import com.entralltechtask.adapter.UserAdapter;
import com.entralltechtask.model.UserModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
{

    SearchView user_search;
    RecyclerView users_recyclerView;
    UserAdapter userAdapter;
    ArrayList<UserModel> userModelList;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}
