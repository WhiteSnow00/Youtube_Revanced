// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.player.controls;

import java.util.concurrent.atomic.AtomicReference;
import android.content.Context;
import android.app.Activity;

public class ReportVideoController implements tfh
{
    public final Activity a;
    public final zki b;
    public final tny c;
    public final zkw d;
    public final absi e;
    public alcc f;
    private final thh g;
    private final isc h;
    private final asho i;
    private final abns j;
    private asic k;
    private final aja l;
    
    public ReportVideoController(final Activity a, final thh g, final zki b, final tny c, final zkw d, final absi e, final isc h, final aja l, final abns j, final asho i, final byte[] array, final byte[] array2, final byte[] array3) {
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
    
    public final void j(final alcc alcc) {
        if (!this.g.p()) {
            tmy.x((Context)this.a, 2132018403, 1);
            return;
        }
        final int b = alcc.b;
        if (b != 77875886) {
            if (b == 113762946) {
                final aja l = this.l;
                final antf antf = (antf)alcc.c;
                final abtt q = ((abno)l.b).q();
                if (q != null) {
                    ((ackj)l.c).a = aexq.k(q.c());
                }
                ((agiy)l.a).d(antf, l.c);
            }
            return;
        }
        this.h.a((amvz)alcc.c);
    }
    
    public final void oS(final aum aum) {
        asic k;
        if (((uyi)this.j.cd().h).bx()) {
            k = this.j.R().am((asix)new isg(this, 1), (asix)irb.j);
        }
        else {
            k = this.j.Q().R().P(this.i).am((asix)new isg(this, 1), (asix)irb.j);
        }
        this.k = k;
    }
    
    public final void oW(final aum aum) {
        final asic k = this.k;
        if (k != null) {
            athh.f((AtomicReference)k);
            this.k = null;
        }
    }
}
