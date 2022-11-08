// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.wellness.youtubetime;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.TimeUnit;

public class YoutubeTimeTimerController implements fen, tew, tev, tff, tec
{
    public final lmv a;
    public final tdz b;
    public final atjj c;
    public final asib d;
    public final atid e;
    public boolean f;
    public final uyf g;
    public final vja h;
    public final sin i;
    private final lmr j;
    private final atjj k;
    private final atjj l;
    private asic m;
    private final uyi n;
    private final mrm o;
    
    public YoutubeTimeTimerController(final lmr j, final lmv a, final uyf g, final tdz b, final sin i, final atjj c, final atjj k, final atjj l, final uyi n, final mrm o, final vja h, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.e = atid.aD();
        this.j = j;
        this.a = a;
        this.g = g;
        this.b = b;
        this.i = i;
        this.c = c;
        this.k = k;
        this.l = l;
        this.n = n;
        this.o = o;
        this.h = h;
        this.d = new asib();
    }
    
    public final void b(final boolean b) {
        if (b) {
            this.a.d();
            return;
        }
        if (((abno)this.k.a()).f()) {
            this.a.c();
        }
    }
    
    public final void j() {
        this.e.tr((Object)false);
        if (this.j.g()) {
            this.a.c();
        }
    }
    
    public final void k() {
        if (this.f) {
            return;
        }
        this.f = true;
        this.a.b = TimeUnit.SECONDS.toMillis(gkt.k(this.g));
        final lmv a = this.a;
        final int a2 = this.j.a();
        TimeUnit timeUnit;
        if (gkt.S(this.g)) {
            timeUnit = TimeUnit.SECONDS;
        }
        else {
            timeUnit = TimeUnit.MINUTES;
        }
        a.b(a2, timeUnit);
        this.b.g((Object)this);
        this.i.j((fen)this);
        this.d.f(new asic[] { ((ashe)this.a.a).aB((asix)new llp(this, 13)), ((ashe)this.j.d).z().aB((asix)new llp(this, 14)) });
        if (this.n.bQ()) {
            this.d.c(((asgt)((abns)this.l.a()).q().k).R().al((asix)new llp(this, 15)));
        }
        this.h.d((tey)this);
        this.a.c();
    }
    
    public final void l() {
        if (!this.j.g()) {
            return;
        }
        this.a.c();
    }
    
    public final void lD() {
        if (!this.j.g()) {
            return;
        }
        if (this.n.bQ() && ((abhq)this.c.a()).j && ((abno)this.k.a()).f()) {
            return;
        }
        this.a.d();
    }
    
    public final void mM(final aum aum) {
        if (!this.n.bP()) {
            return;
        }
        this.h.e((tey)this);
        final asic m = this.m;
        if (m != null) {
            asjg.b((AtomicReference)m);
        }
    }
    
    public final void mq(final aum aum) {
        if (!this.n.bP()) {
            return;
        }
        this.m = ((ashe)this.j.c).p(tmy.ch(this.o.u())).aB((asix)new llp(this, 12));
        if (this.j.g()) {
            this.k();
        }
    }
    
    public final Class[] ms(final Class clazz, final Object o, final int n) {
        Class[] array;
        if (n != -1) {
            array = null;
            if (n != 0) {
                if (n != 1) {
                    final StringBuilder sb = new StringBuilder("unsupported op code: ");
                    sb.append(n);
                    throw new IllegalStateException(sb.toString());
                }
                final zkx zkx = (zkx)o;
                this.a.d();
                this.a.a();
            }
            else {
                final zkv zkv = (zkv)o;
                this.a.d();
                this.a.a();
            }
        }
        else {
            array = new Class[] { zkv.class, zkx.class };
        }
        return array;
    }
}
