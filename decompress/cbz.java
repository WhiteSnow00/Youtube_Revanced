// 
// Decompiled by Procyon v0.6.0
// 

final class cbz extends cck
{
    final String a;
    final cby b;
    
    public cbz(final String a, final cby b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void b(final int n) {
        final String a = this.a;
        if (a != null) {
            final cby b = this.b;
            if (b != null) {
                b.d(a, n);
            }
        }
    }
    
    @Override
    public final void c(final int n) {
        final String a = this.a;
        if (a != null) {
            final cby b = this.b;
            if (b != null) {
                b.e(a, n);
            }
        }
    }
}
