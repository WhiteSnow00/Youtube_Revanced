// 
// Decompiled by Procyon v0.6.0
// 

final class astb implements asgw, aujq
{
    final aujp a;
    final asjd b;
    aujq c;
    boolean d;
    
    public astb(final aujp a, final asjd b) {
        this.a = a;
        this.b = b;
    }
    
    public final void b(final Throwable t) {
        if (!this.d) {
            this.d = true;
            this.a.b(t);
            return;
        }
        aulo.r(t);
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
    
    public final void tr(final Object o) {
        if (!this.d) {
            this.a.tr(o);
            try {
                if (this.b.a(o)) {
                    this.d = true;
                    this.c.tq();
                    this.a.tu();
                }
            }
            finally {
                final Throwable t;
                asey.d(t);
                this.c.tq();
                this.b(t);
            }
        }
    }
    
    public final void tu() {
        if (!this.d) {
            this.d = true;
            this.a.tu();
        }
    }
}
