// 
// Decompiled by Procyon v0.6.0
// 

public final class fkk extends zdk
{
    private static final zdj b;
    public zdj a;
    
    static {
        b = new zdj(640, 360, false);
    }
    
    public fkk() {
        this.a = zdj.a;
    }
    
    public final /* bridge */ Object a() {
        final zdj a = this.a;
        if (a.c > 0 && a.d > 0) {
            return a;
        }
        ttr.l("Suppressed bad viewport dimensions. Video quality may suffer!");
        return fkk.b;
    }
    
    public final void b(final int n, final int n2, final boolean b) {
        if (n > 0 && n2 > 0) {
            final zdj a = this.a;
            if (a.c != n || a.d != n2 || a.b != b) {
                this.a = new zdj(n, n2, b);
                this.notifyObservers();
            }
        }
    }
}
