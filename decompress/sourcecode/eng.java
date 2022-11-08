// 
// Decompiled by Procyon v0.6.0
// 

public final class eng extends enu
{
    private final elw h;
    private final long i;
    private final long j;
    
    public eng(final emj emj, final agza agza, final int n, final elw h, final long i, final long j) {
        super(emj, "uXer3UA11jv0SZxM8rEYS7HzXCd8ucSITS/VghhemVPtPpwzWKxJYN2vUPP5dw9E", "hs3/rpu0ZtoaPE+A6aRGA1SNmSKC7zzkLMT9t285eJ8=", agza, n, 11);
        this.h = h;
        this.i = i;
        this.j = j;
    }
    
    protected final void a() {
        final elw h = this.h;
        if (h != null) {
            final elu elu = new elu((String)this.d.invoke(null, h.a, this.i, this.j));
            synchronized (this.g) {
                final agza g = this.g;
                final long longValue = elu.a;
                g.copyOnWrite();
                final ehs ehs = (ehs)g.instance;
                final ehs a = ehs.a;
                ehs.b |= 0x400;
                ehs.j = longValue;
                if (elu.b >= 0L) {
                    final agza g2 = this.g;
                    final long longValue2 = elu.b;
                    g2.copyOnWrite();
                    final ehs ehs2 = (ehs)g2.instance;
                    ehs2.d |= 0x200;
                    ehs2.ab = longValue2;
                }
                if (elu.c >= 0L) {
                    final agza g3 = this.g;
                    final long longValue3 = elu.c;
                    g3.copyOnWrite();
                    final ehs ehs3 = (ehs)g3.instance;
                    ehs3.d |= 0x400;
                    ehs3.ac = longValue3;
                }
            }
        }
    }
}
