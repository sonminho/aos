package sm2no.schoolapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.text.InputType;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

/**
 * Created by 01020072846 on 2017-10-16.
 */

public class NameSearchFragment extends Fragment {
    SchoolAdapter adapter = null;
    ListView listView = null;
    EditText et_search = null;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup viewGroup = (ViewGroup) inflater.inflate(R.layout.name_frg, container, false);


        adapter = new SchoolAdapter();
        listView = (ListView) viewGroup.findViewById(R.id.name_search_list_view);

        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.school_img), "노원중", "서울 노원구 동일로213길 26 노원...");
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.school_img), "김현중", "서울 노원구 동일로213길 26 노원...");
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.school_img), "김원중", "서울 노원구 동일로213길 26 노원...");
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.school_img), "노원중", "서울 노원구 동일로213길 26 노원...");
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.school_img), "노원중", "서울 노원구 동일로213길 26 노원...");
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.school_img), "노원중", "서울 노원구 동일로213길 26 노원...");
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.school_img), "노원중", "서울 노원구 동일로213길 26 노원...");
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.school_img), "노원중", "서울 노원구 동일로213길 26 노원...");
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.school_img), "노원중", "서울 노원구 동일로213길 26 노원...");
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.school_img), "노원중", "서울 노원구 동일로213길 26 노원...");
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.school_img), "노원중", "서울 노원구 동일로213길 26 노원...");
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.school_img), "노원중", "서울 노원구 동일로213길 26 노원...");
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.school_img), "노원중", "서울 노원구 동일로213길 26 노원...");
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.school_img), "노원중", "서울 노원구 동일로213길 26 노원...");
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.school_img), "노원중", "서울 노원구 동일로213길 26 노원...");
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.school_img), "노원중", "서울 노원구 동일로213길 26 노원...");
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.school_img), "노원중", "서울 노원구 동일로213길 26 노원...");

        listView = (ListView) viewGroup.findViewById(R.id.name_search_list_view);
        listView.setAdapter(adapter);
        listView.setDividerHeight(2);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            Intent intent = null;

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                SchoolItem item = (SchoolItem) parent.getItemAtPosition(position);

                intent = new Intent(getContext(), SchoolInfoActivity.class);

                startActivity(intent);
            }
        });

        return viewGroup;
    }
}
