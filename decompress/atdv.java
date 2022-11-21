// 
// Decompiled by Procyon v0.6.0
// 

final class atdv implements asku, asln
{
    final aslb a;
    final Object b;
    asln c;
    Object d;
    
    public atdv(final aslb a, final Object b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void b(final Throwable t) {
        this.c = asmr.a;
        this.d = null;
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
        this.c.dispose();
        this.c = asmr.a;
    }
    
    @Override
    public final void tt(final Object d) {
        this.d = d;
    }
    
    @Override
    public final void tw() {
        this.c = asmr.a;
        final Object d = this.d;
        if (d != null) {
            this.d = null;
            this.a.tr(d);
            return;
        }
        this.a.tr(this.b);
    }
    
    @Override
    public final boolean tz() {
        return this.c == asmr.a;
    }
}
