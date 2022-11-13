// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.ndk.base;

import android.app.Activity;

class GvrUiLayoutImpl$3 implements Runnable
{
    final Activity val$activity;
    
    public GvrUiLayoutImpl$3(final Activity val$activity) {
        this.val$activity = val$activity;
    }
    
    @Override
    public void run() {
        this.val$activity.onBackPressed();
    }
}
