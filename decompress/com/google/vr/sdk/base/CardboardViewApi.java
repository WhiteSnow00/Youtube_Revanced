// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.sdk.base;

import android.view.MotionEvent;
import android.view.View;
import com.google.vr.ndk.base.GvrSurfaceView;

public interface CardboardViewApi
{
    GvrSurfaceView getGvrSurfaceView();
    
    GvrViewerParams getGvrViewerParams();
    
    View getRootView();
    
    void onPause();
    
    void onResume();
    
    boolean onTouchEvent(final MotionEvent p0);
    
    void setOnCardboardTriggerListener(final Runnable p0);
    
    void setOnCloseButtonListener(final Runnable p0);
    
    void setRenderer(final GvrView$StereoRenderer p0);
    
    void setStereoModeEnabled(final boolean p0);
    
    void shutdown();
}
