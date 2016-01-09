package br.com.udemy.idadedecachorro;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private EditText edtIdade;
    private Button btnIdadeId;
    private TextView txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        edtIdade = (EditText) findViewById(R.id.edtIdade);
        btnIdadeId = (Button) findViewById(R.id.btnIdadeId);
        txtResultado = (TextView) findViewById(R.id.txtResultado);

        btnIdadeId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String idade = edtIdade.getText().toString();

                if(idade.length() <=0) {
                    txtResultado.setText("Nenhum número digitado!");
                } else {
                    int resultado = 7 * Integer.parseInt(idade);

                    txtResultado.setText("A idade do cachorro em anos humanos é: " + resultado + " anos.");
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
