// 
// Decompiled by Procyon v0.6.0
// 

public final class gib implements aaol
{
    public final gif a;
    
    public gib(final gif a) {
        this.a = a;
    }
    
    @Override
    public final void pf(final boolean y) {
        final gif a = this.a;
        if (a.y == y) {
            return;
        }
        a.y = y;
        a.f();
    }
}
