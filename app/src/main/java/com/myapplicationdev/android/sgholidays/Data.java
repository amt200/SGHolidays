package com.myapplicationdev.android.sgholidays;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.TimeZone;

public class Data {

    public static HashMap<String, ArrayList<Holiday>> getData(){

        Date date = new Date();
        Calendar calendar = new GregorianCalendar();
        SimpleDateFormat sdfSG = new SimpleDateFormat("dd-MMM-yyyy");
        TimeZone tzInSG = TimeZone.getTimeZone("Asia/Singapore");

        sdfSG.setTimeZone(tzInSG);
        sdfSG.format(calendar.getTime());
        calendar.setTime(date);
        calendar.setTimeZone(tzInSG);

        String time = sdfSG.format(calendar.getTime());
        int current_year = Integer.parseInt(time.substring(7,11));

        HashMap<String, ArrayList<Holiday>> holidayCategoryMappings = new HashMap<String, ArrayList<Holiday>>();

        ArrayList<Holiday> secular = new ArrayList<Holiday>();
        ArrayList<Holiday> nonSecular = new ArrayList<Holiday>();

        secular.add(new Holiday("1 Jan"+current_year, "New Year's Day", R.drawable.new_year));
        secular.add(new Holiday("1 May"+current_year, "Labour Day", R.drawable.labour_day));

        nonSecular.add(new Holiday("25-26 Jan"+current_year, "Chinese New Year", R.drawable.cny));
        nonSecular.add(new Holiday("10 April"+current_year, "Good Friday", R.drawable.good_friday));
        nonSecular.add(new Holiday("7 May"+current_year, "Vesak Day", R.drawable.vesak_day));
        nonSecular.add(new Holiday("24 May"+current_year, "Hari Raya Puasa", R.drawable.hari_raya_puasa));
        nonSecular.add(new Holiday("31 July"+current_year, "Hari Raya Haji", R.drawable.hari_raya_haji));
        nonSecular.add(new Holiday("9 Aug"+current_year, "Hari Raya Puasa", R.drawable.national_day));
        nonSecular.add(new Holiday("14 Nov"+current_year, "Hari Raya Haji", R.drawable.deepavali));
        nonSecular.add(new Holiday("25 Dec"+current_year, "Hari Raya Haji", R.drawable.christmas));


        holidayCategoryMappings.put("Secular", secular);
        holidayCategoryMappings.put("Ethnic & Religion", nonSecular);

        return holidayCategoryMappings;

    }
}
