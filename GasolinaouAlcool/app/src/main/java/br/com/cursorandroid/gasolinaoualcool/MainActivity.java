package br.com.cursorandroid.gasolinaoualcool;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private EditText edtAlcool;
    private EditText edtGasolina;
    private Button btnVerificar;
    private TextView txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtAlcool       = (EditText) findViewById(R.id.edtAlcool);
        edtGasolina     = (EditText) findViewById(R.id.edtGasolina);
        btnVerificar    = (Button) findViewById(R.id.btnVerificar);
        txtResultado    = (TextView) findViewById(R.id.txtResultado);

        btnVerificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final double resultado = getValorCalculo(Double.parseDouble(edtAlcool.getText().toString()), Double.parseDouble(edtGasolina.getText().toString()));

                atualizarValorTela(resultado);
            }
        });
    }

    private void atualizarValorTela(double resultado) {
        if(resultado >= 0.7) {
            txtResultado.setText("É melhor utilizar Gasolina!");
        } else {
            txtResultado.setText("É melhor utilizar Álcool!");
        }
    }

    private double getValorCalculo(double alcool, double gasolina) {
        return alcool / gasolina;
    }
}
