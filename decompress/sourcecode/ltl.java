// 
// Decompiled by Procyon v0.6.0
// 

final class ltl
{
    public final int a;
    public int b;
    public int c;
    public long d;
    private final boolean e;
    private final lwg f;
    private final lwg g;
    private int h;
    private int i;
    
    public ltl(final lwg g, final lwg f, final boolean e) {
        this.g = g;
        this.f = f;
        this.e = e;
        f.x(12);
        this.a = f.j();
        g.x(12);
        this.i = g.j();
        final int c = g.c();
        boolean b = true;
        if (c != 1) {
            b = false;
        }
        jfi.V(b, (Object)"first_chunk must be 1");
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
            d = this.f.o();
        }
        else {
            d = this.f.n();
        }
        this.d = d;
        if (this.b == this.h) {
            this.c = this.g.j();
            this.g.y(4);
            int i = this.i;
            int h = -1;
            --i;
            if ((this.i = i) > 0) {
                h = -1 + this.g.j();
            }
            this.h = h;
        }
        return true;
    }
}
