// 
// Decompiled by Procyon v0.6.0
// 

public final class atde extends ashe
{
    final ashh[] a;
    final asjc b;
    final int c;
    
    public atde(final ashh[] a, final asjc b, final int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final void f(final ashj ashj) {
        final ashh[] a = this.a;
        final atdc atdc = new atdc(ashj, this.b);
        final int c = this.c;
        final atdd[] c2 = atdc.c;
        final int length = c2.length;
        final int n = 0;
        for (int i = 0; i < 2; ++i) {
            c2[i] = new atdd(atdc, c);
        }
        atdc.lazySet(0);
        atdc.a.d((asic)atdc);
        for (int n2 = n; n2 < 2 && !atdc.e; ++n2) {
            a[n2].aJ((ashj)c2[n2]);
        }
    }
}
