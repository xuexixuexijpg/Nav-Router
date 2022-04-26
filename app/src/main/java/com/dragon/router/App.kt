package com.dragon.router

import android.app.Application
import com.dragon.router.core.template.Router

/**
 * @description
 * @author: created by peihao.feng
 * @date: 4/7/21
 */
class App : Application() {

    companion object {
        lateinit var application: com.dragon.router.App
    }

    override fun onCreate() {
        super.onCreate()
        com.dragon.router.App.Companion.application = this
        Router.init(this)
    }
}