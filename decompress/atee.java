// 
// Decompiled by Procyon v0.6.0
// 

public final class atee extends ashi
{
    final atit b;
    final int c;
    
    public atee(final atit b, final int c) {
        this.b = b;
        this.c = c;
    }
    
    protected final void au(final aukf aukf) {
        final ated ated = new ated(aukf, this.b.a(), this.c);
        aukf.f((aukg)ated);
        final atit b = this.b;
        final ateb[] b2 = ated.b;
        if (b.c((aukf[])b2)) {
            final int length = b2.length;
            final aukf[] array = new aukf[length];
            final int n = 0;
            for (int i = 0; i < length; ++i) {
                final ateb ateb = b2[i];
                final atdx atdx = (atdx)b;
                array[i] = (aukf)aspk.a((aukf)ateb, atdx.b, Integer.MAX_VALUE, atdx.c);
            }
            final atit a = ((atdx)b).a;
            if (a.c(array)) {
                final aukf[] array2 = new aukf[length];
                final atej atej = (atej)a;
                final asid b3 = atej.b;
                int j = n;
                if (b3 instanceof athg) {
                    ((athg)b3).b(length, new ateg(atej, array, array2));
                }
                else {
                    while (j < length) {
                        atej.b(j, array, array2, atej.b.a());
                        ++j;
                    }
                }
                final atit a2 = atej.a;
                if (a2.c(array2)) {
                    final atea atea = (atea)a2;
                    atea.a.at((aukf)new atdz(array2, atea.c));
                }
            }
        }
    }
}
