package demo.sc.gtihubdemo;

import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;
import java.util.List;

import demo.sc.gtihubdemo.bean.Person;
import demo.sc.gtihubdemo.databinding.ListItemDatabindingBinding;


/**
 * Created by sc on 2017/8/25.
 */

public class DataBindingAdapter<T> extends BaseAdapter {

    private List<T> mList;
    private Context mContext;

    public DataBindingAdapter(List<T> list, Context context) {
        mList = list;
        mContext = context;
    }

    public DataBindingAdapter(T[] list, Context context) {
        List<T> temp = new ArrayList<>();
        for (int i = 0; i < list.length; i++) {
            temp.add(list[i]);
        }
        mList = temp;
        mContext = context;
    }

    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public T getItem(int position) {
        return mList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ListItemDatabindingBinding binding;

        if (convertView == null) {

            binding = DataBindingUtil.bind(View.inflate(mContext, R.layout.list_item_databinding, null));

        } else {
            binding = DataBindingUtil.getBinding(convertView);
        }

        binding.setUser((Person) mList.get(position));

        ((Person) mList.get(position)).setName("李小米");

        return binding.getRoot();
    }
}
