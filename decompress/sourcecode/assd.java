// 
// Decompiled by Procyon v0.6.0
// 

final class assd implements asgw, aujq
{
    final aujp a;
    final asit b;
    aujq c;
    Object d;
    boolean e;
    
    public assd(final aujp a, final asit b) {
        this.a = a;
        this.b = b;
    }
    
    public final void b(final Throwable t) {
        if (this.e) {
            aulo.r(t);
            return;
        }
        this.e = true;
        this.a.b(t);
    }
    
    public final void e(final long n) {
        this.c.e(n);
    }
    
    public final void f(final aujq c) {
        if (athh.i(this.c, c)) {
            this.c = c;
            this.a.f((aujq)this);
        }
    }
    
    public final void tq() {
        this.c.tq();
    }
    
    public final void tr(Object a) {
        if (this.e) {
            return;
        }
        final aujp a2 = this.a;
        final Object d = this.d;
        if (d == null) {
            a2.tr(this.d = a);
            return;
        }
        try {
            a = this.b.a(d, a);
            asjv.b(a, "The value returned by the accumulator is null");
            a2.tr(this.d = a);
        }
        finally {
            final Throwable t;
            asey.d(t);
            this.c.tq();
            this.b(t);
        }
    }
    
    public final void tu() {
        if (this.e) {
            return;
        }
        this.e = true;
        this.a.tu();
    }
}
