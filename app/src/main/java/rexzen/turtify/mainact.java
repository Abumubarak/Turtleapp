package rexzen.turtify;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.PersistableBundle;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;

import pl.droidsonroids.gif.GifImageView;
import pl.droidsonroids.gif.GifTextView;

/**
 * Created by harishananth on 01/02/17.
 */

public class mainact extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainact);
        GifTextView imageView;
        imageView=(GifTextView) findViewById(R.id.gif);
        TranslateAnimation animation = new TranslateAnimation(-100.0f, -800.0f,
                0.0f, 0.0f);
        animation.setDuration(3000);
        animation.setRepeatCount(7);
        animation.setRepeatMode(2);
        animation.setFillAfter(true);
        imageView.startAnimation(animation);
        Handler handler=new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(mainact.this,MainActivity.class);
                startActivity(intent);
            }
        },2000);
    }
}
