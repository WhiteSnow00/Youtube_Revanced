import java.util.Collections;

// 
// Decompiled by Procyon v0.6.0
// 

final class but extends bux
{
    private static final int[] a;
    private boolean b;
    private boolean c;
    private int e;
    
    static {
        a = new int[] { 5512, 11025, 22050, 44100 };
    }
    
    public but(final bud bud) {
        super(bud);
    }
    
    protected final boolean a(final bas bas) {
        if (!this.b) {
            final int i = bas.i();
            final int e = i >> 4;
            if ((this.e = e) == 2) {
                final int y = but.a[i >> 2 & 0x3];
                final ayf ayf = new ayf();
                ayf.k = "audio/mpeg";
                ayf.x = 1;
                ayf.y = y;
                this.d.b(ayf.a());
                this.c = true;
            }
            else if (e != 7 && e != 8) {
                if (e != 10) {
                    final StringBuilder sb = new StringBuilder("Audio format not supported: ");
                    sb.append(e);
                    throw new buw(sb.toString());
                }
            }
            else {
                final ayf ayf2 = new ayf();
                String k;
                if (e == 7) {
                    k = "audio/g711-alaw";
                }
                else {
                    k = "audio/g711-mlaw";
                }
                ayf2.k = k;
                ayf2.x = 1;
                ayf2.y = 8000;
                this.d.b(ayf2.a());
                this.c = true;
            }
            this.b = true;
        }
        else {
            bas.H(1);
        }
        return true;
    }
    
    protected final boolean b(final bas bas, final long n) {
        if (this.e == 2) {
            final int a = bas.a();
            this.d.c(bas, a);
            this.d.e(n, 1, a, 0, (buc)null);
            return true;
        }
        final int i = bas.i();
        if (i == 0 && !this.c) {
            final int a2 = bas.a();
            final byte[] array = new byte[a2];
            bas.B(array, 0, a2);
            final ikf a3 = bsr.a(array);
            final ayf ayf = new ayf();
            ayf.k = "audio/mp4a-latm";
            ayf.h = (String)a3.c;
            ayf.x = a3.a;
            ayf.y = a3.b;
            ayf.m = Collections.singletonList(array);
            this.d.b(ayf.a());
            this.c = true;
            return false;
        }
        if (this.e == 10 && i != 1) {
            return false;
        }
        final int a4 = bas.a();
        this.d.c(bas, a4);
        this.d.e(n, 1, a4, 0, (buc)null);
        return true;
    }
}
