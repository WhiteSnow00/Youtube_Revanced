// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.ndk.base;

import android.app.PendingIntent;
import android.app.Activity;

class DaydreamApi$6 extends arat
{
    final /* synthetic */ Activity val$activity;
    final /* synthetic */ PendingIntent val$pendingIntent;
    final /* synthetic */ int val$requestCode;
    
    public DaydreamApi$6(final DaydreamApi daydreamApi, final Activity val$activity, final PendingIntent val$pendingIntent, final int val$requestCode) {
        this.val$activity = val$activity;
        this.val$pendingIntent = val$pendingIntent;
        this.val$requestCode = val$requestCode;
    }
    
    public void onTransitionComplete() {
        this.val$activity.runOnUiThread((Runnable)new DaydreamApi$6$1(this));
    }
}
