package com.dd3xp.cellaring.server;

import com.dd3xp.cellaring.common.IProxy;

public class ServerProxy implements IProxy {
    @Override
    public void preInit() {
        System.out.println("ServerProxy: PreInit");
    }

    @Override
    public void init() {
        System.out.println("ServerProxy: Init");
    }

    @Override
    public void postInit() {
        System.out.println("ServerProxy: PostInit");
    }
}