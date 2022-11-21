// 
// Decompiled by Procyon v0.6.0
// 

final class boi implements boz
{
    public final boz a;
    private final long b;
    
    public boi(final boz a, final long b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final int a(final long n) {
        return this.a.a(n - this.b);
    }
    
    @Override
    public final void b() {
        this.a.b();
    }
    
    @Override
    public final int e(final bxf bxf, final bde bde, int e) {
        e = this.a.e(bxf, bde, e);
        if (e == -4) {
            bde.e = Math.max(0L, bde.e + this.b);
            return -4;
        }
        return e;
    }
    
    @Override
    public final boolean la() {
        return this.a.la();
    }
}
