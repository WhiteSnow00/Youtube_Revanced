// 
// Decompiled by Procyon v0.6.0
// 

public final class agnm
{
    public String a;
    public String b;
    public String c;
    public String d;
    private long e;
    private long f;
    private byte g;
    private int h;
    
    public agnm() {
    }
    
    public agnm(final agnn agnn) {
        this.a = agnn.a;
        this.h = agnn.g;
        this.b = agnn.b;
        this.c = agnn.c;
        this.e = agnn.d;
        this.f = agnn.e;
        this.d = agnn.f;
        this.g = 3;
    }
    
    public final agnn a() {
        if (this.g == 3 && this.h != 0) {
            return new agnn(this.a, this.h, this.b, this.c, this.e, this.f, this.d);
        }
        final StringBuilder sb = new StringBuilder();
        if (this.h == 0) {
            sb.append(" registrationStatus");
        }
        if ((this.g & 0x1) == 0x0) {
            sb.append(" expiresInSecs");
        }
        if ((this.g & 0x2) == 0x0) {
            sb.append(" tokenCreationEpochInSecs");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
    
    public final void b(final long e) {
        this.e = e;
        this.g |= 0x1;
    }
    
    public final void c(final int h) {
        if (h != 0) {
            this.h = h;
            return;
        }
        throw new NullPointerException("Null registrationStatus");
    }
    
    public final void d(final long f) {
        this.f = f;
        this.g |= 0x2;
    }
}
