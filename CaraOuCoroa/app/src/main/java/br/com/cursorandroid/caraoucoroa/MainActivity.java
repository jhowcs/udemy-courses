package br.com.cursorandroid.caraoucoroa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ImageView btnJogar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnJogar = (ImageView) findViewById(R.id.btnJogar);

        btnJogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();
                int anInt = random.nextInt(2);

                Intent intent = new Intent(MainActivity.this, DetalheActivity.class);
                intent.putExtra("opcao", anInt);
                startActivity(intent);
            }

        });
    }
}
