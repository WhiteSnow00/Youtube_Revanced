// 
// Decompiled by Procyon v0.6.0
// 

public final class aeye extends ocs
{
    public final afgm f;
    public final acrm g;
    public final mtf h;
    public final mtf i;
    
    public aeye(final mtf h, final acrm g, final mtf i, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.h = h;
        this.g = g;
        this.i = i;
        final anhp b = anhp.b;
        final anhp d = anhp.d;
        this.f = afgm.n(b, d, d, anhp.b);
    }
    
    public static angz I(final tep tep) {
        final tep a = tep.a;
        final int ordinal = tep.ordinal();
        if (ordinal == 1) {
            return angz.e;
        }
        if (ordinal == 2) {
            return angz.c;
        }
        if (ordinal == 3) {
            return angz.d;
        }
        if (ordinal != 4) {
            return angz.a;
        }
        return angz.b;
    }
}
