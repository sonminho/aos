package sm2no.schoolapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by 01020072846 on 2017-10-16.
 */

public class NameSearchFragment extends Fragment {
    SchoolAdapter adapter = null;
    ListView listView = null;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup viewGroup = (ViewGroup) inflater.inflate(R.layout.name_frg, container, false);

        adapter = new SchoolAdapter(getContext());

        adapter.addData(new SchoolItem(R.drawable.school_img, "노원중", "서울 노원구 동일로213길 26 노원..."));
        adapter.addData(new SchoolItem(R.drawable.school_img, "신상중", "서울 노원구 동일로216길 42 신상... "));
        adapter.addData(new SchoolItem(R.drawable.school_img, "노곡중", "서울 도봉구 노해로70길 95 노곡중..."));
        adapter.addData(new SchoolItem(R.drawable.school_img, "상경중", "서울 노원구 동일로227길 61 상경... "));
        adapter.addData(new SchoolItem(R.drawable.school_img, "은곡중", "서울 노원구 노원로 492 온곡중학..."));
        adapter.addData(new SchoolItem(R.drawable.school_img, "창동중", "서울 도봉구 방학로 32 창동중학교 "));
        adapter.addData(new SchoolItem(R.drawable.school_img, "상계중", "서울특별시 노원구 노원로 398 상계중학교"));
        adapter.addData(new SchoolItem(R.drawable.school_img, "한라중", "제주특별자치도 제주시 과원북2길 24"));
        adapter.addData(new SchoolItem(R.drawable.school_img, "한라중", "제주특별자치도 제주시 과원북2길 24"));

        listView = (ListView) viewGroup.findViewById(R.id.name_search_list_view);
        listView.setAdapter(adapter);
        listView.setDividerHeight(2);

        return viewGroup;
    }
}
