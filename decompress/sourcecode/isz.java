// 
// Decompiled by Procyon v0.6.0
// 

public final class isz extends aaxk implements tec
{
    final /* synthetic */ ita a;
    
    public isz(final ita a) {
        this.a = a;
        super((aaxm)a);
    }
    
    public final void a(final aalx aalx) {
        final ita a = this.a;
        final boolean d = a.d;
        final boolean a2 = aalx.a;
        if (d == a2) {
            return;
        }
        a.d = a2;
        a.e();
    }
    
    public final Class[] ms(final Class clazz, final Object o, final int n) {
        if (clazz == isz.class) {
            Class[] array;
            if (n != -1) {
                if (n != 0) {
                    final StringBuilder sb = new StringBuilder("unsupported op code: ");
                    sb.append(n);
                    throw new IllegalStateException(sb.toString());
                }
                this.a((aalx)o);
                array = null;
            }
            else {
                array = new Class[] { aalx.class };
            }
            return array;
        }
        return aaji.a((aaxk)this, o, n);
    }
}
