// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.preview.service;

import android.net.Uri;
import android.os.Handler;

public abstract class a
{
    protected zqy a;
    final e b;
    private tdi c;
    
    public a(final e b) {
        this.b = b;
    }
    
    final void d() {
        final tdi c = this.c;
        if (c != null) {
            c.b();
            this.c = null;
        }
        final zqy a = this.a;
        if (a != null) {
            a.d();
            this.a = null;
        }
    }
    
    public abstract void e();
    
    public abstract void f();
    
    public abstract void g();
    
    public abstract void h();
    
    final void i(final aowb aowb, final String s) {
        final Uri n = aamz.N(aowb);
        if (n == null) {
            this.b.c();
            return;
        }
        this.c = tdi.a((tdg)new c(this.b, s));
        final e b = this.b;
        ((acig)b.b).k(n, (tdg)tdo.a((Handler)b.a, (tdg)this.c));
    }
    
    public abstract boolean j();
    
    public abstract boolean k();
}
