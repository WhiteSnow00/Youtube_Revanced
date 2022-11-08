// 
// Decompiled by Procyon v0.6.0
// 

public final class gba extends acto
{
    public aqdk a;
    public wwv b;
    public actk c;
    public byte d;
    private int e;
    private int f;
    private int g;
    
    public final gbb b() {
        if (this.d != 63) {
            final StringBuilder sb = new StringBuilder();
            if ((this.d & 0x1) == 0x0) {
                sb.append(" rateLimited");
            }
            if ((this.d & 0x2) == 0x0) {
                sb.append(" shownOnFullscreen");
            }
            if ((this.d & 0x4) == 0x0) {
                sb.append(" counterfactual");
            }
            if ((this.d & 0x8) == 0x0) {
                sb.append(" duration");
            }
            if ((this.d & 0x10) == 0x0) {
                sb.append(" bottomUiType");
            }
            if ((this.d & 0x20) == 0x0) {
                sb.append(" largeFormFactorWidthDp");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        return new gbb(this.e, this.a, this.b, this.c, this.f, this.g);
    }
    
    public final void c(final int f) {
        this.f = f;
        this.d |= 0x10;
    }
    
    public final void d(final int e) {
        this.e = e;
        this.d |= 0x8;
    }
    
    public final void f(final int g) {
        this.g = g;
        this.d |= 0x20;
    }
}
