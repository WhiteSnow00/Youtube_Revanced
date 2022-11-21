// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.player.controls;

import java.util.concurrent.atomic.AtomicReference;
import android.content.Context;
import android.app.Activity;

public class ReportVideoController implements tio
{
    public final Activity a;
    public final zoa b;
    public final tre c;
    public final zoo d;
    public final abvt e;
    public algf f;
    private final tkq g;
    private final itj h;
    private final askz i;
    private final abqz j;
    private asln k;
    private final ajc l;
    
    public ReportVideoController(final Activity a, final tkq g, final zoa b, final tre c, final zoo d, final abvt e, final itj h, final ajc l, final abqz j, final askz i, final byte[] array, final byte[] array2, final byte[] array3) {
        this.a = a;
        this.g = g;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.h = h;
        this.l = l;
        this.j = j;
        this.i = i;
        this.k = null;
        this.f = null;
    }
    
    public final tik g() {
        return tik.b;
    }
    
    public final void j(final algf algf) {
        if (!this.g.p()) {
            tqf.x((Context)this.a, 2132018406, 1);
            return;
        }
        final int b = algf.b;
        if (b != 77875886) {
            if (b == 113762946) {
                final ajc l = this.l;
                final anxo anxo = (anxo)algf.c;
                final abxg q = ((abqv)l.c).q();
                if (q != null) {
                    ((acnz)l.b).a = afbh.k(q.c());
                }
                ((agmq)l.a).d(anxo, l.b);
            }
            return;
        }
        this.h.a((anai)algf.c);
    }
    
    public final void lW(final aup aup) {
    }
    
    public final void mp(final aup aup) {
    }
    
    public final void mx(final aup aup) {
    }
    
    public final void oO(final aup aup) {
    }
    
    public final void oT(final aup aup) {
        asln k;
        if (((vbs)this.j.cg().g).bA()) {
            k = this.j.Q().an((asmi)new itn(this, 0), (asmi)isj.j);
        }
        else {
            k = this.j.P().R().P(this.i).an((asmi)new itn(this, 0), (asmi)isj.j);
        }
        this.k = k;
    }
    
    public final void oU() {
        tgj.d((tio)this);
    }
    
    public final void oX() {
        tgj.c((tio)this);
    }
    
    public final void oY(final aup aup) {
        final asln k = this.k;
        if (k != null) {
            atkw.f((AtomicReference)k);
            this.k = null;
        }
    }
}
