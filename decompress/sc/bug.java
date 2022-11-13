import java.util.Arrays;
import java.io.EOFException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bug implements btj
{
    private static final int[] a;
    private static final int[] b;
    private static final byte[] c;
    private static final byte[] d;
    private static final int e;
    private final byte[] f;
    private boolean g;
    private long h;
    private int i;
    private int j;
    private boolean k;
    private int l;
    private int m;
    private long n;
    private btm o;
    private bud p;
    private bua q;
    private boolean r;
    
    static {
        a = new int[] { 13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1 };
        final int[] array;
        final int[] b2 = array = new int[16];
        array[0] = 18;
        array[1] = 24;
        array[2] = 33;
        array[3] = 37;
        array[4] = 41;
        array[5] = 47;
        array[6] = 51;
        array[7] = 59;
        array[8] = 61;
        array[9] = 6;
        array[11] = (array[10] = 1);
        array[13] = (array[12] = 1);
        array[15] = (array[14] = 1);
        b = b2;
        c = bax.aj("#!AMR\n");
        d = bax.aj("#!AMR-WB\n");
        e = b2[8];
    }
    
    public bug() {
        this(null);
    }
    
    public bug(final byte[] array) {
        this.f = new byte[1];
        this.l = -1;
    }
    
    private final int a(final btk btk) {
        int j;
        if ((j = this.j) == 0) {
            try {
                btk.l();
                btk.j(this.f, 0, 1);
                final byte b = this.f[0];
                if ((b & 0x83) > 0) {
                    final StringBuilder sb = new StringBuilder("Invalid padding bits for frame header ");
                    sb.append(b);
                    throw aza.a(sb.toString(), (Throwable)null);
                }
                final boolean g = this.g;
                final int n = b >> 3 & 0xF;
                Label_0098: {
                    if (g) {
                        if (n < 10) {
                            break Label_0098;
                        }
                        if (n > 13) {
                            break Label_0098;
                        }
                    }
                    if (g || (n >= 12 && n <= 14)) {
                        String s = "WB";
                        if (!g) {
                            s = "NB";
                        }
                        final StringBuilder sb2 = new StringBuilder("Illegal AMR ");
                        sb2.append(s);
                        sb2.append(" frame type ");
                        sb2.append(n);
                        throw aza.a(sb2.toString(), (Throwable)null);
                    }
                }
                int l;
                if (g) {
                    l = bug.b[n];
                }
                else {
                    l = bug.a[n];
                }
                this.i = l;
                this.j = l;
                int i;
                if ((i = this.l) == -1) {
                    this.l = l;
                    i = l;
                }
                if (i == (j = l)) {
                    ++this.m;
                    j = l;
                }
            }
            catch (final EOFException ex) {
                return -1;
            }
        }
        final int a = this.p.a((ayb)btk, j, true);
        if (a == -1) {
            return -1;
        }
        if ((this.j -= a) > 0) {
            return 0;
        }
        this.p.e(this.h, 1, this.i, 0, (buc)null);
        this.h += 20000L;
        return 0;
    }
    
    private static boolean b(final btk btk, final byte[] array) {
        btk.l();
        final int length = array.length;
        final byte[] array2 = new byte[length];
        btk.j(array2, 0, length);
        return Arrays.equals(array2, array);
    }
    
    private final boolean c(final btk btk) {
        final byte[] c = bug.c;
        if (b(btk, c)) {
            this.g = false;
            btk.m(c.length);
            return true;
        }
        final byte[] d = bug.d;
        if (b(btk, d)) {
            this.g = true;
            btk.m(d.length);
            return true;
        }
        return false;
    }
    
    public final void d(final btm o) {
        this.o = o;
        this.p = o.q(0, 1);
        o.r();
    }
    
    public final void e() {
    }
    
    public final void f(final long n, final long n2) {
        this.h = 0L;
        this.i = 0;
        this.j = 0;
        this.n = 0L;
    }
    
    public final boolean g(final btk btk) {
        return this.c(btk);
    }
    
    public final int h(final btk btk, final paq paq) {
        dk.e((Object)this.p);
        final int a = bax.a;
        if (((btd)btk).c == 0L && !this.c(btk)) {
            throw aza.a("Could not find AMR header.", (Throwable)null);
        }
        if (!this.r) {
            this.r = true;
            final boolean g = this.g;
            String k;
            if (!g) {
                k = "audio/3gpp";
            }
            else {
                k = "audio/amr-wb";
            }
            int y;
            if (!g) {
                y = 8000;
            }
            else {
                y = 16000;
            }
            final bud p2 = this.p;
            final ayf ayf = new ayf();
            ayf.k = k;
            ayf.l = bug.e;
            ayf.x = 1;
            ayf.y = y;
            p2.b(ayf.a());
        }
        final int a2 = this.a(btk);
        if (this.k) {
            return a2;
        }
        final btz q = new btz(-9223372036854775807L);
        this.q = (bua)q;
        this.o.x((bua)q);
        this.k = true;
        return a2;
    }
}
