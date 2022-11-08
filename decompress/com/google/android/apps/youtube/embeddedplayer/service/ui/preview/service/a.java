// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.preview.service;

import android.net.Uri;
import android.os.Handler;

public abstract class a
{
    protected zng a;
    final /* synthetic */ e b;
    private szz c;
    
    public a(final e b) {
        this.b = b;
    }
    
    final void d() {
        final szz c = this.c;
        if (c != null) {
            c.d();
            this.c = null;
        }
        final zng a = this.a;
        if (a != null) {
            a.d();
            this.a = null;
        }
    }
    
    public abstract void e();
    
    public abstract void f();
    
    public abstract void g();
    
    public abstract void h();
    
    final void i(final aorm aorm, final String s) {
        final Uri d = actc.D(aorm);
        if (d == null) {
            this.b.c();
            return;
        }
        this.c = szz.c((szx)new c(this.b, s));
        final e b = this.b;
        ((aceo)b.b).k(d, (szx)taf.c((Handler)b.a, (szx)this.c));
    }
    
    public abstract boolean j();
    
    public abstract boolean k();
}
