// 
// Decompiled by Procyon v0.6.0
// 

final class cbv extends ccg
{
    final String a;
    final cbu b;
    
    public cbv(final String a, final cbu b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void b(final int n) {
        final String a = this.a;
        if (a != null) {
            final cbu b = this.b;
            if (b != null) {
                b.d(a, n);
            }
        }
    }
    
    @Override
    public final void c(final int n) {
        final String a = this.a;
        if (a != null) {
            final cbu b = this.b;
            if (b != null) {
                b.e(a, n);
            }
        }
    }
}
