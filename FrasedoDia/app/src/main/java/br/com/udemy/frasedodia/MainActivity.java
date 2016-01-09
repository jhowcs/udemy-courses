package br.com.udemy.frasedodia;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView txtNovaFrase;
    private Button btnNovaFrase;

    private String[] frases;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        txtNovaFrase = (TextView) findViewById(R.id.txtNovaFraseId);
        btnNovaFrase = (Button) findViewById(R.id.btnNovaFraseId);

        btnNovaFrase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(frases != null && frases.length > 0) {
                    Random random = new Random();
                    txtNovaFrase.setText(frases[random.nextInt(frases.length)]);
                } else {
                    Toast.makeText(MainActivity.this, "Nenhuma mensagem para exibir!", Toast.LENGTH_SHORT);
                }
            }
        });

        frases = getResources().getStringArray(R.array.frases);

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
