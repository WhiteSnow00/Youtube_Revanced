// 
// Decompiled by Procyon v0.6.0
// 

final class atfj implements asku, asln
{
    final asku a;
    long b;
    asln c;
    
    public atfj(final asku a) {
        this.a = a;
        this.b = 1L;
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
        this.c.dispose();
    }
    
    @Override
    public final void tt(final Object o) {
        if (this.b != 0L) {
            this.b = 0L;
            return;
        }
        this.a.tt(o);
    }
    
    @Override
    public final void tw() {
        this.a.tw();
    }
    
    @Override
    public final boolean tz() {
        return this.c.tz();
    }
}
