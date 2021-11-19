package com.mdiaz.sqlite02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.mdiaz.sqlite02.utilidades.Utilidades;

public class RegistroSensoresActivity extends AppCompatActivity {

    EditText campoId, campoTipoSensor, campoValorSensor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_sensores);

        campoId = (EditText) findViewById(R.id.campoId);
        campoTipoSensor = (EditText) findViewById(R.id.campoTipoSensor);
        campoValorSensor = (EditText) findViewById(R.id.campoValorSensor);

    }

    public void onClick(View view){
        registrarSensores();
    }

    private void registrarSensores() {
        ConexionSQLiteHelper conn = new ConexionSQLiteHelper(this, "bd_sensores",null,1);

        SQLiteDatabase db=conn.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(Utilidades.CAMPO_ID,campoId.getText().toString());
        values.put(Utilidades.CAMPO_TIPO_SENSOR,campoTipoSensor.getText().toString());
        values.put(Utilidades.CAMPO_VALOR_SENSOR,campoValorSensor.getText().toString());

        Long idResultante = db.insert(Utilidades.TABLA_SENSORES,Utilidades.CAMPO_ID,values);

        Toast.makeText(getApplicationContext(),"Id registro: " + idResultante, Toast.LENGTH_SHORT).show();



    }

}