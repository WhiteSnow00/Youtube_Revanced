// 
// Decompiled by Procyon v0.6.0
// 

public final class asxi extends ashe
{
    final ashh[] a;
    
    public asxi(final ashh[] a) {
        this.a = a;
    }
    
    public final void f(final ashj ashj) {
        final ashh[] a = this.a;
        final asxg asxg = new asxg(ashj);
        final asxh[] b = asxg.b;
        final int n = 0;
        int n2;
        for (int i = 0; i < 2; i = n2) {
            n2 = i + 1;
            b[i] = new asxh(asxg, n2, asxg.a);
        }
        asxg.c.lazySet(0);
        asxg.a.d((asic)asxg);
        for (int n3 = n; n3 < 2 && asxg.c.get() == 0; ++n3) {
            a[n3].aJ((ashj)b[n3]);
        }
    }
}
