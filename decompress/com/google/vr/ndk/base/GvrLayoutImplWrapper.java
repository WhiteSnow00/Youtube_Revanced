// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.ndk.base;

import android.app.PendingIntent;
import android.view.View;
import com.google.vr.vrcore.library.api.ObjectWrapper;

class GvrLayoutImplWrapper extends arbe
{
    private final GvrLayoutImpl impl;
    
    public GvrLayoutImplWrapper(final GvrLayoutImpl impl) {
        this.impl = impl;
    }
    
    public boolean enableAsyncReprojection(final int n) {
        return this.impl.enableAsyncReprojection(n);
    }
    
    public boolean enableCardboardTriggerEmulation(final arbl arbl) {
        return this.impl.enableCardboardTriggerEmulation((Runnable)ObjectWrapper.b(arbl, (Class)Runnable.class));
    }
    
    public long getNativeGvrContext() {
        return this.impl.getGvrApi().getNativeGvrContext();
    }
    
    public arbl getRootView() {
        return ObjectWrapper.a((Object)this.impl);
    }
    
    public arbi getUiLayout() {
        return (arbi)this.impl.getUiLayoutImpl();
    }
    
    public void onBackPressed() {
        this.impl.onBackPressed();
    }
    
    public void onPause() {
        this.impl.onPause();
    }
    
    public void onResume() {
        this.impl.onResume();
    }
    
    public boolean setOnDonNotNeededListener(final arbl arbl) {
        return this.impl.setOnDonNotNeededListener((Runnable)ObjectWrapper.b(arbl, (Class)Runnable.class));
    }
    
    public void setPresentationView(final arbl arbl) {
        this.impl.setPresentationView((View)ObjectWrapper.b(arbl, (Class)View.class));
    }
    
    public void setReentryIntent(final arbl arbl) {
        this.impl.setReentryIntent((PendingIntent)ObjectWrapper.b(arbl, (Class)PendingIntent.class));
    }
    
    public void setStereoModeEnabled(final boolean stereoModeEnabled) {
        this.impl.setStereoModeEnabled(stereoModeEnabled);
    }
    
    public void shutdown() {
        this.impl.shutdown();
    }
}
