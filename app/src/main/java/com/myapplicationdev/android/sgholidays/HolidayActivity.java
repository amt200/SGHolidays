package com.myapplicationdev.android.sgholidays;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class HolidayActivity extends AppCompatActivity {

    ListView lvHolidays;
    HolidayAdapter holidayAdapter;
    ArrayList<Holiday> holidays;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_holidays);

        Intent i = getIntent();
        String category = i.getStringExtra("category");


        holidays = Data.getData().get(category);

        lvHolidays = findViewById(R.id.lvHolidays);
        holidayAdapter = new HolidayAdapter(HolidayActivity.this, R.layout.row, holidays);

        lvHolidays.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Holiday selected = holidays.get(position);

                Toast.makeText(HolidayActivity.this, selected.getName()
                                + " Date: " + selected.getDate(),
                        Toast.LENGTH_LONG).show();

            }
        });

    }
}
