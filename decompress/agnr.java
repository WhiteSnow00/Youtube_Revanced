// 
// Decompiled by Procyon v0.6.0
// 

public final class agnr
{
    public String a;
    public int b;
    private long c;
    private byte d;
    
    public final agns a() {
        if (this.d == 1) {
            return new agns(this.a, this.c, this.b);
        }
        throw new IllegalStateException("Missing required properties: tokenExpirationTimestamp");
    }
    
    public final void b(final long c) {
        this.c = c;
        this.d = 1;
    }
}
