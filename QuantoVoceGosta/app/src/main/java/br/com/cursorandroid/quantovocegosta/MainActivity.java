package br.com.cursorandroid.quantovocegosta;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {

    private final int[] mImages = {R.drawable.pouco,
                                   R.drawable.pouco,
                                   R.drawable.medio,
                                   R.drawable.muito,
                                   R.drawable.susto};

    private MediaPlayer mMediaPlayer;

    private SeekBar seekBar;
    private ImageView imgRate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        seekBar = (SeekBar) findViewById(R.id.seekBar);
        imgRate = (ImageView) findViewById(R.id.imgRate);

        mMediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.grito);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                imgRate.setImageResource(mImages[i]);

                if (i == 4 && mMediaPlayer != null) {
                    mMediaPlayer.start();
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                if (mMediaPlayer != null && mMediaPlayer.isPlaying()) {
                    mMediaPlayer.pause();
                    mMediaPlayer.seekTo(0);
                }
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }

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
