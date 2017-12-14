package demo.sc.gtihubdemo.bean;

import android.databinding.Bindable;
import android.databinding.Observable;
import android.databinding.ObservableField;
import android.databinding.PropertyChangeRegistry;
import android.view.View;

import demo.sc.gtihubdemo.BR;

/**
 * Created by sc on 2017/8/28.
 */

public class Student{

    public ObservableField<String> age = new ObservableField();

    public void click() {
        age.set("100");
    }

}
