// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.search.voice;

import android.os.Bundle;
import com.google.android.libraries.youtube.rendering.ui.permissions.PermissionDescriptor;

public class PermissionRequestActivity extends jlj implements acst
{
    private static final PermissionDescriptor[] d;
    public tox b;
    public acss c;
    
    static {
        d = new PermissionDescriptor[] { new PermissionDescriptor(2, wya.c(65799), wya.c(65800)) };
    }
    
    public final void aL() {
        this.setResult(0);
        this.finish();
    }
    
    public final void aM() {
        this.setResult(-1);
        this.finish();
    }
    
    protected final void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        Object a;
        if (bundle == null) {
            final acss c = this.c;
            c.e(PermissionRequestActivity.d);
            c.f = wya.b(69076);
            c.g = wya.c(69077);
            c.h = wya.c(69078);
            c.i = wya.c(69079);
            c.b(2132020185);
            c.c(2132020186);
            c.c = 2132019105;
            a = c.a();
            final ct i = ((bu)this).getSupportFragmentManager().i();
            i.q(16908290, (br)a);
            i.a();
        }
        else {
            a = ((bu)this).getSupportFragmentManager().e(16908290);
        }
        ((acsu)a).aK((acst)this);
    }
    
    public final void onUserInteraction() {
        final tox b = this.b;
        if (b != null) {
            b.b();
        }
        super.onUserInteraction();
    }
}
