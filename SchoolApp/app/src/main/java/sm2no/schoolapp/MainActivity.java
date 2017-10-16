package sm2no.schoolapp;

import android.graphics.Color;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    Toolbar toolbar;
    TabLayout tabLayout;
    
    NameSearchFragment nameSearchFragment;
    LocalSearchFragment localSearchFragment;
    MapSearchFragment mapSearchFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //  툴바 객체 사용
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // 액션바 사용하지 않음
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowTitleEnabled(false);

        // 프래그먼트 객체화
        nameSearchFragment = new NameSearchFragment();
        localSearchFragment = new LocalSearchFragment();
        mapSearchFragment = new MapSearchFragment();

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container, nameSearchFragment)
                .commit();

        tabLayout = (TabLayout) findViewById(R.id.tab_layout);

        tabLayout.addTab(tabLayout.newTab().setText("학교명"));
        tabLayout.addTab(tabLayout.newTab().setText("지역별"));
        tabLayout.addTab(tabLayout.newTab().setText("지도 검색"));

        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                int position = tab.getPosition();

                Fragment selected = null;

                if(position == 0) {
                    selected = nameSearchFragment;
                } else if(position == 1) {
                    selected = localSearchFragment;
                } else {
                    selected = mapSearchFragment;
                }

                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.container, selected)
                        .commit();
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();


        return true;
    }
}
