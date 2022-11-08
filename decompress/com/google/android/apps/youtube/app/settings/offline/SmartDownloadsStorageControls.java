// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.settings.offline;

import android.util.AttributeSet;
import android.content.Context;
import android.widget.FrameLayout;

public class SmartDownloadsStorageControls extends FrameLayout
{
    public static final afcw a;
    public jpw b;
    public Long c;
    
    static {
        a = afcw.q((Object)amuv.b, (Object)0.0809305668, (Object)amuv.c, (Object)0.1408291944, (Object)amuv.g, (Object)0.2383101657, (Object)amuv.d, (Object)0.2870506514, (Object)amuv.h, (Object)0.4935014859);
    }
    
    public SmartDownloadsStorageControls(final Context context) {
        super(context);
        this.c();
    }
    
    public SmartDownloadsStorageControls(final Context context, final AttributeSet set) {
        super(context, set);
        this.c();
    }
    
    public SmartDownloadsStorageControls(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.c();
    }
    
    public SmartDownloadsStorageControls(final Context context, final AttributeSet set, final int n, final int n2) {
        super(context, set, n, n2);
        this.c();
    }
    
    public static final void a(final wwv wwv, final int n) {
        wwv.l((wxz)new wws(wya.c(n)));
    }
    
    public static final int b(final float n) {
        return Math.round(n / 102.4f);
    }
    
    private final void c() {
        ((jpt)ahbz.az(this.getContext(), (Class)jpt.class)).wy(this);
    }
}
