package com.example.platfomview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;

import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.platform.PlatformView;

public class FirstView implements PlatformView, MethodChannel.MethodCallHandler {
    Context context;
    int id;
    BinaryMessenger messenger;
    View view;
    MethodChannel channel;

    public FirstView(Context context, int id, BinaryMessenger messenger) {
        this.context = context;
        this.id = id;
        this.messenger = messenger;
        this.view = LayoutInflater.from(context).inflate(R.layout.first_widget, null);
        ImageView imageView = view.findViewById(R.id.imgTest);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,"bam cc",Toast.LENGTH_SHORT).show();
            }
        });
        channel = new MethodChannel(messenger, "plugins/first_widget_" + String.valueOf(id));
        channel.setMethodCallHandler(this);
    }

    @Override
    public View getView() {
        return view;
    }

    @Override
    public void dispose() {

    }

    @Override
    public void onMethodCall(@NonNull MethodCall call, @NonNull MethodChannel.Result result) {
        switch (call.method) {
            case "ping": {
                result.success(null);
                break;
            }
            default:
                result.notImplemented();
                break;
        }
    }
}
