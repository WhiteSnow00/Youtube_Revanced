import java.util.Collections;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bzo implements bzp
{
    private final List a;
    private final bud[] b;
    private boolean c;
    private int d;
    private int e;
    private long f;
    
    public bzo(final List a) {
        this.a = a;
        this.b = new bud[a.size()];
        this.f = -9223372036854775807L;
    }
    
    private final boolean f(final bas bas, final int n) {
        if (bas.a() == 0) {
            return false;
        }
        if (bas.i() != n) {
            this.c = false;
        }
        --this.d;
        return this.c;
    }
    
    public final void a(final bas bas) {
        if (this.c) {
            if (this.d == 2 && !this.f(bas, 32)) {
                return;
            }
            final int d = this.d;
            int i = 0;
            if (d == 1 && !this.f(bas, 0)) {
                return;
            }
            final int b = bas.b;
            final int a = bas.a();
            for (bud[] b2 = this.b; i < b2.length; ++i) {
                final bud bud = b2[i];
                bas.G(b);
                bud.c(bas, a);
            }
            this.e += a;
        }
    }
    
    public final void b(final btm btm, final cao cao) {
        for (int i = 0; i < this.b.length; ++i) {
            final eab eab = this.a.get(i);
            cao.c();
            final bud q = btm.q(cao.a(), 3);
            final ayf ayf = new ayf();
            ayf.a = cao.b();
            ayf.k = "application/dvbsubs";
            ayf.m = Collections.singletonList(eab.b);
            ayf.c = (String)eab.a;
            q.b(ayf.a());
            this.b[i] = q;
        }
    }
    
    public final void c() {
        if (this.c) {
            if (this.f != -9223372036854775807L) {
                final bud[] b = this.b;
                for (int length = b.length, i = 0; i < length; ++i) {
                    b[i].e(this.f, 1, this.e, 0, (buc)null);
                }
            }
            this.c = false;
        }
    }
    
    public final void d(final long f, final int n) {
        if ((n & 0x4) == 0x0) {
            return;
        }
        this.c = true;
        if (f != -9223372036854775807L) {
            this.f = f;
        }
        this.e = 0;
        this.d = 2;
    }
    
    public final void e() {
        this.c = false;
        this.f = -9223372036854775807L;
    }
}
