package com.dragon.router

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.dragon.common.constants.RouteConstant
import com.dragon.router.annotation.Constants
import com.dragon.router.annotation.Route
import com.dragon.router.annotation.utils.Utils
import com.dragon.router.core.template.Router
import kotlinx.android.synthetic.main.fragment_login.*

/**
 * @description
 * @author: created by peihao.feng
 * @date: 4/21/21
 */
@Route(destinationText = RouteConstant.LOGIN_FRAGMENT)
class LoginFragment : Fragment(com.cfxc.router.R.layout.fragment_login) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btn_login.setOnClickListener {
            com.dragon.router.TestConstant.isNeedLogin = false
            val destination =
                if (Utils.isEmpty(arguments?.getString(Constants.KEY_CONTINUE_DESTINATION))) {
                    RouteConstant.MAIN_MODULE_HOME_FRAGMENT
                } else {
                    arguments?.getString(Constants.KEY_CONTINUE_DESTINATION)
                }
            Router.getInstance().build(destination)
                .navigation(findNavController(),RouteConstant.LOGIN_FRAGMENT,true)
        }
    }
}