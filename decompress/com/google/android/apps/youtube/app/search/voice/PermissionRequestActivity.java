// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.search.voice;

import android.os.Bundle;
import com.google.android.libraries.youtube.rendering.ui.permissions.PermissionDescriptor;

public class PermissionRequestActivity extends jmx implements acwj
{
    private static final PermissionDescriptor[] d;
    public tsd b;
    public acwi c;
    
    static {
        d = new PermissionDescriptor[] { new PermissionDescriptor(2, xbf.c(65799), xbf.c(65800)) };
    }
    
    public final void aM() {
        this.setResult(0);
        this.finish();
    }
    
    public final void aN() {
        this.setResult(-1);
        this.finish();
    }
    
    protected final void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        acwk a;
        if (bundle == null) {
            final acwi c = this.c;
            c.e(PermissionRequestActivity.d);
            c.f = xbf.b(69076);
            c.g = xbf.c(69077);
            c.h = xbf.c(69078);
            c.i = xbf.c(69079);
            c.b(2132020189);
            c.c(2132020190);
            c.c = 2132019108;
            a = c.a();
            final ct i = ((bu)this).getSupportFragmentManager().i();
            i.q(16908290, (br)a);
            i.a();
        }
        else {
            a = (acwk)((bu)this).getSupportFragmentManager().e(16908290);
        }
        a.aK((acwj)this);
    }
    
    public final void onUserInteraction() {
        final tsd b = this.b;
        if (b != null) {
            b.b();
        }
        super.onUserInteraction();
    }
}
