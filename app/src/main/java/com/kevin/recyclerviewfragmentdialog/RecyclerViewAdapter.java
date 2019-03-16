package com.kevin.recyclerviewfragmentdialog;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by Kevin Kimaru Chege on 7/avatar10/2018.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    Context mContext;
    List<Contact> mData;
    Dialog mDialog;

    public RecyclerViewAdapter(Context context, List<Contact> data) {
        mContext = context;
        mData = data;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(mContext).inflate(R.layout.item_contact, parent, false);
        final MyViewHolder  viewHolder = new MyViewHolder(v);

        mDialog = new Dialog(mContext);
        mDialog.setContentView(R.layout.dialog_contact);
        mDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        viewHolder.item_contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView dialogNameTv = (TextView) mDialog.findViewById(R.id.dialog_name_id);
                TextView dialogPhoneTv = (TextView) mDialog.findViewById(R.id.dialog_phone_id);
                ImageView dialogContactImg = (ImageView) mDialog.findViewById(R.id.dialog_img);
                dialogNameTv.setText(mData.get(viewHolder.getAdapterPosition()).getName());
                dialogPhoneTv.setText(mData.get(viewHolder.getAdapterPosition()).getPhone());
                dialogContactImg.setImageResource(mData.get(viewHolder.getAdapterPosition()).getPhoto());
                Toast.makeText(mContext, "Test click " +
                        String.valueOf(viewHolder.getAdapterPosition()), Toast.LENGTH_SHORT).show();
                mDialog.show();
            }
        });

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.tv_name.setText(mData.get(position).getName());
        holder.tv_phone.setText(mData.get(position).getPhone());
        holder.img.setImageResource(mData.get(position).getPhoto());
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        private LinearLayout item_contact;
        private TextView tv_name;
        private TextView tv_phone;
        private ImageView img;

        public MyViewHolder(View itemView) {
            super(itemView);

            item_contact = (LinearLayout) itemView.findViewById(R.id.contact_item);
            tv_name = (TextView) itemView.findViewById(R.id.name_contact);
            tv_phone = (TextView) itemView.findViewById(R.id.phone_contact);
            img = (ImageView) itemView.findViewById(R.id.img_contact);
        }
    }

}
