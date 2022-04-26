package com.dragon.router

import android.content.Context
import android.util.Log
import com.dragon.router.TestConstant.checkNeedLogin
import com.dragon.common.constants.RouteConstant
import com.dragon.router.annotation.Interceptor
import com.dragon.router.core.Postcard
import com.dragon.router.core.callback.InterceptorCallback
import com.dragon.router.core.template.IInterceptor

/**
 * @description
 * @author: created by peihao.feng
 * @date: 4/21/21
 */
@Interceptor(priority = 2, name = "loginInterceptor")
class LoginInterceptor : IInterceptor {
    val TAG = "LoginInterceptor"

    override fun process(postcard: Postcard, callback: InterceptorCallback) {
        if (checkNeedLogin(postcard.destinationText)) {
            postcard.prerequisiteDestinationGraph = "nav_graph"
            postcard.prerequisiteDestination = RouteConstant.LOGIN_FRAGMENT
        }
        callback.onContinue(postcard)
    }

    override fun init(context: Context?) {
        Log.e(TAG, "LoginInterceptor init")
    }
}