package com.dragon.router.dispatcher

import com.dragon.router.App
import com.cfxc.router.R

/**
 * @description
 * @author: created by peihao.feng
 * @date: 4/6/21
 */
object SchemeConstant {
    val SCHEME = com.dragon.router.App.application.getString(R.string.scheme)
    val HOST = com.dragon.router.App.application.getString(R.string.host)

    val KEY_SCHEME_CONTENT = "scheme_content"
}