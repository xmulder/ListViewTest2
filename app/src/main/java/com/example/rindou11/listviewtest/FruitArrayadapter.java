package com.example.rindou11.listviewtest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class FruitArrayadapter extends ArrayAdapter<Fruit> {
    private int resourceId;
    private ImageView fruitImage;
    private TextView fruitName;

    public FruitArrayadapter(Context context, int textViewResourceId, List<Fruit> objects){
        super(context,textViewResourceId,objects);
        resourceId=textViewResourceId;
    }

    //converView用于缓存数据
    public View getView(int position, View converView, ViewGroup parent){
        Fruit fruit=getItem(position);
        View view;
        ViewHolder viewHolder;

        //判断converView缓存是否为空,如果为空则重新布局,否则直接使用缓存converView的布局
        if (converView==null){
            view=LayoutInflater.from(getContext()).inflate(resourceId,parent,false);

            viewHolder=new ViewHolder();
            viewHolder.fruitName=(TextView) view.findViewById(R.id.fruit_name);
            viewHolder.fruitImage=(ImageView)view.findViewById(R.id.fruit_image);

            view.setTag(viewHolder);
        }
        else {
            view=converView;
            viewHolder=(ViewHolder)view.getTag();
        }

        viewHolder.fruitName.setText(fruit.getFruitName());
        viewHolder.fruitImage.setImageResource(fruit.getImageId());

        return view;
    }
}
