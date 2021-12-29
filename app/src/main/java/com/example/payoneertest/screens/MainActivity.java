package com.example.payoneertest.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.example.payoneertest.R;
import com.example.payoneertest.network.NetworkService;
import com.example.payoneertest.response.Applicable;
import com.example.payoneertest.response.Networks;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
    }

    @OnClick(R.id.bt_make_payment)
    void MakePaymentButton() {
        startActivity(new Intent(this, MakePaymentActivity.class));
    }
}