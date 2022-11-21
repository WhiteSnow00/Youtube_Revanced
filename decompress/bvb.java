// 
// Decompiled by Procyon v0.6.0
// 

final class bvb extends bva
{
    private final bat a;
    private final bat b;
    private int c;
    private boolean e;
    private boolean f;
    private int g;
    
    public bvb(final bug bug) {
        super(bug);
        this.a = new bat(bua.a);
        this.b = new bat(4);
    }
    
    protected final boolean a(final bat bat) {
        final int i = bat.i();
        final int g = i >> 4;
        final int n = i & 0xF;
        if (n == 7) {
            this.g = g;
            return g != 5;
        }
        final StringBuilder sb = new StringBuilder("Video format not supported: ");
        sb.append(n);
        throw new buz(sb.toString());
    }
    
    protected final boolean b(final bat bat, final long n) {
        final int i = bat.i();
        final byte[] a = bat.a;
        final int b = bat.b;
        final int b2 = b + 1;
        bat.b = b2;
        final byte b3 = a[b];
        final int b4 = b2 + 1;
        bat.b = b4;
        final byte b5 = a[b2];
        bat.b = b4 + 1;
        final byte b6 = a[b4];
        if (i == 0) {
            if (!this.e) {
                final bat bat2 = new bat(new byte[bat.a()]);
                bat.B(bat2.a, 0, bat.a());
                final bsx a2 = bsx.a(bat2);
                this.c = a2.b;
                final ayg ayg = new ayg();
                ayg.k = "video/avc";
                ayg.h = a2.f;
                ayg.p = a2.c;
                ayg.q = a2.d;
                ayg.t = a2.e;
                ayg.m = a2.a;
                this.d.b(ayg.a());
                this.e = true;
                return false;
            }
        }
        else if (i == 1 && this.e) {
            int n2;
            if (this.g == 1) {
                n2 = 1;
            }
            else {
                n2 = 0;
            }
            if (!this.f && n2 == 0) {
                return false;
            }
            final byte[] a3 = this.b.a;
            a3[0] = 0;
            a3[2] = (a3[1] = 0);
            final int c = this.c;
            int n3 = 0;
            while (bat.a() > 0) {
                bat.B(this.b.a, 4 - c, this.c);
                this.b.G(0);
                final int l = this.b.l();
                this.a.G(0);
                this.d.c(this.a, 4);
                this.d.c(bat, l);
                n3 = n3 + 4 + l;
            }
            this.d.e(n + ((b3 & 0xFF) << 24 >> 8 | (b5 & 0xFF) << 8 | (b6 & 0xFF)) * 1000L, n2, n3, 0, (buf)null);
            return this.f = true;
        }
        return false;
    }
}
