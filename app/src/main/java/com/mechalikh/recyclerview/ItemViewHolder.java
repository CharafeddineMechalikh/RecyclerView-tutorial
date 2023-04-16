package com.mechalikh.recyclerview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

public class ItemViewHolder extends RecyclerView.ViewHolder {
    public TextView itemNameTextView;
    public TextView itemDescriptionTextView;
    public ImageView itemImageView;

    public ItemViewHolder(View itemView) {
        super(itemView);

        itemNameTextView = itemView.findViewById(R.id.item_name_text_view);
        itemDescriptionTextView = itemView.findViewById(R.id.item_description_text_view);
        itemImageView = itemView.findViewById(R.id.item_image_view);
    }

    public void bind(Item item) {
        itemNameTextView.setText(item.getName());
        itemDescriptionTextView.setText(item.getDescription());

        Glide.with(itemView.getContext())
                .load(item.getImage())
                .into(itemImageView);
    }

}
