// 
// Decompiled by Procyon v0.6.0
// 

public final class hny
{
    public long a;
    public long b;
    public long c;
    public long d;
    public long e;
    public int f;
    
    public hny() {
        this.a = -1L;
        this.b = -1L;
        this.c = -1L;
        this.d = -1L;
        this.e = -1L;
        this.f = 1;
    }
    
    public final void a(final int f) {
        if (this.a == -2L) {
            ttr.b("Already processed cold start.");
            return;
        }
        this.f = f;
    }
}
