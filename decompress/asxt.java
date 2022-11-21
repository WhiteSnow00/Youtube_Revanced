// 
// Decompiled by Procyon v0.6.0
// 

final class asxt implements aslb, asln
{
    final askk a;
    final asmo b;
    asln c;
    
    public asxt(final askk a, final asmo b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void b(final Throwable t) {
        this.a.b(t);
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
        final asln c = this.c;
        this.c = asmr.a;
        c.dispose();
    }
    
    @Override
    public final void tr(final Object o) {
        try {
            if (this.b.a(o)) {
                this.a.tr(o);
                return;
            }
            this.a.tw();
        }
        finally {
            final Throwable t;
            asjv.a(t);
            this.a.b(t);
        }
    }
    
    @Override
    public final boolean tz() {
        return this.c.tz();
    }
}
