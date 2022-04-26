package com.dragon.router

import com.dragon.common.constants.IUserDataProvider
import com.dragon.common.constants.RouteConstant
import com.dragon.router.annotation.Route

/**
 * @description
 * @author: created by peihao.feng
 * @date: 4/22/21
 */
@Route(destinationText = RouteConstant.USER_DATA_PROVIDER)
class UserDataProvider: IUserDataProvider {

    override fun getUserName():String{
        return "Tom"
    }
}