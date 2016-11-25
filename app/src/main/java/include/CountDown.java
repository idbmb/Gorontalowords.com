package include;

/**
 * Created by IDBMB on 11/22/2016.
 */

import android.app.Activity;
import android.content.Intent;
import android.os.CountDownTimer;

public class CountDown extends CountDownTimer {

    private Activity _act;
    private Class _cls;

    public CountDown(long millisInFuture, long countDownInterval, Activity act, Class cls) {
        super(millisInFuture, countDownInterval);
        // TODO Auto-generated constructor stub
        _act = act;
        _cls = cls;
    }

    @Override
    public void onFinish() {
        // TODO Auto-generated method stub
        _act.startActivity(new Intent(_act,_cls));
        _act.finish();
    }

    @Override
    public void onTick(long millisUntilFinished) {
        // TODO Auto-generated method stub

    }

}