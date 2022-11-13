import androidx.media3.common.Metadata;
import java.util.List;
import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

final class bxb extends bxe
{
    public static final byte[] a;
    private static final byte[] o;
    private boolean p;
    
    static {
        a = new byte[] { 79, 112, 117, 115, 72, 101, 97, 100 };
        o = new byte[] { 79, 112, 117, 115, 84, 97, 103, 115 };
    }
    
    public bxb() {
    }
    
    public static boolean d(final bas bas, final byte[] array) {
        if (bas.a() < 8) {
            return false;
        }
        final int b = bas.b;
        final byte[] array2 = new byte[8];
        bas.B(array2, 0, 8);
        bas.G(b);
        return Arrays.equals(array2, array);
    }
    
    protected final long a(final bas bas) {
        final byte[] a = bas.a;
        final int n = a[0] & 0xFF;
        final int n2 = n & 0x3;
        int n3;
        if (n2 != 0) {
            n3 = 2;
            if (n2 != 1) {
                n3 = n3;
                if (n2 != 2) {
                    n3 = (a[1] & 0x3F);
                }
            }
        }
        else {
            n3 = 1;
        }
        final int n4 = n >> 3;
        final int n5 = n4 & 0x3;
        int n6;
        if (n4 >= 16) {
            n6 = 2500 << n5;
        }
        else if (n4 >= 12) {
            n6 = 10000 << (n5 & 0x1);
        }
        else if (n5 == 3) {
            n6 = 60000;
        }
        else {
            n6 = 10000 << n5;
        }
        return this.f(n3 * (long)n6);
    }
    
    protected final void b(final boolean b) {
        super.b(b);
        if (b) {
            this.p = false;
        }
    }
    
    protected final boolean c(final bas bas, final long n, final bxc bxc) {
        if (d(bas, bxb.a)) {
            final byte[] copy = Arrays.copyOf(bas.a, bas.c);
            final byte b = copy[9];
            final List b2 = bsg.b(copy);
            if (bxc.a != null) {
                return true;
            }
            final ayf ayf = new ayf();
            ayf.k = "audio/opus";
            ayf.x = (b & 0xFF);
            ayf.y = 48000;
            ayf.m = b2;
            bxc.a = ayf.a();
            return true;
        }
        else {
            if (!d(bas, bxb.o)) {
                dk.e((Object)bxc.a);
                return false;
            }
            dk.e((Object)bxc.a);
            if (this.p) {
                return true;
            }
            this.p = true;
            bas.H(8);
            final Metadata d = bhq.d((List)afeq.p((Object[])bhq.h(bas, false, false).a));
            if (d == null) {
                return true;
            }
            final ayf b3 = bxc.a.b();
            b3.i = d.d(bxc.a.l);
            bxc.a = b3.a();
            return true;
        }
    }
}
