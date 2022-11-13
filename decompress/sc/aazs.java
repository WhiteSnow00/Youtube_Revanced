// 
// Decompiled by Procyon v0.6.0
// 

public final class aazs extends abvy
{
    final long a;
    public final aazt b;
    
    public aazs(final aazt b, final long a) {
        this.b = b;
        this.a = a;
        super(9223372036854775806L, Long.MAX_VALUE, 1, 1, (String)null);
    }
    
    protected final void b(final boolean b, final boolean b2, final boolean b3) {
        final aazt b4 = this.b;
        if (b4.g) {
            b4.a.execute((Runnable)new ypp(this, this.a, 7));
        }
    }
}
