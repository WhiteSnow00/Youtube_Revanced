// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.ndk.base;

import android.content.Intent;
import android.content.Context;

class GvrUiLayoutImpl$1 implements Runnable
{
    final /* synthetic */ Context val$context;
    final /* synthetic */ Intent val$homeIntent;
    
    public GvrUiLayoutImpl$1(final Context val$context, final Intent val$homeIntent) {
        this.val$context = val$context;
        this.val$homeIntent = val$homeIntent;
    }
    
    @Override
    public void run() {
        this.val$context.startActivity(this.val$homeIntent);
    }
}
