// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.ndk.base;

import android.content.Intent;
import android.app.Activity;

class GvrUiLayoutImpl$2 implements Runnable
{
    final /* synthetic */ Activity val$activity;
    final /* synthetic */ Intent val$homeIntent;
    
    public GvrUiLayoutImpl$2(final Activity val$activity, final Intent val$homeIntent) {
        this.val$activity = val$activity;
        this.val$homeIntent = val$homeIntent;
    }
    
    @Override
    public void run() {
        this.val$activity.startActivity(this.val$homeIntent);
        this.val$activity.finish();
    }
}
