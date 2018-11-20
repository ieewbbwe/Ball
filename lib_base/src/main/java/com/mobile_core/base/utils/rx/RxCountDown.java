package com.mobile_core.base.utils.rx;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Function;
import rx.functions.Func1;

/**
 * Created by picher on 2018/11/20.
 * Describe：
 */
public class RxCountDown {

    public static Observable<Integer> countdown(int seconds) {
        if (seconds < 0) seconds = 0;

        final int countTime = seconds;
        return Observable.interval(0, 1, TimeUnit.SECONDS)
                .subscribeOn(AndroidSchedulers.mainThread())
                .observeOn(AndroidSchedulers.mainThread())
                .map(aLong -> countTime - aLong.intValue())
                .take(countTime + 1);

    }
}
