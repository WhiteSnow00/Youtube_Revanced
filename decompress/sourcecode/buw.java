// 
// Decompiled by Procyon v0.6.0
// 

abstract class buw
{
    protected final buc d;
    
    protected buw(final buc d) {
        this.d = d;
    }
    
    protected abstract boolean a(final bar p0);
    
    protected abstract boolean b(final bar p0, final long p1);
    
    public final boolean c(final bar bar, final long n) {
        return this.a(bar) && this.b(bar, n);
    }
}
