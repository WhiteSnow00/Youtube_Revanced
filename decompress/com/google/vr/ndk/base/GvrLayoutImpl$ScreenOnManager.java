// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.ndk.base;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;
import android.view.View;

class GvrLayoutImpl$ScreenOnManager implements GvrApi$IdleListener
{
    private static final long QUIET_PERIOD_AFTER_RESUME_MILLIS;
    private boolean isEnabled;
    private boolean isIdle;
    private boolean isResumed;
    private long lastResumeTimeMillis;
    private final View parentView;
    
    static /* bridge */ boolean -$$Nest$fgetisEnabled(final GvrLayoutImpl$ScreenOnManager gvrLayoutImpl$ScreenOnManager) {
        return gvrLayoutImpl$ScreenOnManager.isEnabled;
    }
    
    static /* bridge */ boolean -$$Nest$fgetisIdle(final GvrLayoutImpl$ScreenOnManager gvrLayoutImpl$ScreenOnManager) {
        return gvrLayoutImpl$ScreenOnManager.isIdle;
    }
    
    static /* bridge */ long -$$Nest$fgetlastResumeTimeMillis(final GvrLayoutImpl$ScreenOnManager gvrLayoutImpl$ScreenOnManager) {
        return gvrLayoutImpl$ScreenOnManager.lastResumeTimeMillis;
    }
    
    static /* bridge */ void -$$Nest$fputisEnabled(final GvrLayoutImpl$ScreenOnManager gvrLayoutImpl$ScreenOnManager, final boolean isEnabled) {
        gvrLayoutImpl$ScreenOnManager.isEnabled = isEnabled;
    }
    
    static /* bridge */ void -$$Nest$fputisIdle(final GvrLayoutImpl$ScreenOnManager gvrLayoutImpl$ScreenOnManager, final boolean isIdle) {
        gvrLayoutImpl$ScreenOnManager.isIdle = isIdle;
    }
    
    static /* bridge */ void -$$Nest$mupdateSetScreenOn(final GvrLayoutImpl$ScreenOnManager gvrLayoutImpl$ScreenOnManager) {
        gvrLayoutImpl$ScreenOnManager.updateSetScreenOn();
    }
    
    static /* bridge */ long -$$Nest$sfgetQUIET_PERIOD_AFTER_RESUME_MILLIS() {
        return GvrLayoutImpl$ScreenOnManager.QUIET_PERIOD_AFTER_RESUME_MILLIS;
    }
    
    static {
        QUIET_PERIOD_AFTER_RESUME_MILLIS = TimeUnit.SECONDS.toMillis(5L);
    }
    
    public GvrLayoutImpl$ScreenOnManager(final View parentView) {
        this.isEnabled = true;
        this.parentView = parentView;
    }
    
    private void updateSetScreenOn() {
        final View parentView = this.parentView;
        final boolean isEnabled = this.isEnabled;
        boolean keepScreenOn;
        final boolean b = keepScreenOn = false;
        if (isEnabled) {
            keepScreenOn = b;
            if (this.isResumed) {
                keepScreenOn = b;
                if (!this.isIdle) {
                    keepScreenOn = true;
                }
            }
        }
        parentView.setKeepScreenOn(keepScreenOn);
    }
    
    public void onIdleChanged(final boolean b) {
        arcq.a((Runnable)new GvrLayoutImpl$ScreenOnManager$2(this, b));
    }
    
    public void onPause() {
        this.isResumed = false;
        this.updateSetScreenOn();
    }
    
    public void onResume() {
        this.isResumed = true;
        this.isIdle = false;
        this.lastResumeTimeMillis = SystemClock.elapsedRealtime();
        this.updateSetScreenOn();
    }
    
    public void setEnabled(final boolean b) {
        arcq.a((Runnable)new GvrLayoutImpl$ScreenOnManager$1(this, b));
    }
}
