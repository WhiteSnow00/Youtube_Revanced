// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.sdk.base;

import com.google.vr.sdk.proto.Display$DisplayParams;
import com.google.vr.sdk.proto.CardboardDevice$DeviceParams;
import android.view.WindowManager;
import android.view.Display;
import android.content.Context;

public class HeadMountedDisplayManager
{
    private final Context context;
    private final HeadMountedDisplay hmd;
    private final aral paramsProvider;
    
    public HeadMountedDisplayManager(final Context context) {
        this.context = context;
        this.paramsProvider = aqql.o(context);
        this.hmd = new HeadMountedDisplay(this.createScreenParams(), this.createGvrViewerParams());
    }
    
    private GvrViewerParams createGvrViewerParams() {
        return new GvrViewerParams(this.paramsProvider.b());
    }
    
    private ScreenParams createScreenParams() {
        final Display display = this.getDisplay();
        final ScreenParams fromProto = ScreenParams.fromProto(display, this.paramsProvider.d());
        if (fromProto != null) {
            return fromProto;
        }
        return new ScreenParams(display);
    }
    
    private Display getDisplay() {
        return ((WindowManager)this.context.getSystemService("window")).getDefaultDisplay();
    }
    
    public void close() {
        this.paramsProvider.f();
    }
    
    public HeadMountedDisplay getHeadMountedDisplay() {
        return this.hmd;
    }
    
    public void onPause() {
    }
    
    public void onResume() {
        final CardboardDevice$DeviceParams b = this.paramsProvider.b();
        final ScreenParams screenParams = null;
        GvrViewerParams gvrViewerParams;
        if (b != null) {
            gvrViewerParams = new GvrViewerParams(b);
        }
        else {
            gvrViewerParams = null;
        }
        if (gvrViewerParams != null && !gvrViewerParams.equals(this.hmd.getGvrViewerParams())) {
            this.hmd.setGvrViewerParams(gvrViewerParams);
        }
        final Display$DisplayParams d = this.paramsProvider.d();
        ScreenParams fromProto = screenParams;
        if (d != null) {
            fromProto = ScreenParams.fromProto(this.getDisplay(), d);
        }
        if (fromProto != null && !fromProto.equals(this.hmd.getScreenParams())) {
            this.hmd.setScreenParams(fromProto);
        }
    }
}
