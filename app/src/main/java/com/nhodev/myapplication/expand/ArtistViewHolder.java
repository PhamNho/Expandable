package com.nhodev.myapplication.expand;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import com.nhodev.myapplication.R;
import com.thoughtbot.expandablerecyclerview.viewholders.ChildViewHolder;

public class ArtistViewHolder extends ChildViewHolder {

    private TextView tvName;
    private TextView tvId;
    private ImageView imgItemContent;
    private CheckBox cbItemContent;


    public ArtistViewHolder(View itemView) {
        super(itemView);
        tvName = itemView.findViewById(R.id.tvNameNVL);
        tvId = itemView.findViewById(R.id.tvCodeNVL);
        imgItemContent = itemView.findViewById(R.id.imgNVL);
        cbItemContent = itemView.findViewById(R.id.cbPrices);
    }

    public void setTvName(String name) {
        tvName.setText(name);
    }

    public void setTvId(String id) {
        tvId.setText(id);
    }

    public void setImgItemContent(int imgResource) {
        imgItemContent.setImageResource(imgResource);
    }

    public void setCbItemContent(boolean isChecked) {
        cbItemContent.setChecked(isChecked);
    }
}
