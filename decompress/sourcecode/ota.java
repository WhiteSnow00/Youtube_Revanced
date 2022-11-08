// 
// Decompiled by Procyon v0.6.0
// 

public final class ota
{
    public atjj a;
    public String b;
    public osx c;
    public otg d;
    public Object e;
    public otr f;
    public afcr g;
    private boolean h;
    private boolean i;
    private boolean j;
    private byte k;
    
    public final otb a() {
        if (this.k == 7) {
            final atjj a = this.a;
            if (a != null) {
                final String b = this.b;
                if (b != null) {
                    final osx c = this.c;
                    if (c != null) {
                        return new otb(a, b, c, this.d, this.h, this.e, this.f, this.i, this.g, this.j);
                    }
                }
            }
        }
        final StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" converterProvider");
        }
        if (this.b == null) {
            sb.append(" logTag");
        }
        if (this.c == null) {
            sb.append(" perfLoggerFactory");
        }
        if ((this.k & 0x1) == 0x0) {
            sb.append(" useIncrementalMount");
        }
        if ((this.k & 0x2) == 0x0) {
            sb.append(" nestedScrollingEnabled");
        }
        if ((this.k & 0x4) == 0x0) {
            sb.append(" clearComponentOnDetach");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
    
    public final void b(final boolean j) {
        this.j = j;
        this.k |= 0x4;
    }
    
    public final void c(final boolean i) {
        this.i = i;
        this.k |= 0x2;
    }
    
    public final void d(final boolean h) {
        this.h = h;
        this.k |= 0x1;
    }
}
