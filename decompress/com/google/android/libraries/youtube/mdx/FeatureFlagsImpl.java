// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.mdx;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.Executor;
import com.google.common.util.concurrent.ListenableFuture;

public final class FeatureFlagsImpl implements wzt, tfh, tec
{
    private asic A;
    private ashe B;
    private asic C;
    private asic D;
    private ListenableFuture E;
    private ListenableFuture F;
    private final uyi G;
    public final zki a;
    public final wzw b;
    public final xbz c;
    public final rkw d;
    public final atir e;
    public final atir f;
    public final atir g;
    public final atir h;
    public final atir i;
    public final atir j;
    public final atir k;
    public final atir l;
    public final atir m;
    public final atir n;
    public final atir o;
    public final uyi p;
    private final tdz q;
    private final Executor r;
    private final Executor s;
    private final vjf t;
    private final atir u;
    private final atir v;
    private final atir w;
    private final atir x;
    private asic y;
    private asic z;
    
    public FeatureFlagsImpl(final tdz q, final Executor r, final Executor s, final zki a, final vjf t, final wzw b, final uyi g, final rkw d, final uyi p10, final xbz c) {
        this.q = q;
        this.r = r;
        this.s = s;
        this.a = a;
        this.t = t;
        this.b = b;
        this.G = g;
        this.d = d;
        this.p = p10;
        this.c = c;
        final Boolean value = false;
        this.e = atir.aR((Object)value);
        this.f = atir.aR((Object)value);
        this.g = atir.aR((Object)value);
        this.h = atir.aR((Object)value);
        this.i = atir.aR((Object)value);
        this.j = atir.e();
        this.k = atir.e();
        this.l = atir.e();
        this.u = atir.e();
        this.v = atir.e();
        this.n = atir.e();
        this.o = atir.e();
        this.w = atir.e();
        this.m = atir.e();
        this.x = atir.e();
    }
    
    public final ashe j() {
        return (ashe)this.l;
    }
    
    public final ashe k() {
        return (ashe)this.f;
    }
    
    public final ashe l() {
        return (ashe)this.j;
    }
    
    public final ashe m() {
        return (ashe)this.e;
    }
    
    public final Class[] ms(final Class clazz, final Object o, final int n) {
        Class[] array;
        if (n != -1) {
            if (n != 0) {
                final StringBuilder sb = new StringBuilder("unsupported op code: ");
                sb.append(n);
                throw new IllegalStateException(sb.toString());
            }
            final zkv zkv = (zkv)o;
            this.u();
            this.t();
            array = null;
        }
        else {
            array = new Class[] { zkv.class };
        }
        return array;
    }
    
    public final ashe n() {
        return (ashe)this.k;
    }
    
    public final ashe o() {
        return (ashe)this.h;
    }
    
    public final void oS(final aum aum) {
        this.q.g((Object)this);
        this.u();
        this.t();
        final asic y = this.y;
        if (y == null || y.tx()) {
            this.t.h();
            this.y = this.t.h().aB((asix)new wvv(this, 2));
        }
        final asic z = this.z;
        if (z == null || z.tx()) {
            this.z = this.G.l(45357214L).aB((asix)new wvv(this, 4));
        }
        final asic a = this.A;
        if (a == null || a.tx()) {
            final ashe o = ashe.o((ashh)this.w, (ashh)this.x, (ashh)this.m, (asiy)new flk(this, 7));
            this.B = o;
            this.A = o.aB((asix)new wvv(this, 5));
        }
        this.C = ashe.m((ashh)this.B, (ashh)this.n, (asit)uwa.g).aB((asix)new wvv(this.u, 3));
        this.D = ashe.m((ashh)this.B, (ashh)this.o, (asit)new gcn(this, 17)).aB((asix)new wvv(this.v, 3));
    }
    
    public final void oW(final aum aum) {
        this.q.m((Object)this);
        final ListenableFuture e = this.E;
        if (e != null && !e.isDone()) {
            this.E.cancel(true);
        }
        final ListenableFuture f = this.F;
        if (f != null && !f.isDone()) {
            this.F.cancel(true);
        }
        final asic y = this.y;
        if (y != null) {
            asjg.b((AtomicReference)y);
        }
        final asic z = this.z;
        if (z != null) {
            asjg.b((AtomicReference)z);
        }
        final asic a = this.A;
        if (a != null) {
            asjg.b((AtomicReference)a);
        }
        final asic c = this.C;
        if (c != null) {
            asjg.b((AtomicReference)c);
        }
        final asic d = this.D;
        if (d != null) {
            asjg.b((AtomicReference)d);
        }
    }
    
    public final ashe p() {
        return (ashe)this.g;
    }
    
    public final ashe q() {
        return (ashe)this.i;
    }
    
    public final ashe r() {
        return (ashe)this.v;
    }
    
    public final ashe s() {
        return (ashe)this.u;
    }
    
    public final void t() {
        tcp.k(this.F = afva.q((Callable)new wzu(this, 1), this.r), this.s, (tcn)vaa.m, (tco)new wwf(this.x, 2));
    }
    
    public final void u() {
        tcp.k(this.E = afva.q((Callable)new wzu(this, 0), this.r), this.s, (tcn)vaa.l, (tco)new wwf(this.w, 2));
    }
}
