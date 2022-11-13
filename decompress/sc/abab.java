// 
// Decompiled by Procyon v0.6.0
// 

public final class abab
{
    public int a;
    public byte b;
    private int c;
    private int d;
    private long e;
    private int f;
    
    public abab() {
    }
    
    public abab(final abac abac) {
        this.c = abac.a;
        this.d = abac.b;
        this.e = abac.c;
        this.a = abac.d;
        this.f = abac.e;
        this.b = 31;
    }
    
    public final abac a() {
        if (this.b != 31) {
            final StringBuilder sb = new StringBuilder();
            if ((this.b & 0x1) == 0x0) {
                sb.append(" maximumBarHeight");
            }
            if ((this.b & 0x2) == 0x0) {
                sb.append(" minimumBarHeight");
            }
            if ((this.b & 0x4) == 0x0) {
                sb.append(" showHideAnimationDurationMillis");
            }
            if ((this.b & 0x8) == 0x0) {
                sb.append(" barGap");
            }
            if ((this.b & 0x10) == 0x0) {
                sb.append(" highlightWidth");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        return new abac(this.c, this.d, this.e, this.a, this.f);
    }
    
    public final void b(final int f) {
        this.f = f;
        this.b |= 0x10;
    }
    
    public final void c(final int c) {
        this.c = c;
        this.b |= 0x1;
    }
    
    public final void d(final int d) {
        this.d = d;
        this.b |= 0x2;
    }
    
    public final void e(final long e) {
        this.e = e;
        this.b |= 0x4;
    }
}
