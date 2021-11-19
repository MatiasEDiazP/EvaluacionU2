package com.mdiaz.sqlite02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Iterator;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    TextView tvSensors;

    private SensorManager sm;
    List<Sensor> sensors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvSensors = (TextView) findViewById(R.id.tv_Sensors);

        sm = (SensorManager) getSystemService(SENSOR_SERVICE);
        sensors = sm.getSensorList(Sensor.TYPE_ALL);

        int i = 1;
        for(Iterator<Sensor> it = sensors.iterator(); it.hasNext(); i++){
            Sensor s = it.next();
            tvSensors.append(String.format("%d: %s, %d ,%s\n", i,s.getName(),s.getType(),s.getVendor()));
        }

        ConexionSQLiteHelper conn = new ConexionSQLiteHelper(this, "bd_sensores",null,1);

    }

    public void onClick(View view){
        Intent miIntent = null;
        switch (view.getId()){
            case R.id.btn_registrar:
                miIntent = new Intent(MainActivity.this,RegistroSensoresActivity.class);
                break;
        }
        if (miIntent!=null){
            startActivity(miIntent);
        }
    }
}