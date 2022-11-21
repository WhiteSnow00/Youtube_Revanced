import java.nio.ByteBuffer;
import java.io.IOException;
import java.nio.ByteOrder;
import java.io.InputStream;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aexv
{
    public int a;
    public int b;
    public int c;
    public Object d;
    public Object e;
    
    public aexv() {
        this.a = 0;
        this.b = 1;
        this.c = 16;
    }
    
    public aexv(final aj e) {
        this.e = e;
        this.d = e.b;
        this.b = e.a();
        this.a = e.h;
        this.c = e.e;
    }
    
    public static aexv a(final InputStream inputStream) {
        final aexv aexv = new aexv();
        final String e = e(inputStream);
        if ("RIFF".equals(e)) {
            aexv.e = ByteOrder.LITTLE_ENDIAN;
        }
        else {
            if (!"RIFX".equals(e)) {
                throw new IOException("Invalid WAV header.");
            }
            aexv.e = ByteOrder.BIG_ENDIAN;
        }
        inputStream.skip(4L);
        if (!"WAVE".equals(e(inputStream))) {
            throw new IOException("Expected WAVE ID while reading WAV file.");
        }
        int n = 0;
        int n2 = 0;
        while (true) {
            final String e2 = e(inputStream);
            final int b = aexv.b(inputStream);
            int n4;
            int n5;
            if ("fmt ".equals(e2)) {
                int n3 = 16;
                if (b < 16) {
                    throw new IOException("Size of fmt chunk in WAV file is too small.");
                }
                final int c = aexv.c(inputStream);
                if ((aexv.b = aexv.c(inputStream)) <= 0) {
                    throw new IOException("Invalid number of channels in WAV file.");
                }
                if ((aexv.a = aexv.b(inputStream)) <= 0) {
                    throw new IOException("Invalid sample rate in WAV file.");
                }
                inputStream.skip(6L);
                final int c2 = aexv.c(inputStream);
                aexv.c = c2;
                if (c2 < 8 || (c2 & 0x7) != 0x0) {
                    throw new IOException("Unsupported bits per sample in WAV file.");
                }
                int c3;
                if ((c3 = c) == -2) {
                    n3 = 26;
                    if (b < 26) {
                        throw new IOException("Size of extensible fmt chunk in WAV file is too small.");
                    }
                    inputStream.skip(8L);
                    c3 = aexv.c(inputStream);
                }
                if (c3 != 1) {
                    throw new IOException("Only uncompressed linear PCM WAV files are supported.");
                }
                inputStream.skip(b - n3);
                n4 = 1;
                n5 = n2;
            }
            else if ("data".equals(e2)) {
                aexv.d = d(inputStream, b);
                n5 = 1;
                n4 = n;
            }
            else {
                inputStream.skip(b);
                n5 = n2;
                n4 = n;
            }
            n = n4;
            n2 = n5;
            if (n4 != 0) {
                n = n4;
                if ((n2 = n5) != 0) {
                    final int n6 = aexv.c / 8;
                    final int b2 = aexv.b;
                    final int n7 = ((byte[])aexv.d).length / (b2 * n6);
                    final Object e3 = aexv.e;
                    final int n8 = b2 * n7 * n6;
                    if (e3 == ByteOrder.BIG_ENDIAN && n6 > 1) {
                        int n9;
                        for (int i = 0; i < n8; i = n9) {
                            n9 = i + n6;
                            int n10 = n9 - 1;
                            do {
                                final byte[] array = (byte[])aexv.d;
                                final byte b3 = array[i];
                                array[i] = array[n10];
                                array[n10] = b3;
                            } while (++i < --n10);
                        }
                    }
                    final Object d = aexv.d;
                    if (((byte[])d).length >= n8) {
                        final byte[] d2 = new byte[n8];
                        System.arraycopy(d, 0, d2, 0, n8);
                        aexv.d = d2;
                    }
                    return aexv;
                }
                continue;
            }
        }
    }
    
    private final int b(final InputStream inputStream) {
        return ByteBuffer.wrap(d(inputStream, 4)).order((ByteOrder)this.e).getInt();
    }
    
    private final int c(final InputStream inputStream) {
        return ByteBuffer.wrap(d(inputStream, 2)).order((ByteOrder)this.e).getShort();
    }
    
    private static byte[] d(final InputStream inputStream, final int n) {
        if (n >= 0) {
            final byte[] array = new byte[n];
            int read;
            for (int i = 0; i < n; i += read) {
                read = inputStream.read(array, i, n - i);
                if (read == -1) {
                    throw new IOException("Unexpected end of file while reading WAV file.");
                }
            }
            return array;
        }
        throw new IOException("Invalid negative data length in WAV file.");
    }
    
    private static String e(final InputStream inputStream) {
        return new String(d(inputStream, 4));
    }
}
