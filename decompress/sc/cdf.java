import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

final class cdf extends cce implements cdc
{
    final cdh a;
    private final String b;
    private boolean c;
    private int d;
    private int e;
    private cdb f;
    private int g;
    
    public cdf(final cdh a, final String b) {
        this.a = a;
        this.d = -1;
        this.g = -1;
        this.b = b;
    }
    
    public final void a() {
        this.a.m((cdc)this);
    }
    
    public final void b(final int d) {
        final cdb f = this.f;
        if (f != null) {
            f.d(this.g, d);
            return;
        }
        this.d = d;
        this.e = 0;
    }
    
    public final void c(final int n) {
        final cdb f = this.f;
        if (f != null) {
            f.f(this.g, n);
            return;
        }
        this.e += n;
    }
    
    public final int d() {
        return this.g;
    }
    
    public final void e(final cdb f) {
        final cde cde = new cde();
        this.f = f;
        final String b = this.b;
        final int g = f.d++;
        final int n = f.c++;
        final Bundle bundle = new Bundle();
        bundle.putString("memberRouteId", b);
        f.g(11, n, g, (Object)null, bundle);
        f.g.put(n, (Object)cde);
        this.g = g;
        if (this.c) {
            f.b(g);
            final int d = this.d;
            if (d >= 0) {
                f.d(this.g, d);
                this.d = -1;
            }
            final int e = this.e;
            if (e != 0) {
                f.f(this.g, e);
                this.e = 0;
            }
        }
    }
    
    public final void f() {
        final cdb f = this.f;
        if (f != null) {
            f.a(this.g);
            this.f = null;
            this.g = 0;
        }
    }
    
    public final void g() {
        this.c = true;
        final cdb f = this.f;
        if (f != null) {
            f.b(this.g);
        }
    }
    
    public final void h() {
        this.i(0);
    }
    
    public final void i(final int n) {
        this.c = false;
        final cdb f = this.f;
        if (f != null) {
            f.e(this.g, n);
        }
    }
}
