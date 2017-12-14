package demo.sc.gtihubdemo.activity;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.text.format.DateFormat;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.net.InetAddress;
import java.net.InetSocketAddress;

import demo.sc.gtihubdemo.R;


public class MainActivity extends AppCompatActivity {

    Object[][] items = new Object[][]{{
            "animateLayoutChanges",
            "animat",
            "BottomSheetDialog",
            "clipDrawable",
            "canvas",
            "ConstraintActivity",
            "databinding",
            "listactivity",
            "SpannableString",
            "TransitionActivity",
            "nfc",
            "TabHomeActivity",
            "CoordinatorLayoutActivity",
            "NotifictionActivity"
    }, {
            ToolbarActivity.class,
            AnimatActivity.class,
            KotlinActivity.class,
            ClipDrawableActivity.class,
            CanvasActivity.class,
            ConstraintActivity.class,
            DataBindingActivity.class,
            MyListActivity.class,
            SpannableStringActivity.class,
            TransitionActivity.class,
            NFCActivity.class,
            TabHomeActivity.class,
            CoordinatorLayoutActivity.class,
            NotifictionActivity.class,

    }};


    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_layout);

        ListView listView = (ListView) findViewById(R.id.listview);

        listView.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, items[0]));
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Object o = items[1][position];
                startActivity(new Intent(MainActivity.this, (Class<?>) o));
            }
        });

    }
}
