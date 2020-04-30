package com.myapplicationdev.android.sgholidays;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class HolidayAdapter extends ArrayAdapter {

    private ArrayList<Holiday> holidays;
    private Context context;
    private TextView tvName, tvDate;
    private ImageView ivHoliday;

    public HolidayAdapter(Context context, int resource, ArrayList<Holiday> objects){
        super(context, resource, objects);
        // Store the food that is passed to this adapter
        this.holidays = objects;
        // Store Context object as we would need to use it later
        this.context = context;
    }

    // getView() is the method ListView will call to get the
    //  View object every time ListView needs a row
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // The usual way to get the LayoutInflater object to
        //  "inflate" the XML file into a View object
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        // "Inflate" the row.xml as the layout for the View object
        View rowView = inflater.inflate(R.layout.row, parent, false);

        // Get the TextView object
        tvName = (TextView) rowView.findViewById(R.id.tvName);

        // Get the ImageView object
        tvDate = (TextView) rowView.findViewById(R.id.tvDate);

        ivHoliday = (ImageView) rowView.findViewById(R.id.ivHoliday);


        // The parameter "position" is the index of the
        //  row ListView is requesting.
        //  We get back the food at the same index.
        Holiday currentHoliday = holidays.get(position);
        // Set the TextView to show the food

        tvName.setText(currentHoliday.getName());
        // Set the image to star or nostar accordingly
        ivHoliday.setImageResource(currentHoliday.getImageID());
        // Return the nicely done up View to the ListView
        tvDate.setText(currentHoliday.getDate());
        return rowView;
    }





}
