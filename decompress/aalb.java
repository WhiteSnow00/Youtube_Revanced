import java.nio.ByteBuffer;
import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aalb implements Serializable, aala
{
    private static final int[] a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private final byte[] k;
    private final boolean l;
    
    static {
        a = new int[] { 1116352408, 1899447441, -1245643825, -373957723, 961987163, 1508970993, -1841331548, -1424204075, -670586216, 310598401, 607225278, 1426881987, 1925078388, -2132889090, -1680079193, -1046744716, -459576895, -272742522, 264347078, 604807628, 770255983, 1249150122, 1555081692, 1996064986, -1740746414, -1473132947, -1341970488, -1084653625, -958395405, -710438585, 113926993, 338241895, 666307205, 773529912, 1294757372, 1396182291, 1695183700, 1986661051, -2117940946, -1838011259, -1564481375, -1474664885, -1035236496, -949202525, -778901479, -694614492, -200395387, 275423344, 430227734, 506948616, 659060556, 883997877, 958139571, 1322822218, 1537002063, 1747873779, 1955562222, 2024104815, -2067236844, -1933114872, -1866530822, -1538233109, -1090935817, -965641998 };
    }
    
    public aalb(final boolean l) {
        this.b = 1779033703;
        this.c = -1150833019;
        this.d = 1013904242;
        this.e = -1521486534;
        this.f = 1359893119;
        this.g = -1694144372;
        this.h = 528734635;
        this.i = 1541459225;
        this.j = 0;
        this.k = new byte[64];
        this.l = l;
    }
    
    private static final int e(final int n, final int n2) {
        final int n3 = (1 << n2) - 1;
        return (n & n3) << 32 - n2 | (~n3 & n) >>> n2;
    }
    
    @Override
    public final int a() {
        final int j = this.j;
        if (j > 0) {
            final int c = aalc.c;
            return j - 1;
        }
        return 0;
    }
    
    @Override
    public final void b() {
        this.b = 1779033703;
        this.c = -1150833019;
        this.d = 1013904242;
        this.e = -1521486534;
        this.f = 1359893119;
        this.g = -1694144372;
        this.h = 528734635;
        this.i = 1541459225;
        this.j = 0;
    }
    
    @Override
    public final void c(final byte[] array, final int n, final int n2) {
        if (this.j == 0 && n2 > 0) {
            System.arraycopy(aalc.a, 0, this.k, 0, 1);
            this.j = 1;
        }
        int n4;
        for (int i = n2; i > 0; i = n4) {
            final int n3 = this.j % 64;
            final int min = Math.min(64 - n3, i);
            System.arraycopy(array, n + n2 - i, this.k, n3, min);
            this.j += min;
            n4 = i - min;
            if (n3 + min == 64) {
                final int[] array2 = new int[64];
                final ByteBuffer wrap = ByteBuffer.wrap(this.k);
                int n5 = 0;
                int j;
                while (true) {
                    j = 16;
                    if (n5 >= 16) {
                        break;
                    }
                    array2[n5] = wrap.getInt();
                    ++n5;
                }
                while (j < 64) {
                    final int n6 = array2[j - 15];
                    final int e = e(n6, 7);
                    final int e2 = e(n6, 18);
                    final int n7 = array2[j - 2];
                    array2[j] = array2[j - 16] + (n6 >>> 3 ^ (e ^ e2)) + array2[j - 7] + (e(n7, 17) ^ e(n7, 19) ^ n7 >>> 10);
                    ++j;
                }
                int b = this.b;
                int c = this.c;
                int d = this.d;
                int e3 = this.e;
                int f = this.f;
                int g = this.g;
                int h = this.h;
                int k = this.i;
                int n9;
                for (int l = 0; l < 64; l = n9) {
                    final int n8 = k + (e(f, 11) ^ e(f, 6) ^ e(f, 25)) + ((f & g) ^ (~f & h)) + aalb.a[l] + array2[l];
                    final int e4 = e(b, 2);
                    final int e5 = e(b, 13);
                    final int e6 = e(b, 22);
                    n9 = l + 1;
                    final int n10 = h;
                    h = g;
                    g = f;
                    final int n11 = e3 + n8;
                    e3 = d;
                    final int n12 = c;
                    final int n13 = b;
                    b = (e4 ^ e5 ^ e6) + ((b & c) ^ (b & d) ^ (c & d)) + n8;
                    c = n13;
                    d = n12;
                    f = n11;
                    k = n10;
                }
                this.b += b;
                this.c += c;
                this.d += d;
                this.e += e3;
                this.f += f;
                this.g += g;
                this.h += h;
                this.i += k;
            }
        }
    }
    
    @Override
    public final byte[] d() {
        int n2;
        final int n = n2 = 64 - this.j % 64;
        if (n < 9) {
            n2 = n + 64;
        }
        final byte[] array = new byte[n2];
        array[0] = -128;
        ByteBuffer.wrap(array).putLong(n2 - 8, this.j * 8);
        this.c(array, 0, n2);
        if (this.l) {
            final byte[] array2 = new byte[10];
            ByteBuffer.wrap(array2).putInt(this.b).putInt(this.c).putShort((short)(this.d >> 16));
            return array2;
        }
        final byte[] array3 = new byte[32];
        ByteBuffer.wrap(array3).putInt(this.b).putInt(this.c).putInt(this.d).putInt(this.e).putInt(this.f).putInt(this.g).putInt(this.h).putInt(this.i);
        return array3;
    }
}
