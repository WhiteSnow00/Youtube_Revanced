// 
// Decompiled by Procyon v0.6.0
// 

public final class enh extends env
{
    private final elx h;
    private final long i;
    private final long j;
    
    public enh(final emk emk, final ahaz ahaz, final int n, final elx h, final long i, final long j) {
        super(emk, "uXer3UA11jv0SZxM8rEYS7HzXCd8ucSITS/VghhemVPtPpwzWKxJYN2vUPP5dw9E", "hs3/rpu0ZtoaPE+A6aRGA1SNmSKC7zzkLMT9t285eJ8=", ahaz, n, 11);
        this.h = h;
        this.i = i;
        this.j = j;
    }
    
    protected final void a() {
        final elx h = this.h;
        if (h != null) {
            final elv elv = new elv((String)this.d.invoke(null, h.a, this.i, this.j));
            synchronized (this.g) {
                final ahaz g = this.g;
                final long longValue = elv.a;
                g.copyOnWrite();
                final eht eht = (eht)g.instance;
                final eht a = eht.a;
                eht.b |= 0x400;
                eht.j = longValue;
                if (elv.b >= 0L) {
                    final ahaz g2 = this.g;
                    final long longValue2 = elv.b;
                    g2.copyOnWrite();
                    final eht eht2 = (eht)g2.instance;
                    eht2.d |= 0x200;
                    eht2.ab = longValue2;
                }
                if (elv.c >= 0L) {
                    final ahaz g3 = this.g;
                    final long longValue3 = elv.c;
                    g3.copyOnWrite();
                    final eht eht3 = (eht)g3.instance;
                    eht3.d |= 0x400;
                    eht3.ac = longValue3;
                }
            }
        }
    }
}
