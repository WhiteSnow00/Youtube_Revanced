// 
// Decompiled by Procyon v0.6.0
// 

public final class iyq implements fyi
{
    public final iyt a;
    private final int b;
    
    public iyq(final iyt a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void a(final boolean g) {
        final int b = this.b;
        if (b == 0) {
            final iyt a = this.a;
            if (a.h != g) {
                a.h = g;
                a.b();
            }
            return;
        }
        if (b != 1) {
            final iyt a2 = this.a;
            if (a2.m != g) {
                a2.m = g;
                a2.b();
            }
            return;
        }
        final iyt a3 = this.a;
        if (a3.g != g) {
            a3.g = g;
            a3.b();
        }
    }
}
