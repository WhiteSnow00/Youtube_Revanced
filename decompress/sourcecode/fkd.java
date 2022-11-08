// 
// Decompiled by Procyon v0.6.0
// 

public final class fkd extends zbr
{
    private static final zbq b;
    public zbq a;
    
    static {
        b = new zbq(640, 360, false);
    }
    
    public fkd() {
        this.a = zbq.a;
    }
    
    public final void b(final int n, final int n2, final boolean b) {
        if (n > 0 && n2 > 0) {
            final zbq a = this.a;
            if (a.c != n || a.d != n2 || a.b != b) {
                this.a = new zbq(n, n2, b);
                this.notifyObservers();
            }
        }
    }
}
