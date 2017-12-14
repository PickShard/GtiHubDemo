package demo.sc.gtihubdemo.view;

import android.content.Context;
import android.databinding.Bindable;
import android.databinding.BindingAdapter;
import android.databinding.BindingMethod;
import android.databinding.BindingMethods;
import android.databinding.Observable;
import android.databinding.ObservableField;
import android.databinding.PropertyChangeRegistry;
import android.support.v7.widget.AppCompatEditText;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;

import demo.sc.gtihubdemo.BR;
import demo.sc.gtihubdemo.utils.Log;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;

/**
 * Created by sc on 2017/8/28.
 */

public class DatabindingEditText extends AppCompatEditText {

    private static ObservableField field;


    public static void setText(View view,ObservableField text) {
        Log.d("=============","settext");
        field = text;
    }


    public DatabindingEditText(Context context) {
        super(context);
        init();
    }

    public DatabindingEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public DatabindingEditText(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }


    public void init() {


        addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                Log.d("=============","afterTextChanged");

                    if (field!=null){
                        field.set(s.toString());
                    }
            }
        });
    }


    public static class MyTextWatcher implements TextWatcher{

        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        public void onTextChanged(CharSequence s, int start, int before, int count) {

        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    }


}
