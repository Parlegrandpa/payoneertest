package com.example.payoneertest.adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.payoneertest.R;
import com.example.payoneertest.response.Applicable;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class PaymentMethodAdapter extends RecyclerView.Adapter<PaymentMethodAdapter.ViewHolder>{

    private List<Applicable> dataSet;
    private Activity activity;

    public PaymentMethodAdapter(Activity activity, List<Applicable> data) {
        this.dataSet = data;
        this.activity = activity;
    }

    @NotNull
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent,
                                                      int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_list_item, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, final int listPosition) {

        TextView tvCardData = holder.tvCardData;
        ImageView cardIcon = holder.cardIcon;

        tvCardData.setText(dataSet.get(listPosition).getLabel());
        Glide.with(activity)
                .load(dataSet.get(listPosition).getLinks().getLogo())
                .into(cardIcon);

    }

    @Override
    public int getItemCount() {
        if (dataSet == null) return 0;
        return dataSet.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        TextView tvCardData;
        ImageView cardIcon;

        ViewHolder(View itemView) {
            super(itemView);

            this.tvCardData = itemView.findViewById(R.id.card_label);
            this.cardIcon = itemView.findViewById(R.id.cardIcon);
        }
    }
}
