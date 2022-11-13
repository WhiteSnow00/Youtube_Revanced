import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

final class cdg extends cch implements cdc
{
    final cdh a;
    private final String b;
    private final String c;
    private boolean d;
    private int e;
    private int f;
    private cdb g;
    private int h;
    
    public cdg(final cdh a, final String b, final String c) {
        this.a = a;
        this.e = -1;
        this.b = b;
        this.c = c;
    }
    
    public final void a() {
        this.a.m((cdc)this);
    }
    
    public final void b(final int e) {
        final cdb g = this.g;
        if (g != null) {
            g.d(this.h, e);
            return;
        }
        this.e = e;
        this.f = 0;
    }
    
    public final void c(final int n) {
        final cdb g = this.g;
        if (g != null) {
            g.f(this.h, n);
            return;
        }
        this.f += n;
    }
    
    public final int d() {
        return this.h;
    }
    
    public final void e(final cdb g) {
        this.g = g;
        final String b = this.b;
        final String c = this.c;
        final int h = g.d++;
        final Bundle bundle = new Bundle();
        bundle.putString("routeId", b);
        bundle.putString("routeGroupId", c);
        g.g(3, g.c++, h, (Object)null, bundle);
        this.h = h;
        if (this.d) {
            g.b(h);
            final int e = this.e;
            if (e >= 0) {
                g.d(this.h, e);
                this.e = -1;
            }
            final int f = this.f;
            if (f != 0) {
                g.f(this.h, f);
                this.f = 0;
            }
        }
    }
    
    public final void f() {
        final cdb g = this.g;
        if (g != null) {
            g.a(this.h);
            this.g = null;
            this.h = 0;
        }
    }
    
    public final void g() {
        this.d = true;
        final cdb g = this.g;
        if (g != null) {
            g.b(this.h);
        }
    }
    
    public final void h() {
        this.i(0);
    }
    
    public final void i(final int n) {
        this.d = false;
        final cdb g = this.g;
        if (g != null) {
            g.e(this.h, n);
        }
    }
}
