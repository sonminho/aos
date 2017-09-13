package com.son.aos;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by 01020072846 on 2017-09-10.
 */

public class SchoolView extends LinearLayout{
    private ImageView mIcon;
    private TextView mName;
    private TextView mDes;

    public SchoolView(Context context, SchoolItem item) {
        super(context);

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.activity_item, this, true);

        mIcon = (ImageView)findViewById(R.id.school_img);
        mIcon.setImageResource(item.getIcon());

        mName = (TextView)findViewById(R.id.shcool_name);
        mName.setText(item.getSchoolName());

        mDes = (TextView)findViewById(R.id.school_des);
        mDes.setText(item.getSchoolDes());
    }

    public void setIcon(int icon) {
        mIcon.setImageResource(icon);
    }

    public void setNmae(String name) {
        mName.setText(name);
    }

    public void setDes(String des) {
        mDes.setText(des);
    }
}
