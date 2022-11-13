// 
// Decompiled by Procyon v0.6.0
// 

public final class atag extends asht
{
    final Object[] a;
    
    public atag(final Object[] a) {
        this.a = a;
    }
    
    public final void f(final ashy ashy) {
        final ataf ataf = new ataf(ashy, this.a);
        ashy.d((asir)ataf);
        if (!ataf.d) {
            final Object[] b = ataf.b;
            for (int length = b.length, n = 0; n < length && !ataf.e; ++n) {
                final Object o = b[n];
                if (o == null) {
                    final ashy a = ataf.a;
                    final StringBuilder sb = new StringBuilder("The element at index ");
                    sb.append(n);
                    sb.append(" is null");
                    a.b(new NullPointerException(sb.toString()));
                    return;
                }
                ataf.a.tu(o);
            }
            if (!ataf.e) {
                ataf.a.tx();
            }
        }
    }
}
