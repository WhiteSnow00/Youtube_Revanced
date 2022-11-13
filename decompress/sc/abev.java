// 
// Decompiled by Procyon v0.6.0
// 

public final class abev extends abvy
{
    final abew a;
    
    public abev(final abew a, final long n, final long n2) {
        this.a = a;
        super(n, n2, 1, 1, (String)null);
    }
    
    protected final void a() {
        this.a.c = false;
    }
    
    public final void b(final boolean b, final boolean b2, final boolean b3) {
        if (b) {
            this.a.c = false;
            return;
        }
        this.a.c = true;
        this.a.a();
    }
}
