// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.mdx.background;

import android.content.Intent;
import android.content.Context;

public class MdxBackgroundScanBootReceiver extends xae
{
    private static final String b;
    public xas a;
    
    static {
        b = trn.a("MDX.BootReceiver");
    }
    
    public final void onReceive(final Context context, final Intent intent) {
        this.a(context);
        trn.h(MdxBackgroundScanBootReceiver.b, "MdxBackgroundScanBootReceiver: onReceive");
        this.a.a();
    }
}
