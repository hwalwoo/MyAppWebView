package com.example.user.myappwebview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by USER on 2016-06-25.
 */
public class ArrAdapter extends android.widget.ArrayAdapter<String> {
    private Context context;
    private String[] values;
    public ArrAdapter(Context _context, String[] _values) {
        super(_context, R.layout.activity_list,_values);
        this.context = _context;
        this.values = _values;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.activity_list, parent, false);
        TextView textView = (TextView) rowView.findViewById(R.id.label);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.logo);
        textView.setText(values[position]);

        String str = values[position];

        switch (str){
            case "cupcake":imageView.setImageResource(R.drawable.cupcake);break;
            case "donut":imageView.setImageResource(R.drawable.donut);break;
            case "fyoyo":imageView.setImageResource(R.drawable.froyo);break;
            case "honeycomb":imageView.setImageResource(R.drawable.honeycomb);break;
            case "icecream":imageView.setImageResource(R.drawable.icecream);break;
            case "jellybean":imageView.setImageResource(R.drawable.jellybean);break;
            case "lollipop":imageView.setImageResource(R.drawable.lollipop);break;
        }
        return rowView;
    }
}
