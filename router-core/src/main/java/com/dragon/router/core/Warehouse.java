package com.dragon.router.core;

import com.dragon.router.annotation.model.RouteMeta;
import com.dragon.router.core.template.IInterceptor;
import com.dragon.router.core.template.IProvider;
import com.dragon.router.core.utils.UniqueKeyTreeMap;
import com.dragon.router.annotation.model.RouteMeta;
import com.dragon.router.core.template.IInterceptor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @description Storage of route meta and other data.
 * @author: created by peihao.feng
 * @date: 4/2/21
 */
public class Warehouse {
    // Cache route and metas
    public static Map<String, RouteMeta> routes = new HashMap<>();
    public static Map<String, Integer> destinationMap = new HashMap<>();
    public static Map<Class<?>, IProvider> providerMap = new HashMap<>();

    // Cache interceptor
    public static Map<Integer, Class<? extends IInterceptor>> interceptorsIndex = new UniqueKeyTreeMap<>("More than one interceptors use same priority [%s]");
    public static List<IInterceptor> interceptors = new ArrayList<>();

    public static void clear() {
        routes.clear();
        interceptors.clear();
        interceptorsIndex.clear();
    }
}
