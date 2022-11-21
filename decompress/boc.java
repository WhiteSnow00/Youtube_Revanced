import java.io.IOException;
import java.util.Iterator;
import android.os.Handler;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class boc
{
    public final int a;
    public final long b;
    public final List c;
    public final Object d;
    
    public boc() {
        this(new CopyOnWriteArrayList(), 0, null, 0L);
    }
    
    public boc(final List c, final eg d, final int a, final long b, final byte[] array, final byte[] array2) {
        this.c = c;
        this.d = d;
        this.a = a;
        this.b = b;
    }
    
    private boc(final CopyOnWriteArrayList c, final int a, final ayz d, final long b) {
        this.c = c;
        this.a = a;
        this.d = d;
        this.b = b;
    }
    
    public final long a(long a) {
        a = baz.A(a);
        if (a == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return this.b + a;
    }
    
    public final void b(final Handler handler, final bod bod) {
        bad.b(bod);
        ((CopyOnWriteArrayList<eae>)this.c).add(new eae(handler, bod));
    }
    
    public final void c(final bnw bnw) {
        for (final eae eae : (CopyOnWriteArrayList)this.c) {
            baz.az((Handler)eae.b, (Runnable)new vp(this, (bod)eae.a, bnw, 6));
        }
    }
    
    public final void d(final int n, final ayh ayh, final int n2, final Object o, final long n3) {
        this.c(new bnw(1, n, ayh, n2, o, this.a(n3), -9223372036854775807L));
    }
    
    public final void e(final bnr bnr, final bnw bnw) {
        for (final eae eae : (CopyOnWriteArrayList)this.c) {
            baz.az((Handler)eae.b, (Runnable)new tv(this, (bod)eae.a, bnr, bnw, 8));
        }
    }
    
    public final void f(final bnr bnr, final int n, final int n2, final ayh ayh, final int n3, final Object o, final long n4, final long n5) {
        this.e(bnr, new bnw(n, n2, ayh, n3, o, this.a(n4), this.a(n5)));
    }
    
    public final void g(final bnr bnr, final int n) {
        this.i(bnr, n, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }
    
    public final void h(final bnr bnr, final bnw bnw) {
        for (final eae eae : (CopyOnWriteArrayList)this.c) {
            baz.az((Handler)eae.b, (Runnable)new tv(this, (bod)eae.a, bnr, bnw, 11));
        }
    }
    
    public final void i(final bnr bnr, final int n, final int n2, final ayh ayh, final int n3, final Object o, final long n4, final long n5) {
        this.h(bnr, new bnw(n, n2, ayh, n3, o, this.a(n4), this.a(n5)));
    }
    
    public final void j(final bnr bnr, final int n, final IOException ex, final boolean b) {
        this.l(bnr, n, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, ex, b);
    }
    
    public final void k(final bnr bnr, final bnw bnw, final IOException ex, final boolean b) {
        for (final eae eae : (CopyOnWriteArrayList)this.c) {
            baz.az((Handler)eae.b, (Runnable)new nij(this, (bod)eae.a, bnr, bnw, ex, b, 1));
        }
    }
    
    public final void l(final bnr bnr, final int n, final int n2, final ayh ayh, final int n3, final Object o, final long n4, final long n5, final IOException ex, final boolean b) {
        this.k(bnr, new bnw(n, n2, ayh, n3, o, this.a(n4), this.a(n5)), ex, b);
    }
    
    public final void m(final bnr bnr, final bnw bnw) {
        for (final eae eae : (CopyOnWriteArrayList)this.c) {
            baz.az((Handler)eae.b, (Runnable)new tv(this, (bod)eae.a, bnr, bnw, 10));
        }
    }
    
    public final void n(final bnr bnr, final int n, final int n2, final ayh ayh, final int n3, final Object o, final long n4, final long n5) {
        this.m(bnr, new bnw(n, n2, ayh, n3, o, this.a(n4), this.a(n5)));
    }
    
    public final void o(final bnw bnw) {
        final Object d = this.d;
        bad.b(d);
        for (final eae eae : (CopyOnWriteArrayList)this.c) {
            baz.az((Handler)eae.b, (Runnable)new tv(this, (bod)eae.a, (ayz)d, bnw, 9));
        }
    }
    
    public final boc p(final int n, final ayz ayz, final long n2) {
        return new boc((CopyOnWriteArrayList)this.c, n, ayz, n2);
    }
}
