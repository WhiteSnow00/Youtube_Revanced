// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.play.core.review;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

public class ReviewManagerImpl$1 extends ResultReceiver
{
    final nns a;
    
    public ReviewManagerImpl$1(final Handler handler, final nns a, final byte[] array) {
        this.a = a;
        super(handler);
    }
    
    public final void onReceiveResult(final int n, final Bundle bundle) {
        this.a.d((Object)null);
    }
}
