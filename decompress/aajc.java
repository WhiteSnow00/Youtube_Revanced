// 
// Decompiled by Procyon v0.6.0
// 

final class aajc implements zch
{
    final aajd a;
    private final int b;
    
    public aajc(final aajd a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final void a(final Exception ex) {
    }
    
    public final void b(final int n) {
    }
    
    public final void c(final long n) {
        final int b = this.b;
        if (b == 0) {
            this.a.f = n;
            return;
        }
        if (b == 1) {
            this.a.e = n;
            return;
        }
        if (b != 2) {
            this.a.h = n;
            return;
        }
        this.a.g = n;
    }
}
