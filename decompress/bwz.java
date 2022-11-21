import androidx.media3.common.Metadata;
import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

final class bwz extends bxh
{
    private bts a;
    private bwy o;
    
    public bwz() {
    }
    
    private static boolean d(final byte[] array) {
        return array[0] == -1;
    }
    
    protected final long a(final bat bat) {
        if (d(bat.a)) {
            final int n = (bat.a[2] & 0xFF) >> 4;
            int n2 = 0;
            Label_0052: {
                if ((n2 = n) != 6) {
                    if ((n2 = n) != 7) {
                        break Label_0052;
                    }
                    n2 = 7;
                }
                bat.H(4);
                bat.s();
            }
            final int b = bse.b(bat, n2);
            bat.G(0);
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
    
    protected final boolean c(final bat bat, final long a, final bxf bxf) {
        final byte[] a2 = bat.a;
        final bts a3 = this.a;
        if (a3 == null) {
            final bts a4 = new bts(a2, 17);
            this.a = a4;
            bxf.a = a4.c(Arrays.copyOfRange(a2, 9, bat.c), (Metadata)null);
            return true;
        }
        if ((a2[0] & 0x7F) == 0x3) {
            final dmo f = bsj.f(bat);
            final bts e = a3.e(f);
            this.a = e;
            this.o = new bwy(e, f, null, null);
            return true;
        }
        if (d(a2)) {
            final bwy o = this.o;
            if (o != null) {
                o.a = a;
                bxf.b = o;
            }
            bad.b(bxf.a);
            return false;
        }
        return true;
    }
}
