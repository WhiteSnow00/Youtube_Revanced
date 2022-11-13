// 
// Decompiled by Procyon v0.6.0
// 

public final class cai implements cap
{
    private final cah a;
    private final bas b;
    private int c;
    private int d;
    private boolean e;
    private boolean f;
    
    public cai(final cah a) {
        this.a = a;
        this.b = new bas(32);
    }
    
    public final void a(final bas bas, int d) {
        final int n = d & 0x1;
        if (n != 0) {
            d = bas.i();
            d += bas.b;
        }
        else {
            d = -1;
        }
        if (this.f) {
            if (n == 0) {
                return;
            }
            this.f = false;
            bas.G(d);
            this.d = 0;
        }
        while (bas.a() > 0) {
            d = this.d;
            if (d < 3) {
                if (d == 0) {
                    d = bas.i();
                    bas.G(bas.b - 1);
                    if (d == 255) {
                        this.f = true;
                        return;
                    }
                }
                d = Math.min(bas.a(), 3 - this.d);
                bas.B(this.b.a, this.d, d);
                d += this.d;
                if ((this.d = d) != 3) {
                    continue;
                }
                this.b.G(0);
                this.b.F(3);
                this.b.H(1);
                d = this.b.i();
                final int i = this.b.i();
                this.e = ((d & 0x80) != 0x0);
                this.c = ((d & 0xF) << 8 | i) + 3;
                final int b = this.b.b();
                d = this.c;
                if (b >= d) {
                    continue;
                }
                final int b2 = this.b.b();
                d = Math.min(4098, Math.max(d, b2 + b2));
                this.b.A(d);
            }
            else {
                d = Math.min(bas.a(), this.c - d);
                bas.B(this.b.a, this.d, d);
                final int d2 = this.d + d;
                this.d = d2;
                d = this.c;
                if (d2 != d) {
                    continue;
                }
                if (this.e) {
                    if (bax.aw(this.b.a, d) != 0) {
                        this.f = true;
                        return;
                    }
                    this.b.F(this.c - 4);
                }
                else {
                    this.b.F(d);
                }
                this.b.G(0);
                this.a.a(this.b);
                this.d = 0;
            }
        }
    }
    
    public final void b(final baw baw, final btm btm, final cao cao) {
        this.a.b(baw, btm, cao);
        this.f = true;
    }
    
    public final void c() {
        this.f = true;
    }
}
