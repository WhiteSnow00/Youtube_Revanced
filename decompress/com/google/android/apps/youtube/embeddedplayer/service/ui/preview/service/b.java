// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.preview.service;

public final class b extends a implements znj
{
    final /* synthetic */ e c;
    private final String d;
    private int e;
    private int f;
    
    public b(final e c, final String d, final int e) {
        this.c = c;
        super(c);
        this.f = -1;
        this.d = d;
        this.e = e;
    }
    
    private final void l(final int e) {
        this.d();
        this.e = e;
        this.h();
    }
    
    public final void a(final dbi dbi) {
        trn.d("Error loading ApiThumbnailLoader", (Throwable)dbi);
        this.c.c();
    }
    
    public final void e() {
        this.l(0);
    }
    
    public final void f() {
        this.l(this.e + 1);
    }
    
    public final void g() {
        this.l(this.e - 1);
    }
    
    public final void h() {
        final vug f = ((addp)this.c.e).f();
        f.b = this.d;
        f.c = this.e;
        this.a = new zng((znj)this);
        ((addp)this.c.e).g(f, (znj)this.a);
    }
    
    public final boolean j() {
        return this.e < this.f - 1;
    }
    
    public final boolean k() {
        return this.e > 0;
    }
}
