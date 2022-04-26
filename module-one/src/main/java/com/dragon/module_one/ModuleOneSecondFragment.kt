package com.dragon.module_one

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.dragon.common.constants.BundleKeyConstant
import com.dragon.common.constants.RouteConstant
import com.dragon.router.annotation.Route
import com.example.module_one.R
import kotlinx.android.synthetic.main.fragment_module_one_second.*

/**
 * @description
 * @author: created by peihao.feng
 * @date: 4/27/21
 */
@Route(destinationText = RouteConstant.MODULE_ONE_SECOND_FRAGMENT)
class ModuleOneSecondFragment : Fragment(R.layout.fragment_module_one_second) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        tv_received.text = arguments?.getString(BundleKeyConstant.KEY_CONTENT)
    }
}