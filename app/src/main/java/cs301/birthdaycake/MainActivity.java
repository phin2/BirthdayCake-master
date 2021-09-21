package cs301.birthdaycake;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.SeekBar;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    protected Button blowout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_main);
        CakeView cakeView = (CakeView) findViewById(R.id.cakeview);
        CakeController cController = new CakeController(cakeView);

        blowout = (Button) findViewById(R.id.button);
        blowout.setOnClickListener(cController);

        Switch candle = findViewById(R.id.Candle);
        candle.setOnCheckedChangeListener(cController);

        Switch frosting = (Switch) findViewById(R.id.switch1);
        frosting.setOnCheckedChangeListener(cController);

        SeekBar numCandles = (SeekBar) findViewById(R.id.seekBar2);
        numCandles.setOnSeekBarChangeListener(cController);
    }

    public void goodbye(View button) {
        Log.i("button","Goodbye");
    }

    public void button1(View view) {
        blowout.setText("Re-Light");
        view.setTag(0);
        ;
    }

}

