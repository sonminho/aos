package com.son.aos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    SchoolAdapter adapter = null;
    ArrayAdapter<String> cityArrayAdapter = null;
    ArrayAdapter<String> guArrayAdapter = null;
    ArrayAdapter<String> dongArrayAdapter = null;

    ListView listView = null;
    Spinner citySpinner = null;
    Spinner guSpinner = null;
    Spinner dongSpinner = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        citySpinner = (Spinner)findViewById(R.id.city_spinner);
        guSpinner = (Spinner)findViewById(R.id.gu_spinner);
        dongSpinner = (Spinner)findViewById(R.id.dong_spinner);

        String[] cityArray = getResources().getStringArray(R.array.city_array);
        String[] guArray = getResources().getStringArray(R.array.gu_array);
        String[] doungArray = getResources().getStringArray(R.array.dong_array);

        cityArrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, cityArray);
        guArrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, guArray);
        dongArrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, doungArray);

        citySpinner.setAdapter(cityArrayAdapter);
        guSpinner.setAdapter(guArrayAdapter);
        dongSpinner.setAdapter(dongArrayAdapter);

        adapter = new SchoolAdapter(this);

        adapter.addData(new SchoolItem(R.drawable.school_img, "노원중", "서울 노원구 동일로213길 26 노원..."));
        adapter.addData(new SchoolItem(R.drawable.school_img, "신상중", "서울 노원구 동일로216길 42 신상... "));
        adapter.addData(new SchoolItem(R.drawable.school_img, "노곡중", "서울 도봉구 노해로70길 95 노곡중..."));
        adapter.addData(new SchoolItem(R.drawable.school_img, "상경중", "서울 노원구 동일로227길 61 상경... "));
        adapter.addData(new SchoolItem(R.drawable.school_img, "은곡중", "서울 노원구 노원로 492 온곡중학..."));
        adapter.addData(new SchoolItem(R.drawable.school_img, "창동중", "서울 도봉구 방학로 32 창동중학교 "));
        adapter.addData(new SchoolItem(R.drawable.school_img, "상계중", "서울특별시 노원구 노원로 398 상계중학교"));
        adapter.addData(new SchoolItem(R.drawable.school_img, "한라중", "제주특별자치도 제주시 과원북2길 24"));

        listView = (ListView)findViewById(R.id.school_lv);
        listView.setAdapter(adapter);
        listView.setDividerHeight(3);
    }
}
