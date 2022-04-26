package com.dragon.router.core.template;

import com.dragon.router.annotation.model.RouteMeta;
import com.dragon.router.annotation.model.RouteMeta;

import java.util.Map;

/**
 * @description
 * @author: created by peihao.feng
 * @date: 4/6/21
 */
public interface IRouteRoot {

    void loadInto(Map<String, RouteMeta> routes);
}
