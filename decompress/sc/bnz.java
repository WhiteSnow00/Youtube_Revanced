import java.io.IOException;
import java.util.Iterator;
import android.os.Handler;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bnz
{
    public final int a;
    public final long b;
    public final List c;
    public final Object d;
    
    public bnz() {
        this(new CopyOnWriteArrayList(), 0, null, 0L);
    }
    
    public bnz(final List c, final eg d, final int a, final long b, final byte[] array, final byte[] array2) {
        this.c = c;
        this.d = d;
        this.a = a;
        this.b = b;
    }
    
    private bnz(final CopyOnWriteArrayList c, final int a, final ayy d, final long b) {
        this.c = c;
        this.a = a;
        this.d = d;
        this.b = b;
    }
    
    public final long a(long a) {
        a = bax.A(a);
        if (a == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return this.b + a;
    }
    
    public final void b(final Handler handler, final boa boa) {
        dk.d((Object)boa);
        ((CopyOnWriteArrayList<eab>)this.c).add(new eab(handler, boa));
    }
    
    public final void c(final bnt bnt) {
        for (final eab eab : (CopyOnWriteArrayList)this.c) {
            bax.az((Handler)eab.b, (Runnable)new vo(this, (boa)eab.a, bnt, 6));
        }
    }
    
    public final void d(final int n, final ayg ayg, final int n2, final Object o, final long n3) {
        this.c(new bnt(1, n, ayg, n2, o, this.a(n3), -9223372036854775807L));
    }
    
    public final void e(final bno bno, final bnt bnt) {
        for (final eab eab : (CopyOnWriteArrayList)this.c) {
            bax.az((Handler)eab.b, (Runnable)new tu(this, (boa)eab.a, bno, bnt, 8));
        }
    }
    
    public final void f(final bno bno, final int n, final int n2, final ayg ayg, final int n3, final Object o, final long n4, final long n5) {
        this.e(bno, new bnt(n, n2, ayg, n3, o, this.a(n4), this.a(n5)));
    }
    
    public final void g(final bno bno, final int n) {
        this.i(bno, n, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }
    
    public final void h(final bno bno, final bnt bnt) {
        for (final eab eab : (CopyOnWriteArrayList)this.c) {
            bax.az((Handler)eab.b, (Runnable)new tu(this, (boa)eab.a, bno, bnt, 11));
        }
    }
    
    public final void i(final bno bno, final int n, final int n2, final ayg ayg, final int n3, final Object o, final long n4, final long n5) {
        this.h(bno, new bnt(n, n2, ayg, n3, o, this.a(n4), this.a(n5)));
    }
    
    public final void j(final bno bno, final int n, final IOException ex, final boolean b) {
        this.l(bno, n, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, ex, b);
    }
    
    public final void k(final bno bno, final bnt bnt, final IOException ex, final boolean b) {
        for (final eab eab : (CopyOnWriteArrayList)this.c) {
            bax.az((Handler)eab.b, (Runnable)new nhs(this, (boa)eab.a, bno, bnt, ex, b, 1));
        }
    }
    
    public final void l(final bno bno, final int n, final int n2, final ayg ayg, final int n3, final Object o, final long n4, final long n5, final IOException ex, final boolean b) {
        this.k(bno, new bnt(n, n2, ayg, n3, o, this.a(n4), this.a(n5)), ex, b);
    }
    
    public final void m(final bno bno, final bnt bnt) {
        for (final eab eab : (CopyOnWriteArrayList)this.c) {
            bax.az((Handler)eab.b, (Runnable)new tu(this, (boa)eab.a, bno, bnt, 10));
        }
    }
    
    public final void n(final bno bno, final int n, final int n2, final ayg ayg, final int n3, final Object o, final long n4, final long n5) {
        this.m(bno, new bnt(n, n2, ayg, n3, o, this.a(n4), this.a(n5)));
    }
    
    public final void o(final bnt bnt) {
        final Object d = this.d;
        dk.d(d);
        for (final eab eab : (CopyOnWriteArrayList)this.c) {
            bax.az((Handler)eab.b, (Runnable)new tu(this, (boa)eab.a, (ayy)d, bnt, 9));
        }
    }
    
    public final bnz p(final int n, final ayy ayy, final long n2) {
        return new bnz((CopyOnWriteArrayList)this.c, n, ayy, n2);
    }
}
