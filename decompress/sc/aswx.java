// 
// Decompiled by Procyon v0.6.0
// 

public final class aswx extends ashn
{
    final ashq[] a;
    final asjr b;
    
    public aswx(final ashq[] a, final asjr b) {
        this.a = a;
        this.b = b;
    }
    
    protected final void ah(final asho asho) {
        final ashq[] a = this.a;
        final aswv aswv = new aswv(asho, this.b);
        asho.d(aswv);
        for (int i = 0; i < 2; ++i) {
            if (aswv.tA()) {
                return;
            }
            final ashq ashq = a[i];
            if (ashq == null) {
                aswv.b(new NullPointerException("One of the sources is null"), i);
                return;
            }
            ashq.ag(aswv.c[i]);
        }
    }
}
