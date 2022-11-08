// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.watch.engagementpanel;

import java.util.ArrayDeque;
import android.content.Context;

public class WatchEngagementPanelViewContainerController implements tff
{
    public ashe a;
    public final Context b;
    public final arhr c;
    public final kwi d;
    public final abns e;
    public final asib f;
    public final kwe g;
    public final kwf h;
    public final boolean i;
    public kwg j;
    public final uyf k;
    public final arud l;
    public final fzo m;
    private final ArrayDeque n;
    private final ashp o;
    private final ashp p;
    
    public WatchEngagementPanelViewContainerController(final Context b, final arhr c, final uyf k, final arud l, final kwi d, final fzo m, final abns e, final kwe g, final ashp o, final ashp p16, final uyi uyi, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.n = new ArrayDeque();
        this.b = b;
        this.k = k;
        this.l = l;
        this.c = c;
        this.d = d;
        this.m = m;
        this.e = e;
        this.g = g;
        this.o = o;
        this.p = p16;
        this.f = new asib();
        this.i = uyi.cQ();
        this.h = new kwf();
        this.a = ashe.H();
    }
    
    public final ashe j(final kwd kwd) {
        String.valueOf(kwd);
        if (kwd == kwd.a) {
            return this.o.k();
        }
        if (kwd == kwd.b) {
            return this.p.k();
        }
        return ashe.H();
    }
    
    public final void k(final String s) {
        if (this.n.size() == 8) {
            this.n.removeFirst();
        }
        this.n.addLast(s);
    }
    
    public final void mM(final aum aum) {
        this.f.b();
    }
}
