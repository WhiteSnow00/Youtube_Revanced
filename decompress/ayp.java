// 
// Decompiled by Procyon v0.6.0
// 

public final class ayp
{
    public long a;
    public long b;
    public long c;
    public float d;
    public float e;
    
    public ayp() {
        this.a = -9223372036854775807L;
        this.b = -9223372036854775807L;
        this.c = -9223372036854775807L;
        this.d = -3.4028235E38f;
        this.e = -3.4028235E38f;
    }
    
    public ayp(final ayq ayq) {
        this.a = ayq.a;
        this.b = ayq.b;
        this.c = ayq.c;
        this.d = ayq.d;
        this.e = ayq.e;
    }
    
    public final ayq a() {
        return new ayq(this.a, this.b, this.c, this.d, this.e);
    }
}
