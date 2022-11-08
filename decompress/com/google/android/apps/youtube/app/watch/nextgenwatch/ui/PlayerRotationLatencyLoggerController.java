// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.watch.nextgenwatch.ui;

import android.content.res.Configuration;

public class PlayerRotationLatencyLoggerController implements tfh, fxm
{
    public final lbn a;
    public final atjj b;
    public final itq c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final abrx g;
    public int h;
    public boolean i;
    public int j;
    public int k;
    public boolean l;
    private final fxo m;
    
    public PlayerRotationLatencyLoggerController(final lbn a, final atjj b, final itq c, final uyi uyi, final abrx g, final fxo m) {
        this.l = false;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = uyi.cG();
        this.e = uyi.f(45371908L);
        this.f = uyi.f(45371909L);
        this.g = g;
        this.m = m;
    }
    
    public final void j(final Configuration configuration) {
        if (this.k != configuration.orientation) {
            this.k = configuration.orientation;
        }
    }
    
    public final void k() {
        this.h = this.a.b();
        this.i = ((fai)this.b.a()).j();
        this.j = this.k;
    }
    
    public final void oS(final aum aum) {
        this.m.f(this);
    }
    
    public final void oW(final aum aum) {
        this.m.h(this);
    }
}
