// 
// Decompiled by Procyon v0.6.0
// 

final class acse implements ackz
{
    public int a;
    private final acla b;
    
    public acse(final acla b) {
        this.b = b;
    }
    
    private final void g(final int a) {
        if (a < this.a) {
            this.a = a;
        }
    }
    
    public final void e(final int n, final int n2) {
        this.g(Math.min(n, n2));
    }
    
    public final void f() {
        this.a = this.b.a();
    }
    
    @Override
    public final void qL() {
        this.f();
    }
    
    public final void qM(final int n, final int n2) {
        this.g(n);
    }
    
    public final void qN(final int n, final int n2) {
        this.g(n);
    }
    
    public final void tf(final int n, final int n2) {
        this.g(n);
    }
}
