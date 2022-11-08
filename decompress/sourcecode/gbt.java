// 
// Decompiled by Procyon v0.6.0
// 

public final class gbt
{
    public boolean a;
    public aonl b;
    public aong c;
    public aomx d;
    public aomz e;
    public CharSequence f;
    public aioe g;
    public String h;
    public byte i;
    public int j;
    public int k;
    public hez l;
    private int m;
    private int n;
    
    public gbt() {
    }
    
    public gbt(final gbu gbu) {
        this.a = gbu.a;
        this.m = gbu.b;
        this.b = gbu.c;
        this.c = gbu.d;
        this.d = gbu.e;
        this.e = gbu.f;
        this.l = gbu.m;
        this.f = gbu.g;
        this.j = gbu.k;
        this.k = gbu.l;
        this.n = gbu.h;
        this.g = gbu.i;
        this.h = gbu.j;
        this.i = 31;
    }
    
    public final gbu a() {
        if (this.i == 31) {
            final aonl b = this.b;
            if (b != null) {
                final int j = this.j;
                if (j != 0) {
                    final int k = this.k;
                    if (k != 0) {
                        return new gbu(this.a, this.m, b, this.c, this.d, this.e, this.l, this.f, j, k, this.n, this.g, this.h, null);
                    }
                }
            }
        }
        final StringBuilder sb = new StringBuilder();
        if ((this.i & 0x1) == 0x0) {
            sb.append(" rateLimited");
        }
        if ((this.i & 0x2) == 0x0) {
            sb.append(" shownOnFullscreen");
        }
        if ((this.i & 0x4) == 0x0) {
            sb.append(" counterfactual");
        }
        if ((this.i & 0x8) == 0x0) {
            sb.append(" surveyType");
        }
        if (this.b == null) {
            sb.append(" surveySupportedRenderers");
        }
        if (this.j == 0) {
            sb.append(" displayTime");
        }
        if (this.k == 0) {
            sb.append(" displayStart");
        }
        if ((this.i & 0x10) == 0x0) {
            sb.append(" displayDelaySec");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
    
    public final void b(final int n) {
        this.n = n;
        this.i |= 0x10;
    }
    
    public final void c(final int m) {
        this.m = m;
        this.i |= 0x8;
    }
}
