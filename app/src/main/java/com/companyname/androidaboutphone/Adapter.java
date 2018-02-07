package com.companyname.androidaboutphone;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * Created by Nitish Kumar Singh on 06-02-2018.
 */

public class Adapter extends ArrayAdapter<String> {
    private final Activity context;
    private final String[] lab;
    private final String[] val;

    public Adapter(Activity context, String[] web, String[] label) {
        super(context, R.layout.single, web);
        this.context = context;
        this.val = label;
        this.lab = web;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.single, null, true);
        TextView label = rowView.findViewById(R.id.datalabel);
        TextView value = rowView.findViewById(R.id.data);
        label.setText(lab[position]);
        value.setText(val[position]);
        return rowView;
    }
}