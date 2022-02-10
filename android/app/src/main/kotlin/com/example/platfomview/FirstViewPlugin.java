package com.example.platfomview;

import io.flutter.plugin.common.PluginRegistry;

public class FirstViewPlugin {
    static void registerWith(PluginRegistry.Registrar registrar) {
        registrar.platformViewRegistry().registerViewFactory("plugins/first_widget", new FirstViewFactory(null, registrar.messenger()));
    }
}
