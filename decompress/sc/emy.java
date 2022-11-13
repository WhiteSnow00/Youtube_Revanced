// 
// Decompiled by Procyon v0.6.0
// 

public final class emy extends env
{
    public emy(final emk emk, final ahaz ahaz, final int n) {
        super(emk, "YC+pJVOZY25wDvtlWBPChLSjLU0iUh44DqTcbsbdAncZlcvrsOhFkSGXkkm3Hf4Z", "a17x9Lt/WQTGhUJAM6t8VqFWsXteADIsbbHvy7b7aMM=", ahaz, n, 5);
    }
    
    protected final void a() {
        final ahaz g = this.g;
        g.copyOnWrite();
        final eht eht = (eht)g.instance;
        final eht a = eht.a;
        eht.b |= 0x10;
        eht.h = -1L;
        final ahaz g2 = this.g;
        g2.copyOnWrite();
        final eht eht2 = (eht)g2.instance;
        eht2.b |= 0x20;
        eht2.i = -1L;
        final int[] array = (int[])this.d.invoke(null, this.a.a);
        synchronized (this.g) {
            final ahaz g3 = this.g;
            final long h = array[0];
            g3.copyOnWrite();
            final eht eht3 = (eht)g3.instance;
            eht3.b |= 0x10;
            eht3.h = h;
            final ahaz g4 = this.g;
            final long i = array[1];
            g4.copyOnWrite();
            final eht eht4 = (eht)g4.instance;
            eht4.b |= 0x20;
            eht4.i = i;
            final int n = array[2];
            if (n != Integer.MIN_VALUE) {
                final ahaz g5 = this.g;
                g5.copyOnWrite();
                final eht eht5 = (eht)g5.instance;
                eht5.c |= 0x200000;
                eht5.S = n;
            }
        }
    }
}
