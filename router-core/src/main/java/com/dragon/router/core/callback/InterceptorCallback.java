package com.dragon.router.core.callback;

import com.dragon.router.core.Postcard;
import com.dragon.router.core.Postcard;

/**
 * @description
 * @author: created by peihao.feng
 * @date: 4/20/21
 */
public interface InterceptorCallback {
    /**
     * Continue process
     *
     * @param postcard route meta
     */
    void onContinue(Postcard postcard);

    /**
     * Interrupt process, pipeline will be destroy when this method called.
     *
     * @param exception Response of interrupt.
     */
    void onInterrupt(Throwable exception);
}
