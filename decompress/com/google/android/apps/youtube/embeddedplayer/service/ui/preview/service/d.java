// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.preview.service;

public final class d extends a implements znj
{
    final /* synthetic */ e c;
    private final String d;
    
    public d(final e c, final String d) {
        this.c = c;
        super(c);
        this.d = d;
    }
    
    public final void a(final dbi dbi) {
        trn.d("Error loading ApiThumbnailLoader", (Throwable)dbi);
        this.c.c();
    }
    
    public final void e() {
        afqg.s("Ignoring call to first() on YouTubeThumbnailView due to no playlist being set.");
    }
    
    public final void f() {
        throw new UnsupportedOperationException();
    }
    
    public final void g() {
        throw new UnsupportedOperationException();
    }
    
    public final void h() {
        final vug f = ((addp)this.c.e).f();
        f.a = this.d;
        this.a = new zng((znj)this);
        ((addp)this.c.e).g(f, (znj)this.a);
    }
    
    public final boolean j() {
        return false;
    }
    
    public final boolean k() {
        return false;
    }
}
