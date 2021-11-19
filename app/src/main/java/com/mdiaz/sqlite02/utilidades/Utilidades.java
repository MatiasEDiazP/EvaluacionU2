package com.mdiaz.sqlite02.utilidades;

import androidx.activity.result.contract.ActivityResultContracts;

public class Utilidades {
    //Constantes campos tabla sensores
    public static final String TABLA_SENSORES ="sensores";
    public static final String CAMPO_ID="id";
    public static final String CAMPO_TIPO_SENSOR="tipo_sensor";
    public static final String CAMPO_VALOR_SENSOR="valor_sensor";

    public static final String CREAR_TABLA_SENSORES="CREATE TABLE " + TABLA_SENSORES + " ("+CAMPO_ID+" INTEGER, "+CAMPO_TIPO_SENSOR+" TEXT, "+CAMPO_VALOR_SENSOR+" INTEGER)";

}
