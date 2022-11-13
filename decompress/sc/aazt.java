import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aazt implements aazo
{
    public final Executor a;
    public final aukf b;
    public final aukf c;
    public final abuh d;
    public abvz e;
    public abzo f;
    public boolean g;
    public boolean h;
    public int i;
    private final aukf j;
    private final atke k;
    private abvy l;
    private abvy m;
    private abvy n;
    
    public aazt(final ashi ashi, final ashi ashi2, final atke atke, final Executor a, final aukf b, final aukf j, final aukf c, final abuh d, final atke k) {
        this.g = false;
        this.h = false;
        this.i = 0;
        ashi.an(new aauu(this, 16), (asjm)aaof.p);
        ashi2.an(new aauu(this, 17), (asjm)aaof.p);
        ((ashi)((abpu)atke.a()).p().k).an(new aauu(this, 18), (asjm)aaof.p);
        this.a = a;
        this.b = b;
        this.j = j;
        this.c = c;
        this.d = d;
        this.k = k;
    }
    
    static /* bridge */ void k(final aazt aazt) {
        aazt.l(0);
    }
    
    private final void l(final int n) {
        this.h();
        this.g = false;
        this.b.tu((Object)aazn.b(n));
    }
    
    @Override
    public final void a() {
        if (this.g) {
            this.h();
            this.g = false;
            this.b.tu((Object)aazn.b(2));
            this.i = 0;
        }
    }
    
    @Override
    public final void b(final long n, final long n2) {
        this.g(n, n2, true, false);
    }
    
    @Override
    public final void c(final long n, final long n2) {
        this.g(n, n2, false, false);
    }
    
    @Override
    public final void d(final long n, final long n2) {
        this.g(n, n2, true, true);
    }
    
    @Override
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
        this.l = new aazq(this, n - 1L, b2, n, n2);
        this.m = new aazr(this, n2 + 1L, b2, n, n2);
        this.n = new aazs(this, n);
        if (((vai)this.k.a()).f(45364993L) && (!b2 || b)) {
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
            this.c.tu((Object)aazu.d(n, n2, this.i));
        }
        this.j.tu((Object)aazv.c(n, n2));
        if (!this.g) {
            this.a.execute(new aazp(this, b, n));
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
        this.d.Z(n);
    }
}
