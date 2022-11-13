// 
// Decompiled by Procyon v0.6.0
// 

public final class atdw extends asht
{
    final ashw[] a;
    final asjr b;
    final int c;
    
    public atdw(final ashw[] a, final asjr b, final int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final void f(final ashy ashy) {
        final ashw[] a = this.a;
        final atdu atdu = new atdu(ashy, this.b);
        final int c = this.c;
        final atdv[] c2 = atdu.c;
        final int length = c2.length;
        final int n = 0;
        for (int i = 0; i < 2; ++i) {
            c2[i] = new atdv(atdu, c);
        }
        atdu.lazySet(0);
        atdu.a.d((asir)atdu);
        for (int n2 = n; n2 < 2 && !atdu.e; ++n2) {
            a[n2].aP((ashy)c2[n2]);
        }
    }
}
