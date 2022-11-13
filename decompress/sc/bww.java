import androidx.media3.common.Metadata;
import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

final class bww extends bxe
{
    private btp a;
    private bwv o;
    
    public bww() {
    }
    
    private static boolean d(final byte[] array) {
        return array[0] == -1;
    }
    
    protected final long a(final bas bas) {
        if (d(bas.a)) {
            final int n = (bas.a[2] & 0xFF) >> 4;
            int n2 = 0;
            Label_0052: {
                if ((n2 = n) != 6) {
                    if ((n2 = n) != 7) {
                        break Label_0052;
                    }
                    n2 = 7;
                }
                bas.H(4);
                bas.s();
            }
            final int b = bma.b(bas, n2);
            bas.G(0);
            return b;
        }
        return -1L;
    }
    
    protected final void b(final boolean b) {
        super.b(b);
        if (b) {
            this.a = null;
            this.o = null;
        }
    }
    
    protected final boolean c(final bas bas, final long a, final bxc bxc) {
        final byte[] a2 = bas.a;
        final btp a3 = this.a;
        if (a3 == null) {
            final btp a4 = new btp(a2, 17);
            this.a = a4;
            bxc.a = a4.c(Arrays.copyOfRange(a2, 9, bas.c), (Metadata)null);
            return true;
        }
        if ((a2[0] & 0x7F) == 0x3) {
            final dml f = bsb.f(bas);
            final btp e = a3.e(f);
            this.a = e;
            this.o = new bwv(e, f, null, null);
            return true;
        }
        if (d(a2)) {
            final bwv o = this.o;
            if (o != null) {
                o.a = a;
                bxc.b = o;
            }
            dk.d((Object)bxc.a);
            return false;
        }
        return true;
    }
}
