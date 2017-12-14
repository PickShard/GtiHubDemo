package demo.sc.gtihubdemo.bean;


import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.Observable;
import android.databinding.PropertyChangeRegistry;

import demo.sc.gtihubdemo.BR;
import demo.sc.gtihubdemo.utils.Log;

/**
 * Created by sc on 2017/8/25.
 */

public class Person extends BaseObservable{

    private String name;
    private String address;
    private transient PropertyChangeRegistry propertyChangeRegistry = new PropertyChangeRegistry();


    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void onClick() {

        setName("sadfasd");
        Log.v("==========", "clicked" + name);
    }


    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyChange(BR.name);
    }

    @Bindable
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
        notifyChange(BR.address);
    }

    private void notifyChange(int propertyId) {
        if (propertyChangeRegistry == null) {
            propertyChangeRegistry = new PropertyChangeRegistry();
        }
        propertyChangeRegistry.notifyChange(this, propertyId);
    }

    @Override
    public void addOnPropertyChangedCallback(OnPropertyChangedCallback callback) {
        if (propertyChangeRegistry == null) {
            propertyChangeRegistry = new PropertyChangeRegistry();
        }
        propertyChangeRegistry.add(callback);

    }

    @Override
    public void removeOnPropertyChangedCallback(OnPropertyChangedCallback callback) {
        if (propertyChangeRegistry != null) {
            propertyChangeRegistry.remove(callback);
        }
    }
}
