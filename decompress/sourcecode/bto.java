import java.util.Collections;
import androidx.media3.common.Metadata;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bto
{
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final long j;
    public final dmk k;
    private final Metadata l;
    
    public bto(final int a, final int b, final int c, final int d, final int e, final int g, final int h, final long j, final dmk k, final Metadata l, final byte[] array, final byte[] array2) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = g(e);
        this.g = g;
        this.h = h;
        this.i = f(h);
        this.j = j;
        this.k = k;
        this.l = l;
    }
    
    public bto(final byte[] array, int n) {
        final athu athu = new athu(array, (byte[])null);
        athu.m(n * 8);
        this.a = athu.g(16);
        this.b = athu.g(16);
        this.c = athu.g(24);
        this.d = athu.g(24);
        n = athu.g(20);
        this.e = n;
        this.f = g(n);
        this.g = athu.g(3) + 1;
        n = athu.g(5) + 1;
        this.h = n;
        this.i = f(n);
        final int g = athu.g(4);
        n = athu.g(32);
        this.j = (baw.z(g) << 32 | baw.z(n));
        this.k = null;
        this.l = null;
    }
    
    private static int f(final int n) {
        if (n == 8) {
            return 1;
        }
        if (n == 12) {
            return 2;
        }
        if (n == 16) {
            return 4;
        }
        if (n == 20) {
            return 5;
        }
        if (n != 24) {
            return -1;
        }
        return 6;
    }
    
    private static int g(final int n) {
        switch (n) {
            default: {
                return -1;
            }
            case 192000: {
                return 3;
            }
            case 176400: {
                return 2;
            }
            case 96000: {
                return 11;
            }
            case 88200: {
                return 1;
            }
            case 48000: {
                return 10;
            }
            case 44100: {
                return 9;
            }
            case 32000: {
                return 8;
            }
            case 24000: {
                return 7;
            }
            case 22050: {
                return 6;
            }
            case 16000: {
                return 5;
            }
            case 8000: {
                return 4;
            }
        }
    }
    
    public final long a() {
        final long j = this.j;
        if (j == 0L) {
            return -9223372036854775807L;
        }
        return j * 1000000L / this.e;
    }
    
    public final long b(final long n) {
        return baw.r(n * this.e / 1000000L, 0L, this.j - 1L);
    }
    
    public final ayf c(final byte[] array, Metadata d) {
        array[4] = -128;
        int d2;
        if ((d2 = this.d) <= 0) {
            d2 = -1;
        }
        d = this.d(d);
        final aye aye = new aye();
        aye.k = "audio/flac";
        aye.l = d2;
        aye.x = this.g;
        aye.y = this.e;
        aye.m = Collections.singletonList(array);
        aye.i = d;
        return aye.a();
    }
    
    public final Metadata d(final Metadata metadata) {
        final Metadata l = this.l;
        if (l == null) {
            return metadata;
        }
        return l.d(metadata);
    }
    
    public final bto e(final dmk dmk) {
        return new bto(this.a, this.b, this.c, this.d, this.e, this.g, this.h, this.j, dmk, this.l, null, null);
    }
}
