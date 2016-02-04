package br.com.cursorandroid.somdosbichos;

import android.app.Activity;
import android.media.MediaPlayer;
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

    private MediaPlayer mMediaPlayer;

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
                mMediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.cao);
                play();
                break;
            case R.id.imgCat:
                mMediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.gato);
                play();
                break;
            case R.id.imgLion:
                mMediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.leao);
                play();
                break;
            case R.id.imgMonkey:
                mMediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.macaco);
                play();
                break;
            case R.id.imgSheep:
                mMediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.ovelha);
                play();
                break;
            case R.id.imgCow:
                mMediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.vaca);
                play();
                break;
        }
    }

    public void play() {
        if(mMediaPlayer != null) {
            mMediaPlayer.start();
        }
    }

    /**
     * Good practice on onDestroy method release resources
     * and set MediaPlayer instance to null to state to GC
     * start cleaning!
     */
    @Override
    protected void onDestroy() {
        if(mMediaPlayer != null) {
            mMediaPlayer.stop();
            mMediaPlayer.release();
            mMediaPlayer = null;
        }

        super.onDestroy();
    }
}
