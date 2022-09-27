package com.snowy.snowynetwork;

import net.md_5.bungee.api.plugin.Plugin;

public final class SnowyNetwork extends Plugin {

    @Override
    public void onEnable() {
        getProxy().getPluginManager().registerCommand(this, new FruitCommand());
    }
}
