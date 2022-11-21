import java.util.Collections;

// 
// Decompiled by Procyon v0.6.0
// 

final class buw extends bva
{
    private static final int[] a;
    private boolean b;
    private boolean c;
    private int e;
    
    static {
        a = new int[] { 5512, 11025, 22050, 44100 };
    }
    
    public buw(final bug bug) {
        super(bug);
    }
    
    protected final boolean a(final bat bat) {
        if (!this.b) {
            final int i = bat.i();
            final int e = i >> 4;
            if ((this.e = e) == 2) {
                final int y = buw.a[i >> 2 & 0x3];
                final ayg ayg = new ayg();
                ayg.k = "audio/mpeg";
                ayg.x = 1;
                ayg.y = y;
                this.d.b(ayg.a());
                this.c = true;
            }
            else if (e != 7 && e != 8) {
                if (e != 10) {
                    final StringBuilder sb = new StringBuilder("Audio format not supported: ");
                    sb.append(e);
                    throw new buz(sb.toString());
                }
            }
            else {
                final ayg ayg2 = new ayg();
                String k;
                if (e == 7) {
                    k = "audio/g711-alaw";
                }
                else {
                    k = "audio/g711-mlaw";
                }
                ayg2.k = k;
                ayg2.x = 1;
                ayg2.y = 8000;
                this.d.b(ayg2.a());
                this.c = true;
            }
            this.b = true;
        }
        else {
            bat.H(1);
        }
        return true;
    }
    
    protected final boolean b(final bat bat, final long n) {
        if (this.e == 2) {
            final int a = bat.a();
            this.d.c(bat, a);
            this.d.e(n, 1, a, 0, (buf)null);
            return true;
        }
        final int i = bat.i();
        if (i == 0 && !this.c) {
            final int a2 = bat.a();
            final byte[] array = new byte[a2];
            bat.B(array, 0, a2);
            final ikm a3 = bsu.a(array);
            final ayg ayg = new ayg();
            ayg.k = "audio/mp4a-latm";
            ayg.h = (String)a3.c;
            ayg.x = a3.a;
            ayg.y = a3.b;
            ayg.m = Collections.singletonList(array);
            this.d.b(ayg.a());
            this.c = true;
            return false;
        }
        if (this.e == 10 && i != 1) {
            return false;
        }
        final int a4 = bat.a();
        this.d.c(bat, a4);
        this.d.e(n, 1, a4, 0, (buf)null);
        return true;
    }
}
