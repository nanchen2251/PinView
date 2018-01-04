package com.nanchen.pinviewdemo;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

import com.nanchen.pinview.PinView;
import com.nanchen.pinview.PinView.PinViewEventListener;

public class MainActivity extends AppCompatActivity implements PinViewEventListener {

    private TextView mTvTime;
    private PinView mPinView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTvTime = findViewById(R.id.tv_time_cut);
        mPinView = findViewById(R.id.pinView);

        mPinView.setPinViewEventListener(this);
    }

    int count = 0;

    @Override
    public void onDataEntered(PinView pinview, boolean fromUser) {
        Toast.makeText(this, pinview.getValue(), Toast.LENGTH_SHORT).show();
//        String value = pinview.getValue();
//
//        String trueValue = getSharedPreferences(GlobalConfig.PREFERENCES_KEY, MODE_PRIVATE).getString(GlobalConfig.PIN_KEY, null);
//        if (TextUtils.equals(trueValue, value)) {
//            // 如果输入正确，进入到主页
//            startActivity(new Intent(this, HomeActivity.class));
//            finish();
//        } else {
        count++;
        mPinView.setValue("");
        // 清空
        mTvTime.setText("输入错误，还可尝试" + (5 - count) + "次");
        if (count >= 5) { // 大于5次需要等待10秒
            long millisInFuture = 10 * 1000;
            if (mTimeCount != null)
                mTimeCount.cancel();
            mTimeCount = new MyTimeCount(millisInFuture, 1000);
            mTimeCount.start();
            mPinView.setCanInput(false);
        }
//        }
    }

    MyTimeCount mTimeCount;


    private class MyTimeCount extends CountDownTimer {

        /**
         * @param millisInFuture    The number of millis in the future from the call
         *                          to {@link #start()} until the countdown is done and {@link #onFinish()}
         *                          is called.
         * @param countDownInterval The interval along the way to receive
         *                          {@link #onTick(long)} callbacks.
         */
        public MyTimeCount(long millisInFuture, long countDownInterval) {
            super(millisInFuture, countDownInterval);
        }

        @SuppressLint("SetTextI18n")
        @Override
        public void onTick(long millisUntilFinished) {
            mTvTime.setText("输入错误，" + (millisUntilFinished / 1000) + "秒后再试");
        }

        @Override
        public void onFinish() {
            mTvTime.setText("输入密码");
            mPinView.setCanInput(true);
        }
    }
}
