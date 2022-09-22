package cs301.birthdaycake;

import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;

public class CakeController implements View.OnClickListener, CompoundButton.OnCheckedChangeListener {
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
}
