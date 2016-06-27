package com.example.cameronyeager.sunshine;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by cameronyeager on 6/27/16.
 */
public class PlaceholderFragment extends Fragment {

    public PlaceholderFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
    /*My Array List
    ArrayList<String> forecast = new ArrayList<>();
    forecast.add("Today - Sunny - 99 / 78");
    forecast.add("Tomorrow - Rainy - 90/75");
    forecast.add("Saturday - Sunny - 95/88");
    forecast.add("Sunday - Cloudy - 88/70");
    forecast.add("Monday - Boo - 92/85");
    forecast.add("Tuesday - Rainy - 93/86");
    */

        // Tutorial Array List
        String[] forecastArray = {
                "Today - Sunny - 99 / 78",
                "Tomorrow - Rainy - 90/75",
                "Saturday - Sunny - 95/88",
                "Sunday - Cloudy - 88/70",
                "Monday - Boo - 92/85",
                "Tuesday - Rainy - 93/86",
                "Wednesday - HELP TRAPPED IN WEATHER STATION - 0/0"
        };

        List<String> weekForecast = new ArrayList<String>(Arrays.asList(forecastArray));

        ArrayAdapter<String> mForecastAdaptor = new ArrayAdapter<String>(
                //this fragments parent activity
                getActivity(),
                //layout xml file
                R.layout.list_item_forecast,
                //id of the element in the xml file
                R.id.list_item_forecast_textview,
                //array list of the forecast elements
                weekForecast
        );

        ListView listView = (ListView) rootView.findViewById(R.id.listview_forecast);
        listView.setAdapter(mForecastAdaptor);

        return rootView;
    }
}
