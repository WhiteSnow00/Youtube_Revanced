// 
// Decompiled by Procyon v0.6.0
// 

final class aset implements asew
{
    final int a;
    private final int b;
    
    public aset(final int a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void a(final asfc asfc) {
        final int b = this.b;
        if (b == 0) {
            asfc.a.l(this.a);
            return;
        }
        if (b != 1) {
            asfc.a.g(this.a);
            return;
        }
        asfc.a.k(this.a);
    }
}
