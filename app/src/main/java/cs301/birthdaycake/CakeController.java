package cs301.birthdaycake;

import android.util.Log;
import android.view.View;

public class CakeController {
    private CakeView cakeView;
    private CakeModel cakeMod;

    public CakeController(CakeView cakeV) {
        cakeView = cakeV;
        cakeMod = cakeView.getCakeModel();
    }

    public void onClick(View v) {
        Log.d("Blow");
    }
}
