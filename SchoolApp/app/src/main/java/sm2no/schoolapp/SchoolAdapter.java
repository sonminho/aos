package sm2no.schoolapp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by 01020072846 on 2017-10-17.
 */

public class SchoolAdapter extends BaseAdapter {

    private ArrayList<SchoolItem> sList = new ArrayList<>();

    @Override
    public int getCount() {
        return sList.size();
    }

    @Override
    public Object getItem(int position) {
        return sList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        final Context context = parent.getContext();

        if(convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.school_item, parent, false);
        }

        ImageView lv_img = (ImageView) convertView.findViewById(R.id.school_img);
        final TextView tv_name = (TextView) convertView.findViewById(R.id.shcool_name);
        final TextView tv_contents = (TextView) convertView.findViewById(R.id.school_des);

        SchoolItem schoolItem = (SchoolItem) getItem(position);

        lv_img.setImageDrawable(schoolItem.getIcon());
        tv_name.setText(schoolItem.getName());
        tv_contents.setText(schoolItem.getContents());



        return convertView;
    }

    public void addItem(Drawable img, String name, String contents) {
        SchoolItem schoolItem = new SchoolItem();

        schoolItem.setIcon(img);
        schoolItem.setName(name);
        schoolItem.setContents(contents);

        sList.add(schoolItem);
    }
}
