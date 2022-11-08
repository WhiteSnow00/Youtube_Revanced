import android.media.metrics.LogSessionId;
import android.media.AudioTrack;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bht
{
    public static void a(final AudioTrack audioTrack, final bgz bgz) {
        final LogSessionId a = bgz.a();
        if (!a.equals((Object)LogSessionId.LOG_SESSION_ID_NONE)) {
            audioTrack.setLogSessionId(a);
        }
    }
    
    public static void b(final bkl bkl, final bkl bkl2) {
        if (bkl == bkl2) {
            return;
        }
        if (bkl2 != null) {
            bkl2.o((trg)null);
        }
        if (bkl != null) {
            bkl.p((trg)null);
        }
    }
    
    public static boolean c(final btj btj) {
        final bar bar = new bar(8);
        final int b = ynj.e(btj, bar).b;
        if (b != 1380533830 && b != 1380333108) {
            return false;
        }
        btj.j(bar.a, 0, 4);
        bar.G(0);
        final int d = bar.d();
        if (d != 1463899717) {
            final StringBuilder sb = new StringBuilder("Unsupported form type: ");
            sb.append(d);
            bao.a("WavHeaderReader", sb.toString());
            return false;
        }
        return true;
    }
    
    public static int d(final byte[] array, int n, final int n2) {
        while (n < n2 && array[n] != 71) {
            ++n;
        }
        return n;
    }
    
    public static long e(final bar bar, int d, int n) {
        bar.G(d);
        if (bar.a() < 5) {
            return -9223372036854775807L;
        }
        d = bar.d();
        if ((0x800000 & d) != 0x0) {
            return -9223372036854775807L;
        }
        if ((d >> 8 & 0x1FFF) != n) {
            return -9223372036854775807L;
        }
        if ((d & 0x20) != 0x0 && bar.i() >= 7 && bar.a() >= 7 && (bar.i() & 0x10) == 0x10) {
            final byte[] array = new byte[6];
            bar.B(array, 0, 6);
            d = array[0];
            n = array[1];
            final byte b = array[2];
            final long n2 = (long)array[3] & 0xFFL;
            return ((long)n & 0xFFL) << 17 | ((long)d & 0xFFL) << 25 | ((long)b & 0xFFL) << 9 | n2 + n2 | ((long)array[4] & 0xFFL) >> 7;
        }
        return -9223372036854775807L;
    }
    
    public static ynj f(int b, final btj btj, final bar bar) {
        ynj ynj = ynj.e(btj, bar);
        while (true) {
            final int b2 = ynj.b;
            if (b2 == b) {
                return ynj;
            }
            final StringBuilder sb = new StringBuilder("Ignoring unknown WAV chunk: ");
            sb.append(b2);
            bao.c("WavHeaderReader", sb.toString());
            final long n = ynj.a + 8L;
            if (n > 2147483647L) {
                b = ynj.b;
                final StringBuilder sb2 = new StringBuilder("Chunk is too large (~2GB+) to skip; id: ");
                sb2.append(b);
                throw ayz.d(sb2.toString());
            }
            btj.m((int)n);
            ynj = ynj.e(btj, bar);
        }
    }
}
