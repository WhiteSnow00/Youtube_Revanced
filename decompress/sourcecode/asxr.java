import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asxr extends ashe
{
    final ashh[] a;
    final Iterable b;
    final asjc c;
    final int d;
    
    public asxr(final ashh[] a, final Iterable b, final asjc c, final int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final void f(final ashj ashj) {
        Object[] a = this.a;
        final int n = 0;
        int length;
        if (a == null) {
            Object[] array = new ashe[8];
            final Iterator iterator = this.b.iterator();
            int n2 = 0;
            while (true) {
                a = array;
                length = n2;
                if (!iterator.hasNext()) {
                    break;
                }
                final ashh ashh = (ashh)iterator.next();
                Object[] array2 = array;
                if (n2 == array.length) {
                    array2 = new ashh[(n2 >> 2) + n2];
                    System.arraycopy(array, 0, array2, 0, n2);
                }
                array2[n2] = ashh;
                ++n2;
                array = array2;
            }
        }
        else {
            length = a.length;
        }
        if (length == 0) {
            asjh.d(ashj);
            return;
        }
        final asxq asxq = new asxq(ashj, this.c, length, this.d);
        final asxp[] c = asxq.c;
        final int length2 = c.length;
        asxq.a.d((asic)asxq);
        for (int n3 = n; n3 < length2 && !asxq.g && !asxq.f; ++n3) {
            ((ashh)a[n3]).aJ((ashj)c[n3]);
        }
    }
}
