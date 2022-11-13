import android.media.metrics.LogSessionId;
import android.media.AudioTrack;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bhu
{
    public static void a(final AudioTrack audioTrack, final bha bha) {
        final LogSessionId a = bha.a();
        if (!a.equals((Object)LogSessionId.LOG_SESSION_ID_NONE)) {
            audioTrack.setLogSessionId(a);
        }
    }
    
    public static void b(final bkm bkm, final bkm bkm2) {
        if (bkm == bkm2) {
            return;
        }
        if (bkm2 != null) {
            bkm2.o(null);
        }
        if (bkm != null) {
            bkm.p(null);
        }
    }
    
    public static boolean c(final btk btk) {
        final bas bas = new bas(8);
        final int b = ypi.e(btk, bas).b;
        if (b != 1380533830 && b != 1380333108) {
            return false;
        }
        btk.j(bas.a, 0, 4);
        bas.G(0);
        final int d = bas.d();
        if (d != 1463899717) {
            final StringBuilder sb = new StringBuilder("Unsupported form type: ");
            sb.append(d);
            bap.a("WavHeaderReader", sb.toString());
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
    
    public static long e(final bas bas, int d, final int n) {
        bas.G(d);
        if (bas.a() < 5) {
            return -9223372036854775807L;
        }
        d = bas.d();
        if ((0x800000 & d) != 0x0) {
            return -9223372036854775807L;
        }
        if ((d >> 8 & 0x1FFF) != n) {
            return -9223372036854775807L;
        }
        if ((d & 0x20) != 0x0 && bas.i() >= 7 && bas.a() >= 7 && (bas.i() & 0x10) == 0x10) {
            final byte[] array = new byte[6];
            bas.B(array, 0, 6);
            final long n2 = array[0];
            final long n3 = array[1];
            final long n4 = array[2];
            final long n5 = array[3];
            final long n6 = array[4];
            final long n7 = n5 & 0xFFL;
            return (n2 & 0xFFL) << 25 | (n3 & 0xFFL) << 17 | (n4 & 0xFFL) << 9 | n7 + n7 | (n6 & 0xFFL) >> 7;
        }
        return -9223372036854775807L;
    }
    
    public static ypi f(int b, final btk btk, final bas bas) {
        ypi ypi = ypi.e(btk, bas);
        while (true) {
            final int b2 = ypi.b;
            if (b2 == b) {
                return ypi;
            }
            final StringBuilder sb = new StringBuilder("Ignoring unknown WAV chunk: ");
            sb.append(b2);
            bap.c("WavHeaderReader", sb.toString());
            final long n = ypi.a + 8L;
            if (n > 2147483647L) {
                b = ypi.b;
                final StringBuilder sb2 = new StringBuilder("Chunk is too large (~2GB+) to skip; id: ");
                sb2.append(b);
                throw aza.d(sb2.toString());
            }
            btk.m((int)n);
            ypi = ypi.e(btk, bas);
        }
    }
}
