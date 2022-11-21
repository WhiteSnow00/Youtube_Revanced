import java.util.Arrays;
import java.io.EOFException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class buj implements btm
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
    private btp o;
    private bug p;
    private bud q;
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
        c = baz.aj("#!AMR\n");
        d = baz.aj("#!AMR-WB\n");
        e = b2[8];
    }
    
    public buj() {
        this(null);
    }
    
    public buj(final byte[] array) {
        this.f = new byte[1];
        this.l = -1;
    }
    
    private final int a(final btn btn) {
        int j;
        if ((j = this.j) == 0) {
            try {
                btn.l();
                btn.j(this.f, 0, 1);
                final byte b = this.f[0];
                if ((b & 0x83) > 0) {
                    final StringBuilder sb = new StringBuilder("Invalid padding bits for frame header ");
                    sb.append(b);
                    throw azb.a(sb.toString(), null);
                }
                final boolean g = this.g;
                final int n = b >> 3 & 0xF;
                Label_0097: {
                    if (g) {
                        if (n < 10) {
                            break Label_0097;
                        }
                        if (n > 13) {
                            break Label_0097;
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
                        throw azb.a(sb2.toString(), null);
                    }
                }
                int l;
                if (g) {
                    l = buj.b[n];
                }
                else {
                    l = buj.a[n];
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
        final int a = this.p.a((ayc)btn, j, true);
        if (a == -1) {
            return -1;
        }
        if ((this.j -= a) > 0) {
            return 0;
        }
        this.p.e(this.h, 1, this.i, 0, (buf)null);
        this.h += 20000L;
        return 0;
    }
    
    private static boolean b(final btn btn, final byte[] array) {
        btn.l();
        final int length = array.length;
        final byte[] array2 = new byte[length];
        btn.j(array2, 0, length);
        return Arrays.equals(array2, array);
    }
    
    private final boolean c(final btn btn) {
        final byte[] c = buj.c;
        if (b(btn, c)) {
            this.g = false;
            btn.m(c.length);
            return true;
        }
        final byte[] d = buj.d;
        if (b(btn, d)) {
            this.g = true;
            btn.m(d.length);
            return true;
        }
        return false;
    }
    
    public final void d(final btp o) {
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
    
    public final boolean g(final btn btn) {
        return this.c(btn);
    }
    
    public final int h(final btn btn, final pbg pbg) {
        bad.c(this.p);
        final int a = baz.a;
        if (((btg)btn).c == 0L && !this.c(btn)) {
            throw azb.a("Could not find AMR header.", null);
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
            final bug p2 = this.p;
            final ayg ayg = new ayg();
            ayg.k = k;
            ayg.l = buj.e;
            ayg.x = 1;
            ayg.y = y;
            p2.b(ayg.a());
        }
        final int a2 = this.a(btn);
        if (this.k) {
            return a2;
        }
        final buc q = new buc(-9223372036854775807L);
        this.q = (bud)q;
        this.o.x((bud)q);
        this.k = true;
        return a2;
    }
}
