import java.util.Map;
import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

class afeu implements Serializable
{
    private static final long serialVersionUID = 0L;
    private final Object a;
    private final Object b;
    
    public afeu(final afev afev) {
        final Object[] a = new Object[afev.size()];
        final Object[] b = new Object[afev.size()];
        final afke k = afev.r().k();
        int n = 0;
        while (k.hasNext()) {
            final Map.Entry<Object, V> entry = k.next();
            a[n] = entry.getKey();
            b[n] = entry.getValue();
            ++n;
        }
        this.a = a;
        this.b = b;
    }
    
    public afes a(final int n) {
        return new afes(n);
    }
    
    final Object readResolve() {
        final Object a = this.a;
        if (!(a instanceof afft)) {
            final Object[] array = (Object[])a;
            final Object[] array2 = (Object[])this.b;
            final afes a2 = this.a(array.length);
            for (int i = 0; i < array.length; ++i) {
                a2.g(array[i], array2[i]);
            }
            return a2.c();
        }
        final afft afft = (afft)a;
        final afeh afeh = (afeh)this.b;
        final afes a3 = this.a(afft.size());
        final afke k = afft.k();
        final afke j = afeh.k();
        while (k.hasNext()) {
            a3.g(k.next(), j.next());
        }
        return a3.c();
    }
}
