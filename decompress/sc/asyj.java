import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asyj extends asht
{
    final ashw[] a;
    final Iterable b;
    final asjr c;
    final int d;
    
    public asyj(final ashw[] a, final Iterable b, final asjr c, final int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final void f(final ashy ashy) {
        Object[] a = this.a;
        final int n = 0;
        int length;
        if (a == null) {
            Object[] array = new asht[8];
            final Iterator iterator = this.b.iterator();
            int n2 = 0;
            while (true) {
                a = array;
                length = n2;
                if (!iterator.hasNext()) {
                    break;
                }
                final ashw ashw = (ashw)iterator.next();
                Object[] array2 = array;
                if (n2 == array.length) {
                    array2 = new ashw[(n2 >> 2) + n2];
                    System.arraycopy(array, 0, array2, 0, n2);
                }
                array2[n2] = ashw;
                ++n2;
                array = array2;
            }
        }
        else {
            length = a.length;
        }
        if (length == 0) {
            asjw.d(ashy);
            return;
        }
        final asyi asyi = new asyi(ashy, this.c, length, this.d);
        final asyh[] c = asyi.c;
        final int length2 = c.length;
        asyi.a.d(asyi);
        for (int n3 = n; n3 < length2 && !asyi.g && !asyi.f; ++n3) {
            ((ashw)a[n3]).aP(c[n3]);
        }
    }
}
