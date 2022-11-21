// 
// Decompiled by Procyon v0.6.0
// 

final class accp extends accr
{
    public byte a;
    private int b;
    private aqiq c;
    private xab d;
    private acxb e;
    private int f;
    private int g;
    
    public accp() {
    }
    
    @Override
    public final /* bridge */ acxg a() {
        if (this.a != 31) {
            final StringBuilder sb = new StringBuilder();
            if ((this.a & 0x1) == 0x0) {
                sb.append(" counterfactual");
            }
            if ((this.a & 0x2) == 0x0) {
                sb.append(" duration");
            }
            if ((this.a & 0x4) == 0x0) {
                sb.append(" rateLimited");
            }
            if ((this.a & 0x8) == 0x0) {
                sb.append(" bottomUiType");
            }
            if ((this.a & 0x10) == 0x0) {
                sb.append(" largeFormFactorWidthDp");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        return new accs(this.b, this.c, this.d, this.e, this.f, this.g);
    }
    
    public final void b(final int f) {
        this.f = f;
        this.a |= 0x8;
    }
    
    public final void c(final int b) {
        this.b = b;
        this.a |= 0x2;
    }
    
    public final void d(final int g) {
        this.g = g;
        this.a |= 0x10;
    }
    
    @Override
    public final void e(final xab d) {
        this.d = d;
    }
    
    @Override
    public final void g(final acxb e) {
        this.e = e;
    }
    
    @Override
    public final /* bridge */ void h(final int n) {
        this.b(n);
    }
    
    @Override
    public final /* bridge */ void i(final int n) {
        this.c(n);
    }
    
    @Override
    public final void j(final aqiq c) {
        this.c = c;
    }
    
    @Override
    public final /* bridge */ void k(final int n) {
        this.d(n);
    }
}
