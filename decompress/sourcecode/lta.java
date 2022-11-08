// 
// Decompiled by Procyon v0.6.0
// 

abstract class lta
{
    protected final lsv a;
    public long b;
    
    protected lta(final lsv a) {
        this.a = a;
        this.b = -1L;
    }
    
    protected abstract void a(final lwg p0, final long p1);
    
    protected abstract boolean b(final lwg p0);
    
    public final void c(final lwg lwg, final long n) {
        if (this.b(lwg)) {
            this.a(lwg, n);
        }
    }
}
