import java.io.EOFException;

// 
// Decompiled by Procyon v0.6.0
// 

final class lub
{
    private static final int a;
    
    static {
        a = lwj.c("OggS");
    }
    
    public static void a(final lsh lsh) {
        int n = 2048;
        final byte[] array = new byte[2048];
        while (true) {
            final long b = lsh.b;
            int n2 = n;
            if (b != -1L) {
                final long c = lsh.c;
                n2 = n;
                if (n + c > b) {
                    n2 = (int)(b - c);
                    if (n2 < 4) {
                        throw new EOFException();
                    }
                }
            }
            int n3 = 0;
            lsh.k(array, 0, n2, false);
            while (true) {
                final int n4 = n2 - 3;
                if (n3 >= n4) {
                    lsh.i(n4);
                    n = n2;
                    break;
                }
                if (array[n3] == 79 && array[n3 + 1] == 103 && array[n3 + 2] == 103 && array[n3 + 3] == 83) {
                    lsh.i(n3);
                    return;
                }
                ++n3;
            }
        }
    }
    
    public static boolean b(final lsh lsh, final lua lua, final lwg lwg, final boolean b) {
        lwg.t();
        lua.a();
        final long b2 = lsh.b;
        int i = 0;
        if ((b2 != -1L && b2 - lsh.c() < 27L) || !lsh.k((byte[])lwg.c, 0, 27, true)) {
            if (b) {
                return false;
            }
            throw new EOFException();
        }
        else if (lwg.n() != lub.a) {
            if (b) {
                return false;
            }
            throw new lrl("expected OggS capture pattern at begin of page");
        }
        else {
            if (lwg.h() == 0) {
                lua.a = lwg.h();
                final Object c = lwg.c;
                final int a = lwg.a;
                final int a2 = a + 1;
                lwg.a = a2;
                final byte[] array = (byte[])c;
                final byte b3 = array[a];
                final int a3 = a2 + 1;
                lwg.a = a3;
                final byte b4 = array[a2];
                final int a4 = a3 + 1;
                lwg.a = a4;
                final byte b5 = array[a3];
                final int a5 = a4 + 1;
                lwg.a = a5;
                final byte b6 = array[a4];
                final int a6 = a5 + 1;
                lwg.a = a6;
                final byte b7 = array[a5];
                final int a7 = a6 + 1;
                lwg.a = a7;
                final byte b8 = array[a6];
                final int a8 = a7 + 1;
                lwg.a = a8;
                final byte b9 = array[a7];
                lwg.a = a8 + 1;
                lua.b = (((long)b4 & 0xFFL) << 8 | ((long)b3 & 0xFFL) | ((long)b5 & 0xFFL) << 16 | ((long)b6 & 0xFFL) << 24 | ((long)b7 & 0xFFL) << 32 | ((long)b8 & 0xFFL) << 40 | ((long)b9 & 0xFFL) << 48 | ((long)array[a8] & 0xFFL) << 56);
                lwg.l();
                lwg.l();
                lwg.l();
                lua.c = lwg.h();
                lwg.t();
                final int c2 = lua.c;
                lua.d = c2 + 27;
                lsh.f((byte[])lwg.c, 0, c2);
                while (i < lua.c) {
                    ((int[])lua.f)[i] = lwg.h();
                    lua.e += ((int[])lua.f)[i];
                    ++i;
                }
                return true;
            }
            if (b) {
                return false;
            }
            throw new lrl("unsupported bit stream revision");
        }
    }
    
    public static int c(final byte b, final int n) {
        return b >> 1 & 255 >>> 8 - n;
    }
    
    public static void d(final lua lua, final int n, final nsa nsa) {
        nsa.b = 0;
        nsa.a = 0;
        int i;
        do {
            final int b = nsa.b;
            final int n2 = n + b;
            if (n2 >= lua.c) {
                break;
            }
            final Object f = lua.f;
            nsa.b = b + 1;
            i = ((int[])f)[n2];
            nsa.a += i;
        } while (i == 255);
    }
}
