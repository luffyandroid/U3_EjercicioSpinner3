package com.example.didact.u3_ejerciciospinner3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    Spinner spTipoRopa;
    RadioGroup rgTalla;
    CheckBox cbRojo, cbAzul, cbAmarillo, cbBlanco, cbNegro, cbGris, cbVerde, cbBeige,
            cbMarron, cbMorado, cbNaranja, cbRosa;
    TextView tvTiporopa, tvColortalla;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spTipoRopa = (Spinner)findViewById(R.id.sp_tipo_ropa);
        rgTalla = (RadioGroup)findViewById(R.id.rg_talla);
        cbAmarillo = (CheckBox)findViewById(R.id.cb_amarillo);
        cbAzul = (CheckBox)findViewById(R.id.cb_azul);
        cbRojo = (CheckBox)findViewById(R.id.cb_rojo);
        cbRosa = (CheckBox)findViewById(R.id.cb_rosa);
        cbBeige = (CheckBox)findViewById(R.id.cb_beige);
        cbBlanco = (CheckBox)findViewById(R.id.cb_blanco);
        cbNegro = (CheckBox)findViewById(R.id.cb_negro);
        cbNaranja = (CheckBox)findViewById(R.id.cb_naranja);
        cbGris = (CheckBox)findViewById(R.id.cb_gris);
        cbVerde = (CheckBox)findViewById(R.id.cb_verde);
        cbMarron = (CheckBox)findViewById(R.id.cb_marron);
        cbMorado = (CheckBox)findViewById(R.id.cb_morado);
        tvTiporopa = (TextView)findViewById(R.id.tv_tiporopa);
        tvColortalla = (TextView)findViewById(R.id.tv_colortalla);

        String[] tiporopa={"","Pantalon","Blusa","Camiseta","Camisa","Sudadera"};
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this,
                android.R.layout.simple_expandable_list_item_1,tiporopa);
        spTipoRopa.setAdapter(adaptador);

    }

    public void clickBtnTipoRopa (View view){
        String tipoRopaSeleccionada = spTipoRopa.getSelectedItem().toString();

        if(tipoRopaSeleccionada.equals("")){
            Toast.makeText(this,"Debes seleccionar un tipo de ropa",
                    Toast.LENGTH_LONG).show();
        }else{
            tvTiporopa.setText("Tipo de prenda: "+tipoRopaSeleccionada);
        }

    }




}
