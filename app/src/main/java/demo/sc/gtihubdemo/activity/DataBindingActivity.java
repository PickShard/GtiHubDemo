package demo.sc.gtihubdemo.activity;

import android.databinding.DataBindingUtil;
import android.databinding.Observable;
import android.databinding.adapters.TextViewBindingAdapter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.WindowManager;

import demo.sc.gtihubdemo.DataBindingAdapter;
import demo.sc.gtihubdemo.R;
import demo.sc.gtihubdemo.bean.Person;
import demo.sc.gtihubdemo.bean.Student;
import demo.sc.gtihubdemo.databinding.ActivityDataBindingBinding;


public class DataBindingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        final Person[] persons = new Person[]{new Person("苏城", "福田"), new Person("苏城", "福田"), new Person("苏城", "福田")};

        ActivityDataBindingBinding viewDataBinding = DataBindingUtil.setContentView(this, R.layout.activity_data_binding);
        viewDataBinding.setUser(persons[0]);
        Student s = new Student();
        s.age.set("1000");


        viewDataBinding.setActivity(this);

        persons[0].addOnPropertyChangedCallback(new Observable.OnPropertyChangedCallback() {
            @Override
            public void onPropertyChanged(Observable sender, int propertyId) {
                Log.d("============",propertyId+"");
            }
        });

        viewDataBinding.setStudent(s);

        DataBindingAdapter<Person> adapter = new DataBindingAdapter(persons, this);

        viewDataBinding.setAdapter(adapter);
    }

    public void click(){
        Log.d("==============","onclick");
    }
}
