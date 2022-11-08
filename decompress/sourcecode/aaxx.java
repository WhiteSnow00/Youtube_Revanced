import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aaxx implements aaxs
{
    public final Executor a;
    public final aujp b;
    public final aujp c;
    public final absg d;
    public abtv e;
    public abxl f;
    public boolean g;
    public boolean h;
    public int i;
    private final aujp j;
    private final atjj k;
    private abtu l;
    private abtu m;
    private abtu n;
    
    public aaxx(final asgt asgt, final asgt asgt2, final atjj atjj, final Executor a, final aujp b, final aujp j, final aujp c, final absg d, final atjj k) {
        this.g = false;
        this.h = false;
        this.i = 0;
        asgt.am((asix)new aavd(this, 11), (asix)aamk.p);
        asgt2.am((asix)new aavd(this, 12), (asix)aamk.p);
        ((asgt)((abns)atjj.a()).q().k).am((asix)new aavd(this, 13), (asix)aamk.p);
        this.a = a;
        this.b = b;
        this.j = j;
        this.c = c;
        this.d = d;
        this.k = k;
    }
    
    private final void l(final int n) {
        this.h();
        this.g = false;
        this.b.tr((Object)aaxr.b(n));
    }
    
    public final void a() {
        if (this.g) {
            this.h();
            this.g = false;
            this.b.tr((Object)aaxr.b(2));
            this.i = 0;
        }
    }
    
    public final void b(final long n, final long n2) {
        this.g(n, n2, true, false);
    }
    
    public final void c(final long n, final long n2) {
        this.g(n, n2, false, false);
    }
    
    public final void d(final long n, final long n2) {
        this.g(n, n2, true, true);
    }
    
    public final void e(final long n, final long n2) {
        this.g(n, n2, false, true);
    }
    
    public final void f() {
        this.e.e(this.l);
        this.e.e(this.m);
        this.e.e(this.n);
    }
    
    public final void g(final long n, final long n2, final boolean b, final boolean b2) {
        this.e.getClass();
        this.i = 0;
        this.h();
        this.l = (abtu)new aaxu(this, n - 1L, b2, n, n2);
        this.m = (abtu)new aaxv(this, n2 + 1L, b2, n, n2);
        this.n = (abtu)new aaxw(this, n);
        if (((uyi)this.k.a()).f(45364993L) && (!b2 || b)) {
            if (this.g) {
                this.f();
            }
            else {
                this.h = true;
            }
        }
        else {
            this.f();
        }
        if (b2) {
            this.c.tr((Object)aaxy.d(n, n2, this.i));
        }
        this.j.tr((Object)aaxz.c(n, n2));
        if (!this.g) {
            this.a.execute((Runnable)new aaxt(this, b, n));
            this.g = true;
        }
    }
    
    public final void h() {
        if (this.e != null) {
            this.i();
        }
        this.l = null;
        this.m = null;
        this.n = null;
    }
    
    public final void i() {
        this.e.k(this.l);
        this.e.k(this.m);
        this.e.k(this.n);
    }
    
    public final void j(final long n) {
        if (n < this.f.g) {
            this.l(1);
            return;
        }
        this.d.aa(n);
    }
}
