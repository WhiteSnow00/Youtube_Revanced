import java.util.Collections;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bzr implements bzs
{
    private final List a;
    private final bug[] b;
    private boolean c;
    private int d;
    private int e;
    private long f;
    
    public bzr(final List a) {
        this.a = a;
        this.b = new bug[a.size()];
        this.f = -9223372036854775807L;
    }
    
    private final boolean f(final bat bat, final int n) {
        if (bat.a() == 0) {
            return false;
        }
        if (bat.i() != n) {
            this.c = false;
        }
        --this.d;
        return this.c;
    }
    
    public final void a(final bat bat) {
        if (this.c) {
            if (this.d == 2 && !this.f(bat, 32)) {
                return;
            }
            final int d = this.d;
            int i = 0;
            if (d == 1 && !this.f(bat, 0)) {
                return;
            }
            final int b = bat.b;
            final int a = bat.a();
            for (bug[] b2 = this.b; i < b2.length; ++i) {
                final bug bug = b2[i];
                bat.G(b);
                bug.c(bat, a);
            }
            this.e += a;
        }
    }
    
    public final void b(final btp btp, final car car) {
        for (int i = 0; i < this.b.length; ++i) {
            final eae eae = this.a.get(i);
            car.c();
            final bug q = btp.q(car.a(), 3);
            final ayg ayg = new ayg();
            ayg.a = car.b();
            ayg.k = "application/dvbsubs";
            ayg.m = Collections.singletonList(eae.b);
            ayg.c = (String)eae.a;
            q.b(ayg.a());
            this.b[i] = q;
        }
    }
    
    public final void c() {
        if (this.c) {
            if (this.f != -9223372036854775807L) {
                final bug[] b = this.b;
                for (int length = b.length, i = 0; i < length; ++i) {
                    b[i].e(this.f, 1, this.e, 0, (buf)null);
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
