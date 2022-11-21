// 
// Decompiled by Procyon v0.6.0
// 

final class asyu implements askk, asln
{
    final askk a;
    final asyv b;
    asln c;
    
    public asyu(final askk a, final asyv b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void b(final Throwable t) {
        if (this.c == asmr.a) {
            aqvq.w(t);
            return;
        }
        this.c(t);
    }
    
    final void c(final Throwable t) {
        aslv aslv = null;
        try {
            this.b.c.a(t);
        }
        finally {
            final Throwable t2;
            asjv.a(t2);
            aslv = new aslv(new Throwable[] { t, t2 });
        }
        this.c = asmr.a;
        this.a.b(aslv);
    }
    
    @Override
    public final void d(final asln c) {
        if (asmr.g(this.c, c)) {
            this.c = c;
            this.a.d(this);
        }
    }
    
    @Override
    public final void dispose() {
        this.c.dispose();
        this.c = asmr.a;
    }
    
    @Override
    public final void tr(final Object o) {
        if (this.c == asmr.a) {
            return;
        }
        try {
            this.b.b.a(o);
            this.c = asmr.a;
            this.a.tr(o);
        }
        finally {
            final Throwable t;
            asjv.a(t);
            this.c(t);
        }
    }
    
    @Override
    public final void tw() {
        if (this.c == asmr.a) {
            return;
        }
        try {
            this.b.d.a();
            this.c = asmr.a;
            this.a.tw();
        }
        finally {
            final Throwable t;
            asjv.a(t);
            this.c(t);
        }
    }
    
    @Override
    public final boolean tz() {
        return this.c.tz();
    }
}
