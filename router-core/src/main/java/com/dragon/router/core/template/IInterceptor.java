package com.dragon.router.core.template;

import android.content.Context;

import com.dragon.router.core.Postcard;
import com.dragon.router.core.callback.InterceptorCallback;

/**
 * @description
 * @author: created by peihao.feng
 * @date: 4/20/21
 */
public interface IInterceptor {

    /**
     * The operation of this interceptor.
     */
    void process(Postcard postcard, InterceptorCallback callback);

    /**
     * Do your init work in this method, it well be call when processor has been load.
     */
    void init(Context context);
}
