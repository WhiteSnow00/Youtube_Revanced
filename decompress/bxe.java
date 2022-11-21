import androidx.media3.common.Metadata;
import java.util.List;
import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

final class bxe extends bxh
{
    public static final byte[] a;
    private static final byte[] o;
    private boolean p;
    
    static {
        a = new byte[] { 79, 112, 117, 115, 72, 101, 97, 100 };
        o = new byte[] { 79, 112, 117, 115, 84, 97, 103, 115 };
    }
    
    public bxe() {
    }
    
    public static boolean d(final bat bat, final byte[] array) {
        if (bat.a() < 8) {
            return false;
        }
        final int b = bat.b;
        final byte[] array2 = new byte[8];
        bat.B(array2, 0, 8);
        bat.G(b);
        return Arrays.equals(array2, array);
    }
    
    protected final long a(final bat bat) {
        final byte[] a = bat.a;
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
    
    protected final boolean c(final bat bat, final long n, final bxf bxf) {
        if (d(bat, bxe.a)) {
            final byte[] copy = Arrays.copyOf(bat.a, bat.c);
            final byte b = copy[9];
            final List j = bht.j(copy);
            if (bxf.a != null) {
                return true;
            }
            final ayg ayg = new ayg();
            ayg.k = "audio/opus";
            ayg.x = (b & 0xFF);
            ayg.y = 48000;
            ayg.m = j;
            bxf.a = ayg.a();
            return true;
        }
        else {
            if (!d(bat, bxe.o)) {
                bad.c(bxf.a);
                return false;
            }
            bad.c(bxf.a);
            if (this.p) {
                return true;
            }
            this.p = true;
            bat.H(8);
            final Metadata i = bhw.i((List)afgh.p((Object[])bhw.k(bat, false, false).a));
            if (i == null) {
                return true;
            }
            final ayg b2 = bxf.a.b();
            b2.i = i.d(bxf.a.l);
            bxf.a = b2.a();
            return true;
        }
    }
}
