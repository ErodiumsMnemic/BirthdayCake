package cs301.birthdaycake;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_main);
        CakeView cView = findViewById(R.id.cakeview);
        CakeController cCont = new CakeController(cView);
        Button blowOut = findViewById(R.id.button);
        blowOut.setOnClickListener(cCont);
        Switch candleSwitch = findViewById(R.id.switch2);
        candleSwitch.setOnCheckedChangeListener(cCont);
        SeekBar candleCountBar = findViewById(R.id.seekBar);
        candleCountBar.setOnSeekBarChangeListener(cCont);
        cView.setOnTouchListener(cCont);

    }

    public void goodbye(View button) {
        Log.i("button", "Goodbye");
    }

}
