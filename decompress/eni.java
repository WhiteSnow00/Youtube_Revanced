// 
// Decompiled by Procyon v0.6.0
// 

public final class eni extends env
{
    public eni(final emk emk, final ahaz ahaz, final int n) {
        super(emk, "qfI1DhKUvYvonhmDhl2HtQbINO0xIIYvKgMRQgz52nQi898Sh8QDGcMkGv/U7x7x", "dGQnAya6a12xEk9RZqxizYv1KQcB0awlyegaC3HNbmw=", ahaz, n, 12);
    }
    
    protected final void a() {
        final ahaz g = this.g;
        g.copyOnWrite();
        final eht eht = (eht)g.instance;
        final eht a = eht.a;
        eht.b |= 0x800;
        eht.k = -1L;
        final ahaz g2 = this.g;
        final long longValue = (long)this.d.invoke(null, this.a.a);
        g2.copyOnWrite();
        final eht eht2 = (eht)g2.instance;
        eht2.b |= 0x800;
        eht2.k = longValue;
    }
}
