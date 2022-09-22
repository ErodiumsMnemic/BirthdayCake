package cs301.birthdaycake;

import android.util.Log;
import android.view.View;

public class CakeController implements View.OnClickListener {
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
}
