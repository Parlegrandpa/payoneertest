package com.example.payoneertest.screens;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.payoneertest.R;
import com.example.payoneertest.adapter.PaymentMethodAdapter;
import com.example.payoneertest.network.NetworkService;
import com.example.payoneertest.response.Applicable;
import com.example.payoneertest.response.Networks;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MakePaymentActivity extends AppCompatActivity {

    PaymentMethodAdapter adapter;

    @BindView(R.id.card_list)
    RecyclerView cardList;

    @BindView(R.id.tv_no_record_found)
    TextView noRecordFoundText;

    @BindView(R.id.progressBar)
    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_make_payment);

        ButterKnife.bind(this);

        setupActionBar();
        initViews();
    }

    void setupActionBar() {
        ImageView toolbarBack = findViewById(R.id.back_button);
        toolbarBack.setOnClickListener(v -> finish());
    }

    void initViews() {
        NetworkService networkService = new NetworkService();

        progressBar.setVisibility(View.VISIBLE);
        noRecordFoundText.setVisibility(View.GONE);
        cardList.setVisibility(View.GONE);

        networkService.fetchList((data, isFaulted, error) -> {

            if (isFaulted) {
                progressBar.setVisibility(View.GONE);
                noRecordFoundText.setVisibility(View.VISIBLE);
                cardList.setVisibility(View.GONE);
            } else {

                Networks networks = data.getNetworks();
                List<Applicable> applicables = networks.getApplicable();
                if (applicables.size() > 0) {
                    progressBar.setVisibility(View.GONE);
                    noRecordFoundText.setVisibility(View.GONE);
                    cardList.setVisibility(View.VISIBLE);

                    RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MakePaymentActivity.this);
                    cardList.setLayoutManager(layoutManager);
                    cardList.setItemAnimator(new DefaultItemAnimator());
                    adapter = new PaymentMethodAdapter(MakePaymentActivity.this, applicables);
                    cardList.setAdapter(adapter);
                } else {
                    progressBar.setVisibility(View.GONE);
                    noRecordFoundText.setVisibility(View.VISIBLE);
                    cardList.setVisibility(View.GONE);
                }
            }
        });
    }
}