package com.mobile_core.module_main.main.campaign;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mobile_core.base.BasicAdapter;
import com.mobile_core.base.bean.CampaignListBean;
import com.mobile_core.module_main.R;

import java.util.List;

/**
 * Created by picher on 2018/7/27.
 * Describe：
 */

public class CampaignListAdapter extends BasicAdapter<CampaignListBean, CampaignListAdapter.ViewHolder>{

    public CampaignListAdapter(Context context) {
        super(context);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(mInflater.inflate(R.layout.campaign_list_item,parent,false));
    }

    @Override
    public void onBindItemHolder(ViewHolder holder, int position) {

    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public ViewHolder(View itemView) {
            super(itemView);
        }
    }
}
