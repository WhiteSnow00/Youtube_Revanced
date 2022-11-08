// 
// Decompiled by Procyon v0.6.0
// 

public final class enh extends enu
{
    public enh(final emj emj, final agza agza, final int n) {
        super(emj, "qfI1DhKUvYvonhmDhl2HtQbINO0xIIYvKgMRQgz52nQi898Sh8QDGcMkGv/U7x7x", "dGQnAya6a12xEk9RZqxizYv1KQcB0awlyegaC3HNbmw=", agza, n, 12);
    }
    
    protected final void a() {
        final agza g = this.g;
        g.copyOnWrite();
        final ehs ehs = (ehs)g.instance;
        final ehs a = ehs.a;
        ehs.b |= 0x800;
        ehs.k = -1L;
        final agza g2 = this.g;
        final long longValue = (long)this.d.invoke(null, this.a.a);
        g2.copyOnWrite();
        final ehs ehs2 = (ehs)g2.instance;
        ehs2.b |= 0x800;
        ehs2.k = longValue;
    }
}
