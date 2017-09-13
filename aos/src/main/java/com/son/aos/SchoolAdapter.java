package com.son.aos;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;

/**
 * Created by 01020072846 on 2017-09-10.
 */

public class SchoolAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<SchoolItem> sList = new ArrayList<SchoolItem>();

    public SchoolAdapter(Context context) {
        this.context = context;
    }

    public void addData(SchoolItem item) {
        sList.add(item);
    }

    @Override
    public int getCount() {
        return sList.size();
    }

    @Override
    public Object getItem(int position) {
        return sList.get(position).getSchoolName();
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        SchoolView itemView;

        if(convertView == null) {
            itemView = new SchoolView(context, sList.get(position));
        } else {
            itemView = (SchoolView)convertView;
        }

        itemView.setIcon(sList.get(position).getIcon());
        itemView.setNmae(sList.get(position).getSchoolName());
        itemView.setDes(sList.get(position).getSchoolDes());

        itemView.setBackgroundColor(0xffffffff);

        return itemView;
    }
}
