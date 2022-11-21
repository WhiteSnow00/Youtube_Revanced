// 
// Decompiled by Procyon v0.6.0
// 

public final class asoe implements asjz, aunb
{
    final auna a;
    asln b;
    
    public asoe(final auna a) {
        this.a = a;
    }
    
    @Override
    public final void b(final Throwable t) {
        this.a.b(t);
    }
    
    @Override
    public final void d(final asln b) {
        if (asmr.g(this.b, b)) {
            this.b = b;
            this.a.f(this);
        }
    }
    
    @Override
    public final void e(final long n) {
    }
    
    @Override
    public final void ts() {
        this.b.dispose();
    }
    
    @Override
    public final void tw() {
        this.a.tw();
    }
}
