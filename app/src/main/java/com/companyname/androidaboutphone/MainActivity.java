package com.companyname.androidaboutphone;

import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.list);
        String[] label = {
                "Operating System",
                "Brand",
                "Serial",
                "Manufacturer",
                "Device",
                "IMEI"
        };
        String[] value = {
                "1",
                "2",
                "3",
                "4",
                "5",
                "6"
        };
        value[0] = android.os.Build.MODEL;
        value[1] = Build.BRAND;
        //value[2] = Build.getSerial();
        value[3] = Build.MANUFACTURER;
        value[4] = Build.DEVICE;
        listView.setAdapter(new Adapter(this, label, value));
    }
}
