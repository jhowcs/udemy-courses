package br.com.cursorandroid.caraoucoroa;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class DetalheActivity extends AppCompatActivity {
    private ImageView imgDetalhe;
    private ImageView btnVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe);

        imgDetalhe = (ImageView) findViewById(R.id.imgDetalhe);
        btnVoltar = (ImageView) findViewById(R.id.btnVoltar);

        Bundle extra = getIntent().getExtras();

        if(extra != null) {
            if (extra.getInt("opcao") == OpcaoMoeda.CARA.getValue()) {
                imgDetalhe.setImageDrawable(ContextCompat.getDrawable(DetalheActivity.this, R.drawable.moeda_cara));
            } else if(extra.getInt("opcao") == OpcaoMoeda.COROA.getValue()) {
                imgDetalhe.setImageDrawable(ContextCompat.getDrawable(DetalheActivity.this, R.drawable.moeda_coroa));
            }
        }

        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*startActivity(new Intent(DetalheActivity.this, MainActivity.class));*/
                onBackPressed();
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
