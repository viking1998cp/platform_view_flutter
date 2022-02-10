package com.example.platfomview;

import android.os.Bundle;

import io.flutter.app.FlutterActivity;
import io.flutter.plugins.GeneratedPluginRegistrant;

public class MainActivity extends FlutterActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        GeneratedPluginRegistrant.registerWith(this);
        FirstViewPlugin.registerWith(this.registrarFor("com.example.flutter_platformview_example.FirstWidgetPlugin"));
    }

}
