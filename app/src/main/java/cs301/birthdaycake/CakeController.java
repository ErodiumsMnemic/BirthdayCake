package cs301.birthdaycake;

import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.SeekBar;

public class CakeController implements View.OnClickListener, CompoundButton.OnCheckedChangeListener, SeekBar.OnSeekBarChangeListener, View.OnTouchListener {
    private CakeView cakeView;
    private CakeModel cakeMod;
    private static final String TAG = "CakeController";

    public CakeController(CakeView cakeV) {
        cakeView = cakeV;
        cakeMod = cakeView.getCakeModel();
    }

    @Override
    public void onClick(View view) {
        Log.d(TAG, "Blow Out");
        cakeMod.candlesLit = false;
        cakeView.invalidate();
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        Log.d(TAG, "Candle Toggle");
        cakeMod.candles = b;
        cakeMod.candlesLit = true;
        cakeView.invalidate();
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
        Log.d(TAG, "Candle Count");
        cakeMod.candleCount = i;
        cakeView.invalidate();
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (cakeMod.balloon == true) {
            cakeMod.balloonX = motionEvent.getX();
            cakeMod.balloonY = motionEvent.getY();
            cakeView.invalidate();
        } else {
            cakeMod.balloon = true;
            cakeMod.balloonX = motionEvent.getX();
            cakeMod.balloonY = motionEvent.getY();
            cakeView.invalidate();
        }
        return false;
    }
}
