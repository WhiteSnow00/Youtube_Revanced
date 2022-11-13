// 
// Decompiled by Procyon v0.6.0
// 

public final class bzk implements bzp
{
    private final bas a;
    private final String b;
    private String c;
    private bud d;
    private int e;
    private int f;
    private boolean g;
    private long h;
    private ayg i;
    private int j;
    private long k;
    private final atim l;
    
    public bzk() {
        this(null);
    }
    
    public bzk(final String b) {
        final atim l = new atim(new byte[16], (byte[])null);
        this.l = l;
        this.a = new bas((byte[])l.d);
        this.e = 0;
        this.f = 0;
        this.g = false;
        this.k = -9223372036854775807L;
        this.b = b;
    }
    
    public final void a(final bas bas) {
        dk.e((Object)this.d);
        while (bas.a() > 0) {
            final int e = this.e;
            if (e != 0) {
                if (e != 1) {
                    final int min = Math.min(bas.a(), this.j - this.f);
                    this.d.c(bas, min);
                    final int f = this.f + min;
                    this.f = f;
                    final int j = this.j;
                    if (f != j) {
                        continue;
                    }
                    final long k = this.k;
                    if (k != -9223372036854775807L) {
                        this.d.e(k, 1, j, 0, (buc)null);
                        this.k += this.h;
                    }
                    this.e = 0;
                }
                else {
                    final byte[] a = this.a.a;
                    final int min2 = Math.min(bas.a(), 16 - this.f);
                    bas.B(a, this.f, min2);
                    if ((this.f += min2) != 16) {
                        continue;
                    }
                    this.l.m(0);
                    final aetm c = bst.c(this.l);
                    final ayg i = this.i;
                    if (i == null || i.A != 2 || c.c != i.B || !"audio/ac4".equals(i.n)) {
                        final ayf ayf = new ayf();
                        ayf.a = this.c;
                        ayf.k = "audio/ac4";
                        ayf.x = 2;
                        ayf.y = c.c;
                        ayf.c = this.b;
                        final ayg a2 = ayf.a();
                        this.i = a2;
                        this.d.b(a2);
                    }
                    this.j = c.a;
                    this.h = c.b * 1000000L / this.i.B;
                    this.a.G(0);
                    this.d.c(this.a, 16);
                    this.e = 2;
                }
            }
            else {
                while (bas.a() > 0) {
                    if (this.g) {
                        final int l = bas.i();
                        this.g = (l == 172);
                        byte b = 64;
                        int n;
                        if ((n = l) != 64) {
                            if (l != 65) {
                                continue;
                            }
                            n = 65;
                        }
                        this.e = 1;
                        final byte[] a3 = this.a.a;
                        a3[0] = -84;
                        if (n == 65) {
                            b = 65;
                        }
                        a3[1] = b;
                        this.f = 2;
                        break;
                    }
                    this.g = (bas.i() == 172);
                }
            }
        }
    }
    
    public final void b(final btm btm, final cao cao) {
        cao.c();
        this.c = cao.b();
        this.d = btm.q(cao.a(), 1);
    }
    
    public final void c() {
    }
    
    public final void d(final long k, final int n) {
        if (k != -9223372036854775807L) {
            this.k = k;
        }
    }
    
    public final void e() {
        this.e = 0;
        this.f = 0;
        this.g = false;
        this.k = -9223372036854775807L;
    }
}
