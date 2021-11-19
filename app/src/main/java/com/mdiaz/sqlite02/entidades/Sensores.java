package com.mdiaz.sqlite02.entidades;

public class Sensores {
    private Integer id;
    private String tipo_sensor;
    private Integer valor_sensor;

    public Sensores(Integer id, String tipo_sensor, Integer valor_sensor) {
        this.id = id;
        this.tipo_sensor = tipo_sensor;
        this.valor_sensor = valor_sensor;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTipo_sensor() {
        return tipo_sensor;
    }

    public void setTipo_sensor(String tipo_sensor) {
        this.tipo_sensor = tipo_sensor;
    }

    public float getValor_sensor() {
        return valor_sensor;
    }

    public void setValor_sensor(Integer valor_sensor) {
        this.valor_sensor = valor_sensor;
    }
}
