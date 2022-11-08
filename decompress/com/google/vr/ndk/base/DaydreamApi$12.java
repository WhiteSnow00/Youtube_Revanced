// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.ndk.base;

import android.content.Context;

class DaydreamApi$12 implements Runnable
{
    final /* synthetic */ DaydreamApi this$0;
    
    public DaydreamApi$12(final DaydreamApi this$0) {
        this.this$0 = this$0;
    }
    
    @Override
    public void run() {
        Context context;
        if (DaydreamApi.-$$Nest$fgetcontext(this.this$0).getApplicationContext() != null) {
            context = DaydreamApi.-$$Nest$fgetcontext(this.this$0).getApplicationContext();
        }
        else {
            context = DaydreamApi.-$$Nest$fgetcontext(this.this$0);
        }
        context.unbindService(DaydreamApi.-$$Nest$fgetconnection(this.this$0));
        DaydreamApi.-$$Nest$fputvrCoreSdkService(this.this$0, (araw)null);
    }
}
