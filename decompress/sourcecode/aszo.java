// 
// Decompiled by Procyon v0.6.0
// 

public final class aszo extends ashe
{
    final Object[] a;
    
    public aszo(final Object[] a) {
        this.a = a;
    }
    
    public final void f(final ashj ashj) {
        final aszn aszn = new aszn(ashj, this.a);
        ashj.d((asic)aszn);
        if (!aszn.d) {
            final Object[] b = aszn.b;
            for (int length = b.length, n = 0; n < length && !aszn.e; ++n) {
                final Object o = b[n];
                if (o == null) {
                    final ashj a = aszn.a;
                    final StringBuilder sb = new StringBuilder("The element at index ");
                    sb.append(n);
                    sb.append(" is null");
                    a.b((Throwable)new NullPointerException(sb.toString()));
                    return;
                }
                aszn.a.tr(o);
            }
            if (!aszn.e) {
                aszn.a.tu();
            }
        }
    }
}
