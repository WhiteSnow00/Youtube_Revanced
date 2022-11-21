// 
// Decompiled by Procyon v0.6.0
// 

public final class cal implements cas
{
    private final cak a;
    private final bat b;
    private int c;
    private int d;
    private boolean e;
    private boolean f;
    
    public cal(final cak a) {
        this.a = a;
        this.b = new bat(32);
    }
    
    @Override
    public final void a(final bat bat, int d) {
        final int n = d & 0x1;
        if (n != 0) {
            d = bat.i();
            d += bat.b;
        }
        else {
            d = -1;
        }
        if (this.f) {
            if (n == 0) {
                return;
            }
            this.f = false;
            bat.G(d);
            this.d = 0;
        }
        while (bat.a() > 0) {
            d = this.d;
            if (d < 3) {
                if (d == 0) {
                    d = bat.i();
                    bat.G(bat.b - 1);
                    if (d == 255) {
                        this.f = true;
                        return;
                    }
                }
                d = Math.min(bat.a(), 3 - this.d);
                bat.B(this.b.a, this.d, d);
                d += this.d;
                if ((this.d = d) != 3) {
                    continue;
                }
                this.b.G(0);
                this.b.F(3);
                this.b.H(1);
                final int i = this.b.i();
                d = this.b.i();
                this.e = ((i & 0x80) != 0x0);
                this.c = ((i & 0xF) << 8 | d) + 3;
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
                d = Math.min(bat.a(), this.c - d);
                bat.B(this.b.a, this.d, d);
                final int d2 = this.d + d;
                this.d = d2;
                d = this.c;
                if (d2 != d) {
                    continue;
                }
                if (this.e) {
                    if (baz.aw(this.b.a, d) != 0) {
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
    
    @Override
    public final void b(final bay bay, final btp btp, final car car) {
        this.a.b(bay, btp, car);
        this.f = true;
    }
    
    @Override
    public final void c() {
        this.f = true;
    }
}
