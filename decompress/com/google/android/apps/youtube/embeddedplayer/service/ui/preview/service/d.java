// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.preview.service;

public final class d extends a implements zrb
{
    final e c;
    private final String d;
    
    public d(final e c, final String d) {
        super(this.c = c);
        this.d = d;
    }
    
    public final void a(final dbm dbm) {
        tut.d("Error loading ApiThumbnailLoader", (Throwable)dbm);
        this.c.c();
    }
    
    @Override
    public final void e() {
        aftr.l("Ignoring call to first() on YouTubeThumbnailView due to no playlist being set.");
    }
    
    @Override
    public final void f() {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public final void g() {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public final void h() {
        final vxq f = ((adhd)this.c.e).f();
        f.a = this.d;
        this.a = new zqy((zrb)this);
        ((adhd)this.c.e).g(f, (zrb)this.a);
    }
    
    @Override
    public final boolean j() {
        return false;
    }
    
    @Override
    public final boolean k() {
        return false;
    }
    
    public final /* bridge */ void mU(final Object o) {
        this.i(e.a((aldc)o), this.d);
    }
    
    public final void mV() {
    }
}
