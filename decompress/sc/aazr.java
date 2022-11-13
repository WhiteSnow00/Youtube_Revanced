// 
// Decompiled by Procyon v0.6.0
// 

public final class aazr extends abvy
{
    final boolean a;
    final long b;
    final long c;
    public final aazt d;
    
    public aazr(final aazt d, final long n, final boolean a, final long b, final long c) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
        super(n, 9223372036854775806L, 1, 1, (String)null);
    }
    
    protected final void b(final boolean b, final boolean b2, final boolean b3) {
        final aazt d = this.d;
        if (b2) {
            aazt.k(d);
            return;
        }
        final int i = d.i + 1;
        d.i = i;
        if (this.a) {
            d.c.tu((Object)aazu.d(this.b, this.c, i));
        }
        this.d.a.execute((Runnable)new ypp(this, this.b, 6));
    }
}
