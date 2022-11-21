// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.preview.service;

public final class b extends a implements zrb
{
    final e c;
    private final String d;
    private int e;
    private int f;
    
    public b(final e c, final String d, final int e) {
        super(this.c = c);
        this.f = -1;
        this.d = d;
        this.e = e;
    }
    
    private final void l(final int e) {
        this.d();
        this.e = e;
        this.h();
    }
    
    public final void a(final dbm dbm) {
        tut.d("Error loading ApiThumbnailLoader", (Throwable)dbm);
        this.c.c();
    }
    
    @Override
    public final void e() {
        this.l(0);
    }
    
    @Override
    public final void f() {
        this.l(this.e + 1);
    }
    
    @Override
    public final void g() {
        this.l(this.e - 1);
    }
    
    @Override
    public final void h() {
        final vxq f = ((adhd)this.c.e).f();
        f.b = this.d;
        f.c = this.e;
        this.a = new zqy((zrb)this);
        ((adhd)this.c.e).g(f, (zrb)this.a);
    }
    
    @Override
    public final boolean j() {
        return this.e < this.f - 1;
    }
    
    @Override
    public final boolean k() {
        return this.e > 0;
    }
    
    public final /* bridge */ void mU(final Object o) {
        final aldc aldc = (aldc)o;
        alcz alcz;
        if ((alcz = aldc.d) == null) {
            alcz = alcz.a;
        }
        aldd aldd;
        if ((aldd = alcz.b) == null) {
            aldd = aldd.a;
        }
        this.f = (int)aldd.b;
        final aowb a = com.google.android.apps.youtube.embeddedplayer.service.ui.preview.service.e.a(aldc);
        alda alda;
        if ((alda = aldc.c) == null) {
            alda = alda.a;
        }
        alde a2;
        if (alda.b == 87079103) {
            a2 = (alde)alda.c;
        }
        else {
            a2 = alde.a;
        }
        this.i(a, a2.c);
    }
    
    public final void mV() {
    }
}
