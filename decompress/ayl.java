// 
// Decompiled by Procyon v0.6.0
// 

public final class ayl
{
    public long a;
    public long b;
    
    public ayl() {
        this.b = Long.MIN_VALUE;
    }
    
    public ayl(final aym aym) {
        this.a = aym.a;
        this.b = aym.b;
    }
    
    @Deprecated
    public final ayn a() {
        return new ayn(this);
    }
    
    public final void b(final long b) {
        boolean b2 = true;
        if (b != Long.MIN_VALUE) {
            b2 = (b >= 0L && b2);
        }
        bad.d(b2);
        this.b = b;
    }
    
    public final void c(final long a) {
        bad.d(a >= 0L);
        this.a = a;
    }
}
