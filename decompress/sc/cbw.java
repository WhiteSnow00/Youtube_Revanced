// 
// Decompiled by Procyon v0.6.0
// 

final class cbw extends cch
{
    final String a;
    final cbv b;
    
    public cbw(final String a, final cbv b) {
        this.a = a;
        this.b = b;
    }
    
    public final void b(final int n) {
        final String a = this.a;
        if (a != null) {
            final cbv b = this.b;
            if (b != null) {
                b.d(a, n);
            }
        }
    }
    
    public final void c(final int n) {
        final String a = this.a;
        if (a != null) {
            final cbv b = this.b;
            if (b != null) {
                b.e(a, n);
            }
        }
    }
}
