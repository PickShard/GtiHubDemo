package demo.sc.gtihubdemo.activity;

import android.content.DialogInterface;
import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.BottomSheetDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import demo.sc.gtihubdemo.R;

public class KotlinActivity extends AppCompatActivity {

    private BottomSheetDialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kotlin);
        dialog = new BottomSheetDialog(this);
        String[] items = new String[20];
        for (int i = 0; i <20 ; i++) {
            items[i] = "item"+i;
        }

        ListView listView = new ListView(this);
        listView.setAdapter(new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,items));


        WindowManager.LayoutParams attributes = dialog.getWindow().getAttributes();

        attributes.width = (int)(getResources().getDisplayMetrics().widthPixels/0.8);

        dialog.setContentView(listView,attributes);

        final BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.from((View) listView.getParent());


        dialog.setOnDismissListener(new DialogInterface.OnDismissListener() {
            @Override
            public void onDismiss(DialogInterface dialog) {
                bottomSheetBehavior.setState(BottomSheetBehavior.STATE_COLLAPSED);
            }
        });
    }

    public void onClick(View v){



        dialog.show();

    }
}
