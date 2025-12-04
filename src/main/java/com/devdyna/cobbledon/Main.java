package com.devdyna.cobbledon;

import com.devdyna.cobbledon.init.Material;
import com.devdyna.cobbledon.utils.LogUtil;
import com.devdyna.cobbledon.compat.core;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;

@Mod(Main.MODID)
public class Main {

    public static final String MODID = "cobbledon";

    public Main(IEventBus bus, ModContainer mc) {

        new LogUtil();

        Material.register(bus);
        core.registerCompat();

        // NeoForge.EVENT_BUS.register(new event());

    }
}
