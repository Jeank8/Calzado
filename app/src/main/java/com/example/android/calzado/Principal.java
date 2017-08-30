package com.example.android.calzado;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Principal extends AppCompatActivity {

    private TextView total;
    private EditText cantidad;
    private Resources resources;
    private Spinner generos, tipos, marcas;
    private String genero[], tipo[], marca[];
    private ArrayAdapter<String> generosOpc, tiposOpc, marcasOpc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        total = (TextView)findViewById(R.id.lblTotal);
        cantidad = (EditText)findViewById(R.id.txtCantidad);
        generos = (Spinner)findViewById(R.id.cmbGenero);
        tipos = (Spinner)findViewById(R.id.cmbTipo);
        marcas = (Spinner)findViewById(R.id.cmbMarca);
        resources = this.getResources();

        genero = getResources().getStringArray(R.array.generos);
        tipo = getResources().getStringArray(R.array.tipos);
        marca = getResources().getStringArray(R.array.marcas);

        generosOpc = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, genero);
        tiposOpc = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, tipo);
        marcasOpc = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, marca);

        generos.setAdapter(generosOpc);
        tipos.setAdapter(tiposOpc);
        marcas.setAdapter(marcasOpc);
    }

    public boolean validar(){
        if(cantidad.getText().toString().isEmpty()){
            cantidad.setError(resources.getString(R.string.mensaje_error_cantidad));
            return false;
        }
        if((Integer.parseInt(cantidad.getText().toString())==0)){
            Toast.makeText(this, resources.getString(R.string.mensaje_error_cero), Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;
    }

    public void calcular(View v){
        String gen, tip, marc;
        int cant, result=0, valorUni=0;
        if(validar()){
            cant = Integer.parseInt(cantidad.getText().toString());
            gen = generos.getSelectedItem().toString();
            tip = tipos.getSelectedItem().toString();
            marc = marcas.getSelectedItem().toString();
            resources = this.getResources();

            if(gen.equals(resources.getString(R.string.masculino)) && tip.equals(resources.getString(R.string.zapatilla)) && marc.equals(resources.getString(R.string.nike))){
                valorUni = 120000;
            }
            if(gen.equals(resources.getString(R.string.masculino)) && tip.equals(resources.getString(R.string.zapatilla)) && marc.equals(resources.getString(R.string.adidas))){
                valorUni = 140000;
            }
            if(gen.equals(resources.getString(R.string.masculino)) && tip.equals(resources.getString(R.string.zapatilla)) && marc.equals(resources.getString(R.string.puma))){
                valorUni = 130000;
            }
            if(gen.equals(resources.getString(R.string.masculino)) && tip.equals(resources.getString(R.string.clasico)) && marc.equals(resources.getString(R.string.nike))){
                valorUni = 50000;
            }
            if(gen.equals(resources.getString(R.string.masculino)) && tip.equals(resources.getString(R.string.clasico)) && marc.equals(resources.getString(R.string.adidas))){
                valorUni = 80000;
            }
            if(gen.equals(resources.getString(R.string.masculino)) && tip.equals(resources.getString(R.string.clasico)) && marc.equals(resources.getString(R.string.puma))){
                valorUni = 100000;
            }
            if(gen.equals(resources.getString(R.string.femenino)) && tip.equals(resources.getString(R.string.zapatilla)) && marc.equals(resources.getString(R.string.nike))){
                valorUni = 100000;
            }
            if(gen.equals(resources.getString(R.string.femenino)) && tip.equals(resources.getString(R.string.zapatilla)) && marc.equals(resources.getString(R.string.adidas))){
                valorUni = 130000;
            }
            if(gen.equals(resources.getString(R.string.femenino)) && tip.equals(resources.getString(R.string.zapatilla)) && marc.equals(resources.getString(R.string.puma))){
                valorUni = 110000;
            }
            if(gen.equals(resources.getString(R.string.femenino)) && tip.equals(resources.getString(R.string.clasico)) && marc.equals(resources.getString(R.string.nike))){
                valorUni = 60000;
            }
            if(gen.equals(resources.getString(R.string.femenino)) && tip.equals(resources.getString(R.string.clasico)) && marc.equals(resources.getString(R.string.adidas))){
                valorUni = 70000;
            }
            if(gen.equals(resources.getString(R.string.femenino)) && tip.equals(resources.getString(R.string.clasico)) && marc.equals(resources.getString(R.string.puma))){
                valorUni = 120000;
            }
            result = valorUni * cant;
            total.setText(resources.getString(R.string.signo_peso)+result+"");
        }
    }

    public void borrar(View v){
        total.setText("");
        cantidad.setText("");
        generos.setSelection(0);
        tipos.setSelection(0);
        marcas.setSelection(0);
        cantidad.requestFocus();
    }
}
