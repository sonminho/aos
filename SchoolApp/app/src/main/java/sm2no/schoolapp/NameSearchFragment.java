package sm2no.schoolapp;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.text.InputType;
import android.util.Log;
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

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

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
        IdCheckAsyncTask task = new IdCheckAsyncTask();


        adapter = new SchoolAdapter();
        listView = (ListView) viewGroup.findViewById(R.id.name_search_list_view);


       // adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.school_img), "노원중", "서울 노원구 동일로213길 26 노원...");
       // adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.school_img), "노원중", "서울 노원구 동일로213길 26 노원...");
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

        task.execute();

        return viewGroup;
    }

    public class IdCheckAsyncTask extends AsyncTask<String, Void, ArrayList<SchoolItem> > {

        @Override
        protected ArrayList<SchoolItem> doInBackground(String... params) {
            String result = "";

            ArrayList<SchoolItem> items = null;
            SchoolItem item = null;
            try {
                URL url = new URL("http://211.253.26.113/server_api/master_info/getAll.do?schMasterInfo");
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.connect();

                InputStream inputStream = conn.getInputStream();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "utf-8"));

                StringBuffer sb = new StringBuffer();
                while((result = bufferedReader.readLine()) != null){
                    sb.append(result);
                }

                JSONArray jsonArray = new JSONArray(sb.toString());

                items = new ArrayList<SchoolItem>(jsonArray.length());

                for(int i = 0; i <jsonArray.length(); i++) {
                    JSONObject jsonobject = jsonArray.getJSONObject(i);

                    item = new SchoolItem();
                    item.setName(jsonobject.getString("sch_name"));
                    item.setContents(jsonobject.getString("sch_adrs"));

                    items.add(item);
                }

                Log.d("test1", "서버 응답 " + items.size());
            } catch (Exception e) {
                e.printStackTrace();
            }

            return items;
        }
        
        @Override
        protected void onPostExecute(ArrayList<SchoolItem> schoolItems) {
            for(int i = 0; i < schoolItems.size(); i++) {
                adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.school_img), schoolItems.get(i).getName(), schoolItems.get(i).getContents());
            }
            adapter.notifyDataSetChanged();
        }
    }
}
