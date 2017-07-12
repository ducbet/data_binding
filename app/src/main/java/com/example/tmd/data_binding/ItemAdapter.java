package com.example.tmd.data_binding;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;

/**
 * Created by tmd on 12/07/2017.
 */

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ViewHolder> {

    private Context mContext;
    private List<Item> mList;

    public ItemAdapter(Context context, List<Item> list) {
        mContext = context;
        mList = list;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(mContext).inflate(R.layout.item_recyclerview, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Item item = mList.get(position);
        holder.bindData(item);
    }

    @Override
    public int getItemCount() {
        if (mList != null) return mList.size();
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView mAvatar;
        private TextView mName;

        public ViewHolder(View itemView) {
            super(itemView);
            mAvatar = itemView.findViewById(R.id.image_view);
            mName = itemView.findViewById(R.id.text_view);
        }

        public void bindData(Item item) {
            mAvatar.setImageResource(item.getAvatar());
            mName.setText(item.getName());
        }
    }
}
