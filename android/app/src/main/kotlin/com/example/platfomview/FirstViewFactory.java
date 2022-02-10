package com.example.platfomview;

import android.content.Context;

import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import io.flutter.plugin.platform.PlatformView;
import io.flutter.plugin.platform.PlatformViewFactory;

public class FirstViewFactory extends PlatformViewFactory {
    BinaryMessenger messenger;

    public FirstViewFactory(MessageCodec<Object> createArgsCodec, BinaryMessenger messenger) {
        super(createArgsCodec);
        this.messenger = messenger;
    }



    @Override
    public PlatformView create(Context context, int viewId, Object args) {
        return new FirstView(context, viewId, messenger);
    }
}
