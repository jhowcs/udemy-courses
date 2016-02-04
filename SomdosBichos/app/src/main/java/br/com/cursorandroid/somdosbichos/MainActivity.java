package br.com.cursorandroid.somdosbichos;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends Activity implements View.OnClickListener {

    private ImageView imgDog;
    private ImageView imgCat;
    private ImageView imgLion;
    private ImageView imgMonkey;
    private ImageView imgSheep;
    private ImageView imgCow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgDog = (ImageView) findViewById(R.id.imgDog);
        imgCat = (ImageView) findViewById(R.id.imgCat);
        imgLion = (ImageView) findViewById(R.id.imgLion);
        imgMonkey = (ImageView) findViewById(R.id.imgMonkey);
        imgSheep = (ImageView) findViewById(R.id.imgSheep);
        imgCow = (ImageView) findViewById(R.id.imgCow);

        imgDog.setOnClickListener(this);
        imgCat.setOnClickListener(this);
        imgLion.setOnClickListener(this);
        imgMonkey.setOnClickListener(this);
        imgSheep.setOnClickListener(this);
        imgCow.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.imgDog:
                break;
            case R.id.imgCat:
                break;
            case R.id.imgLion:
                break;
            case R.id.imgMonkey:
                break;
            case R.id.imgSheep:
                break;
            case R.id.imgCow:
                break;
        }
    }
}
