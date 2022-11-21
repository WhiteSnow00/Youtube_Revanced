// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.player.overlay;

import android.content.Context;

public final class RepeatChapterPlaybackLoopController implements uxt, tio
{
    public final atnb a;
    public final Context b;
    public final abav c;
    public final jdx d;
    public final jco e;
    public final abbx f;
    public final wza g;
    public int h;
    public String i;
    public final agop j;
    private final uwk k;
    private final jfe l;
    private final aslm m;
    private final aslm n;
    
    public RepeatChapterPlaybackLoopController(final atnb a, final Context b, final uwk k, final jfe l, final agop j, final abav c, final jdx d, final jco e, final abbx f, final wza g, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.h = 0;
        this.a = a;
        this.b = b;
        this.k = k;
        this.l = l;
        this.j = j;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.m = new aslm();
        this.n = new aslm();
    }
    
    public final tik g() {
        return tik.b;
    }
    
    public final void j() {
        this.m.b();
    }
    
    public final void lW(final aup aup) {
    }
    
    public final void mJ(final uwd uwd) {
        if (uwd == null) {
            this.j();
            return;
        }
        final ajrp b = uwd.B();
        if (b != null && b.d == 1 && ((String)b.e).equals("engagement-panel-macro-markers-description-chapters")) {
            this.m.b();
            this.m.c(this.l.z().am((asmi)new ixu(this, 15)));
            return;
        }
        this.j();
    }
    
    public final void mp(final aup aup) {
    }
    
    public final void mx(final aup aup) {
    }
    
    public final void oO(final aup aup) {
    }
    
    public final void oT(final aup aup) {
        this.k.g().a((uxt)this);
        this.n.c(this.l.y().am((asmi)new ixu(this, 13)));
        this.n.c(((aske)this.l.p().d).R().am((asmi)new ixu(this, 14)));
    }
    
    public final void oU() {
        tgj.d((tio)this);
    }
    
    public final void oX() {
        tgj.c((tio)this);
    }
    
    public final void oY(final aup aup) {
        this.k.g().b((uxt)this);
        if (!this.m.b) {
            this.j();
        }
        this.n.b();
    }
}
