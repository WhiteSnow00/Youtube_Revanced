// 
// Decompiled by Procyon v0.6.0
// 

public final class agma
{
    public String a;
    public int b;
    private long c;
    private byte d;
    
    public final agmb a() {
        if (this.d == 1) {
            return new agmb(this.a, this.c, this.b);
        }
        throw new IllegalStateException("Missing required properties: tokenExpirationTimestamp");
    }
    
    public final void b(final long c) {
        this.c = c;
        this.d = 1;
    }
}
