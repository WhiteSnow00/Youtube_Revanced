// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.player.overlay;

import android.content.Context;

public final class RepeatChapterPlaybackLoopController implements uut, tfh
{
    public final atjj a;
    public final Context b;
    public final aaxs c;
    public final jcm d;
    public final jbg e;
    public final aays f;
    public final wvu g;
    public int h;
    public String i;
    public final agkw j;
    private final utk k;
    private final jdt l;
    private final asib m;
    private final asib n;
    
    public RepeatChapterPlaybackLoopController(final atjj a, final Context b, final utk k, final jdt l, final agkw j, final aaxs c, final jcm d, final jbg e, final aays f, final wvu g, final byte[] array, final byte[] array2) {
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
        this.m = new asib();
        this.n = new asib();
    }
    
    public final void j() {
        this.m.b();
    }
    
    public final void oS(final aum aum) {
        this.k.E().i((uut)this);
        this.n.c(this.l.z().al((asix)new iws(this, 11)));
        this.n.c(((asgt)this.l.q().d).R().al((asix)new iws(this, 12)));
    }
    
    public final void oW(final aum aum) {
        this.k.E().j((uut)this);
        if (!this.m.b) {
            this.j();
        }
        this.n.b();
    }
    
    public final void pw(final utd utd) {
        if (utd == null) {
            this.j();
            return;
        }
        final ajnl c = utd.C();
        if (c != null && c.d == 1 && ((String)c.e).equals("engagement-panel-macro-markers-description-chapters")) {
            this.m.b();
            this.m.c(this.l.A().al((asix)new iws(this, 13)));
            return;
        }
        this.j();
    }
}
