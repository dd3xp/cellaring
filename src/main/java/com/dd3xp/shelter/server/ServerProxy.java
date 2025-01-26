package com.dd3xp.shelter.server;

import com.dd3xp.shelter.common.IProxy;

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
