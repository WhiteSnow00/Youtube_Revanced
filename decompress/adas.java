import java.io.IOException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adas implements Runnable
{
    public final adaw a;
    
    public adas(final adaw a) {
        this.a = a;
    }
    
    @Override
    public final void run() {
        final adaw a = this.a;
        while (a.b.getRecordingState() == 3) {
            final int k = a.k;
            final byte[] array = new byte[k];
            final int read = a.b.read(array, 0, k);
            if (read <= 0) {
                break;
            }
            final adbb j = a.j;
            long n;
            int i;
            long n2;
            byte b;
            int n3;
            for (n = 0L, i = read, n2 = 0L; i >= 2; i -= 2, n3 = (b << 8) + (array[i] & 0xFF), n2 += n3, n += n3 * n3) {
                b = array[i - 1];
            }
            final int n4 = read >> 1;
            final float n5 = (float)Math.sqrt((double)((n * n4 - n2 * n2) / (n4 * n4)));
            if (!j.b && n5 == 0.0f) {
                tut.m("SpeechLevelGenerator", "Really low audio levels detected. The audio input may have issues.");
                j.b = true;
            }
            final float a2 = j.a;
            float n6;
            if (a2 < n5) {
                n6 = a2 * 0.999f + 0.001f * n5;
                j.a = n6;
            }
            else {
                n6 = a2 * 0.95f + 0.05f * n5;
                j.a = n6;
            }
            final double n7 = n6;
            float n8 = -120.0f;
            if (n7 > 0.0) {
                final double n9 = n5 / n6;
                n8 = n8;
                if (n9 > 1.0E-6) {
                    n8 = (float)Math.log10(n9) * 10.0f;
                }
            }
            final int n10 = (int)((Math.min(Math.max(n8, -2.0f), 10.0f) + 2.0f) * 100.0f / 12.0f);
            int n11;
            if (n10 < 30) {
                n11 = 0;
            }
            else {
                n11 = n10 / 10 * 10;
            }
            a.c.post((Runnable)new zuo(a, n11, 9));
            if (a.n == null) {
                a.c();
                a.c.post((Runnable)new abse(a, new NullPointerException(), 17));
                break;
            }
            if (a.e()) {
                final adbe q = a.q;
                if (!q.b) {
                    throw new IllegalStateException("You forgot to call init()!");
                }
                if (q.a) {
                    throw new IllegalStateException("Cannot process more bytes after flushing.");
                }
                final adbc c = q.c;
                final ahbs t = ahbt.t();
                if (!c.d) {
                    try {
                        final int e = c.e;
                        final int n12 = e - 1;
                        byte[] bytes = null;
                        if (e == 0) {
                            throw null;
                        }
                        if (n12 == 0) {
                            throw new IllegalStateException("Trying to make header for unspecified codec!");
                        }
                        if (n12 != 1) {
                            if (n12 != 2) {
                                if (n12 == 3) {
                                    throw new IllegalStateException("Should never happen! Use OggOpusEncoder instead.");
                                }
                            }
                            else {
                                bytes = new byte[0];
                            }
                        }
                        else {
                            bytes = "#!AMR-WB\n".getBytes();
                        }
                        t.write(bytes);
                    }
                    catch (final IOException ex) {
                        tut.b("Unable to write bytes into buffer!");
                    }
                    c.d = true;
                }
                int min;
                for (int l = 0; l < k; l += min) {
                    min = Math.min(4096, k - l);
                    c.a(array, l, min, false, t);
                }
                final ahbt b2 = t.b();
                if (b2.d() <= 0) {
                    continue;
                }
                final asjm n13 = a.n;
                final ahcr builder = aexi.a.createBuilder();
                builder.copyOnWrite();
                final aexi aexi = (aexi)builder.instance;
                b2.getClass();
                aexi.b = 1;
                aexi.c = b2;
                n13.c(builder.build());
            }
            else {
                final asjm n14 = a.n;
                final ahcr builder2 = aexi.a.createBuilder();
                final ahbt x = ahbt.x(array);
                builder2.copyOnWrite();
                final aexi aexi2 = (aexi)builder2.instance;
                aexi2.b = 1;
                aexi2.c = x;
                n14.c(builder2.build());
            }
        }
    }
}
