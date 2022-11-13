// 
// Decompiled by Procyon v0.6.0
// 

public final class itx extends aazg implements tgg
{
    final ity a;
    
    public itx(final ity a) {
        super((aazi)(this.a = a));
    }
    
    public final void a(final aanr aanr) {
        final ity a = this.a;
        final boolean d = a.d;
        final boolean a2 = aanr.a;
        if (d == a2) {
            return;
        }
        a.d = a2;
        a.e();
    }
    
    public final Class[] ms(final Class clazz, final Object o, final int n) {
        if (clazz == itx.class) {
            Class[] array;
            if (n != -1) {
                if (n != 0) {
                    final StringBuilder sb = new StringBuilder("unsupported op code: ");
                    sb.append(n);
                    throw new IllegalStateException(sb.toString());
                }
                this.a((aanr)o);
                array = null;
            }
            else {
                array = new Class[] { aanr.class };
            }
            return array;
        }
        return aald.a(this, o, n);
    }
}
