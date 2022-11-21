import java.nio.ByteBuffer;
import android.media.MediaCodec$CryptoInfo;
import android.media.MediaCodec$CryptoInfo$Pattern;
import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bow
{
    public final int a;
    public final bat b;
    public bov c;
    public bov d;
    public bov e;
    public long f;
    public final bri g;
    
    public bow(final bri g) {
        this.g = g;
        final int a = g.a;
        this.a = a;
        this.b = new bat(32);
        final bov e = new bov(0L, a);
        this.c = e;
        this.d = e;
        this.e = e;
    }
    
    public static bov e(bov bov, final bde bde, final adfz adfz, final bat bat) {
        bov bov2 = bov;
        if (bde.d()) {
            final long b = adfz.b;
            int m = 1;
            bat.C(1);
            bov = h(bov, b, bat.a, 1);
            final long n = b + 1L;
            final byte[] a = bat.a;
            final int n2 = 0;
            final byte b2 = a[0];
            final int n3 = b2 & 0x7F;
            final bda b3 = bde.b;
            final byte[] a2 = b3.a;
            if (a2 == null) {
                b3.a = new byte[16];
            }
            else {
                Arrays.fill(a2, (byte)0);
            }
            final boolean b4 = (b2 & 0x80) != 0x0;
            final bov h = h(bov, n, b3.a, n3);
            long n5;
            final long n4 = n5 = n + n3;
            bov = h;
            if (b4) {
                bat.C(2);
                bov = h(h, n4, bat.a, 2);
                n5 = n4 + 2L;
                m = bat.m();
            }
            final int[] d = b3.d;
            int[] array = null;
            Label_0215: {
                if (d != null) {
                    array = d;
                    if (d.length >= m) {
                        break Label_0215;
                    }
                }
                array = new int[m];
            }
            final int[] e = b3.e;
            int[] array2 = null;
            Label_0245: {
                if (e != null) {
                    array2 = e;
                    if (e.length >= m) {
                        break Label_0245;
                    }
                }
                array2 = new int[m];
            }
            if (b4) {
                final int n6 = m * 6;
                bat.C(n6);
                final bov h2 = h(bov, n5, bat.a, n6);
                final long n7 = n5 + n6;
                bat.G(0);
                int n8 = n2;
                while (true) {
                    n5 = n7;
                    bov = h2;
                    if (n8 >= m) {
                        break;
                    }
                    array[n8] = bat.m();
                    array2[n8] = bat.l();
                    ++n8;
                }
            }
            else {
                array2[array[0] = 0] = adfz.c - (int)(n5 - adfz.b);
            }
            final Object a3 = adfz.a;
            final int a4 = baz.a;
            final buf buf = (buf)a3;
            final byte[] b5 = buf.b;
            final byte[] a5 = b3.a;
            final int a6 = buf.a;
            final int c = buf.c;
            final int d2 = buf.d;
            b3.f = m;
            b3.d = array;
            b3.e = array2;
            b3.b = b5;
            b3.c = a6;
            b3.g = c;
            b3.h = d2;
            b3.i.numSubSamples = m;
            b3.i.numBytesOfClearData = array;
            b3.i.numBytesOfEncryptedData = array2;
            b3.i.key = b5;
            b3.i.iv = a5;
            b3.i.mode = a6;
            final eae j = b3.j;
            ((MediaCodec$CryptoInfo$Pattern)j.a).set(c, d2);
            ((MediaCodec$CryptoInfo)j.b).setPattern((MediaCodec$CryptoInfo$Pattern)j.a);
            final long b6 = adfz.b;
            final int n9 = (int)(n5 - b6);
            adfz.b = b6 + n9;
            adfz.c -= n9;
            bov2 = bov;
        }
        if (((bcy)bde).hasSupplementalData()) {
            bat.C(4);
            bov = h(bov2, adfz.b, bat.a, 4);
            final int l = bat.l();
            adfz.b += 4L;
            adfz.c -= 4;
            bde.b(l);
            bov = g(bov, adfz.b, bde.c, l);
            adfz.b += l;
            final int c2 = adfz.c - l;
            adfz.c = c2;
            final ByteBuffer f = bde.f;
            if (f != null && f.capacity() >= c2) {
                bde.f.clear();
            }
            else {
                bde.f = ByteBuffer.allocate(c2);
            }
            bov = g(bov, adfz.b, bde.f, adfz.c);
        }
        else {
            bde.b(adfz.c);
            bov = g(bov2, adfz.b, bde.c, adfz.c);
        }
        return bov;
    }
    
    private static bov f(bov c, final long n) {
        while (n >= c.b) {
            c = c.c;
        }
        return c;
    }
    
    private static bov g(bov bov, long n, final ByteBuffer byteBuffer, int i) {
        bov = f(bov, n);
        while (i > 0) {
            final int min = Math.min(i, (int)(bov.b - n));
            byteBuffer.put((byte[])bov.d.b, bov.a(n), min);
            final int n2 = i - min;
            final long n3 = n += min;
            i = n2;
            if (n3 == bov.b) {
                bov = bov.c;
                n = n3;
                i = n2;
            }
        }
        return bov;
    }
    
    private static bov h(bov bov, long n, final byte[] array, final int n2) {
        bov = f(bov, n);
        int n3;
        long n4;
        for (int i = n2; i > 0; i = n3, n = n4) {
            final int min = Math.min(i, (int)(bov.b - n));
            System.arraycopy(bov.d.b, bov.a(n), array, n2 - i, min);
            n3 = i - min;
            n4 = n + min;
            i = n3;
            n = n4;
            if (n4 == bov.b) {
                bov = bov.c;
            }
        }
        return bov;
    }
    
    public final int a(final int n) {
        final bov e = this.e;
        if (e.d == null) {
            final arjd f = this.g.f();
            final bov c = new bov(this.e.b, this.a);
            e.d = f;
            e.c = c;
        }
        return Math.min(n, (int)(this.e.b - this.f));
    }
    
    public final void b(final bov bov) {
        if (bov.d == null) {
            return;
        }
        this.g.e(bov);
        bov.b();
    }
    
    public final void c(final long n) {
        if (n != -1L) {
            bov c;
            while (true) {
                c = this.c;
                if (n < c.b) {
                    break;
                }
                this.g.g(c.d);
                this.c = this.c.b();
            }
            if (this.d.a < c.a) {
                this.d = c;
            }
        }
    }
    
    public final void d(final int n) {
        final long f = this.f + n;
        this.f = f;
        final bov e = this.e;
        if (f == e.b) {
            this.e = e.c;
        }
    }
}
