// 
// Decompiled by Procyon v0.6.0
// 

final class bwb
{
    public final int a;
    public int b;
    public int c;
    public long d;
    private final boolean e;
    private final bar f;
    private final bar g;
    private int h;
    private int i;
    
    public bwb(final bar g, final bar f, final boolean e) {
        this.g = g;
        this.f = f;
        this.e = e;
        f.G(12);
        this.a = f.l();
        g.G(12);
        this.i = g.l();
        final int d = g.d();
        boolean b = true;
        if (d != 1) {
            b = false;
        }
        blx.c(b, "first_chunk must be 1");
        this.b = -1;
    }
    
    public final boolean a() {
        final int b = this.b + 1;
        this.b = b;
        if (b == this.a) {
            return false;
        }
        long d;
        if (this.e) {
            d = this.f.r();
        }
        else {
            d = this.f.q();
        }
        this.d = d;
        if (this.b == this.h) {
            this.c = this.g.l();
            this.g.H(4);
            int i = this.i;
            int h = -1;
            --i;
            if ((this.i = i) > 0) {
                h = -1 + this.g.l();
            }
            this.h = h;
        }
        return true;
    }
}
