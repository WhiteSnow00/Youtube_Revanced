// 
// Decompiled by Procyon v0.6.0
// 

final class astc implements asku, aunb
{
    final auna a;
    asln b;
    
    public astc(final auna a) {
        this.a = a;
    }
    
    @Override
    public final void b(final Throwable t) {
        this.a.b(t);
    }
    
    @Override
    public final void d(final asln b) {
        this.b = b;
        this.a.f(this);
    }
    
    @Override
    public final void e(final long n) {
    }
    
    @Override
    public final void ts() {
        this.b.dispose();
    }
    
    @Override
    public final void tt(final Object o) {
        this.a.tt(o);
    }
    
    @Override
    public final void tw() {
        this.a.tw();
    }
}
