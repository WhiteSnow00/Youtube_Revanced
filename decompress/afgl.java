import java.util.Iterator;
import java.util.Map;
import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

class afgl implements Serializable
{
    private static final long serialVersionUID = 0L;
    private final Object a;
    private final Object b;
    
    public afgl(final afgm afgm) {
        final Object[] a = new Object[afgm.size()];
        final Object[] b = new Object[afgm.size()];
        final aflu k = afgm.r().k();
        int n = 0;
        while (((Iterator)k).hasNext()) {
            final Map.Entry<Object, V> entry = (Map.Entry<Object, V>)((Iterator)k).next();
            a[n] = entry.getKey();
            b[n] = entry.getValue();
            ++n;
        }
        this.a = a;
        this.b = b;
    }
    
    public afgj a(final int n) {
        return new afgj(n);
    }
    
    final Object readResolve() {
        final Object a = this.a;
        if (!(a instanceof afhk)) {
            final Object b = this.b;
            final Object[] array = (Object[])a;
            final afgj a2 = this.a(array.length);
            for (int i = 0; i < array.length; ++i) {
                a2.g(array[i], ((Object[])b)[i]);
            }
            return a2.c();
        }
        final afhk afhk = (afhk)a;
        final affy affy = (affy)this.b;
        final afgj a3 = this.a(afhk.size());
        final aflu k = afhk.k();
        final aflu j = affy.k();
        while (k.hasNext()) {
            a3.g(k.next(), j.next());
        }
        return a3.c();
    }
}
