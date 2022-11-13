// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.preview.service;

import android.net.Uri;
import android.os.Handler;

public abstract class a
{
    protected zpc a;
    final e b;
    private tce c;
    
    public a(final e b) {
        this.b = b;
    }
    
    final void d() {
        final tce c = this.c;
        if (c != null) {
            c.d();
            this.c = null;
        }
        final zpc a = this.a;
        if (a != null) {
            a.d();
            this.a = null;
        }
    }
    
    public abstract void e();
    
    public abstract void f();
    
    public abstract void g();
    
    public abstract void h();
    
    final void i(final aotp aotp, final String s) {
        final Uri j = aald.J(aotp);
        if (j == null) {
            this.b.c();
            return;
        }
        this.c = tce.c((tcc)new c(this.b, s));
        final e b = this.b;
        ((acgs)b.b).k(j, (tcc)tck.c((Handler)b.a, (tcc)this.c));
    }
    
    public abstract boolean j();
    
    public abstract boolean k();
}
