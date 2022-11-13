// 
// Decompiled by Procyon v0.6.0
// 

public final class abbb
{
    private boolean a;
    private boolean b;
    private boolean c;
    private long d;
    private byte e;
    
    public abbb() {
    }
    
    public abbb(final abbc abbc) {
        this.a = abbc.a;
        this.b = abbc.b;
        this.c = abbc.c;
        this.d = abbc.d;
        this.e = 15;
    }
    
    public final abbc a() {
        if (this.e != 15) {
            final StringBuilder sb = new StringBuilder();
            if ((this.e & 0x1) == 0x0) {
                sb.append(" isAccessibilityPlayerEnabled");
            }
            if ((this.e & 0x2) == 0x0) {
                sb.append(" isTestOnlyState");
            }
            if ((this.e & 0x4) == 0x0) {
                sb.append(" canHidePlayerControls");
            }
            if ((this.e & 0x8) == 0x0) {
                sb.append(" controlsHideDelayMs");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        return new abbc(this.a, this.b, this.c, this.d);
    }
    
    public final void b(final boolean c) {
        this.c = c;
        this.e |= 0x4;
    }
    
    public final void c(final long d) {
        this.d = d;
        this.e |= 0x8;
    }
    
    public final void d(final boolean a) {
        this.a = a;
        this.e |= 0x1;
    }
    
    public final void e(final boolean b) {
        this.b = b;
        this.e |= 0x2;
    }
}
