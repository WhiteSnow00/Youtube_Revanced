// 
// Decompiled by Procyon v0.6.0
// 

public final class emx extends enu
{
    public emx(final emj emj, final agza agza, final int n) {
        super(emj, "YC+pJVOZY25wDvtlWBPChLSjLU0iUh44DqTcbsbdAncZlcvrsOhFkSGXkkm3Hf4Z", "a17x9Lt/WQTGhUJAM6t8VqFWsXteADIsbbHvy7b7aMM=", agza, n, 5);
    }
    
    protected final void a() {
        final agza g = this.g;
        g.copyOnWrite();
        final ehs ehs = (ehs)g.instance;
        final ehs a = ehs.a;
        ehs.b |= 0x10;
        ehs.h = -1L;
        final agza g2 = this.g;
        g2.copyOnWrite();
        final ehs ehs2 = (ehs)g2.instance;
        ehs2.b |= 0x20;
        ehs2.i = -1L;
        final int[] array = (int[])this.d.invoke(null, this.a.a);
        synchronized (this.g) {
            final agza g3 = this.g;
            final long h = array[0];
            g3.copyOnWrite();
            final ehs ehs3 = (ehs)g3.instance;
            ehs3.b |= 0x10;
            ehs3.h = h;
            final agza g4 = this.g;
            final long i = array[1];
            g4.copyOnWrite();
            final ehs ehs4 = (ehs)g4.instance;
            ehs4.b |= 0x20;
            ehs4.i = i;
            final int n = array[2];
            if (n != Integer.MIN_VALUE) {
                final agza g5 = this.g;
                final long s = n;
                g5.copyOnWrite();
                final ehs ehs5 = (ehs)g5.instance;
                ehs5.c |= 0x200000;
                ehs5.S = s;
            }
        }
    }
}
